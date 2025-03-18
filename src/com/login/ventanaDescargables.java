/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.login;

import java.awt.Desktop;
import java.net.URI;
import java.util.List;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;

public class ventanaDescargables extends javax.swing.JFrame {

    int xMouse, yMouse;
    CDatosNOM obj = new CDatosNOM();

    public ventanaDescargables() {
        initComponents();

        llenarComboBox();
    }

    public static void abrirEnlace(String url) {
        try {
            Desktop.getDesktop().browse(new URI(url)); // Abrir el enlace en el navegador
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void llenarComboBox() {
        // Método que devuelve la lista de nombres (ajusta según tu lógica)
        int idUsuario = obj.obtenerIDUsuario();
        List<String> valores = obj.obtenerNombreTerminales(idUsuario);
        // Crear un modelo para el JComboBox con los valores
        DefaultComboBoxModel<String> modelo = new DefaultComboBoxModel<>(valores.toArray(new String[0]));
        // Asignar el modelo al JComboBox
        terminalesDescargas.setModel(modelo);

        terminalesDescargas.insertItemAt("Seleccione una terminal", 0); // Insertar el mensaje inicial en la posición 0
        terminalesDescargas.setSelectedIndex(0); // Establecer el mensaje inicial como seleccionado
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bg = new javax.swing.JPanel();
        barNaviMov = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        modernButton1 = new com.login.ModernButton();
        descargar = new com.login.ModernButton();
        terminalesDescargas = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);

        bg.setBackground(new java.awt.Color(255, 255, 255));
        bg.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

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

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/imagenes/lgo.jpg"))); // NOI18N
        jLabel2.setText("jLabel2");

        javax.swing.GroupLayout barNaviMovLayout = new javax.swing.GroupLayout(barNaviMov);
        barNaviMov.setLayout(barNaviMovLayout);
        barNaviMovLayout.setHorizontalGroup(
            barNaviMovLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, barNaviMovLayout.createSequentialGroup()
                .addContainerGap(454, Short.MAX_VALUE)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(14, 14, 14))
        );
        barNaviMovLayout.setVerticalGroup(
            barNaviMovLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, barNaviMovLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel2))
        );

        bg.add(barNaviMov, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 600, 40));

        modernButton1.setText("TERMINAR");
        modernButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                modernButton1MouseClicked(evt);
            }
        });
        modernButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                modernButton1ActionPerformed(evt);
            }
        });
        bg.add(modernButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 190, 110, -1));

        descargar.setText("DESCARGAR");
        descargar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                descargarActionPerformed(evt);
            }
        });
        bg.add(descargar, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 90, -1, -1));

        terminalesDescargas.setBackground(new java.awt.Color(255, 255, 255));
        terminalesDescargas.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true), "URL", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION));
        terminalesDescargas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                terminalesDescargasActionPerformed(evt);
            }
        });
        bg.add(terminalesDescargas, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 80, 350, 50));

        jLabel1.setFont(new java.awt.Font("Roboto Black", 1, 14)); // NOI18N
        jLabel1.setText("ENLACES DE DESCARGA ABAJO, SELECCIONE TERMINAL");
        bg.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 50, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bg, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bg, javax.swing.GroupLayout.DEFAULT_SIZE, 250, Short.MAX_VALUE)
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

    private void modernButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_modernButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_modernButton1ActionPerformed

    private void descargarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_descargarActionPerformed
        // Obtener la terminal seleccionada en el combobox
        String terminalSeleccionada = (String) terminalesDescargas.getSelectedItem();

        // Verificar si se seleccionó una terminal válida
        if (terminalSeleccionada != null && !terminalSeleccionada.isEmpty() && !terminalSeleccionada.equals("Seleccione una terminal")) {
            // Obtener el enlace de descarga para la terminal seleccionada
            String enlace = obj.obtenerEnlaceDescarga(terminalSeleccionada);

            if (enlace != null && !enlace.isEmpty()) {
                // Abrir el enlace en el navegador
                ventanaDescargables.abrirEnlace(enlace);
            } else {
                JOptionPane.showMessageDialog(this, "No se encontró un enlace de descarga para la terminal seleccionada.", "Error", JOptionPane.ERROR_MESSAGE);
            }
        } else {
            JOptionPane.showMessageDialog(this, "Selecciona una terminal antes de descargar.", "Advertencia", JOptionPane.WARNING_MESSAGE);
        }
        }//GEN-LAST:event_descargarActionPerformed

    private void terminalesDescargasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_terminalesDescargasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_terminalesDescargasActionPerformed

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel barNaviMov;
    private javax.swing.JPanel bg;
    private com.login.ModernButton descargar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private com.login.ModernButton modernButton1;
    private javax.swing.JComboBox<String> terminalesDescargas;
    // End of variables declaration//GEN-END:variables
}
