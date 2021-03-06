/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor. oe poeta
 */
package vista;

import javax.swing.JOptionPane;

/**
 *
 * @author Cibert_Poet
 */
public class GestionBancos extends javax.swing.JInternalFrame {

    private double monto;

    public GestionBancos() {
        initComponents();
        limpiar();
    }

    private void limpiar() {
        desactivarControles();
        monto = 0.0;
        cboDepositos.removeAllItems();
        cboRetiros.removeAllItems();
        txtSaldo.setText(null);
        txtCliente.setText(null);
        txtMontoInicial.setText(null);

    }

    //deposito y retiro
    private double leer(String mensaje) {
        Double cantidad = 0.0;

        cantidad = Double.parseDouble(JOptionPane.showInputDialog("INGRES MONTO A " + mensaje, JOptionPane.INFORMATION_MESSAGE));

        return cantidad;
    }

    private void mostrar() {
        txtSaldo.setText(Double.toString(monto));
    }

    private void activarControles() {
        txtCliente.setEnabled(false);
        txtMontoInicial.setEnabled(false);
        txtSaldo.setEnabled(false);
        btnMonto.setEnabled(false);
        btnRetirar.setEnabled(true);
        btnDepocitar.setEnabled(true);
    }

    private void desactivarControles() {
        txtCliente.setEnabled(true);
        txtMontoInicial.setEnabled(true);
        btnMonto.setEnabled(true);
        btnRetirar.setEnabled(false);
        btnDepocitar.setEnabled(false);
        txtSaldo.setEnabled(false);
    }

    private void flujo() {
        String f = txtFlujo.getText();
        Double res;
        double d;

    }

    //no a sido corroborado falta logica
    private void validacion() {
        if (btnMonto.isSelected()) {
            txtCliente.setText(null);
            txtMontoInicial.setText(null);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        btnRetirar = new javax.swing.JButton();
        txtCliente = new javax.swing.JTextField();
        cboRetiros = new javax.swing.JComboBox();
        jLabel2 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtMontoInicial = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtFlujo = new javax.swing.JTextField();
        btnNuevo = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        txtSaldo = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        cboDepositos = new javax.swing.JComboBox();
        btnMonto = new javax.swing.JButton();
        btnDepocitar = new javax.swing.JButton();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setInheritsPopupMenu(true);

        jLabel1.setText("Cliente");

        btnRetirar.setText("Retirar");
        btnRetirar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRetirarActionPerformed(evt);
            }
        });

        cboRetiros.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLabel2.setText("Monto Inicial");

        jLabel5.setText("saldo");

        jLabel6.setText("flujo");

        txtFlujo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFlujoActionPerformed(evt);
            }
        });

        btnNuevo.setText("Nuevo");
        btnNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNuevoActionPerformed(evt);
            }
        });

        jLabel3.setText("depositos");

        jLabel4.setText("retiros");

        cboDepositos.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        btnMonto.setText("abrir cuenta");
        btnMonto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMontoActionPerformed(evt);
            }
        });

        btnDepocitar.setText("depositar");
        btnDepocitar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDepocitarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(86, 86, 86)
                .addComponent(btnDepocitar)
                .addGap(28, 28, 28)
                .addComponent(btnRetirar)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel1))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(51, 51, 51)
                                .addComponent(txtMontoInicial, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(40, 40, 40)
                                .addComponent(txtCliente)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(btnMonto))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(0, 99, Short.MAX_VALUE)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel4)
                                            .addComponent(jLabel3))
                                        .addGap(51, 51, 51)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(cboDepositos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(cboRetiros, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel6)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(txtFlujo, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(48, 48, 48)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel5)
                                            .addComponent(txtSaldo, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(35, 35, 35)
                                        .addComponent(btnNuevo)))))
                        .addGap(30, 30, 30))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(txtCliente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(7, 7, 7)
                        .addComponent(btnMonto)
                        .addGap(3, 3, 3)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(txtMontoInicial, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(28, 28, 28)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnDepocitar)
                            .addComponent(btnRetirar))
                        .addGap(27, 27, 27)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(cboDepositos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(33, 33, 33))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btnNuevo)
                        .addGap(12, 12, 12)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(cboRetiros, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 14, Short.MAX_VALUE)
                .addComponent(jLabel5)
                .addGap(7, 7, 7)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtSaldo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtFlujo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addGap(10, 10, 10))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnRetirarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRetirarActionPerformed
        Double retirar = leer("retirar");
        if (retirar <= monto) {
            monto = monto - retirar;
            cboRetiros.addItem(retirar);
            mostrar();
        } else {
            JOptionPane.showMessageDialog(rootPane, "usted no cuenta suficiente para retirar ese monto");
        }

    }//GEN-LAST:event_btnRetirarActionPerformed

    private void txtFlujoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFlujoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtFlujoActionPerformed

    private void btnNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevoActionPerformed
        limpiar();
    }//GEN-LAST:event_btnNuevoActionPerformed

    private void btnMontoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMontoActionPerformed

        //Captura de datos
        String cliente = txtCliente.getText();

        monto = Double.parseDouble(txtMontoInicial.getText());
        //condicion para abrir la cuenta
        if (monto >= 0) {
            activarControles();
            mostrar();
        } else {
            JOptionPane.showMessageDialog(rootPane, "monto agotado");
        }
    }//GEN-LAST:event_btnMontoActionPerformed

    private void btnDepocitarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDepocitarActionPerformed
        Double deposito;

        //ahora le voy llamar del meto leer q como savemos esta espando un campo
        deposito = leer("depositar");
        monto = monto + deposito;
        cboDepositos.addItem(deposito);
        mostrar();

    }//GEN-LAST:event_btnDepocitarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDepocitar;
    private javax.swing.JButton btnMonto;
    private javax.swing.JButton btnNuevo;
    private javax.swing.JButton btnRetirar;
    private javax.swing.JComboBox cboDepositos;
    private javax.swing.JComboBox cboRetiros;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JTextField txtCliente;
    private javax.swing.JTextField txtFlujo;
    private javax.swing.JTextField txtMontoInicial;
    private javax.swing.JTextField txtSaldo;
    // End of variables declaration//GEN-END:variables
}
