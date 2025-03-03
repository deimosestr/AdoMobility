package com.login;

import com.login.TConexion;
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
import javax.swing.JComboBox;
//import static javafx.scene.paint.Color.color;

public class adminScreen extends javax.swing.JFrame {

    int xMouse, yMouse;
    CDatosNOM obj = new CDatosNOM();

    public adminScreen() {
        initComponents();
        setSize(790, 500);
        setLocationRelativeTo(null);
        llenarComboBox();
        llenarComboBoxRoles(comboRoles);
        llenarComboBoxTerminalesG(comboTerminales);
        llenarComboBoxUsuarios(listaUsuarios);
        //llenarComboBoxHumo();
        //bitacoras.setVisible(false);
        obj.mostrarUsuarios(tablaUsers);

        bitacoras.add(usuarios, "usuarios");
        bitacoras.add(terminales, "terminales");
        bitacoras.add(bitacorasGeneral, "bitacorasGeneral");

        buttonsNormas btnUsuario = new buttonsNormas();
        buttonsNormas menuTerminales = new buttonsNormas();
        buttonsNormas menuRegiones = new buttonsNormas();
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
        btnUsuarios = new com.login.buttonsNormas();
        menuTerminales = new com.login.buttonsNormas();
        menuRegiones = new com.login.buttonsNormas();
        bitacoras = new javax.swing.JPanel();
        bitacorasGeneral = new javax.swing.JPanel();
        terminales = new javax.swing.JPanel();
        usuarios = new javax.swing.JPanel();
        tablaUsuarios = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        tablaUsers = new javax.swing.JTable();
        menuUsuario = new javax.swing.JLabel();
        adminUsuario = new javax.swing.JTextField();
        labelAreaEPP = new javax.swing.JLabel();
        adminUsername = new javax.swing.JTextField();
        labelPuestoEPP = new javax.swing.JLabel();
        checkActivo = new javax.swing.JCheckBox();
        jSeparator5 = new javax.swing.JSeparator();
        jSeparator10 = new javax.swing.JSeparator();
        labelAreaEPP1 = new javax.swing.JLabel();
        adminCorreo = new javax.swing.JTextField();
        jSeparator11 = new javax.swing.JSeparator();
        labelAreaEPP2 = new javax.swing.JLabel();
        adminPassword = new javax.swing.JTextField();
        jSeparator13 = new javax.swing.JSeparator();
        menuUsuario1 = new javax.swing.JLabel();
        jSeparator6 = new javax.swing.JSeparator();
        adminNombre = new javax.swing.JTextField();
        comboRegiones = new javax.swing.JComboBox<>();
        comboRoles = new javax.swing.JComboBox<>();
        comboTerminales = new javax.swing.JComboBox<>();
        insertarUser = new com.login.ModernButton();
        modernButton1 = new com.login.ModernButton();
        listaUsuarios = new javax.swing.JComboBox<>();
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

        btnUsuarios.setText("USUARIOS");
        btnUsuarios.setFont(new java.awt.Font("Roboto Black", 1, 14)); // NOI18N
        btnUsuarios.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnUsuariosMouseClicked(evt);
            }
        });
        btnUsuarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUsuariosActionPerformed(evt);
            }
        });
        menuDeOpciones.add(btnUsuarios, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 60, 180, 35));

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

        bitacorasGeneral.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout bitacorasGeneralLayout = new javax.swing.GroupLayout(bitacorasGeneral);
        bitacorasGeneral.setLayout(bitacorasGeneralLayout);
        bitacorasGeneralLayout.setHorizontalGroup(
            bitacorasGeneralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 610, Short.MAX_VALUE)
        );
        bitacorasGeneralLayout.setVerticalGroup(
            bitacorasGeneralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 410, Short.MAX_VALUE)
        );

        bitacoras.add(bitacorasGeneral, "card5");

        terminales.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout terminalesLayout = new javax.swing.GroupLayout(terminales);
        terminales.setLayout(terminalesLayout);
        terminalesLayout.setHorizontalGroup(
            terminalesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 610, Short.MAX_VALUE)
        );
        terminalesLayout.setVerticalGroup(
            terminalesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 410, Short.MAX_VALUE)
        );

        bitacoras.add(terminales, "card5");

        usuarios.setBackground(new java.awt.Color(255, 255, 255));
        usuarios.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tablaUsuarios.setBackground(new java.awt.Color(255, 255, 255));
        tablaUsuarios.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(197, 172, 204), 2, true), "Información", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Roboto Light", 1, 12))); // NOI18N

        tablaUsers.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        tablaUsers.setAutoResizeMode(0);
        tablaUsers.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablaUsersMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(tablaUsers);

        javax.swing.GroupLayout tablaUsuariosLayout = new javax.swing.GroupLayout(tablaUsuarios);
        tablaUsuarios.setLayout(tablaUsuariosLayout);
        tablaUsuariosLayout.setHorizontalGroup(
            tablaUsuariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 568, Short.MAX_VALUE)
        );
        tablaUsuariosLayout.setVerticalGroup(
            tablaUsuariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 117, Short.MAX_VALUE)
        );

        usuarios.add(tablaUsuarios, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 260, 580, 140));

        menuUsuario.setFont(new java.awt.Font("Roboto Light", 1, 12)); // NOI18N
        menuUsuario.setText("Su ID de usuario es:");
        usuarios.add(menuUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, -1, 20));

        adminUsuario.setFont(new java.awt.Font("Roboto Light", 1, 12)); // NOI18N
        adminUsuario.setBorder(null);
        usuarios.add(adminUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 20, 140, -1));

        labelAreaEPP.setFont(new java.awt.Font("Roboto Light", 1, 12)); // NOI18N
        labelAreaEPP.setText("Username");
        usuarios.add(labelAreaEPP, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, 100, -1));

        adminUsername.setFont(new java.awt.Font("Roboto Light", 1, 12)); // NOI18N
        adminUsername.setBorder(null);
        usuarios.add(adminUsername, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 100, 140, 20));

        labelPuestoEPP.setFont(new java.awt.Font("Roboto Light", 1, 12)); // NOI18N
        labelPuestoEPP.setText("Asignar Terminal: ");
        usuarios.add(labelPuestoEPP, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 180, 110, -1));

        checkActivo.setBackground(new java.awt.Color(255, 255, 255));
        checkActivo.setFont(new java.awt.Font("Roboto Light", 1, 12)); // NOI18N
        checkActivo.setText("Activo");
        usuarios.add(checkActivo, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 60, 80, 20));

        jSeparator5.setBackground(new java.awt.Color(197, 172, 204));
        jSeparator5.setForeground(new java.awt.Color(197, 172, 204));
        usuarios.add(jSeparator5, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 40, 140, 10));

        jSeparator10.setBackground(new java.awt.Color(197, 172, 204));
        jSeparator10.setForeground(new java.awt.Color(197, 172, 204));
        jSeparator10.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        usuarios.add(jSeparator10, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 120, 140, 10));

        labelAreaEPP1.setFont(new java.awt.Font("Roboto Light", 1, 12)); // NOI18N
        labelAreaEPP1.setText("Correo");
        usuarios.add(labelAreaEPP1, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 20, 50, -1));

        adminCorreo.setFont(new java.awt.Font("Roboto Light", 1, 12)); // NOI18N
        adminCorreo.setBorder(null);
        usuarios.add(adminCorreo, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 20, 140, 20));

        jSeparator11.setBackground(new java.awt.Color(197, 172, 204));
        jSeparator11.setForeground(new java.awt.Color(197, 172, 204));
        jSeparator11.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        usuarios.add(jSeparator11, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 40, 140, 10));

        labelAreaEPP2.setFont(new java.awt.Font("Roboto Light", 1, 12)); // NOI18N
        labelAreaEPP2.setText("Password:");
        usuarios.add(labelAreaEPP2, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 60, 70, -1));

        adminPassword.setFont(new java.awt.Font("Roboto Light", 1, 12)); // NOI18N
        adminPassword.setBorder(null);
        usuarios.add(adminPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 60, 140, 20));

        jSeparator13.setBackground(new java.awt.Color(197, 172, 204));
        jSeparator13.setForeground(new java.awt.Color(197, 172, 204));
        jSeparator13.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        usuarios.add(jSeparator13, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 80, 140, 10));

        menuUsuario1.setFont(new java.awt.Font("Roboto Light", 1, 12)); // NOI18N
        menuUsuario1.setText("Nombre");
        usuarios.add(menuUsuario1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, -1, 20));

        jSeparator6.setBackground(new java.awt.Color(197, 172, 204));
        jSeparator6.setForeground(new java.awt.Color(197, 172, 204));
        usuarios.add(jSeparator6, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 80, 140, 10));

        adminNombre.setFont(new java.awt.Font("Roboto Light", 1, 12)); // NOI18N
        adminNombre.setBorder(null);
        usuarios.add(adminNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 60, 140, -1));

        comboRegiones.setBackground(new java.awt.Color(255, 255, 255));
        comboRegiones.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        comboRegiones.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(197, 172, 204), 1, true), "Regiones", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION));
        comboRegiones.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                comboRegionesMouseClicked(evt);
            }
        });
        usuarios.add(comboRegiones, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 90, 140, 40));

        comboRoles.setBackground(new java.awt.Color(255, 255, 255));
        comboRoles.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        comboRoles.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(197, 172, 204), 1, true), "Roles", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Roboto Light", 1, 12))); // NOI18N
        comboRoles.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboRolesActionPerformed(evt);
            }
        });
        usuarios.add(comboRoles, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 90, 140, 40));

        comboTerminales.setBackground(new java.awt.Color(255, 255, 255));
        comboTerminales.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        comboTerminales.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(197, 172, 204), 1, true), "Lista Terminales", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION));
        usuarios.add(comboTerminales, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 170, 140, 40));

        insertarUser.setText("AGREGAR USUARIO");
        insertarUser.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                insertarUserMouseClicked(evt);
            }
        });
        usuarios.add(insertarUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 140, -1, -1));

        modernButton1.setText("ASIGNAR TERMINAL");
        modernButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                modernButton1MouseClicked(evt);
            }
        });
        usuarios.add(modernButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 220, -1, -1));

        listaUsuarios.setBackground(new java.awt.Color(255, 255, 255));
        listaUsuarios.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        listaUsuarios.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(197, 172, 204), 1, true), "Lista Usuarios", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION));
        usuarios.add(listaUsuarios, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 170, 190, 40));

        bitacoras.add(usuarios, "card3");

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
        // Obtener la lista de nombres de regiones
        List<String> valores = obj.obtenerNombreRegiones();

        // Crear un modelo para el JComboBox con los valores
        DefaultComboBoxModel<String> modelo = new DefaultComboBoxModel<>(valores.toArray(new String[0]));

        // Asignar el modelo al JComboBox
        comboRegiones.setModel(modelo);
    }

    private void llenarComboBoxRoles(JComboBox<String> comboBoxRoles) {
        // Obtener la lista de nombres de roles
        List<String> nombresRoles = obj.obtenerNombreRoles();

        // Crear un modelo para el JComboBox con los valores
        DefaultComboBoxModel<String> modelo = new DefaultComboBoxModel<>(nombresRoles.toArray(new String[0]));

        // Asignar el modelo al JComboBox
        comboRoles.setModel(modelo);
    }

    private void llenarComboBoxTerminalesG(JComboBox<String> comboBoxTerminalG) {
        // Obtener la lista de nombres de roles
        List<String> nombreTerminal = obj.obtenerTerminalesNombre();

        // Crear un modelo para el JComboBox con los valores
        DefaultComboBoxModel<String> modelo = new DefaultComboBoxModel<>(nombreTerminal.toArray(new String[0]));

        // Asignar el modelo al JComboBox
        comboTerminales.setModel(modelo);
    }
    
    private void llenarComboBoxUsuarios(JComboBox<String> comboBoxUsuarios) {
        // Obtener la lista de nombres de roles
        List<String> nombres = obj.obtenerNombreUsuarios();

        // Crear un modelo para el JComboBox con los valores
        DefaultComboBoxModel<String> modelo = new DefaultComboBoxModel<>(nombres.toArray(new String[0]));

        // Asignar el modelo al JComboBox
        listaUsuarios.setModel(modelo);
    }

    private void exitTxtMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitTxtMouseClicked
        // TODO add your handling code here:
        int opcion = JOptionPane.showConfirmDialog(null, "¿Deseas cerrar sesión?", "Aviso", JOptionPane.YES_NO_OPTION);
        if (opcion == JOptionPane.YES_OPTION) {
            //System.out.println("Sí, cerrar sesión.");

            // Cerrar la conexión a la base de datos
            if (conectar == null) {
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

    private void btnUsuariosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnUsuariosMouseClicked
       CardLayout layout = (CardLayout) bitacoras.getLayout();
        layout.show(bitacoras, "usuarios"); // Cambia a panel1

        
        btnUsuarios.setSelected(true);
        menuRegiones.setSelected(false);
        menuTerminales.setSelected(false);


    }//GEN-LAST:event_btnUsuariosMouseClicked

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

        if (btnUsuarios.isSelected()) {

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
        layout.show(bitacoras, "terminales");

        btnUsuarios.setSelected(false);
        menuTerminales.setSelected(true);
        menuRegiones.setSelected(false);


    }//GEN-LAST:event_menuTerminalesActionPerformed

    private void btnExportarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExportarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnExportarActionPerformed

    private void menuRegionesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuRegionesActionPerformed
        CardLayout layout = (CardLayout) bitacoras.getLayout();
        layout.show(bitacoras, "gas"); // Cambia al panel humo.

        btnUsuarios.setSelected(false);
        menuTerminales.setSelected(false);
        menuRegiones.setSelected(true);

        // Cambiar color de botón seleccionado

    }//GEN-LAST:event_menuRegionesActionPerformed

    private void menuRegionesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menuRegionesMouseClicked

        usuarios.setVisible(false);    }//GEN-LAST:event_menuRegionesMouseClicked

    private void btnUsuariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUsuariosActionPerformed

    }//GEN-LAST:event_btnUsuariosActionPerformed

    private void btnInsertar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInsertar1ActionPerformed

        if (btnUsuarios.isSelected()) {

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

    private void comboRolesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboRolesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_comboRolesActionPerformed

    private void tablaUsersMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaUsersMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_tablaUsersMouseClicked

    private void comboRegionesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_comboRegionesMouseClicked
        // TODO add your handling code here:

    }//GEN-LAST:event_comboRegionesMouseClicked

    private void insertarUserMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_insertarUserMouseClicked
        // TODO add your handling code here:
        obj.insertarUSUARIO(adminNombre, adminCorreo, adminUsername, adminPassword,
                checkActivo, comboRegiones.getSelectedItem().toString(), comboRoles.getSelectedItem().toString());
        obj.mostrarUsuarios(tablaUsers);
    }//GEN-LAST:event_insertarUserMouseClicked

    private void modernButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_modernButton1MouseClicked
        // TODO add your handling code here:
        obj.asignarTerminal(listaUsuarios.getSelectedItem().toString(), comboTerminales.getSelectedItem().toString());
    }//GEN-LAST:event_modernButton1MouseClicked

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
    private javax.swing.JTextField adminCorreo;
    private javax.swing.JTextField adminNombre;
    private javax.swing.JTextField adminPassword;
    private javax.swing.JTextField adminUsername;
    private javax.swing.JTextField adminUsuario;
    private javax.swing.JPanel barNavMov;
    private javax.swing.JPanel bgHomeScreen;
    private javax.swing.JPanel bitacoras;
    private javax.swing.JPanel bitacorasGeneral;
    private com.login.ModernButton btnExportar;
    private com.login.ModernButton btnInsertar1;
    private com.login.ModernButton btnModificar;
    private com.login.buttonsNormas btnUsuarios;
    private javax.swing.JCheckBox checkActivo;
    private javax.swing.JComboBox<String> comboRegiones;
    private javax.swing.JComboBox<String> comboRoles;
    private javax.swing.JComboBox<String> comboTerminales;
    private javax.swing.JPanel exitBtn;
    private javax.swing.JLabel exitTxt;
    private com.login.ModernButton insertarUser;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JSeparator jSeparator10;
    private javax.swing.JSeparator jSeparator11;
    private javax.swing.JSeparator jSeparator13;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JLabel labelAreaEPP;
    private javax.swing.JLabel labelAreaEPP1;
    private javax.swing.JLabel labelAreaEPP2;
    private javax.swing.JLabel labelPuestoEPP;
    private javax.swing.JComboBox<String> listaUsuarios;
    private javax.swing.JLabel logoDerecha;
    private javax.swing.JPanel menuDeOpciones;
    private com.login.buttonsNormas menuRegiones;
    private com.login.buttonsNormas menuTerminales;
    private javax.swing.JLabel menuUsuario;
    private javax.swing.JLabel menuUsuario1;
    private com.login.ModernButton modernButton1;
    private javax.swing.JPanel returnPanel;
    private javax.swing.JLabel returnTxt;
    private javax.swing.JTable tablaUsers;
    private javax.swing.JPanel tablaUsuarios;
    private javax.swing.JPanel terminales;
    private javax.swing.JPanel usuarios;
    // End of variables declaration//GEN-END:variables
}
