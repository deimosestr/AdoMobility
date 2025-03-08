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
        adminUsuario.setEditable(false);
        llenarComboBox();
        llenarComboBoxRoles(comboRoles);
        llenarComboBoxTerminalesG(comboTerminales);
        llenarComboBoxTerminalesG(comboTerminales1);
        llenarComboBoxUsuariosUP(listaUsuarios);
        llenarComboBoxUsuariosDOWN(listaUsuarios);
        llenarComboBoxRegiones(comboboxRegionTerminales);
        //llenarComboBoxHumo();
        //bitacoras.setVisible(false);
        obj.mostrarUsuarios(tablaUsers);
        obj.mostrarTerminales(tableTerminalesAdmin);

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
        modernButton1 = new com.login.ModernButton();
        bitacoras = new javax.swing.JPanel();
        bitacorasGeneral = new javax.swing.JPanel();
        terminales = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        idTerminalAdmin = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel2 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        nombreTerminalAdmin = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        ubicacionTerminalAdmin = new javax.swing.JTextField();
        comboboxRegionTerminales = new javax.swing.JComboBox<>();
        jSeparator4 = new javax.swing.JSeparator();
        agregarTerminal = new com.login.ModernButton();
        tablaTerminales = new javax.swing.JPanel();
        jScrollPane4 = new javax.swing.JScrollPane();
        tableTerminalesAdmin = new javax.swing.JTable();
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
        revocarTerminal = new com.login.ModernButton();
        listaUsuarios = new javax.swing.JComboBox<>();
        labelPuestoEPP1 = new javax.swing.JLabel();
        comboTerminales1 = new javax.swing.JComboBox<>();
        listaUsuarios1 = new javax.swing.JComboBox<>();
        asignarTerminal = new com.login.ModernButton();

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

        modernButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/imagenes/limpiar.png"))); // NOI18N
        modernButton1.setText("LIMPIAR CAMPOS");
        modernButton1.setFont(new java.awt.Font("ROBOTO", 1, 10)); // NOI18N
        modernButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                modernButton1MouseClicked(evt);
            }
        });
        menuDeOpciones.add(modernButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 450, 160, -1));

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
            .addGap(0, 460, Short.MAX_VALUE)
        );

        bitacoras.add(bitacorasGeneral, "card5");

        terminales.setBackground(new java.awt.Color(255, 255, 255));
        terminales.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Roboto Light", 1, 12)); // NOI18N
        jLabel1.setText("El ID de la terminal:");
        terminales.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, -1, -1));

        idTerminalAdmin.setBackground(new java.awt.Color(255, 255, 255));
        idTerminalAdmin.setBorder(null);
        idTerminalAdmin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                idTerminalAdminActionPerformed(evt);
            }
        });
        terminales.add(idTerminalAdmin, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 20, 80, -1));

        jSeparator1.setBackground(new java.awt.Color(197, 172, 204));
        jSeparator1.setForeground(new java.awt.Color(197, 172, 204));
        terminales.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 40, 190, 10));

        jLabel2.setFont(new java.awt.Font("Roboto Light", 1, 12)); // NOI18N
        jLabel2.setText("Nombre Terminal: ");
        terminales.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, -1, -1));

        jSeparator2.setBackground(new java.awt.Color(197, 172, 204));
        jSeparator2.setForeground(new java.awt.Color(197, 172, 204));
        terminales.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 80, 190, 10));

        nombreTerminalAdmin.setBackground(new java.awt.Color(255, 255, 255));
        nombreTerminalAdmin.setBorder(null);
        terminales.add(nombreTerminalAdmin, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 60, 190, -1));

        jLabel3.setFont(new java.awt.Font("Roboto Light", 1, 12)); // NOI18N
        jLabel3.setText("Ubicacion");
        terminales.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, -1, -1));

        ubicacionTerminalAdmin.setBackground(new java.awt.Color(255, 255, 255));
        ubicacionTerminalAdmin.setBorder(null);
        terminales.add(ubicacionTerminalAdmin, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 100, 190, -1));

        comboboxRegionTerminales.setBackground(new java.awt.Color(255, 255, 255));
        comboboxRegionTerminales.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        comboboxRegionTerminales.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(197, 172, 204), 1, true), "Asignar Region", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Roboto Light", 1, 12))); // NOI18N
        terminales.add(comboboxRegionTerminales, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 30, 190, 40));

        jSeparator4.setBackground(new java.awt.Color(197, 172, 204));
        jSeparator4.setForeground(new java.awt.Color(197, 172, 204));
        terminales.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 120, 190, 10));

        agregarTerminal.setText("REGISTRAR TERMINAL");
        agregarTerminal.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                agregarTerminalMouseClicked(evt);
            }
        });
        terminales.add(agregarTerminal, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 90, 190, -1));

        tablaTerminales.setBackground(new java.awt.Color(255, 255, 255));
        tablaTerminales.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(197, 172, 204), 2, true), "Información", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Roboto Light", 1, 12))); // NOI18N

        tableTerminalesAdmin.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        tableTerminalesAdmin.setAutoResizeMode(0);
        tableTerminalesAdmin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableTerminalesAdminMouseClicked(evt);
            }
        });
        jScrollPane4.setViewportView(tableTerminalesAdmin);

        javax.swing.GroupLayout tablaTerminalesLayout = new javax.swing.GroupLayout(tablaTerminales);
        tablaTerminales.setLayout(tablaTerminalesLayout);
        tablaTerminalesLayout.setHorizontalGroup(
            tablaTerminalesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 578, Short.MAX_VALUE)
        );
        tablaTerminalesLayout.setVerticalGroup(
            tablaTerminalesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 117, Short.MAX_VALUE)
        );

        terminales.add(tablaTerminales, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 310, 590, 140));

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
            .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 578, Short.MAX_VALUE)
        );
        tablaUsuariosLayout.setVerticalGroup(
            tablaUsuariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 117, Short.MAX_VALUE)
        );

        usuarios.add(tablaUsuarios, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 310, 590, 140));

        menuUsuario.setFont(new java.awt.Font("Roboto Light", 1, 12)); // NOI18N
        menuUsuario.setText("Su ID de usuario es:");
        usuarios.add(menuUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, -1, 20));

        adminUsuario.setBackground(new java.awt.Color(255, 255, 255));
        adminUsuario.setFont(new java.awt.Font("Roboto Light", 1, 12)); // NOI18N
        adminUsuario.setBorder(null);
        usuarios.add(adminUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 10, 140, -1));

        labelAreaEPP.setFont(new java.awt.Font("Roboto Light", 1, 12)); // NOI18N
        labelAreaEPP.setText("Username");
        usuarios.add(labelAreaEPP, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, 100, -1));

        adminUsername.setFont(new java.awt.Font("Roboto Light", 1, 12)); // NOI18N
        adminUsername.setBorder(null);
        usuarios.add(adminUsername, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 90, 140, 20));

        labelPuestoEPP.setFont(new java.awt.Font("Roboto Light", 1, 12)); // NOI18N
        labelPuestoEPP.setText("Revocar Terminal: ");
        usuarios.add(labelPuestoEPP, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 250, 110, -1));

        checkActivo.setBackground(new java.awt.Color(255, 255, 255));
        checkActivo.setFont(new java.awt.Font("Roboto Light", 1, 12)); // NOI18N
        checkActivo.setText("Activo");
        usuarios.add(checkActivo, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 50, 80, 20));

        jSeparator5.setBackground(new java.awt.Color(197, 172, 204));
        jSeparator5.setForeground(new java.awt.Color(197, 172, 204));
        usuarios.add(jSeparator5, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 30, 140, 10));

        jSeparator10.setBackground(new java.awt.Color(197, 172, 204));
        jSeparator10.setForeground(new java.awt.Color(197, 172, 204));
        jSeparator10.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        usuarios.add(jSeparator10, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 110, 140, 10));

        labelAreaEPP1.setFont(new java.awt.Font("Roboto Light", 1, 12)); // NOI18N
        labelAreaEPP1.setText("Correo");
        usuarios.add(labelAreaEPP1, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 10, 50, -1));

        adminCorreo.setFont(new java.awt.Font("Roboto Light", 1, 12)); // NOI18N
        adminCorreo.setBorder(null);
        usuarios.add(adminCorreo, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 10, 140, 20));

        jSeparator11.setBackground(new java.awt.Color(197, 172, 204));
        jSeparator11.setForeground(new java.awt.Color(197, 172, 204));
        jSeparator11.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        usuarios.add(jSeparator11, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 30, 140, 10));

        labelAreaEPP2.setFont(new java.awt.Font("Roboto Light", 1, 12)); // NOI18N
        labelAreaEPP2.setText("Password:");
        usuarios.add(labelAreaEPP2, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 50, 70, -1));

        adminPassword.setFont(new java.awt.Font("Roboto Light", 1, 12)); // NOI18N
        adminPassword.setBorder(null);
        usuarios.add(adminPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 50, 140, 20));

        jSeparator13.setBackground(new java.awt.Color(197, 172, 204));
        jSeparator13.setForeground(new java.awt.Color(197, 172, 204));
        jSeparator13.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        usuarios.add(jSeparator13, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 70, 140, 10));

        menuUsuario1.setFont(new java.awt.Font("Roboto Light", 1, 12)); // NOI18N
        menuUsuario1.setText("Nombre");
        usuarios.add(menuUsuario1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, -1, 20));

        jSeparator6.setBackground(new java.awt.Color(197, 172, 204));
        jSeparator6.setForeground(new java.awt.Color(197, 172, 204));
        usuarios.add(jSeparator6, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 70, 140, 10));

        adminNombre.setFont(new java.awt.Font("Roboto Light", 1, 12)); // NOI18N
        adminNombre.setBorder(null);
        usuarios.add(adminNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 50, 140, -1));

        comboRegiones.setBackground(new java.awt.Color(255, 255, 255));
        comboRegiones.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        comboRegiones.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(197, 172, 204), 1, true), "Regiones", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION));
        comboRegiones.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                comboRegionesMouseClicked(evt);
            }
        });
        usuarios.add(comboRegiones, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 80, 140, 40));

        comboRoles.setBackground(new java.awt.Color(255, 255, 255));
        comboRoles.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        comboRoles.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(197, 172, 204), 1, true), "Roles", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Roboto Light", 1, 12))); // NOI18N
        comboRoles.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboRolesActionPerformed(evt);
            }
        });
        usuarios.add(comboRoles, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 80, 140, 40));

        comboTerminales.setBackground(new java.awt.Color(255, 255, 255));
        comboTerminales.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        comboTerminales.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(197, 172, 204), 1, true), "Lista Terminales", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION));
        usuarios.add(comboTerminales, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 160, 140, 40));

        insertarUser.setText("AGREGAR USUARIO");
        insertarUser.setFont(new java.awt.Font("ROBOTO", 1, 12)); // NOI18N
        insertarUser.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                insertarUserMouseClicked(evt);
            }
        });
        usuarios.add(insertarUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 130, 150, -1));

        revocarTerminal.setText("QUITAR TERMINAL");
        revocarTerminal.setFont(new java.awt.Font("ROBOTO", 1, 12)); // NOI18N
        revocarTerminal.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                revocarTerminalMouseClicked(evt);
            }
        });
        usuarios.add(revocarTerminal, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 280, 150, -1));

        listaUsuarios.setBackground(new java.awt.Color(255, 255, 255));
        listaUsuarios.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        listaUsuarios.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(197, 172, 204), 1, true), "Lista Usuarios", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION));
        usuarios.add(listaUsuarios, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 160, 190, 40));

        labelPuestoEPP1.setFont(new java.awt.Font("Roboto Light", 1, 12)); // NOI18N
        labelPuestoEPP1.setText("Asignar Terminal: ");
        usuarios.add(labelPuestoEPP1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 170, 110, -1));

        comboTerminales1.setBackground(new java.awt.Color(255, 255, 255));
        comboTerminales1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        comboTerminales1.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(197, 172, 204), 1, true), "Lista Terminales", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION));
        usuarios.add(comboTerminales1, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 240, 140, 40));

        listaUsuarios1.setBackground(new java.awt.Color(255, 255, 255));
        listaUsuarios1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        listaUsuarios1.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(197, 172, 204), 1, true), "Lista Usuarios", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION));
        usuarios.add(listaUsuarios1, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 240, 190, 40));

        asignarTerminal.setText("ASIGNAR TERMINAL");
        asignarTerminal.setFont(new java.awt.Font("ROBOTO", 1, 12)); // NOI18N
        asignarTerminal.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                asignarTerminalMouseClicked(evt);
            }
        });
        usuarios.add(asignarTerminal, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 210, 150, -1));

        bitacoras.add(usuarios, "card3");

        bgHomeScreen.add(bitacoras, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 40, 610, 460));

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

    private void llenarComboBoxRegiones(JComboBox<String> comboBoxRegiones) {
        // Obtener la lista de nombres de roles
        List<String> nombresRegiones = obj.obtenerNombreRegiones();

        // Crear un modelo para el JComboBox con los valores
        DefaultComboBoxModel<String> modelo = new DefaultComboBoxModel<>(nombresRegiones.toArray(new String[0]));

        // Asignar el modelo al JComboBox
        comboboxRegionTerminales.setModel(modelo);
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
        comboTerminales1.setModel(modelo);
    }

    private void llenarComboBoxUsuariosUP(JComboBox<String> comboBoxUsuarios) {
        // Obtener la lista de nombres de roles
        List<String> nombres = obj.obtenerNombreUsuarios();

        // Crear un modelo para el JComboBox con los valores
        DefaultComboBoxModel<String> modelo = new DefaultComboBoxModel<>(nombres.toArray(new String[0]));

        // Asignar el modelo al JComboBox
        listaUsuarios.setModel(modelo);
    }
    
    private void llenarComboBoxUsuariosDOWN(JComboBox<String> comboBoxUsuarios) {
        // Obtener la lista de nombres de roles
        List<String> nombres = obj.obtenerNombreUsuarios();

        // Crear un modelo para el JComboBox con los valores
        DefaultComboBoxModel<String> modelo = new DefaultComboBoxModel<>(nombres.toArray(new String[0]));

        // Asignar el modelo al JComboBox
        listaUsuarios1.setModel(modelo);
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

    private void menuTerminalesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuTerminalesActionPerformed

        CardLayout layout = (CardLayout) bitacoras.getLayout();
        layout.show(bitacoras, "terminales");

        btnUsuarios.setSelected(false);
        menuTerminales.setSelected(true);
        menuRegiones.setSelected(false);


    }//GEN-LAST:event_menuTerminalesActionPerformed

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

    private void comboRolesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboRolesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_comboRolesActionPerformed

    private void tablaUsersMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaUsersMouseClicked
        // TODO add your handling code here:
        obj.seleccionarUsuario(tablaUsers, adminUsuario,
                adminNombre, adminCorreo, adminUsername,
                adminPassword, checkActivo, comboRegiones, comboRoles);
    }//GEN-LAST:event_tablaUsersMouseClicked

    private void comboRegionesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_comboRegionesMouseClicked
        // TODO add your handling code here:

    }//GEN-LAST:event_comboRegionesMouseClicked

    private void insertarUserMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_insertarUserMouseClicked
        // TODO add your handling code here:
        obj.insertarUSUARIO(adminNombre, adminCorreo, adminUsername, adminPassword,
                checkActivo, comboRegiones.getSelectedItem().toString(), comboRoles.getSelectedItem().toString());
        adminUsuario.setText("");
        adminCorreo.setText("");
        adminNombre.setText("");
        adminPassword.setText("");
        adminUsername.setText("");
        checkActivo.setSelected(false);
        llenarComboBoxUsuariosUP(listaUsuarios);
        llenarComboBoxTerminalesG(comboTerminales);
        obj.mostrarUsuarios(tablaUsers);
    }//GEN-LAST:event_insertarUserMouseClicked

    private void revocarTerminalMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_revocarTerminalMouseClicked
        // TODO add your handling code here:
        obj.revocarTerminal(listaUsuarios1, comboTerminales1.getSelectedItem().toString());
        
        obj.mostrarUsuarios(tablaUsers);
        //obj.mostrarTerminales(tableTerminalesAdmin);
    }//GEN-LAST:event_revocarTerminalMouseClicked

    private void agregarTerminalMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_agregarTerminalMouseClicked
        // TODO add your handling code here:
        obj.insertarTerminal(nombreTerminalAdmin, ubicacionTerminalAdmin,
                comboboxRegionTerminales.getSelectedItem().toString());
        obj.mostrarTerminales(tablaUsers);

    }//GEN-LAST:event_agregarTerminalMouseClicked

    private void tableTerminalesAdminMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableTerminalesAdminMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_tableTerminalesAdminMouseClicked

    private void idTerminalAdminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_idTerminalAdminActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_idTerminalAdminActionPerformed

    private void asignarTerminalMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_asignarTerminalMouseClicked
        // TODO add your handling code here:
        int idUsuario = obj.obtenerIDUsuarioGeneral(listaUsuarios);
        if (listaUsuarios.getSelectedItem() == null || comboTerminales.getSelectedItem() == null) {
            JOptionPane.showMessageDialog(this, "Debes seleccionar un usuario y una terminal.");
            return;
        }

        try {
            // Obtener el valor seleccionado en el JComboBox de terminales
            String idTerminalSeleccionado = comboTerminales.getSelectedItem().toString();

            // Llamar al método asignarTerminal
            obj.asignarTerminal(listaUsuarios, idTerminalSeleccionado);

            // Actualizar la tabla de usuarios (si es necesario)
            obj.mostrarUsuarios(tablaUsers);

            // Mostrar mensaje de éxito
            //JOptionPane.showMessageDialog(this, "Asignación realizada correctamente.");
        } catch (Exception e) {
            // Mostrar mensaje de error
            JOptionPane.showMessageDialog(this, "Error: " + e.getMessage());
        }
    }//GEN-LAST:event_asignarTerminalMouseClicked

    private void modernButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_modernButton1MouseClicked
        // TODO add your handling code here:
        adminUsuario.setText("");
        adminCorreo.setText("");
        adminNombre.setText("");
        adminPassword.setText("");
        adminUsername.setText("");
        checkActivo.setSelected(false);
        llenarComboBoxUsuariosUP(listaUsuarios);
        llenarComboBoxTerminalesG(comboTerminales);
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
    private com.login.ModernButton agregarTerminal;
    private com.login.ModernButton asignarTerminal;
    private javax.swing.JPanel barNavMov;
    private javax.swing.JPanel bgHomeScreen;
    private javax.swing.JPanel bitacoras;
    private javax.swing.JPanel bitacorasGeneral;
    private com.login.buttonsNormas btnUsuarios;
    private javax.swing.JCheckBox checkActivo;
    private javax.swing.JComboBox<String> comboRegiones;
    private javax.swing.JComboBox<String> comboRoles;
    private javax.swing.JComboBox<String> comboTerminales;
    private javax.swing.JComboBox<String> comboTerminales1;
    private javax.swing.JComboBox<String> comboboxRegionTerminales;
    private javax.swing.JPanel exitBtn;
    private javax.swing.JLabel exitTxt;
    private javax.swing.JTextField idTerminalAdmin;
    private com.login.ModernButton insertarUser;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator10;
    private javax.swing.JSeparator jSeparator11;
    private javax.swing.JSeparator jSeparator13;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JLabel labelAreaEPP;
    private javax.swing.JLabel labelAreaEPP1;
    private javax.swing.JLabel labelAreaEPP2;
    private javax.swing.JLabel labelPuestoEPP;
    private javax.swing.JLabel labelPuestoEPP1;
    private javax.swing.JComboBox<String> listaUsuarios;
    private javax.swing.JComboBox<String> listaUsuarios1;
    private javax.swing.JLabel logoDerecha;
    private javax.swing.JPanel menuDeOpciones;
    private com.login.buttonsNormas menuRegiones;
    private com.login.buttonsNormas menuTerminales;
    private javax.swing.JLabel menuUsuario;
    private javax.swing.JLabel menuUsuario1;
    private com.login.ModernButton modernButton1;
    private javax.swing.JTextField nombreTerminalAdmin;
    private javax.swing.JPanel returnPanel;
    private javax.swing.JLabel returnTxt;
    private com.login.ModernButton revocarTerminal;
    private javax.swing.JPanel tablaTerminales;
    private javax.swing.JTable tablaUsers;
    private javax.swing.JPanel tablaUsuarios;
    private javax.swing.JTable tableTerminalesAdmin;
    private javax.swing.JPanel terminales;
    private javax.swing.JTextField ubicacionTerminalAdmin;
    private javax.swing.JPanel usuarios;
    // End of variables declaration//GEN-END:variables
}
