
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.table.DefaultTableModel;

public class Guardar {
    
    private Tablon t;
    public File f;
    private static String ficha;
    private FileWriter fw;
    Frame m;
    private String nombre;
    
    
    public Guardar  (Tablon tabla,String nombre) throws IOException {
        ficha = nombre + ".java";
        f = new File(ficha);
        if(f.createNewFile()){
            fw = new FileWriter(ficha);
            
        } else {
         fw = new FileWriter(ficha);
        }
        this.t = tabla;
        this.nombre = nombre;
    }

    public void escribir(String s){
        try {
            fw.write(s);            
            fw.flush();            
        } catch (IOException ex) {
            Logger.getLogger(Guardar.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void registrarArchivo(){
        escribir ("public class " + nombreDeClase(nombre) + " { \r\n"); 
        
               
        if (t.getTable().isEditing()) t.getTable().getCellEditor().stopCellEditing();
        String linea, valor, atributo, tipo;
        ArrayList<String> metodos = new ArrayList<>();
        ArrayList<String> atributos = new ArrayList<>();
        ArrayList<String> tipos = new ArrayList<>();
             
        for (int i = 0; i < t.getModel().getRowCount(); i++) {
            linea = "";            
            for (int j = 0; j < t.getModel().getColumnCount(); j++) {
              valor = String.valueOf(t.getModel().getValueAt(i, j));
              valor = valor.trim(); 
              if (!valor.equals("null") && !valor.equals("")) {
                linea += linea.equals("") ? valor : " " + valor;
                if (j == 1) tipos.add(valor);
                if (j == 2) atributos.add(valor);
              }
              
            } 
            
            if (!linea.equals("")) {
                escribir("  " + linea + ";\r\n");                             
            }      
            
        }
				
			 //Constructor sin parametros      
        String constructor = "  public " + nombreDeClase(nombre) + "(" +
								") { \r\n  } \r\n \r\n";
        metodos.add(constructor);
				 
        // ####################################################################
        // Creando el constructor con parametros
				if (!atributos.isEmpty()) {
					String parametro;
					constructor = "  public " + nombreDeClase(nombre) + "(";
					for (int i = 0; i < atributos.size(); i++) {          
						tipo = tipos.get(i);
						atributo = atributos.get(i);  
						parametro = tipo + " " + atributo;
						constructor += (i == 0) ? parametro : ", " + parametro;        
					}
					constructor += ") { \r\n";      // 
					for(String atr : atributos) {  
						constructor += "    this." + atr + " = " + atr + "; \r\n";          
					}
					constructor += "  } \r\n \r\n";
					metodos.add(constructor);
				}
        
        // #################################################################### me esta pasando lo mismo que a ti . un robot.
        
     
        for (int i = 0; i < atributos.size(); i++) {
          tipo = tipos.get(i);
          atributo = atributos.get(i);
          metodos.add(
            "  public " + tipo + " get" + capitalize(atributo) + "() { \r\n" +
            "    return " + atributo + "; \r\n  } \r\n \r\n" +
                   
            "  public " + "set" + capitalize(atributo) + "(" + tipo + " " +
            atributo + ") { \r\n" +
            "    this." + atributo + " = " + atributo + "; \r\n" +
            "  } \r\n \r\n"                        
          );
        }        
        
        
        escribir("\r\n \r\n");
        metodos.stream().forEach( (metodo) -> escribir(metodo));//for ( String metodo: metodos ) escribir (metodo);
        
        escribir ("}");
        
        try {
            fw.close();
        } catch (IOException ex) {
            Logger.getLogger(Guardar.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    String capitalize(String s) {
      return s.substring(0, 1).toUpperCase() + s.substring(1);
    }
    
    // por ej: estUdiante -> Estudiante
    String nombreDeClase(String s) {
      return s.substring(0, 1).toUpperCase() + s.substring(1).toLowerCase();
    }
   
 }

