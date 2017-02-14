package vista;

/**
 *
 * @author Cibert_Poet
 */
public class problemaarimetico extends javax.swing.JInternalFrame {

    /**
     * Creates new form problemaarimetico
     */
    public problemaarimetico() {
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

        btnRestar = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        TXTn2 = new javax.swing.JTextField();
        btnMultiplicar = new javax.swing.JButton();
        btnLimpiar = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        txtResultado = new javax.swing.JTextField();
        btnDividir = new javax.swing.JButton();
        btnSUMAR = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        txtN1 = new javax.swing.JTextField();

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

        jLabel1.setText("numero 1");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(44, 44, 44)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel1))
                        .addGap(56, 56, 56)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(TXTn2)
                            .addComponent(txtN1, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(39, 39, 39))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel3)
                        .addGap(56, 56, 56)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtResultado, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnLimpiar))
                        .addGap(18, 18, 18)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnRestar)
                    .addComponent(btnMultiplicar)
                    .addComponent(btnDividir)
                    .addComponent(btnSUMAR))
                .addContainerGap(15, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(txtN1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(24, 24, 24)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(TXTn2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnLimpiar)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(txtResultado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(87, 87, 87))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnSUMAR)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnRestar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnMultiplicar)
                        .addGap(18, 18, 18)
                        .addComponent(btnDividir, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(137, 137, 137))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

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

    private void btnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarActionPerformed

        limpiar();
    }//GEN-LAST:event_btnLimpiarActionPerformed

    private void btnDividirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDividirActionPerformed
        //todo en uno en este campo

        calculos(Integer.parseInt(txtN1.getText()), Integer.parseInt(TXTn2.getText()), "d");
        txtResultado.setText(Double.toString(calculos(Integer.parseInt(txtN1.getText()), Integer.parseInt(TXTn2.getText()), "d")));
    }//GEN-LAST:event_btnDividirActionPerformed

    private void btnSUMARActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSUMARActionPerformed
        double resultaPantalla = 0;
        //solo el procedimiento sumas();
        int n1 = Integer.parseInt(txtN1.getText());
        int n2 = Integer.parseInt(TXTn2.getText());
        resultaPantalla = sumar(n1, n2);

        txtResultado.setText(Double.toString(resultaPantalla));
    }//GEN-LAST:event_btnSUMARActionPerformed


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
