/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prueba_fuente;

/**
 *
 * @author Cibert_Poet
 */
public class prueba extends javax.swing.JInternalFrame {

    float p1, p2, c1, c2, r;

    public prueba() {
        initComponents();
        this.setLocation(100, 100);
        desavilitarControl();

    }

    private void control() {
        this.txtCantidad1.setText("");
        this.txtCantidad2.setText("");
        this.txtPrecio1.setText("");
        this.txtPrecio2.setText("");
        this.txtElesticidad.setText("");
        this.txtResultado1.setText("");
    }
    
    private void desavilitarControl(){
        txtElesticidad.setEditable(false);
        txtResultado1.setEditable(false
        );
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        abstractAreaEffect1 = new org.jdesktop.swingx.painter.effects.AbstractAreaEffect();
        basicStatusBarUI1 = new org.jdesktop.swingx.plaf.basic.BasicStatusBarUI();
        weakEventListenerList1 = new org.jdesktop.swingx.event.WeakEventListenerList();
        weakEventListenerList2 = new org.jdesktop.swingx.event.WeakEventListenerList();
        textPainter1 = new org.jdesktop.swingx.painter.TextPainter();
        jcMousePanelBeanInfo1 = new jcMousePanel.jcMousePanelBeanInfo();
        layoutStyle1 = new org.jdesktop.layout.LayoutStyle();
        layoutStyle2 = new org.jdesktop.layout.LayoutStyle();
        jcMousePanel1 = new jcMousePanel.jcMousePanel();
        labelHeader1 = new org.edisoncor.gui.label.LabelHeader();
        labelHeader2 = new org.edisoncor.gui.label.LabelHeader();
        txtCantidad2 = new org.edisoncor.gui.textField.TextFieldRectBackground();
        btnLimpiar = new org.edisoncor.gui.button.ButtonAction();
        labelHeader3 = new org.edisoncor.gui.label.LabelHeader();
        txtElesticidad = new org.edisoncor.gui.textField.TextFieldRectBackground();
        labelHeader4 = new org.edisoncor.gui.label.LabelHeader();
        txtCantidad1 = new org.edisoncor.gui.textField.TextFieldRectBackground();
        txtPrecio1 = new org.edisoncor.gui.textField.TextFieldRectBackground();
        buttonAction2 = new org.edisoncor.gui.button.ButtonAction();
        btnSalir = new org.edisoncor.gui.button.ButtonAction();
        btnCalucular = new org.edisoncor.gui.button.ButtonAction();
        txtPrecio2 = new org.edisoncor.gui.textField.TextFieldRectBackground();
        labelHeader5 = new org.edisoncor.gui.label.LabelHeader();
        labelHeader6 = new org.edisoncor.gui.label.LabelHeader();
        labelHeader7 = new org.edisoncor.gui.label.LabelHeader();
        txtResultado1 = new org.edisoncor.gui.textField.TextFieldRectBackground();

        setClosable(true);
        setMaximizable(true);
        setResizable(true);

        jcMousePanel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/prueba_fuente/Hada Hermosa.jpg"))); // NOI18N
        jcMousePanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        labelHeader1.setText("resultado");
        jcMousePanel1.add(labelHeader1, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 420, -1, -1));

