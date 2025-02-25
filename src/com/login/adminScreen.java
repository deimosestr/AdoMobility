package com.login;

import static com.login.globalV.conectar;
import java.awt.CardLayout;
import java.sql.Connection;
import java.awt.Color;
import java.io.IOException;
//import java.awt.List;
import javax.crypto.AEADBadTagException;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import java.util.List;
import java.util.ArrayList;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
//import static javafx.scene.paint.Color.color;

public class adminScreen extends javax.swing.JFrame {

    int xMouse, yMouse;
    CDatosNOM obj = new CDatosNOM();

    public adminScreen() {
        initComponents();
        setSize(790, 500);
        setLocationRelativeTo(null);
        llenarComboBox();
        //llenarComboBoxHumo();
        //bitacoras.setVisible(false);
        obj.MostrarEPP(tablaEPP);

        bitacoras.add(epp, "epp");
        //bitacoras.add(epp, "humo");
        //bitacoras.add(gas, "gas");

        buttonsNormas btnExtintores = new buttonsNormas();
        buttonsNormas btnHumo = new buttonsNormas();
        buttonsNormas btnGas = new buttonsNormas();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bgHomeScreen = new javax.swing.JPanel();
        barNavMov = new javax.swing.JPanel();
        logoDerecha = new javax.swing.JLabel();
        exitBtn = new javax.swing.JPanel();
        exitTxt = new javax.swing.JLabel();
        returnPanel = new javax.swing.JPanel();
        returnTxt = new javax.swing.JLabel();
        menuDeOpciones = new javax.swing.JPanel();
        menuUsuarios = new com.login.buttonsNormas();
        menuTerminales = new com.login.buttonsNormas();
        menuRegiones = new com.login.buttonsNormas();
        bitacoras = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        epp = new javax.swing.JPanel();
        tbEPP = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        tablaEPP = new javax.swing.JTable();
        menuUsuario = new javax.swing.JLabel();
        nombreEPP = new javax.swing.JTextField();
        labelAreaEPP = new javax.swing.JLabel();
        areaEPP = new javax.swing.JTextField();
        labelPuestoEPP = new javax.swing.JLabel();
        puestoEPP = new javax.swing.JTextField();
        lentesDeSeguridadEPP = new javax.swing.JCheckBox();
        jSeparator5 = new javax.swing.JSeparator();
        jSeparator10 = new javax.swing.JSeparator();
        jSeparator12 = new javax.swing.JSeparator();
        labelAreaEPP1 = new javax.swing.JLabel();
        areaEPP1 = new javax.swing.JTextField();
        jSeparator11 = new javax.swing.JSeparator();
        labelAreaEPP2 = new javax.swing.JLabel();
        areaEPP2 = new javax.swing.JTextField();
        jSeparator13 = new javax.swing.JSeparator();
        menuUsuario1 = new javax.swing.JLabel();
        jSeparator6 = new javax.swing.JSeparator();
        nombreEPP1 = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        btnInsertar1 = new com.login.ModernButton();
        btnModificar = new com.login.ModernButton();
        btnExportar = new com.login.ModernButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);

