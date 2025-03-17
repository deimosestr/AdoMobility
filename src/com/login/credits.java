/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.login;

/**
 *
 * @author Fabian
 */
public class credits extends javax.swing.JFrame {

    int xMouse, yMouse;

    public credits() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bg = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        barNaviMov = new javax.swing.JPanel();
        modernButton1 = new com.login.ModernButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);

        bg.setBackground(new java.awt.Color(255, 255, 255));
        bg.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/imagenes/fotoEG (1).jpg"))); // NOI18N
        bg.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 30, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/imagenes/ht.jpg"))); // NOI18N
        bg.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 190, -1, -1));

        jLabel3.setFont(new java.awt.Font("Roboto", 1, 10)); // NOI18N
        jLabel3.setText("<html>"
            + "ESTE PROGRAMA FUE IMPLEMENTADO POR ALAN CRUZ JARCIA<br>"
            + "JOSÉ FABIAN SALCEDO ESTRADA Y BAJO LA COORDINACIÓN DE<br>"
            + "LA INGENIERO PAOLA V. TRUJILLO LOYO, ASÍ COMO TAMBIÉN<br>"
            + "CON EL APOYO DE NUESTRO AMIGO JEZREEL RIVERA A.<br>"
            + "AGRADECEMOS AL ADO POR DARNOS LA OPORTUNIDAD<br>"
            + "Y A HÊRMANN-THÔMÃS YA QUE EN LAS ÚLTIMAS SEMANAS<br>"
            + "DE IMPLEMENTACIÓN NOS BRINDARON EL ESPACIO, CONEXIÓN<br>"
            + "Y DISPONIBILIDAD DE TIEMPO PARA TERMINAR DICHO PROYECTO.<br>"
            + "</html>");
        bg.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 40, -1, -1));

        barNaviMov.setBackground(new java.awt.Color(255, 255, 255));
        barNaviMov.setForeground(new java.awt.Color(255, 255, 255));
        barNaviMov.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                barNaviMovMouseDragged(evt);
            }
        });
        barNaviMov.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                barNaviMovMousePressed(evt);
            }
        });

        javax.swing.GroupLayout barNaviMovLayout = new javax.swing.GroupLayout(barNaviMov);
        barNaviMov.setLayout(barNaviMovLayout);
        barNaviMovLayout.setHorizontalGroup(
            barNaviMovLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 600, Short.MAX_VALUE)
        );
        barNaviMovLayout.setVerticalGroup(
            barNaviMovLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
        );

        bg.add(barNaviMov, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 600, 40));

        modernButton1.setText("¡GRACIAS!");
        modernButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                modernButton1MouseClicked(evt);
            }
        });
        bg.add(modernButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 290, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bg, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bg, javax.swing.GroupLayout.DEFAULT_SIZE, 340, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void barNaviMovMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_barNaviMovMouseDragged
        // MOVER VENTANA --
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        this.setLocation(x - xMouse, y - yMouse);
    }//GEN-LAST:event_barNaviMovMouseDragged

    private void barNaviMovMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_barNaviMovMousePressed
        // MOVER VENTANA --
        xMouse = evt.getX();
        yMouse = evt.getY();
    }//GEN-LAST:event_barNaviMovMousePressed

    private void modernButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_modernButton1MouseClicked
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_modernButton1MouseClicked

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel barNaviMov;
    private javax.swing.JPanel bg;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private com.login.ModernButton modernButton1;
    // End of variables declaration//GEN-END:variables
}
