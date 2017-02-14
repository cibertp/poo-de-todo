package vista;

/**
 *
 * @author Cibert_Poet
 */
public class funcionesProcedimientos extends javax.swing.JFrame {

    public funcionesProcedimientos() {
        initComponents();
    }

    //creando un procedimiento
    private void limpiar() {
        TXTn2.setText(null);
        txtN1.setText(null);
        txtResultado.setText(null);
    }

    private double sumar(int a1, int a2) {
        double resultado = a1 + a2;
        return resultado;
    }

    private double restar(int r1, int r2) {
        double res = r1 + r2;
        return res;
    }

    private double dividir(int a, int b) {
        double res = a / b;
        return res;
    }

    private double multiplicar(int a, int b) {
        double res = a * b;
        return res;
    }

    //en un solo blooque todo los procedimientos arimeticos
    private double calculos(int a, int b, String operacion) {
        double res = 0;
        if (operacion == "s") {
            res = a + b;
        } else if (operacion == "r") {
            res = a - b;
        } else if (operacion == "m") {
            res = a * b;
        } else if (operacion == "d") {
            if (a > b) {
                res = a / b;
            } else {
                res = b / a;
            }

        }

        return res;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        txtN1 = new javax.swing.JTextField();
        btnRestar = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        TXTn2 = new javax.swing.JTextField();
        btnMultiplicar = new javax.swing.JButton();
        btnLimpiar = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        txtResultado = new javax.swing.JTextField();
        btnDividir = new javax.swing.JButton();
        btnSUMAR = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("numero 1");

        btnRestar.setText("Restar");
        btnRestar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRestarActionPerformed(evt);
            }
        });

        jLabel2.setText("numero 2");

        btnMultiplicar.setText("multipicar");
        btnMultiplicar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMultiplicarActionPerformed(evt);
            }
        });

        btnLimpiar.setText("limpiar");
        btnLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarActionPerformed(evt);
            }
        });

        jLabel3.setText("resultado");

        btnDividir.setText("dividir");
        btnDividir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDividirActionPerformed(evt);
            }
        });

        btnSUMAR.setText("sumar");
        btnSUMAR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSUMARActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(57, 57, 57)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel3)
                    .addComponent(jLabel2)
                    .addComponent(jLabel1))
                .addGap(56, 56, 56)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(TXTn2, javax.swing.GroupLayout.DEFAULT_SIZE, 118, Short.MAX_VALUE)
                            .addComponent(txtN1))
                        .addGap(26, 26, 26)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnRestar)
                            .addComponent(btnMultiplicar)
                            .addComponent(btnDividir)
                            .addComponent(btnSUMAR)))
                    .addComponent(txtResultado, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnLimpiar))
                .addContainerGap(21, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(46, 46, 46)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(txtN1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(24, 24, 24)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(TXTn2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(31, Short.MAX_VALUE)
                        .addComponent(btnSUMAR)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnRestar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnMultiplicar)
                        .addGap(18, 18, 18)))
                .addComponent(btnDividir, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(4, 4, 4)
                .addComponent(btnLimpiar)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtResultado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(72, 72, 72))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarActionPerformed

        limpiar();
    }//GEN-LAST:event_btnLimpiarActionPerformed

    private void btnSUMARActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSUMARActionPerformed
        double resultaPantalla = 0;
        //solo el procedimiento sumas();
        int n1 = Integer.parseInt(txtN1.getText());
        int n2 = Integer.parseInt(TXTn2.getText());
        resultaPantalla = sumar(n1, n2);

        txtResultado.setText(Double.toString(resultaPantalla));
    }//GEN-LAST:event_btnSUMARActionPerformed

    private void btnRestarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRestarActionPerformed
        double resultaPantalla = 0;
        //solo el procedimiento RESTAR();

        int n1 = Integer.parseInt(txtN1.getText());
        int n2 = Integer.parseInt(TXTn2.getText());

        //EL PROCEIMIENTO RESTAS CON PARAMETRO SIN CONIDCION
       /*
         resultaPantalla = restar(n1, n2);
         txtResultado.setText(Double.toString(resultaPantalla));
         */
        //EN ESTE CASO UTILIZAREMOS EL PROCEDIMIENTO MULTIPLE
        double res;
        res = calculos(n1, n2, "r");
        txtResultado.setText(Double.toString(res));


    }//GEN-LAST:event_btnRestarActionPerformed

    private void btnMultiplicarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMultiplicarActionPerformed

        //uso de procedimiento multipli
        int a = Integer.parseInt(txtN1.getText());
        int b = Integer.parseInt(TXTn2.getText());

        double res = calculos(a, b, "m");

        txtResultado.setText(Double.toString(res));
    }//GEN-LAST:event_btnMultiplicarActionPerformed

    private void btnDividirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDividirActionPerformed
       //todo en uno en este campo
        
        calculos(Integer.parseInt(txtN1.getText()), Integer.parseInt(TXTn2.getText()), "d");
        txtResultado.setText(Double.toString(calculos(Integer.parseInt(txtN1.getText()), Integer.parseInt(TXTn2.getText()), "d")));
    }//GEN-LAST:event_btnDividirActionPerformed

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
            java.util.logging.Logger.getLogger(funcionesProcedimientos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(funcionesProcedimientos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(funcionesProcedimientos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(funcionesProcedimientos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new funcionesProcedimientos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField TXTn2;
    private javax.swing.JButton btnDividir;
    private javax.swing.JButton btnLimpiar;
    private javax.swing.JButton btnMultiplicar;
    private javax.swing.JButton btnRestar;
    private javax.swing.JButton btnSUMAR;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JTextField txtN1;
    private javax.swing.JTextField txtResultado;
    // End of variables declaration//GEN-END:variables

}
