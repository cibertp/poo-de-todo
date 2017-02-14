package calculadora;

import javax.swing.JOptionPane;

/**
 *
 * @author Cibert_Poet
 */
public class frmCalculadora extends javax.swing.JInternalFrame {

    private String memoria1;
    private String signo;
    private String memoria2;

    public frmCalculadora() {
        initComponents();
    }

    public boolean existepunto(String cadena) {

        boolean resultado = false;
        for (int i = 0; i < cadena.length(); i++) {
            if (cadena.substring(i, i + 1).equals(".")) {
                resultado = true;
                break;

            }
        }
        return resultado;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtResultado = new javax.swing.JTextField();
        btn1 = new javax.swing.JButton();
        btn2 = new javax.swing.JButton();
        btn3 = new javax.swing.JButton();
        btn4 = new javax.swing.JButton();
        btn5 = new javax.swing.JButton();
        btn9 = new javax.swing.JButton();
        btnSuma = new javax.swing.JButton();
        btn6 = new javax.swing.JButton();
        btn8 = new javax.swing.JButton();
        btnResta = new javax.swing.JButton();
        btnDivicion = new javax.swing.JButton();
        btn0 = new javax.swing.JButton();
        btnSumaResta = new javax.swing.JButton();
        btnPunto = new javax.swing.JButton();
        btnBorrar = new javax.swing.JButton();
        btnMultiplicacion = new javax.swing.JButton();
        btnigual = new javax.swing.JButton();
        btnInversa = new javax.swing.JButton();
        btnBorrarTodo = new javax.swing.JButton();
        btn7 = new javax.swing.JButton();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);

