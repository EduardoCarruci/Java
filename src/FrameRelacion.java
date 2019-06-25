
import java.util.ArrayList;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class FrameRelacion extends javax.swing.JFrame {

	Frame frame;
	
	public FrameRelacion(Frame frame) {
		
		initComponents();
		String [] relaciones = { "uno a uno", "uno a muchos" };
		relaciones_combo.setModel(new DefaultComboBoxModel(relaciones));
		this.frame = frame;
		
	}
	
	public void actualizarListas(ArrayList<String> clases) {
	  primera_clase_combo.setModel(new DefaultComboBoxModel(clases.toArray()));
		segunda_clase_combo.setModel(new DefaultComboBoxModel(clases.toArray()));		
	}
	

	
	@SuppressWarnings("unchecked")
  // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
  private void initComponents() {

    segunda_clase_combo = new javax.swing.JComboBox<>();
    primera_clase_combo = new javax.swing.JComboBox<>();
    relaciones_combo = new javax.swing.JComboBox<>();
    relacionar_btn = new javax.swing.JButton();

    setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
    setTitle("Relaciones");

    relacionar_btn.setText("Relacionar");
    relacionar_btn.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        relacionar_btnActionPerformed(evt);
      }
    });

    javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
    getContentPane().setLayout(layout);
    layout.setHorizontalGroup(
      layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(layout.createSequentialGroup()
        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
          .addGroup(layout.createSequentialGroup()
            .addGap(46, 46, 46)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
              .addComponent(relaciones_combo, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
              .addComponent(primera_clase_combo, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
              .addComponent(segunda_clase_combo, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)))
          .addGroup(layout.createSequentialGroup()
            .addGap(93, 93, 93)
            .addComponent(relacionar_btn)))
        .addContainerGap(60, Short.MAX_VALUE))
    );
    layout.setVerticalGroup(
      layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(layout.createSequentialGroup()
        .addGap(43, 43, 43)
        .addComponent(primera_clase_combo, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addGap(29, 29, 29)
        .addComponent(segunda_clase_combo, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addGap(28, 28, 28)
        .addComponent(relaciones_combo, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addGap(39, 39, 39)
        .addComponent(relacionar_btn)
        .addContainerGap(42, Short.MAX_VALUE))
    );

    pack();
  }// </editor-fold>//GEN-END:initComponents

  private void relacionar_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_relacionar_btnActionPerformed
    if (primera_clase_combo.getSelectedItem().equals(segunda_clase_combo.getSelectedItem())) {
		  JOptionPane.showMessageDialog(this, "Debe seleccionar tablas diferentes");
			return;
		}
		
		Tablon primera_tabla = frame.buscarTabla(String.valueOf(primera_clase_combo.getSelectedItem()));
		Tablon segunda_tabla = frame.buscarTabla(String.valueOf(segunda_clase_combo.getSelectedItem()));
		String primera = primera_tabla.getLabel().getText();
		String segunda = segunda_tabla.getLabel().getText();
		
		DefaultTableModel model;
		int fila;
		switch (String.valueOf(relaciones_combo.getSelectedItem())) {
			case "uno a uno": {
				model = primera_tabla.getModel();
				fila = buscarFilaDisponible(model);
				
				if (fila != -1) {
				  model.setValueAt("private", fila, 0);
					model.setValueAt(nombreDeClase(segunda), fila, 1);
					model.setValueAt(segunda.toLowerCase(), fila, 2);
				} else {
				  fila = model.getRowCount();
					primera_tabla.agregar();
					model.setValueAt("private", fila, 0);
					model.setValueAt(nombreDeClase(segunda), fila, 1);
					model.setValueAt(segunda.toLowerCase(), fila, 2);
				}
				
				model = segunda_tabla.getModel();
				fila = buscarFilaDisponible(model);
				
				if (fila != -1) {
				  model.setValueAt("private", fila, 0);
					model.setValueAt(nombreDeClase(primera), fila, 1);
					model.setValueAt(primera.toLowerCase(), fila, 2);
				} else {
				  fila = model.getRowCount();
					segunda_tabla.agregar();
					model.setValueAt("private", fila, 0);
					model.setValueAt(nombreDeClase(primera), fila, 1);
					model.setValueAt(primera.toLowerCase(), fila, 2);
				}
			  break; 
			}
			
			
			case "uno a muchos": {
			  model = primera_tabla.getModel();
				fila = buscarFilaDisponible(model);
				
				if (fila != -1) {
				  model.setValueAt("private", fila, 0);
					model.setValueAt("Set<" + nombreDeClase(segunda) + ">", fila, 1);
					model.setValueAt(segunda.toLowerCase() + "s", fila, 2);
				} else {
				  fila = model.getRowCount();
					primera_tabla.agregar();
					model.setValueAt("private", fila, 0);
					model.setValueAt("Set<" + nombreDeClase(segunda) + ">", fila, 1);
					model.setValueAt(segunda.toLowerCase() + "s", fila, 2);
				}
				
				model = segunda_tabla.getModel();
				fila = buscarFilaDisponible(model);
				
				if (fila != -1) {
				  model.setValueAt("private", fila, 0);
					model.setValueAt(nombreDeClase(primera), fila, 1);
					model.setValueAt(primera.toLowerCase(), fila, 2);
				} else {
				  fila = model.getRowCount();
					segunda_tabla.agregar();
					model.setValueAt("private", fila, 0);
					model.setValueAt(nombreDeClase(primera), fila, 1);
					model.setValueAt(primera.toLowerCase(), fila, 2);
				}
				break;
			}
			
		}
		
	
		
  }//GEN-LAST:event_relacionar_btnActionPerformed
	
	public int buscarFilaDisponible(DefaultTableModel model) {
		String valor;
		boolean disponible;
		for (int i = 0; i < model.getRowCount(); i++) {
		  disponible = true;
			for (int j = 0; j < model.getColumnCount(); j++) {
				valor = String.valueOf(model.getValueAt(i, j));
				valor = valor.trim();
			  if (!valor.equals("null") && !valor.equals("")) disponible = false;
			}			
			if (disponible) return i;
		}
	
	  return -1;
	}
	
	String nombreDeClase(String s) {
    return s.substring(0, 1).toUpperCase() + s.substring(1).toLowerCase();
  }
	
	

  // Variables declaration - do not modify//GEN-BEGIN:variables
  private javax.swing.JComboBox<String> primera_clase_combo;
  private javax.swing.JButton relacionar_btn;
  private javax.swing.JComboBox<String> relaciones_combo;
  private javax.swing.JComboBox<String> segunda_clase_combo;
  // End of variables declaration//GEN-END:variables
}
