
package poo.cons.vista;

import poo.cons.clase.perro;

/**
 *
 * @author Cibert_Poet
 */
public class frmPerro extends javax.swing.JFrame {

   
    public frmPerro() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panel1 = new java.awt.Panel();
        txtMensaje = new javax.swing.JTextField();
        btnOb1 = new javax.swing.JButton();
        btnOb2 = new javax.swing.JButton();
        btnOb3 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btnOb1.setLabel("Objeto 1");
        btnOb1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOb1ActionPerformed(evt);
            }
        });

        btnOb2.setLabel("Objeto 2");
        btnOb2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOb2ActionPerformed(evt);
            }
        });

        btnOb3.setLabel("Objeto 3");
        btnOb3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOb3ActionPerformed(evt);
            }
        });

        jLabel1.setText("mensaje");

        javax.swing.GroupLayout panel1Layout = new javax.swing.GroupLayout(panel1);
        panel1.setLayout(panel1Layout);
        panel1Layout.setHorizontalGroup(
            panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel1Layout.createSequentialGroup()
                .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panel1Layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addComponent(btnOb1)
                        .addGap(31, 31, 31)
                        .addComponent(btnOb2)
                        .addGap(31, 31, 31)
                        .addComponent(btnOb3)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(panel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(txtMensaje)))
                .addContainerGap())
            .addGroup(panel1Layout.createSequentialGroup()
                .addGap(104, 104, 104)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panel1Layout.setVerticalGroup(
            panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel1Layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(txtMensaje, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnOb1)
                    .addComponent(btnOb2)
                    .addComponent(btnOb3))
                .addGap(102, 102, 102))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnOb1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOb1ActionPerformed
       perro p= new perro();
       p.altura=12.1;
       p.nombre="dincol ";
       p.raza= "Bulldog ";
       
       String mensaje = p.comer(" carne pura");
       txtMensaje.setText(mensaje);
    }//GEN-LAST:event_btnOb1ActionPerformed

    private void btnOb2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOb2ActionPerformed
        perro p= new perro();
       p.altura=12.1;
       p.nombre="MASCHIS ";
       String mensaje;
        mensaje = p.comer("POLLO");
        
        txtMensaje.setText(mensaje);
       
    }//GEN-LAST:event_btnOb2ActionPerformed

    private void btnOb3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOb3ActionPerformed
        perro pe= new perro("maxil ", "chizu ", 12.0);
        String mensaje =pe.comer(" gallina");
        txtMensaje.setText((mensaje));
    }//GEN-LAST:event_btnOb3ActionPerformed

    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(frmPerro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmPerro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmPerro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmPerro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmPerro().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnOb1;
    private javax.swing.JButton btnOb2;
    private javax.swing.JButton btnOb3;
    private javax.swing.JLabel jLabel1;
    private java.awt.Panel panel1;
    private javax.swing.JTextField txtMensaje;
    // End of variables declaration//GEN-END:variables
}