        btn1.setText("1");
        btn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn1ActionPerformed(evt);
            }
        });

        btn2.setText("2");
        btn2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn2ActionPerformed(evt);
            }
        });

        btn3.setText("3");
        btn3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn3ActionPerformed(evt);
            }
        });

        btn4.setText("4");
        btn4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn4ActionPerformed(evt);
            }
        });

        btn5.setText("5");
        btn5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn5ActionPerformed(evt);
            }
        });

        btn9.setText("9");
        btn9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn9ActionPerformed(evt);
            }
        });

        btnSuma.setText("+");
        btnSuma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSumaActionPerformed(evt);
            }
        });

        btn6.setText("6");
        btn6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn6ActionPerformed(evt);
            }
        });

        btn8.setText("8");
        btn8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn8ActionPerformed(evt);
            }
        });

        btnResta.setText("-");
        btnResta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRestaActionPerformed(evt);
            }
        });

        btnDivicion.setText("/");
        btnDivicion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDivicionActionPerformed(evt);
            }
        });

        btn0.setText("0");
        btn0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn0ActionPerformed(evt);
            }
        });

        btnSumaResta.setText("+/-");
        btnSumaResta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSumaRestaActionPerformed(evt);
            }
        });

        btnPunto.setText(".");
        btnPunto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPuntoActionPerformed(evt);
            }
        });

        btnBorrar.setText("c");
        btnBorrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBorrarActionPerformed(evt);
            }
        });

        btnMultiplicacion.setText("*");
        btnMultiplicacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMultiplicacionActionPerformed(evt);
            }
        });

        btnigual.setText("=");
        btnigual.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnigualActionPerformed(evt);
            }
        });

        btnInversa.setText("1/x");
        btnInversa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInversaActionPerformed(evt);
            }
        });

        btnBorrarTodo.setText("ce");
        btnBorrarTodo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBorrarTodoActionPerformed(evt);
            }
        });

        btn7.setText("7");
        btn7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn7ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btn0)
                                .addGap(18, 18, 18)
                                .addComponent(btnSumaResta)
                                .addGap(18, 18, 18)
                                .addComponent(btnPunto)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnMultiplicacion)
                                .addGap(18, 18, 18)
                                .addComponent(btnigual, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btn1)
                                .addGap(18, 18, 18)
                                .addComponent(btn2)
                                .addGap(18, 18, 18)
                                .addComponent(btn3)
                                .addGap(18, 18, 18)
                                .addComponent(btnResta)
                                .addGap(18, 18, 18)
                                .addComponent(btnBorrar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btn4)
                                    .addComponent(btn7, javax.swing.GroupLayout.Alignment.TRAILING))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(btn5)
                                        .addGap(18, 18, 18)
                                        .addComponent(btn6)
                                        .addGap(18, 18, 18)
                                        .addComponent(btnSuma))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(btn8)
                                        .addGap(18, 18, 18)
                                        .addComponent(btn9)
                                        .addGap(18, 18, 18)
                                        .addComponent(btnDivicion)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(btnInversa, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btnBorrarTodo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(txtResultado, javax.swing.GroupLayout.PREFERRED_SIZE, 292, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(72, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(txtResultado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn1)
                    .addComponent(btn2)
                    .addComponent(btn3)
                    .addComponent(btnResta)
                    .addComponent(btnBorrar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnSuma)
                        .addComponent(btnBorrarTodo))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btn4)
                            .addComponent(btn5)
                            .addComponent(btn6))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btn7)
                            .addComponent(btn8)
                            .addComponent(btn9)
                            .addComponent(btnDivicion)
                            .addComponent(btnInversa))))
                .addGap(11, 11, 11)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btn0)
                        .addComponent(btnSumaResta)
                        .addComponent(btnPunto)
                        .addComponent(btnMultiplicacion))
                    .addComponent(btnigual))
                .addContainerGap(85, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn1ActionPerformed
        txtResultado.setText(txtResultado.getText() + "1");
    }//GEN-LAST:event_btn1ActionPerformed

    private void btn2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn2ActionPerformed
        txtResultado.setText(txtResultado.getText() + "2");
    }//GEN-LAST:event_btn2ActionPerformed

    private void btn3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn3ActionPerformed
        txtResultado.setText(txtResultado.getText() + "3");
    }//GEN-LAST:event_btn3ActionPerformed

    private void btn4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn4ActionPerformed
        txtResultado.setText(txtResultado.getText() + "4");
    }//GEN-LAST:event_btn4ActionPerformed

    private void btn5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn5ActionPerformed
        txtResultado.setText(txtResultado.getText() + "5");
    }//GEN-LAST:event_btn5ActionPerformed

    private void btn6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn6ActionPerformed
        txtResultado.setText(txtResultado.getText() + "6");
    }//GEN-LAST:event_btn6ActionPerformed

    private void btn7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn7ActionPerformed
        txtResultado.setText(txtResultado.getText() + "7");
    }//GEN-LAST:event_btn7ActionPerformed

    private void btn8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn8ActionPerformed
        txtResultado.setText(txtResultado.getText() + "8");
    }//GEN-LAST:event_btn8ActionPerformed

    private void btn9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn9ActionPerformed
        txtResultado.setText(txtResultado.getText() + "9");
    }//GEN-LAST:event_btn9ActionPerformed

    private void btn0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn0ActionPerformed
        txtResultado.setText(txtResultado.getText() + "0");
    }//GEN-LAST:event_btn0ActionPerformed

    private void btnPuntoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPuntoActionPerformed
        String cadena;
        cadena = txtResultado.getText();
        if (cadena.length() < 0) {
            txtResultado.setText("0.");
        } else {
            if (!existepunto(txtResultado.getText())) {
                txtResultado.setText(txtResultado.getText() + ".");
            }
        }

    }//GEN-LAST:event_btnPuntoActionPerformed

    private void btnSumaRestaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSumaRestaActionPerformed
        Double num = 0.0;
        String cadena = "";
        cadena = txtResultado.getText();

        if (cadena.length() > 0) {
            //para comvertir nesecito *-1
            num = (-1) * Double.parseDouble(cadena);

            txtResultado.setText(num.toString());
        }
    }//GEN-LAST:event_btnSumaRestaActionPerformed

    private void btnRestaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRestaActionPerformed

        if (!txtResultado.getText().equals("")) {
            memoria1 = txtResultado.getText();
            signo = "-";
            txtResultado.setText("");
        }
    }//GEN-LAST:event_btnRestaActionPerformed

    private void btnSumaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSumaActionPerformed

        String msj;
        msj = txtResultado.getText();

        if (msj.length() > 0) {
            memoria1 = txtResultado.getText();
            signo = "+";

            txtResultado.setText(signo);
        }
    }//GEN-LAST:event_btnSumaActionPerformed

    private void btnDivicionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDivicionActionPerformed

        if (txtResultado.getText().equals("")) {
            memoria1 = txtResultado.getText();
            signo = "/";
            txtResultado.setText("/");
        }
    }//GEN-LAST:event_btnDivicionActionPerformed

    private void btnMultiplicacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMultiplicacionActionPerformed
        if (!txtResultado.getText().equals("")) {
            memoria1 = txtResultado.getText();
            signo = "*";
            txtResultado.setText("*");
        }
    }//GEN-LAST:event_btnMultiplicacionActionPerformed

    private void btnBorrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBorrarActionPerformed
        String cadena;
        cadena = txtResultado.getText();

        if (cadena.length() > 0) {
            cadena = cadena.substring(0, cadena.length() - 1);
            txtResultado.setText(cadena);
        }
    }//GEN-LAST:event_btnBorrarActionPerformed

    private void btnBorrarTodoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBorrarTodoActionPerformed
        txtResultado.setText("");
    }//GEN-LAST:event_btnBorrarTodoActionPerformed

    private void btnInversaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInversaActionPerformed
        String cadena;
        Double numero = 0.0;
        cadena = txtResultado.getText();
        if (cadena.length() > 0) {
            numero = 1 / (Double.parseDouble(cadena));
            txtResultado.setText(Double.toString(numero));
        }


    }//GEN-LAST:event_btnInversaActionPerformed

    private void btnigualActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnigualActionPerformed
        String resultado = "";

        memoria2 = txtResultado.getText();

        if (!memoria2.equals("")) {
            resultado = calculadora(memoria1, memoria1, signo);
            txtResultado.setText(resultado);
        }
    }//GEN-LAST:event_btnigualActionPerformed

    private String calculadora(String memoria1, String memoria2, String signo) {
        double resultado = 0.0;
        String res = "";
        try {

            if (!signo.equals("-")) {
                resultado = Double.parseDouble(memoria1) - Double.parseDouble(memoria2);
            }
            if (!signo.equals("/")) {
                resultado = Double.parseDouble(memoria1) / Double.parseDouble(memoria2);

            }
            if (!signo.equals("*")) {
                resultado = Double.parseDouble(memoria1) * Double.parseDouble(memoria2);

            }
            if (!signo.equals("+")) {
                resultado = Double.parseDouble(memoria1) + Double.parseDouble(memoria2);

            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "calculadora" + e.getMessage());
        }
        res = Double.toString(resultado);
        return res;
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn0;
    private javax.swing.JButton btn1;
    private javax.swing.JButton btn2;
    private javax.swing.JButton btn3;
    private javax.swing.JButton btn4;
    private javax.swing.JButton btn5;
    private javax.swing.JButton btn6;
    private javax.swing.JButton btn7;
    private javax.swing.JButton btn8;
    private javax.swing.JButton btn9;
    private javax.swing.JButton btnBorrar;
    private javax.swing.JButton btnBorrarTodo;
    private javax.swing.JButton btnDivicion;
    private javax.swing.JButton btnInversa;
    private javax.swing.JButton btnMultiplicacion;
    private javax.swing.JButton btnPunto;
    private javax.swing.JButton btnResta;
    private javax.swing.JButton btnSuma;
    private javax.swing.JButton btnSumaResta;
    private javax.swing.JButton btnigual;
    private javax.swing.JTextField txtResultado;
    // End of variables declaration//GEN-END:variables

}
