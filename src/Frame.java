
import java.awt.Color;
import java.awt.Dimension;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class Frame extends javax.swing.JFrame {
	//VARIABLES
	private JTable tablaso;
	private JScrollPane scroll;
	private Guardar guardar;
	private FrameRelacion frameRelacion;

	private String nombre;
	private boolean[] numeros;
	
	private Tablon tablaso1;
	private Tablon tablaso2;
	private Tablon tablaso3;
	private Tablon tablaso4;
	private Tablon tablaso5;
	private Tablon tablaso6;

//Constructor 
	public Frame() {
		initComponents();
		setTitle("Herramienta DMOO");
		setLocationRelativeTo(this);
		setResizable(false);
		cargar_imagen();
		this.setIconImage(new ImageIcon(getClass().getResource("/Imagenes/t2.png")).getImage()); // se asigna una imagen al icono de la APP
		this.setPreferredSize(new Dimension(875, 560));
		this.setMinimumSize(new Dimension(875, 560)); // se coloca el minimo de  tamaño
		revalidate();
		cargar();

	}
	// se carga un pequeño vector usado como pivote 
	public void cargar() {
		numeros = new boolean[6];
		for (int i = 0; i < 6; i++) {
			numeros[i] = false;
		}		
		frameRelacion = new FrameRelacion(this);		
	}
	
	//funcion para cargar imagenes en los labels y boton.
	public void cargar_imagen(){
		  Lbl_Opciones.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/cooltext233742953728334.png")));
		  Lbl_Fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Imagen-de-fondo-html.jpg")));
			Lbl_mos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/user.png")));
			boton_salir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/1484031936_x.png")));
	}
	@SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panel3 = new javax.swing.JPanel();
        panel11 = new javax.swing.JPanel();
        panel1 = new javax.swing.JPanel();
        panel2 = new javax.swing.JPanel();
        Panel_Contenedor = new javax.swing.JPanel();
        Boton_cargar = new javax.swing.JButton();
        Cambiar_nombre = new javax.swing.JButton();
        Lbl_Opciones = new javax.swing.JLabel();
        Add_Fila_Tabla = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        Delete_Fila1 = new javax.swing.JButton();
        Relaciones = new javax.swing.JButton();
        Lbl_mos = new javax.swing.JLabel();
        Delete_Tabla = new javax.swing.JButton();
        boton_salir = new javax.swing.JButton();
        panel6 = new javax.swing.JPanel();
        panel12 = new javax.swing.JPanel();
        panel4 = new javax.swing.JPanel();
        Lbl_2 = new javax.swing.JLabel();
        panel5 = new javax.swing.JPanel();
        Lbl_1 = new javax.swing.JLabel();
        Lbl_3 = new javax.swing.JLabel();
        Lbl_4 = new javax.swing.JLabel();
        Lbl_6 = new javax.swing.JLabel();
        Lbl_5 = new javax.swing.JLabel();
        Lbl_Fondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(875, 531));
        setPreferredSize(new java.awt.Dimension(875, 531));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panel3.setBackground(new java.awt.Color(255, 255, 255));
        panel3.setLayout(new javax.swing.BoxLayout(panel3, javax.swing.BoxLayout.LINE_AXIS));

        panel11.setBackground(new java.awt.Color(255, 255, 255));
        panel11.setLayout(new javax.swing.BoxLayout(panel11, javax.swing.BoxLayout.LINE_AXIS));
        panel3.add(panel11);

        getContentPane().add(panel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 370, 270, 140));

        panel1.setBackground(new java.awt.Color(255, 255, 255));
        panel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                panel1MousePressed(evt);
            }
        });
        panel1.setLayout(new javax.swing.BoxLayout(panel1, javax.swing.BoxLayout.LINE_AXIS));
        getContentPane().add(panel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 30, 270, 140));

        panel2.setBackground(new java.awt.Color(255, 255, 255));
        panel2.setLayout(new javax.swing.BoxLayout(panel2, javax.swing.BoxLayout.LINE_AXIS));
        getContentPane().add(panel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 200, 270, 140));

        Panel_Contenedor.setBackground(new java.awt.Color(51, 153, 255));
        Panel_Contenedor.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        Panel_Contenedor.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Boton_cargar.setText("Cargar Tabla");
        Boton_cargar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Boton_cargarActionPerformed(evt);
            }
        });
        Panel_Contenedor.add(Boton_cargar, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 270, 180, -1));

        Cambiar_nombre.setText("Cambiar nombre a Tabla");
        Cambiar_nombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Cambiar_nombreActionPerformed(evt);
            }
        });
        Panel_Contenedor.add(Cambiar_nombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 420, 180, -1));
        Panel_Contenedor.add(Lbl_Opciones, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 240, 70));

        Add_Fila_Tabla.setText("Agregar Fila a Tabla");
        Add_Fila_Tabla.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Add_Fila_TablaActionPerformed(evt);
            }
        });
        Panel_Contenedor.add(Add_Fila_Tabla, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 300, 180, -1));

        jButton4.setText("Guardar ");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        Panel_Contenedor.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 490, 180, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel3.setText("Apartado de Tablas");
        Panel_Contenedor.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 240, -1, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel4.setText("Apartado de Clases");
        Panel_Contenedor.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(41, 460, 160, -1));

        Delete_Fila1.setText("Eliminar Fila de Tabla ");
        Delete_Fila1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Delete_Fila1ActionPerformed(evt);
            }
        });
        Panel_Contenedor.add(Delete_Fila1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 360, 180, -1));

        Relaciones.setText("Relaciones ");
        Relaciones.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RelacionesActionPerformed(evt);
            }
        });
        Panel_Contenedor.add(Relaciones, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 330, 180, -1));

        Lbl_mos.setPreferredSize(new java.awt.Dimension(128, 128));
        Panel_Contenedor.add(Lbl_mos, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 90, -1, -1));

        Delete_Tabla.setText("Eliminar  Tabla ");
        Delete_Tabla.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Delete_TablaActionPerformed(evt);
            }
        });
        Panel_Contenedor.add(Delete_Tabla, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 390, 180, -1));

        getContentPane().add(Panel_Contenedor, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 250, 530));

        boton_salir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/1484031936_x.png"))); // NOI18N
        boton_salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton_salirActionPerformed(evt);
            }
        });
        getContentPane().add(boton_salir, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 0, 30, 30));

        panel6.setBackground(new java.awt.Color(255, 255, 255));
        panel6.setLayout(new javax.swing.BoxLayout(panel6, javax.swing.BoxLayout.LINE_AXIS));

        panel12.setBackground(new java.awt.Color(255, 255, 255));
        panel12.setLayout(new javax.swing.BoxLayout(panel12, javax.swing.BoxLayout.LINE_AXIS));
        panel6.add(panel12);

        getContentPane().add(panel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 370, 270, 140));

        panel4.setBackground(new java.awt.Color(255, 255, 255));
        panel4.setLayout(new javax.swing.BoxLayout(panel4, javax.swing.BoxLayout.LINE_AXIS));
        getContentPane().add(panel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 30, 270, 140));

        Lbl_2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        Lbl_2.setForeground(new java.awt.Color(255, 255, 255));
        Lbl_2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Lbl_2.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        Lbl_2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        Lbl_2.setVerticalTextPosition(javax.swing.SwingConstants.TOP);
        getContentPane().add(Lbl_2, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 180, 270, 20));

        panel5.setBackground(new java.awt.Color(255, 255, 255));
        panel5.setLayout(new javax.swing.BoxLayout(panel5, javax.swing.BoxLayout.LINE_AXIS));
        getContentPane().add(panel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 200, 270, 140));

        Lbl_1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        Lbl_1.setForeground(new java.awt.Color(255, 255, 255));
        Lbl_1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Lbl_1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        Lbl_1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        Lbl_1.setVerticalTextPosition(javax.swing.SwingConstants.TOP);
        getContentPane().add(Lbl_1, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 10, 270, 20));

        Lbl_3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        Lbl_3.setForeground(new java.awt.Color(255, 255, 255));
        Lbl_3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Lbl_3.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        Lbl_3.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        Lbl_3.setVerticalTextPosition(javax.swing.SwingConstants.TOP);
        getContentPane().add(Lbl_3, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 350, 270, 20));

        Lbl_4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        Lbl_4.setForeground(new java.awt.Color(255, 255, 255));
        Lbl_4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Lbl_4.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        Lbl_4.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        Lbl_4.setVerticalTextPosition(javax.swing.SwingConstants.TOP);
        getContentPane().add(Lbl_4, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 10, 270, 20));

        Lbl_6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        Lbl_6.setForeground(new java.awt.Color(255, 255, 255));
        Lbl_6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Lbl_6.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        Lbl_6.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        Lbl_6.setVerticalTextPosition(javax.swing.SwingConstants.TOP);
        getContentPane().add(Lbl_6, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 350, 270, 20));

        Lbl_5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        Lbl_5.setForeground(new java.awt.Color(255, 255, 255));
        Lbl_5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Lbl_5.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        Lbl_5.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        Lbl_5.setVerticalTextPosition(javax.swing.SwingConstants.TOP);
        getContentPane().add(Lbl_5, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 180, 270, 20));
        getContentPane().add(Lbl_Fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(248, 0, 2160, 530));

        pack();
    }// </editor-fold>//GEN-END:initComponents
	//accion tomada por el boton cargar
    private void Boton_cargarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Boton_cargarActionPerformed

			if (contar() == 6) {
				JOptionPane.showMessageDialog(this, "Solamente puedes cargar 6 Tablas");
				return;
			}
			nombre = JOptionPane.showInputDialog(
							this,
							"Introduce un Nombre", "Creacion de Tabla",
							JOptionPane.QUESTION_MESSAGE);
			if (nombre != null) {
				if (!nombre.equals("")) {

					Tablon temp = buscarTabla(nombre);
					if (temp == null) {
						tabla();
					} else {
						JOptionPane.showMessageDialog(this, " Existe la tabla con el nombre " + nombre);
					}

				} else {
					JOptionPane.showMessageDialog(this, "Debe ingresar un nombre");
				}

			} else {
				System.out.println("El usuario ha cancelado");
			}

			//
			pack();
			revalidate();
    }//GEN-LAST:event_Boton_cargarActionPerformed
	

	public int buscarDisponible() {
		for (int i = 0; i < 6; i++) {
			if (!numeros[i]) {
				return i;
			}
		}
		return -1;
	}


	public int contar() {
		int cantidad = 0;
		for (int i = 0; i < 6; i++) {
			if (numeros[i]) {
				cantidad++;
			}
		}
		return cantidad;
	} 
	
	public void listar() {
	
	}
	

	public void tabla() {

		switch (buscarDisponible()) {

			case 0:
				tablaso1 = new Tablon(0, panel1, Lbl_1, numeros);
				tablaso1.creartabla();
				numeros[0] = true;
				Lbl_1.setText(nombre);
				break;

			case 1:
				tablaso2 = new Tablon(1, panel2, Lbl_2, numeros);
				tablaso2.creartabla();
				numeros[1] = true;
				Lbl_2.setText(nombre);

				break;
			case 2:
				tablaso3 = new Tablon(2, panel3, Lbl_3, numeros);
				tablaso3.creartabla();
				numeros[2] = true;
				Lbl_3.setText(nombre);

				break;
			case 3:
				tablaso4 = new Tablon(3, panel4, Lbl_4, numeros);
				tablaso4.creartabla();
				numeros[3] = true;
				Lbl_4.setText(nombre);
				break;
			case 4:
				tablaso5 = new Tablon(4, panel5, Lbl_5, numeros);
				tablaso5.creartabla();
				numeros[4] = true;
				Lbl_5.setText(nombre);
				break;
			case 5:
				tablaso6 = new Tablon(5, panel6, Lbl_6, numeros);
				tablaso6.creartabla();
				numeros[5] = true;
				Lbl_6.setText(nombre);
				break;
		}

	}

	public Tablon buscarTabla(String cadena) {

		if (Lbl_1.getText().equals(cadena)) {
			return tablaso1;
		}
		if (Lbl_2.getText().equals(cadena)) {
			return tablaso2;
		}
		if (Lbl_3.getText().equals(cadena)) {
			return tablaso3;
		}
		if (Lbl_4.getText().equals(cadena)) {
			return tablaso4;
		}
		if (Lbl_5.getText().equals(cadena)) {
			return tablaso5;
		}
		if (Lbl_6.getText().equals(cadena)) {
			return tablaso6;
		}

		return null;
	}
	
	public ArrayList<String> getLista() {
		ArrayList<String> lista = new ArrayList<>();
	  if (!Lbl_1.getText().equals("")) lista.add(Lbl_1.getText());
		if (!Lbl_2.getText().equals("")) lista.add(Lbl_2.getText());
		if (!Lbl_3.getText().equals("")) lista.add(Lbl_3.getText());
		if (!Lbl_4.getText().equals("")) lista.add(Lbl_4.getText());
		if (!Lbl_5.getText().equals("")) lista.add(Lbl_5.getText());
		if (!Lbl_6.getText().equals("")) lista.add(Lbl_6.getText());
		return lista;
	}

    private void Add_Fila_TablaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Add_Fila_TablaActionPerformed

			if (contar() == 0) {
				JOptionPane.showMessageDialog(this, "No se han agregado tablas");
				return;
			}

			String cadena = JOptionPane.showInputDialog(
							this,
							"Introduce un Nombre ", "Busqueda de Tabla  ",
							JOptionPane.QUESTION_MESSAGE);

			if (cadena != null) {
				if (!cadena.equals("")) {

					Tablon tabla = buscarTabla(cadena);
					if (tabla != null) {
						tabla.agregar();
					} else {
						JOptionPane.showMessageDialog(this, "No existe la tabla con el nombre " + cadena);
					}

				} else {
					JOptionPane.showMessageDialog(this, "Debe ingresar un nombre");
				}

			}


    }//GEN-LAST:event_Add_Fila_TablaActionPerformed
	
		
    private void Cambiar_nombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Cambiar_nombreActionPerformed
			if (contar() == 0) {
				JOptionPane.showMessageDialog(this, "No se han agregado tablas");
				return;
			} 

			String cadena = JOptionPane.showInputDialog(
							this,
							"Introduce un Nombre ", "Busqueda de Tabla  ",
							JOptionPane.QUESTION_MESSAGE);

			if (cadena != null) {
				if (!cadena.equals("")) {

					Tablon tabla = buscarTabla(cadena);
					
					if (tabla != null) {
						 String nuevo = JOptionPane.showInputDialog(
							this,
							"Introduce un nuevo nombre ", "Busqueda de Tabla  ",
							JOptionPane.QUESTION_MESSAGE);

							if (nuevo != null) {
								if (!nuevo.equals("")) {
								  tabla.getLabel().setText(nuevo);
								} 
							} else {
							  JOptionPane.showMessageDialog(this, "Debe ingresar un nombre");
							}
						 
					} else {
						JOptionPane.showMessageDialog(this, "No existe la tabla con el nombre " + cadena);
					}

				} else {
					JOptionPane.showMessageDialog(this, "Debe ingresar un nombre");
				}

			}


    }//GEN-LAST:event_Cambiar_nombreActionPerformed

    private void boton_salirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_salirActionPerformed
			System.exit(0);
    }//GEN-LAST:event_boton_salirActionPerformed

    private void RelacionesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RelacionesActionPerformed
			if (contar() == 0) {
				JOptionPane.showMessageDialog(this, "No se han agregado tablas");
				return;
			}
			frameRelacion.setVisible(true);
			frameRelacion.setLocationRelativeTo(this);
			frameRelacion.actualizarListas(getLista());
    }//GEN-LAST:event_RelacionesActionPerformed

    private void panel1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panel1MousePressed

    }//GEN-LAST:event_panel1MousePressed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
			if (contar() == 0) {
				JOptionPane.showMessageDialog(this, "No se han agregado tablas");
				return;
			}
			
			try {
				
				if (numeros[0]) {
				  guardar = new Guardar(tablaso1, Lbl_1.getText());
				  guardar.registrarArchivo();
				}
				
				if (numeros[1]) {
				  guardar = new Guardar(tablaso2, Lbl_2.getText());
				  guardar.registrarArchivo();
				}
				
				if (numeros[2]) {
				  guardar = new Guardar(tablaso3, Lbl_3.getText());
				  guardar.registrarArchivo();
				}
				
				if (numeros[3]) {
				  guardar = new Guardar(tablaso4, Lbl_4.getText());
				  guardar.registrarArchivo();
				}
				
				if (numeros[4]) {
				  guardar = new Guardar(tablaso5, Lbl_5.getText());
				  guardar.registrarArchivo();
				}
				
				if (numeros[5]) {
				  guardar = new Guardar(tablaso6, Lbl_6.getText());
				  guardar.registrarArchivo();
				}
				

			} catch (IOException ex) {
				Logger.getLogger(Frame.class.getName()).log(Level.SEVERE, null, ex);
			}

    }//GEN-LAST:event_jButton4ActionPerformed

    private void Delete_Fila1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Delete_Fila1ActionPerformed
			if (contar() == 0) {
				JOptionPane.showMessageDialog(this, "No se han agregado tablas");
				return;
			} 

			String cadena = JOptionPane.showInputDialog(
							this,
							"Introduce un Nombre ", "Busqueda de Tabla  ",
							JOptionPane.QUESTION_MESSAGE);

			if (cadena != null) {
				if (!cadena.equals("")) {

					Tablon tabla = buscarTabla(cadena);
					if (tabla != null) {
						tabla.eliminar();
					} else {
						JOptionPane.showMessageDialog(this, "No existe la tabla con el nombre " + cadena);
					}

				} else {
					JOptionPane.showMessageDialog(this, "Debe ingresar un nombre");
				}

			}
    }//GEN-LAST:event_Delete_Fila1ActionPerformed

    private void Delete_TablaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Delete_TablaActionPerformed
			if (contar() == 0) {
				JOptionPane.showMessageDialog(this, "No se han agregado tablas");
				return;
			} // que deberia hacer ?

			String cadena = JOptionPane.showInputDialog(
							this,
							"Introduce un Nombre ", "Busqueda de Tabla  ",
							JOptionPane.QUESTION_MESSAGE);

			if (cadena != null) {
				if (!cadena.equals("")) {

					Tablon tabla = buscarTabla(cadena);
					if (tabla != null) {
						tabla.delete();
					} else {
						JOptionPane.showMessageDialog(this, "No existe la tabla con el nombre " + cadena);
					}

				} else {
					JOptionPane.showMessageDialog(this, "Debe ingresar un nombre");
				}

			}
    }//GEN-LAST:event_Delete_TablaActionPerformed

	public static void main(String args[]) {
		/* Set the Nimbus look and feel */
		//<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
		/* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
		 */
		try {
			for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
				if ("Nimbus".equals(info.getName())) {
					javax.swing.UIManager.setLookAndFeel(info.getClassName());
					break;
				}
			}
		} catch (ClassNotFoundException ex) {
			java.util.logging.Logger.getLogger(Frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		} catch (InstantiationException ex) {
			java.util.logging.Logger.getLogger(Frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		} catch (IllegalAccessException ex) {
			java.util.logging.Logger.getLogger(Frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		} catch (javax.swing.UnsupportedLookAndFeelException ex) {
			java.util.logging.Logger.getLogger(Frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		}
		//</editor-fold>

		/* Create and display the form */
		java.awt.EventQueue.invokeLater(new Runnable() {
			public void run() {
				new Frame().setVisible(true);
			}
		});
	}

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Add_Fila_Tabla;
    public javax.swing.JButton Boton_cargar;
    private javax.swing.JButton Cambiar_nombre;
    private javax.swing.JButton Delete_Fila1;
    private javax.swing.JButton Delete_Tabla;
    private javax.swing.JLabel Lbl_1;
    private javax.swing.JLabel Lbl_2;
    private javax.swing.JLabel Lbl_3;
    private javax.swing.JLabel Lbl_4;
    private javax.swing.JLabel Lbl_5;
    private javax.swing.JLabel Lbl_6;
    private javax.swing.JLabel Lbl_Fondo;
    private javax.swing.JLabel Lbl_Opciones;
    private javax.swing.JLabel Lbl_mos;
    private javax.swing.JPanel Panel_Contenedor;
    private javax.swing.JButton Relaciones;
    private javax.swing.JButton boton_salir;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel panel1;
    private javax.swing.JPanel panel11;
    private javax.swing.JPanel panel12;
    private javax.swing.JPanel panel2;
    private javax.swing.JPanel panel3;
    private javax.swing.JPanel panel4;
    private javax.swing.JPanel panel5;
    private javax.swing.JPanel panel6;
    // End of variables declaration//GEN-END:variables
}
