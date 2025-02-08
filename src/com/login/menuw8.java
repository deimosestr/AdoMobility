package com.login;

import com.video.FrameReproductor;
import org.netbeans.lib.awtextra.AbsoluteConstraints;
import org.netbeans.lib.awtextra.AbsoluteLayout;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.sql.Connection;
import javax.crypto.AEADBadTagException;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class menuw8 extends javax.swing.JFrame {

    FondoPanel fondo = new FondoPanel();
    int xMouse, yMouse;
    private boolean isPasswordVisible = false;
    private final TConexion conexion = new TConexion();

    public menuw8() {

        //Aplicar transparencias
        setUndecorated(true);
        setBackground(new Color(255, 255, 255));
        setSize(790, 500);
        setLocationRelativeTo(null);
        initComponents();
        this.setSize(800, 500);  // Solo si quieres cambiar el tamaño por código       
        panelMenu.setOpaque(false);
        etiquetaUsuarios.setText(globalV.user);

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel8 = new javax.swing.JLabel();
        exitBtn = new javax.swing.JPanel();
        exitTxt = new javax.swing.JLabel();
        barNaviMov = new javax.swing.JPanel();
        panelMenu = new javax.swing.JPanel();
        etiquetaBienvenido = new javax.swing.JLabel();
        salud = new com.login.buttons();
        acerca = new com.login.buttons();
        capacitacion = new com.login.buttons();
        organizacion = new com.login.buttons();
        organizacion1 = new com.login.buttons();
        etiquetaUsuarios = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(550, 305));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/imagenes/fond.jpeg"))); // NOI18N
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, -140, -1, -1));

        exitBtn.setBackground(new java.awt.Color(255, 255, 255));
        exitBtn.setPreferredSize(new java.awt.Dimension(40, 40));

        exitTxt.setBackground(new java.awt.Color(255, 255, 255));
        exitTxt.setFont(new java.awt.Font("Roboto Black", 1, 14)); // NOI18N
        exitTxt.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        exitTxt.setText("X");
        exitTxt.setPreferredSize(new java.awt.Dimension(40, 40));
        exitTxt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                exitTxtMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                exitTxtMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                exitTxtMouseExited(evt);
            }
        });

        javax.swing.GroupLayout exitBtnLayout = new javax.swing.GroupLayout(exitBtn);
        exitBtn.setLayout(exitBtnLayout);
        exitBtnLayout.setHorizontalGroup(
            exitBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, exitBtnLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(exitTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        exitBtnLayout.setVerticalGroup(
            exitBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, exitBtnLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(exitTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        getContentPane().add(exitBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 40, 40));

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
            .addGap(0, 790, Short.MAX_VALUE)
        );
        barNaviMovLayout.setVerticalGroup(
            barNaviMovLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
        );

        getContentPane().add(barNaviMov, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 790, 40));

        panelMenu.setBackground(new java.awt.Color(204, 204, 204));

        etiquetaBienvenido.setFont(new java.awt.Font("Roboto Medium", 0, 24)); // NOI18N
        etiquetaBienvenido.setForeground(new java.awt.Color(51, 51, 51));
        etiquetaBienvenido.setText("Bienvenido");

        salud.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/imagenes/salud.png"))); // NOI18N
        salud.setText("Salud");
        salud.setFont(new java.awt.Font("Roboto Medium", 0, 12)); // NOI18N
        salud.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        salud.setRadius(20);
        salud.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        salud.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saludActionPerformed(evt);
            }
        });

        acerca.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/imagenes/acerca de.png"))); // NOI18N
        acerca.setText("Acerca de");
        acerca.setFont(new java.awt.Font("Roboto Medium", 0, 12)); // NOI18N
        acerca.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        acerca.setRadius(20);
        acerca.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        acerca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                acercaActionPerformed(evt);
            }
        });

        capacitacion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/imagenes/capa.png"))); // NOI18N
        capacitacion.setText("Capacitacion");
        capacitacion.setFont(new java.awt.Font("Roboto Medium", 0, 12)); // NOI18N
        capacitacion.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        capacitacion.setRadius(20);
        capacitacion.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        capacitacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                capacitacionActionPerformed(evt);
            }
        });

        organizacion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/imagenes/seguridad.png"))); // NOI18N
        organizacion.setText("Seguridad");
        organizacion.setFont(new java.awt.Font("Roboto Medium", 0, 12)); // NOI18N
        organizacion.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        organizacion.setRadius(20);
        organizacion.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        organizacion.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                organizacionMouseClicked(evt);
            }
        });
        organizacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                organizacionActionPerformed(evt);
            }
        });

        organizacion1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/imagenes/organizacion.png"))); // NOI18N
        organizacion1.setText("Organizacion");
        organizacion1.setFont(new java.awt.Font("Roboto Medium", 0, 12)); // NOI18N
        organizacion1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        organizacion1.setRadius(20);
        organizacion1.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        organizacion1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                organizacion1MouseClicked(evt);
            }
        });
        organizacion1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                organizacion1ActionPerformed(evt);
            }
        });

        etiquetaUsuarios.setFont(new java.awt.Font("Roboto Light", 1, 12)); // NOI18N
        etiquetaUsuarios.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/imagenes/usuario.png"))); // NOI18N
        etiquetaUsuarios.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);

        javax.swing.GroupLayout panelMenuLayout = new javax.swing.GroupLayout(panelMenu);
        panelMenu.setLayout(panelMenuLayout);
        panelMenuLayout.setHorizontalGroup(
            panelMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelMenuLayout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(panelMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(organizacion, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(organizacion1, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(panelMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(etiquetaUsuarios, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(etiquetaBienvenido, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(salud, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(panelMenuLayout.createSequentialGroup()
                        .addComponent(capacitacion, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(acerca, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(33, Short.MAX_VALUE))
        );
        panelMenuLayout.setVerticalGroup(
            panelMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelMenuLayout.createSequentialGroup()
                .addGap(52, 52, 52)
                .addComponent(etiquetaUsuarios)
                .addGap(5, 5, 5)
                .addComponent(etiquetaBienvenido)
                .addGap(18, 18, 18)
                .addGroup(panelMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(panelMenuLayout.createSequentialGroup()
                        .addComponent(organizacion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(organizacion1, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelMenuLayout.createSequentialGroup()
                        .addComponent(salud, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panelMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(acerca, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(capacitacion, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(86, Short.MAX_VALUE))
        );

        getContentPane().add(panelMenu, new org.netbeans.lib.awtextra.AbsoluteConstraints(-20, 0, 490, 420));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void organizacion1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_organizacion1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_organizacion1ActionPerformed

    private void organizacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_organizacionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_organizacionActionPerformed

    private void organizacionMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_organizacionMouseClicked
        // TODO add your handling code here:
        homeScreen obj = new homeScreen();
        obj.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_organizacionMouseClicked

    private void capacitacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_capacitacionActionPerformed
        FrameReproductor obj = new FrameReproductor();
        obj.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_capacitacionActionPerformed

    private void acercaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_acercaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_acercaActionPerformed

    private void saludActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saludActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_saludActionPerformed

    private void exitTxtMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitTxtMouseClicked

        int opcion = JOptionPane.showConfirmDialog(null, "Deseas cerrar sesion?", "Aviso", JOptionPane.YES_OPTION);
        if (opcion == 0) {
            conexion.cerrarConexion();
            Login obj = new Login();
            obj.setVisible(true);
            obj.setLocationRelativeTo(null);
            this.dispose();
        } else {

        }

    }//GEN-LAST:event_exitTxtMouseClicked

    private void exitTxtMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitTxtMouseEntered
        // EVENTO QUE CAMBIA EL COLOR DEL FONDO DEL BOTON --
        exitBtn.setBackground(Color.red);
        exitTxt.setForeground(Color.white);
    }//GEN-LAST:event_exitTxtMouseEntered

    private void exitTxtMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitTxtMouseExited
        // EVENTO QUE CAMBIA EL COLOR DEL FONDO DEL BOTON --
        exitBtn.setBackground(Color.white);
        exitTxt.setForeground(Color.black);
    }//GEN-LAST:event_exitTxtMouseExited

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

    private void organizacion1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_organizacion1MouseClicked
        // TODO add your handling code here:
        screenOrganizacion obj = new screenOrganizacion();
        obj.setSize(790, 500);
        obj.setVisible(true);
        obj.setLocationRelativeTo(null);
    }//GEN-LAST:event_organizacion1MouseClicked

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
            java.util.logging.Logger.getLogger(menuw8.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(menuw8.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(menuw8.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(menuw8.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new menuw8().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.login.buttons acerca;
    private javax.swing.JPanel barNaviMov;
    private com.login.buttons capacitacion;
    private javax.swing.JLabel etiquetaBienvenido;
    private javax.swing.JLabel etiquetaUsuarios;
    private javax.swing.JPanel exitBtn;
    private javax.swing.JLabel exitTxt;
    private javax.swing.JLabel jLabel8;
    private com.login.buttons organizacion;
    private com.login.buttons organizacion1;
    private javax.swing.JPanel panelMenu;
    private com.login.buttons salud;
    // End of variables declaration//GEN-END:variables
    class FondoPanel extends JPanel {

        private Image imagen;

        @Override
        public void paint(Graphics g) {
            imagen = new ImageIcon(getClass().getResource("/com/imagenes/fondo.jpeg")).getImage();
            g.drawImage(imagen, 0, 0, getWidth(), getHeight(), this);

            setOpaque(false);

            super.paint(g);
        }
    }

}