        labelHeader2.setText("cantidad demandada");
        jcMousePanel1.add(labelHeader2, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 70, -1, -1));
        jcMousePanel1.add(txtCantidad2, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 270, 110, -1));

        btnLimpiar.setText("limpiar");
        btnLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarActionPerformed(evt);
            }
        });
        jcMousePanel1.add(btnLimpiar, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 400, -1, -1));

        labelHeader3.setText("precioProducto");
        jcMousePanel1.add(labelHeader3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 80, -1, -1));
        jcMousePanel1.add(txtElesticidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 400, 120, -1));

        labelHeader4.setText("cantiadad 1");
        jcMousePanel1.add(labelHeader4, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 150, -1, -1));
        jcMousePanel1.add(txtCantidad1, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 180, 110, -1));
        jcMousePanel1.add(txtPrecio1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 190, 110, -1));

        buttonAction2.setText("buttonAction1");
        jcMousePanel1.add(buttonAction2, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 400, -1, -1));

        btnSalir.setText("salir");
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });
        jcMousePanel1.add(btnSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 310, -1, -1));

        btnCalucular.setText("calcular");
        btnCalucular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCalucularActionPerformed(evt);
            }
        });
        jcMousePanel1.add(btnCalucular, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 330, -1, -1));
        jcMousePanel1.add(txtPrecio2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 280, 120, -1));

        labelHeader5.setText("cantidad 2");
        jcMousePanel1.add(labelHeader5, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 230, -1, -1));

        labelHeader6.setText("precio 1 :");
        jcMousePanel1.add(labelHeader6, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 150, -1, -1));

        labelHeader7.setText("precio :");
        jcMousePanel1.add(labelHeader7, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 240, -1, -1));
        jcMousePanel1.add(txtResultado1, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 430, 120, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jcMousePanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jcMousePanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 454, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnSalirActionPerformed

    private void btnCalucularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCalucularActionPerformed

        float p1 = Float.parseFloat(txtPrecio1.getText());
        float p2 = Float.parseFloat(txtPrecio2.getText());
        float c1 = Float.parseFloat(txtCantidad1.getText());
        float c2 = Float.parseFloat(txtCantidad2.getText());

        r = (((c1 - c2) / c1) * 100) / (((p2 - p1) / p2) * 100);

        txtElesticidad.setText(Float.toString(r));
        //  txtResultado.setText(" "+r);

        if (r < 0) {
            r = -1 * r;
            txtElesticidad.setText("inelastica");
            if (r > 0) {
                txtElesticidad.setText("es elastica");

            }
            if (r == 1) {
                txtElesticidad.setText("es unitaria");
            }
        }

    }//GEN-LAST:event_btnCalucularActionPerformed

    private void btnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarActionPerformed
        control();
    }//GEN-LAST:event_btnLimpiarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private org.jdesktop.swingx.painter.effects.AbstractAreaEffect abstractAreaEffect1;
    private org.jdesktop.swingx.plaf.basic.BasicStatusBarUI basicStatusBarUI1;
    private org.edisoncor.gui.button.ButtonAction btnCalucular;
    private org.edisoncor.gui.button.ButtonAction btnLimpiar;
    private org.edisoncor.gui.button.ButtonAction btnSalir;
    private org.edisoncor.gui.button.ButtonAction buttonAction2;
    private jcMousePanel.jcMousePanel jcMousePanel1;
    private jcMousePanel.jcMousePanelBeanInfo jcMousePanelBeanInfo1;
    private org.edisoncor.gui.label.LabelHeader labelHeader1;
    private org.edisoncor.gui.label.LabelHeader labelHeader2;
    private org.edisoncor.gui.label.LabelHeader labelHeader3;
    private org.edisoncor.gui.label.LabelHeader labelHeader4;
    private org.edisoncor.gui.label.LabelHeader labelHeader5;
    private org.edisoncor.gui.label.LabelHeader labelHeader6;
    private org.edisoncor.gui.label.LabelHeader labelHeader7;
    private org.jdesktop.layout.LayoutStyle layoutStyle1;
    private org.jdesktop.layout.LayoutStyle layoutStyle2;
    private org.jdesktop.swingx.painter.TextPainter textPainter1;
    private org.edisoncor.gui.textField.TextFieldRectBackground txtCantidad1;
    private org.edisoncor.gui.textField.TextFieldRectBackground txtCantidad2;
    private org.edisoncor.gui.textField.TextFieldRectBackground txtElesticidad;
    private org.edisoncor.gui.textField.TextFieldRectBackground txtPrecio1;
    private org.edisoncor.gui.textField.TextFieldRectBackground txtPrecio2;
    private org.edisoncor.gui.textField.TextFieldRectBackground txtResultado1;
    private org.jdesktop.swingx.event.WeakEventListenerList weakEventListenerList1;
    private org.jdesktop.swingx.event.WeakEventListenerList weakEventListenerList2;
    // End of variables declaration//GEN-END:variables
}