        bgHomeScreen.setBackground(new java.awt.Color(255, 255, 255));
        bgHomeScreen.setMinimumSize(new java.awt.Dimension(790, 510));
        bgHomeScreen.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        barNavMov.setBackground(new java.awt.Color(255, 255, 255));
        barNavMov.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                barNavMovMouseDragged(evt);
            }
        });
        barNavMov.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                barNavMovMousePressed(evt);
            }
        });
        barNavMov.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        logoDerecha.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/imagenes/lgo.jpg"))); // NOI18N
        barNavMov.add(logoDerecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(622, 0, -1, 43));

        exitBtn.setBackground(new java.awt.Color(255, 255, 255));

        exitTxt.setFont(new java.awt.Font("Roboto Black", 1, 14)); // NOI18N
        exitTxt.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        exitTxt.setText("X");
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
            .addComponent(exitTxt, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
        );
        exitBtnLayout.setVerticalGroup(
            exitBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(exitTxt, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
        );

        barNavMov.add(exitBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 40, 40));

        returnPanel.setBackground(new java.awt.Color(255, 255, 255));
        returnPanel.setPreferredSize(new java.awt.Dimension(40, 40));

        returnTxt.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        returnTxt.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/imagenes/flecha-izquierda (1).png"))); // NOI18N
        returnTxt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                returnTxtMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                returnTxtMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                returnTxtMouseExited(evt);
            }
        });

        javax.swing.GroupLayout returnPanelLayout = new javax.swing.GroupLayout(returnPanel);
        returnPanel.setLayout(returnPanelLayout);
        returnPanelLayout.setHorizontalGroup(
            returnPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(returnTxt, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
        );
        returnPanelLayout.setVerticalGroup(
            returnPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, returnPanelLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(returnTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        barNavMov.add(returnPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 0, -1, -1));

        bgHomeScreen.add(barNavMov, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 790, 40));

        menuDeOpciones.setBackground(new java.awt.Color(197, 172, 204));
        menuDeOpciones.setForeground(new java.awt.Color(197, 172, 204));
        menuDeOpciones.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        menuUsuarios.setText("USUARIOS");
        menuUsuarios.setFont(new java.awt.Font("Roboto Black", 1, 14)); // NOI18N
        menuUsuarios.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                menuUsuariosMouseClicked(evt);
            }
        });
        menuUsuarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuUsuariosActionPerformed(evt);
            }
        });
        menuDeOpciones.add(menuUsuarios, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 60, 180, 35));

        menuTerminales.setText("TERMINALES");
        menuTerminales.setFont(new java.awt.Font("Roboto Black", 1, 14)); // NOI18N
        menuTerminales.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                menuTerminalesMouseClicked(evt);
            }
        });
        menuTerminales.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuTerminalesActionPerformed(evt);
            }
        });
        menuDeOpciones.add(menuTerminales, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 110, 180, 40));

        menuRegiones.setText("REGIONES");
        menuRegiones.setFont(new java.awt.Font("Roboto Black", 1, 14)); // NOI18N
        menuRegiones.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                menuRegionesMouseClicked(evt);
            }
        });
        menuRegiones.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuRegionesActionPerformed(evt);
            }
        });
        menuDeOpciones.add(menuRegiones, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 170, 180, 40));

        bgHomeScreen.add(menuDeOpciones, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 180, 500));

        bitacoras.setBackground(new java.awt.Color(255, 255, 255));
        bitacoras.setLayout(new java.awt.CardLayout());

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 610, Short.MAX_VALUE)
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 410, Short.MAX_VALUE)
        );

        bitacoras.add(jPanel5, "card5");

        epp.setBackground(new java.awt.Color(255, 255, 255));
        epp.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tbEPP.setBackground(new java.awt.Color(255, 255, 255));
        tbEPP.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(197, 172, 204), 2, true), "Información", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Roboto Light", 1, 12))); // NOI18N

        tablaEPP.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        tablaEPP.setAutoResizeMode(0);
        tablaEPP.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablaEPPMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(tablaEPP);

        javax.swing.GroupLayout tbEPPLayout = new javax.swing.GroupLayout(tbEPP);
        tbEPP.setLayout(tbEPPLayout);
        tbEPPLayout.setHorizontalGroup(
            tbEPPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 568, Short.MAX_VALUE)
        );
        tbEPPLayout.setVerticalGroup(
            tbEPPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 137, Short.MAX_VALUE)
        );

        epp.add(tbEPP, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 220, 580, 160));

        menuUsuario.setFont(new java.awt.Font("Roboto Light", 1, 12)); // NOI18N
        menuUsuario.setText("Su ID de usuario es:");
        epp.add(menuUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, -1, 20));

        nombreEPP.setFont(new java.awt.Font("Roboto Light", 1, 12)); // NOI18N
        nombreEPP.setBorder(null);
        epp.add(nombreEPP, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 20, 140, -1));

        labelAreaEPP.setFont(new java.awt.Font("Roboto Light", 1, 12)); // NOI18N
        labelAreaEPP.setText("Username");
        epp.add(labelAreaEPP, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, 100, -1));

        areaEPP.setFont(new java.awt.Font("Roboto Light", 1, 12)); // NOI18N
        areaEPP.setBorder(null);
        epp.add(areaEPP, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 100, 140, 20));

        labelPuestoEPP.setFont(new java.awt.Font("Roboto Light", 1, 12)); // NOI18N
        labelPuestoEPP.setText("Puesto");
        epp.add(labelPuestoEPP, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 100, 50, -1));

        puestoEPP.setFont(new java.awt.Font("Roboto Light", 1, 12)); // NOI18N
        puestoEPP.setBorder(null);
        epp.add(puestoEPP, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 100, 140, -1));

        lentesDeSeguridadEPP.setBackground(new java.awt.Color(255, 255, 255));
        lentesDeSeguridadEPP.setFont(new java.awt.Font("Roboto Light", 1, 12)); // NOI18N
        lentesDeSeguridadEPP.setText("Activo");
        epp.add(lentesDeSeguridadEPP, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 20, 80, 20));

        jSeparator5.setBackground(new java.awt.Color(197, 172, 204));
        jSeparator5.setForeground(new java.awt.Color(197, 172, 204));
        epp.add(jSeparator5, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 40, 140, 10));

        jSeparator10.setBackground(new java.awt.Color(197, 172, 204));
        jSeparator10.setForeground(new java.awt.Color(197, 172, 204));
        jSeparator10.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        epp.add(jSeparator10, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 120, 140, 10));

        jSeparator12.setBackground(new java.awt.Color(197, 172, 204));
        jSeparator12.setForeground(new java.awt.Color(197, 172, 204));
        jSeparator12.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        epp.add(jSeparator12, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 120, 140, 10));

        labelAreaEPP1.setFont(new java.awt.Font("Roboto Light", 1, 12)); // NOI18N
        labelAreaEPP1.setText("Correo");
        epp.add(labelAreaEPP1, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 20, 50, -1));

        areaEPP1.setFont(new java.awt.Font("Roboto Light", 1, 12)); // NOI18N
        areaEPP1.setBorder(null);
        epp.add(areaEPP1, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 20, 140, 20));

        jSeparator11.setBackground(new java.awt.Color(197, 172, 204));
        jSeparator11.setForeground(new java.awt.Color(197, 172, 204));
        jSeparator11.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        epp.add(jSeparator11, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 40, 140, 10));

        labelAreaEPP2.setFont(new java.awt.Font("Roboto Light", 1, 12)); // NOI18N
        labelAreaEPP2.setText("Password:");
        epp.add(labelAreaEPP2, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 60, 70, -1));

        areaEPP2.setFont(new java.awt.Font("Roboto Light", 1, 12)); // NOI18N
        areaEPP2.setBorder(null);
        epp.add(areaEPP2, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 60, 140, 20));

        jSeparator13.setBackground(new java.awt.Color(197, 172, 204));
        jSeparator13.setForeground(new java.awt.Color(197, 172, 204));
        jSeparator13.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        epp.add(jSeparator13, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 80, 140, 10));

        menuUsuario1.setFont(new java.awt.Font("Roboto Light", 1, 12)); // NOI18N
        menuUsuario1.setText("Nombre");
        epp.add(menuUsuario1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, -1, 20));

        jSeparator6.setBackground(new java.awt.Color(197, 172, 204));
        jSeparator6.setForeground(new java.awt.Color(197, 172, 204));
        epp.add(jSeparator6, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 80, 140, 10));

        nombreEPP1.setFont(new java.awt.Font("Roboto Light", 1, 12)); // NOI18N
        nombreEPP1.setBorder(null);
        epp.add(nombreEPP1, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 60, 140, -1));

        bitacoras.add(epp, "card3");

        bgHomeScreen.add(bitacoras, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 40, 610, 410));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnInsertar1.setText("AGREGAR");
        btnInsertar1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnInsertar1MouseClicked(evt);
            }
        });
        btnInsertar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInsertar1ActionPerformed(evt);
            }
        });
        jPanel1.add(btnInsertar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 10, -1, -1));

        btnModificar.setText("MODIFICAR");
        btnModificar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnModificarMouseClicked(evt);
            }
        });
        btnModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarActionPerformed(evt);
            }
        });
        jPanel1.add(btnModificar, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 10, -1, -1));

        btnExportar.setText("EXPORTAR");
        btnExportar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnExportarMouseClicked(evt);
            }
        });
        btnExportar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExportarActionPerformed(evt);
            }
        });
        jPanel1.add(btnExportar, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        bgHomeScreen.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 450, 610, 50));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bgHomeScreen, javax.swing.GroupLayout.PREFERRED_SIZE, 789, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bgHomeScreen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private Boolean validateFields() {
        // Validar campos de texto
       /* if (txtFecha.getText().trim().isEmpty()
                || ubicacion.getText().trim().isEmpty()
                || ultimaRecarga.getText().trim().isEmpty()
                || proximaRecarga.getText().trim().isEmpty()
                || capacidad.getText().trim().isEmpty()
                || agenteExtinguidor.getText().trim().isEmpty()
                || observaciones.getText().trim().isEmpty()
                || listNom.getSelectedItem().toString().trim().isEmpty()
                || listNom.getSelectedItem().toString().equals("Selecciona un valor")) {
            System.out.println("vacio txt");
            return false;
        }

        // Validar checkboxes (al menos uno debe estar seleccionado)
        if (!chckManguera.isSelected()
                && !chckManometro.isSelected()
                && !chckSoporte.isSelected()
                && !chckPresion.isSelected()
                && !chckCilindro.isSelected()
                && !chckLimpieza.isSelected()
                && !chckEtiqueta.isSelected()
                && !chckSeguro.isSelected()
                && !chckObstrucciones.isSelected()
                && !chckSenalizacion.isSelected()
                && !firma.isSelected()) {
            System.out.println("vacio check");
            return false;
        }*/

        // Si todos los campos tienen valores válidos, devuelve true
        return true;
    }

    private void llenarComboBox() {
        // Método que devuelve la lista de nombres (ajusta según tu lógica)
        int idUsuario = obj.obtenerIDUsuario();
        List<String> valores = obj.obtenerNombreTerminales(idUsuario);

        // Crear un modelo para el JComboBox con los valores
        DefaultComboBoxModel<String> modelo = new DefaultComboBoxModel<>(valores.toArray(new String[0]));
        // Asignar el m odelo al JComboBox
       // listNom.setModel(modelo);

    }

    private void actBtnMenu() {

    }


    private void exitTxtMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitTxtMouseClicked
        // TODO add your handling code here:
        int opcion = JOptionPane.showConfirmDialog(null, "¿Deseas cerrar sesión?", "Aviso", JOptionPane.YES_NO_OPTION);
        if (opcion == JOptionPane.YES_OPTION) {
            //System.out.println("Sí, cerrar sesión.");

            // Cerrar la conexión a la base de datos
            if(conectar == null){
                System.out.println("la conexion es nula");
            } 
            if (conectar != null) {
                TConexion.cerrarConexion(conectar);
                //System.out.println("Conexión cerrada correctamente.");
            }

            // Abrir la ventana de login
            Login obj = new Login();
            obj.setVisible(true);
            obj.setLocationRelativeTo(null);

            // Cerrar la ventana actual
            this.dispose();
        } else {
            //System.out.println("No, no cerrar sesión.");
        }
    }//GEN-LAST:event_exitTxtMouseClicked

    private void barNavMovMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_barNavMovMousePressed
        // TODO add your handling code here:
        // MOVER VENTANA --
        xMouse = evt.getX();
        yMouse = evt.getY();
    }//GEN-LAST:event_barNavMovMousePressed

    private void barNavMovMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_barNavMovMouseDragged
        // TODO add your handling code here:
        // MOVER VENTANA --
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        this.setLocation(x - xMouse, y - yMouse);
    }//GEN-LAST:event_barNavMovMouseDragged

    private void exitTxtMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitTxtMouseEntered
        // TODO add your handling code here:
        // EVENTO QUE CAMBIA EL COLOR DEL FONDO DEL BOTON --
        exitBtn.setBackground(Color.red);
        exitTxt.setForeground(Color.white);
    }//GEN-LAST:event_exitTxtMouseEntered

    private void exitTxtMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitTxtMouseExited
        // EVENTO QUE CAMBIA EL COLOR DEL FONDO DEL BOTON --
        exitBtn.setBackground(Color.white);
        exitTxt.setForeground(Color.black);
    }//GEN-LAST:event_exitTxtMouseExited

    private void menuUsuariosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menuUsuariosMouseClicked
        CardLayout layout = (CardLayout) bitacoras.getLayout();
        layout.show(bitacoras, "epp"); // Cambia a panel1

        menuUsuarios.setSelected(true);
        menuTerminales.setSelected(false);
        menuRegiones.setSelected(false);

    }//GEN-LAST:event_menuUsuariosMouseClicked

    private void menuTerminalesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menuTerminalesMouseClicked

    }//GEN-LAST:event_menuTerminalesMouseClicked

    private void returnTxtMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_returnTxtMouseClicked
        // TODO add your handling code here:
        menuw8 obj = new menuw8();
        obj.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_returnTxtMouseClicked

    private void returnTxtMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_returnTxtMouseEntered
        // TODO add your handling code here:
        returnPanel.setBackground(new Color(197, 172, 204));
        returnPanel.setForeground(Color.white);
    }//GEN-LAST:event_returnTxtMouseEntered

    private void returnTxtMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_returnTxtMouseExited
        // TODO add your handling code here:
        returnPanel.setBackground(Color.white);
        returnPanel.setForeground(Color.black);
    }//GEN-LAST:event_returnTxtMouseExited

    private void tablaEPPMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaEPPMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_tablaEPPMouseClicked

    private void btnModificarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnModificarMouseClicked
        // TODO add your handling code here:

        /*if (btnHumo.isSelected()) {
            obj.modificarHumo(txtIDBitacora, txtFecha, ubicacionHumo,
                    ultimaFechaHumo, proximaFechaHumo, marcaHumo,
                    tipoDetectorHumo, pruebaFuncionamiento, soporteHumo,
                    ubicacionFisica, observacionesHumo);
            obj.MostrarHumo(tablaHumo);
        }

        if (btnGas.isSelected()) {
            obj.modificarGas(
                    txtIDBitacora, txtFecha,
                    nomEmpresa, cMalas, c_Buena, c_Regular,
                    cObservaciones, capacidadTanque, fechaFabricacion,
                    cRegistrada, tObservaciones, marca, numSerie,
                    diametroEXT, espesor);
            obj.MostrarGas(tablaGas);
        }*/

    }//GEN-LAST:event_btnModificarMouseClicked

    private void btnInsertar1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnInsertar1MouseClicked
    }//GEN-LAST:event_btnInsertar1MouseClicked

    private void btnExportarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnExportarMouseClicked
        // TODO add your handling code here:

        if (menuUsuarios.isSelected()) {

            PDFExporter ejemplo = new PDFExporter();
            try {
                ejemplo.ExtintorPDF();
            } catch (IOException ex) {
                Logger.getLogger(homeScreen.class.getName()).log(Level.SEVERE, null, ex);
            }

        }

        if (menuTerminales.isSelected()) {

        }

        if (menuRegiones.isSelected()) {

        }

    }//GEN-LAST:event_btnExportarMouseClicked

    private void menuTerminalesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuTerminalesActionPerformed

        CardLayout layout = (CardLayout) bitacoras.getLayout();
        layout.show(bitacoras, "humo");

        menuUsuarios.setSelected(false);
        menuTerminales.setSelected(true);
        menuRegiones.setSelected(false);


    }//GEN-LAST:event_menuTerminalesActionPerformed

    private void btnExportarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExportarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnExportarActionPerformed

    private void menuRegionesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuRegionesActionPerformed
        CardLayout layout = (CardLayout) bitacoras.getLayout();
        layout.show(bitacoras, "gas"); // Cambia al panel humo.

        menuUsuarios.setSelected(false);
        menuTerminales.setSelected(false);
        menuRegiones.setSelected(true);

        // Cambiar color de botón seleccionado

    }//GEN-LAST:event_menuRegionesActionPerformed

    private void menuRegionesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menuRegionesMouseClicked

        epp.setVisible(false);    }//GEN-LAST:event_menuRegionesMouseClicked

    private void menuUsuariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuUsuariosActionPerformed

    }//GEN-LAST:event_menuUsuariosActionPerformed

    private void btnInsertar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInsertar1ActionPerformed

        if (menuUsuarios.isSelected()) {
           

        }

        /*if (btnHumo.isSelected()) {

            obj.insertarHumo(txtFecha, ubicacionHumo, ultimaFechaHumo, proximaFechaHumo, marcaHumo,
                    tipoDetectorHumo, pruebaFuncionamiento, chckSoporte,
                    ubicacionFisica, observacionesHumo, txtIDNorma, txtiDUsuario, listNom.getSelectedItem().toString());
            obj.MostrarHumo(tablaHumo);

        }

        if (btnGas.isSelected()) {
            obj.insertarGas(txtFecha, nomEmpresa, cMalas,
                    c_Buena, c_Regular, cObservaciones,
                    capacidadTanque, fechaFabricacion,
                    cRegistrada, tObservaciones, marca,
                    numSerie, diametroEXT, espesor, txtIDNorma,
                    txtiDUsuario, listNom.getSelectedItem().toString());
            obj.MostrarGas(tablaGas);
        }*/
    }//GEN-LAST:event_btnInsertar1ActionPerformed

    private void btnModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnModificarActionPerformed

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
            java.util.logging.Logger.getLogger(homeScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(homeScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(homeScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(homeScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new homeScreen().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField areaEPP;
    private javax.swing.JTextField areaEPP1;
    private javax.swing.JTextField areaEPP2;
    private javax.swing.JPanel barNavMov;
    private javax.swing.JPanel bgHomeScreen;
    private javax.swing.JPanel bitacoras;
    private com.login.ModernButton btnExportar;
    private com.login.ModernButton btnInsertar1;
    private com.login.ModernButton btnModificar;
    private javax.swing.JPanel epp;
    private javax.swing.JPanel exitBtn;
    private javax.swing.JLabel exitTxt;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JSeparator jSeparator10;
    private javax.swing.JSeparator jSeparator11;
    private javax.swing.JSeparator jSeparator12;
    private javax.swing.JSeparator jSeparator13;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JLabel labelAreaEPP;
    private javax.swing.JLabel labelAreaEPP1;
    private javax.swing.JLabel labelAreaEPP2;
    private javax.swing.JLabel labelPuestoEPP;
    private javax.swing.JCheckBox lentesDeSeguridadEPP;
    private javax.swing.JLabel logoDerecha;
    private javax.swing.JPanel menuDeOpciones;
    private com.login.buttonsNormas menuRegiones;
    private com.login.buttonsNormas menuTerminales;
    private javax.swing.JLabel menuUsuario;
    private javax.swing.JLabel menuUsuario1;
    private com.login.buttonsNormas menuUsuarios;
    private javax.swing.JTextField nombreEPP;
    private javax.swing.JTextField nombreEPP1;
    private javax.swing.JTextField puestoEPP;
    private javax.swing.JPanel returnPanel;
    private javax.swing.JLabel returnTxt;
    private javax.swing.JTable tablaEPP;
    private javax.swing.JPanel tbEPP;
    // End of variables declaration//GEN-END:variables
}
