
import javax.swing.table.DefaultTableModel;


public class MenuFrame extends javax.swing.JFrame {
    private Tablon tabla;
  
    
    public MenuFrame(Tablon tabla) {
        initComponents();
        this.tabla = tabla;
        
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Btn_Eliminar = new javax.swing.JButton();
        Btn_Agregar = new javax.swing.JButton();
        Btn_Delete = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(134, 187));
        setUndecorated(true);
        setPreferredSize(new java.awt.Dimension(134, 187));
        setResizable(false);
        addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                formFocusLost(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Btn_Eliminar.setText("Eliminar Fila");
        Btn_Eliminar.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                Btn_EliminarFocusLost(evt);
            }
        });
        Btn_Eliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_EliminarActionPerformed(evt);
            }
        });
        getContentPane().add(Btn_Eliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 97, -1));

        Btn_Agregar.setText("Agregar");
        Btn_Agregar.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                Btn_AgregarFocusLost(evt);
            }
        });
        Btn_Agregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_AgregarActionPerformed(evt);
            }
        });
        getContentPane().add(Btn_Agregar, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, 97, -1));

        Btn_Delete.setText("Eliminar Tabla");
        Btn_Delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_DeleteActionPerformed(evt);
            }
        });
        getContentPane().add(Btn_Delete, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_formFocusLost
      dispose();
      
    }//GEN-LAST:event_formFocusLost

    private void Btn_EliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_EliminarActionPerformed
     tabla.eliminar();
     //requestFocus()
    }//GEN-LAST:event_Btn_EliminarActionPerformed

    private void Btn_EliminarFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_Btn_EliminarFocusLost
     // dispose();
    }//GEN-LAST:event_Btn_EliminarFocusLost

    private void Btn_AgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_AgregarActionPerformed
       tabla.agregar();
  

        
    }//GEN-LAST:event_Btn_AgregarActionPerformed

    private void Btn_AgregarFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_Btn_AgregarFocusLost
     //dispose();
    }//GEN-LAST:event_Btn_AgregarFocusLost

    private void Btn_DeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_DeleteActionPerformed
      tabla.delete();
    }//GEN-LAST:event_Btn_DeleteActionPerformed

    
   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Btn_Agregar;
    private javax.swing.JButton Btn_Delete;
    private javax.swing.JButton Btn_Eliminar;
    // End of variables declaration//GEN-END:variables
}
