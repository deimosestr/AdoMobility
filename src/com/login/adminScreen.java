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
        obj.mostrarExtintoresGlobal(tableBItacorasAdmin);

        bitacoras.add(usuarios, "usuarios");
        bitacoras.add(terminales, "terminales");
        bitacoras.add(bitacorasGeneralExtintores, "bitaEXTINTOR");
        bitacoras.add(bitacorasGeneralHumo, "bitaHUMO");
        bitacoras.add(bitacorasGeneralGas, "bitaGAS");
        bitacoras.add(bitacorasGeneralEpp, "bitaEPP");

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
        modernButton1 = new com.login.ModernButton();
        cambiarVentana = new javax.swing.JComboBox<>();
        bitacoras = new javax.swing.JPanel();
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
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jSeparator7 = new javax.swing.JSeparator();
        nombreRegionAdmin = new javax.swing.JTextField();
        jSeparator3 = new javax.swing.JSeparator();
        idRegionAdmin = new javax.swing.JTextField();
        modernButton2 = new com.login.ModernButton();
        jSeparator8 = new javax.swing.JSeparator();
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
        bitacorasGeneralEpp = new javax.swing.JPanel();
        tablaBitacoras3 = new javax.swing.JPanel();
        jScrollPane8 = new javax.swing.JScrollPane();
        tableBItacorasAdmin3 = new javax.swing.JTable();
        jComboBox7 = new javax.swing.JComboBox<>();
        jComboBox8 = new javax.swing.JComboBox<>();
        bitacorasGeneralGas = new javax.swing.JPanel();
        tablaBitacoras2 = new javax.swing.JPanel();
        jScrollPane7 = new javax.swing.JScrollPane();
        tableBItacorasAdmin2 = new javax.swing.JTable();
        jComboBox5 = new javax.swing.JComboBox<>();
        jComboBox6 = new javax.swing.JComboBox<>();
        bitacorasGeneralHumo = new javax.swing.JPanel();
        tablaBitacoras1 = new javax.swing.JPanel();
        jScrollPane6 = new javax.swing.JScrollPane();
        tableBItacorasAdmin1 = new javax.swing.JTable();
        jComboBox3 = new javax.swing.JComboBox<>();
        jComboBox4 = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        bitacorasGeneralExtintores = new javax.swing.JPanel();
        tablaBitacoras = new javax.swing.JPanel();
        jScrollPane5 = new javax.swing.JScrollPane();
        tableBItacorasAdmin = new javax.swing.JTable();
        jComboBox1 = new javax.swing.JComboBox<>();
        jComboBox2 = new javax.swing.JComboBox<>();

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

        modernButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/imagenes/limpiar.png"))); // NOI18N
        modernButton1.setText("LIMPIAR CAMPOS");
        modernButton1.setFont(new java.awt.Font("ROBOTO", 1, 10)); // NOI18N
        modernButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                modernButton1MouseClicked(evt);
            }
        });
        menuDeOpciones.add(modernButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 450, 160, -1));

        cambiarVentana.setBackground(new java.awt.Color(255, 255, 255));
        cambiarVentana.setFont(new java.awt.Font("Roboto Light", 1, 12)); // NOI18N
        cambiarVentana.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(197, 172, 204)), "BITACORAS", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Roboto Black", 1, 14))); // NOI18N
        cambiarVentana.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cambiarVentanaActionPerformed(evt);
            }
        });
        menuDeOpciones.add(cambiarVentana, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 170, 180, 50));

        bgHomeScreen.add(menuDeOpciones, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 180, 500));

        bitacoras.setBackground(new java.awt.Color(255, 255, 255));
        bitacoras.setLayout(new java.awt.CardLayout());

        terminales.setBackground(new java.awt.Color(255, 255, 255));
        terminales.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Roboto Light", 1, 12)); // NOI18N
        jLabel1.setText("El ID de la región es:");
        terminales.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, -1, -1));

        idTerminalAdmin.setBackground(new java.awt.Color(255, 255, 255));
        idTerminalAdmin.setBorder(null);
        idTerminalAdmin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                idTerminalAdminActionPerformed(evt);
            }
        });
        terminales.add(idTerminalAdmin, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 140, 80, -1));

        jSeparator1.setBackground(new java.awt.Color(197, 172, 204));
        jSeparator1.setForeground(new java.awt.Color(197, 172, 204));
        terminales.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 160, 190, 10));

        jLabel2.setFont(new java.awt.Font("Roboto Light", 1, 12)); // NOI18N
        jLabel2.setText("Nombre Terminal: ");
        terminales.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 180, -1, -1));

        jSeparator2.setBackground(new java.awt.Color(197, 172, 204));
        jSeparator2.setForeground(new java.awt.Color(197, 172, 204));
        terminales.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 200, 190, 10));

        nombreTerminalAdmin.setBackground(new java.awt.Color(255, 255, 255));
        nombreTerminalAdmin.setBorder(null);
        terminales.add(nombreTerminalAdmin, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 180, 190, -1));

        jLabel3.setFont(new java.awt.Font("Roboto Light", 1, 12)); // NOI18N
        jLabel3.setText("Nombre:");
        terminales.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 60, -1, -1));

        ubicacionTerminalAdmin.setBackground(new java.awt.Color(255, 255, 255));
        ubicacionTerminalAdmin.setBorder(null);
        terminales.add(ubicacionTerminalAdmin, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 220, 190, -1));

        comboboxRegionTerminales.setBackground(new java.awt.Color(255, 255, 255));
        comboboxRegionTerminales.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        comboboxRegionTerminales.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(197, 172, 204), 1, true), "Asignar Region", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Roboto Light", 1, 12))); // NOI18N
        terminales.add(comboboxRegionTerminales, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 150, 190, 40));

        jSeparator4.setBackground(new java.awt.Color(197, 172, 204));
        jSeparator4.setForeground(new java.awt.Color(197, 172, 204));
        terminales.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 240, 190, 10));

        agregarTerminal.setText("REGISTRAR TERMINAL");
        agregarTerminal.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                agregarTerminalMouseClicked(evt);
            }
        });
        terminales.add(agregarTerminal, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 210, 190, -1));

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
            .addComponent(jScrollPane4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 147, Short.MAX_VALUE)
        );

        terminales.add(tablaTerminales, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 280, 590, 170));

        jLabel4.setFont(new java.awt.Font("Roboto Light", 1, 12)); // NOI18N
        jLabel4.setText("El ID de la terminal:");
        terminales.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 140, -1, -1));

        jLabel5.setFont(new java.awt.Font("Roboto Light", 1, 12)); // NOI18N
        jLabel5.setText("Ubicacion");
        terminales.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 220, -1, -1));

        jSeparator7.setBackground(new java.awt.Color(197, 172, 204));
        jSeparator7.setForeground(new java.awt.Color(197, 172, 204));
        terminales.add(jSeparator7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, 550, 10));

        nombreRegionAdmin.setBackground(new java.awt.Color(255, 255, 255));
        nombreRegionAdmin.setBorder(null);
        terminales.add(nombreRegionAdmin, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 60, 190, -1));

        jSeparator3.setBackground(new java.awt.Color(197, 172, 204));
        jSeparator3.setForeground(new java.awt.Color(197, 172, 204));
        terminales.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 40, 190, 10));

        idRegionAdmin.setBackground(new java.awt.Color(255, 255, 255));
        idRegionAdmin.setBorder(null);
        terminales.add(idRegionAdmin, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 20, 190, -1));

        modernButton2.setText("AGREGAR REGION");
        modernButton2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                modernButton2MouseClicked(evt);
            }
        });
        terminales.add(modernButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 50, 190, -1));

        jSeparator8.setBackground(new java.awt.Color(197, 172, 204));
        jSeparator8.setForeground(new java.awt.Color(197, 172, 204));
        terminales.add(jSeparator8, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 80, 190, 10));

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

        bitacorasGeneralEpp.setBackground(new java.awt.Color(255, 255, 255));
        bitacorasGeneralEpp.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tablaBitacoras3.setBackground(new java.awt.Color(255, 255, 255));
        tablaBitacoras3.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(197, 172, 204), 2, true), "Información", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Roboto Light", 1, 12))); // NOI18N

        tableBItacorasAdmin3.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        tableBItacorasAdmin3.setAutoResizeMode(0);
        tableBItacorasAdmin3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableBItacorasAdmin3MouseClicked(evt);
            }
        });
        jScrollPane8.setViewportView(tableBItacorasAdmin3);

        javax.swing.GroupLayout tablaBitacoras3Layout = new javax.swing.GroupLayout(tablaBitacoras3);
        tablaBitacoras3.setLayout(tablaBitacoras3Layout);
        tablaBitacoras3Layout.setHorizontalGroup(
            tablaBitacoras3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane8, javax.swing.GroupLayout.DEFAULT_SIZE, 578, Short.MAX_VALUE)
        );
        tablaBitacoras3Layout.setVerticalGroup(
            tablaBitacoras3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane8, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 147, Short.MAX_VALUE)
        );

        bitacorasGeneralEpp.add(tablaBitacoras3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 280, 590, 170));

        jComboBox7.setBackground(new java.awt.Color(255, 255, 255));
        jComboBox7.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jComboBox7.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(197, 172, 204), 1, true), "Buscar por fecha", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION));
        bitacorasGeneralEpp.add(jComboBox7, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 10, 150, 40));

        jComboBox8.setBackground(new java.awt.Color(255, 255, 255));
        jComboBox8.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jComboBox8.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(197, 172, 204), 1, true), "Buscar por fecha", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION));
        bitacorasGeneralEpp.add(jComboBox8, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 10, 150, 40));

        bitacoras.add(bitacorasGeneralEpp, "card5");

        bitacorasGeneralGas.setBackground(new java.awt.Color(255, 255, 255));
        bitacorasGeneralGas.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tablaBitacoras2.setBackground(new java.awt.Color(255, 255, 255));
        tablaBitacoras2.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(197, 172, 204), 2, true), "Información", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Roboto Light", 1, 12))); // NOI18N

        tableBItacorasAdmin2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        tableBItacorasAdmin2.setAutoResizeMode(0);
        tableBItacorasAdmin2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableBItacorasAdmin2MouseClicked(evt);
            }
        });
        jScrollPane7.setViewportView(tableBItacorasAdmin2);

        javax.swing.GroupLayout tablaBitacoras2Layout = new javax.swing.GroupLayout(tablaBitacoras2);
        tablaBitacoras2.setLayout(tablaBitacoras2Layout);
        tablaBitacoras2Layout.setHorizontalGroup(
            tablaBitacoras2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane7, javax.swing.GroupLayout.DEFAULT_SIZE, 578, Short.MAX_VALUE)
        );
        tablaBitacoras2Layout.setVerticalGroup(
            tablaBitacoras2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane7, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 147, Short.MAX_VALUE)
        );

        bitacorasGeneralGas.add(tablaBitacoras2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 280, 590, 170));

        jComboBox5.setBackground(new java.awt.Color(255, 255, 255));
        jComboBox5.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jComboBox5.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(197, 172, 204), 1, true), "Buscar por fecha", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION));
        bitacorasGeneralGas.add(jComboBox5, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 10, 150, 40));

        jComboBox6.setBackground(new java.awt.Color(255, 255, 255));
        jComboBox6.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jComboBox6.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(197, 172, 204), 1, true), "Buscar por fecha", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION));
        bitacorasGeneralGas.add(jComboBox6, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 10, 150, 40));

        bitacoras.add(bitacorasGeneralGas, "card5");

        bitacorasGeneralHumo.setBackground(new java.awt.Color(255, 255, 255));
        bitacorasGeneralHumo.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tablaBitacoras1.setBackground(new java.awt.Color(255, 255, 255));
        tablaBitacoras1.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(197, 172, 204), 2, true), "Información", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Roboto Light", 1, 12))); // NOI18N

        tableBItacorasAdmin1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        tableBItacorasAdmin1.setAutoResizeMode(0);
        tableBItacorasAdmin1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableBItacorasAdmin1MouseClicked(evt);
            }
        });
        jScrollPane6.setViewportView(tableBItacorasAdmin1);

        javax.swing.GroupLayout tablaBitacoras1Layout = new javax.swing.GroupLayout(tablaBitacoras1);
        tablaBitacoras1.setLayout(tablaBitacoras1Layout);
        tablaBitacoras1Layout.setHorizontalGroup(
            tablaBitacoras1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane6, javax.swing.GroupLayout.DEFAULT_SIZE, 578, Short.MAX_VALUE)
        );
        tablaBitacoras1Layout.setVerticalGroup(
            tablaBitacoras1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 147, Short.MAX_VALUE)
        );

        bitacorasGeneralHumo.add(tablaBitacoras1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 280, 590, 170));

        jComboBox3.setBackground(new java.awt.Color(255, 255, 255));
        jComboBox3.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jComboBox3.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(197, 172, 204), 1, true), "Buscar por fecha", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION));
        jComboBox3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox3ActionPerformed(evt);
            }
        });
        bitacorasGeneralHumo.add(jComboBox3, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 10, 150, 40));

        jComboBox4.setBackground(new java.awt.Color(255, 255, 255));
        jComboBox4.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jComboBox4.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(197, 172, 204), 1, true), "Buscar por fecha", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION));
        bitacorasGeneralHumo.add(jComboBox4, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 10, 150, 40));

        jLabel6.setText("epp");
        bitacorasGeneralHumo.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 170, -1, -1));

        bitacoras.add(bitacorasGeneralHumo, "card5");

        bitacorasGeneralExtintores.setBackground(new java.awt.Color(255, 255, 255));
        bitacorasGeneralExtintores.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tablaBitacoras.setBackground(new java.awt.Color(255, 255, 255));
        tablaBitacoras.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(197, 172, 204), 2, true), "Información", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Roboto Light", 1, 12))); // NOI18N

        tableBItacorasAdmin.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        tableBItacorasAdmin.setAutoResizeMode(0);
        tableBItacorasAdmin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableBItacorasAdminMouseClicked(evt);
            }
        });
        jScrollPane5.setViewportView(tableBItacorasAdmin);

        javax.swing.GroupLayout tablaBitacorasLayout = new javax.swing.GroupLayout(tablaBitacoras);
        tablaBitacoras.setLayout(tablaBitacorasLayout);
        tablaBitacorasLayout.setHorizontalGroup(
            tablaBitacorasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane5, javax.swing.GroupLayout.DEFAULT_SIZE, 578, Short.MAX_VALUE)
        );
        tablaBitacorasLayout.setVerticalGroup(
            tablaBitacorasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 147, Short.MAX_VALUE)
        );

        bitacorasGeneralExtintores.add(tablaBitacoras, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 280, 590, 170));

        jComboBox1.setBackground(new java.awt.Color(255, 255, 255));
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jComboBox1.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(197, 172, 204), 1, true), "Buscar por fecha", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION));
        bitacorasGeneralExtintores.add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 10, 150, 40));

        jComboBox2.setBackground(new java.awt.Color(255, 255, 255));
        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jComboBox2.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(197, 172, 204), 1, true), "Buscar por fecha", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION));
        bitacorasGeneralExtintores.add(jComboBox2, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 10, 150, 40));

        bitacoras.add(bitacorasGeneralExtintores, "card5");

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

        String[] razonesSociales = {
            "EXTINTORES",
            "HUMO",
            "GAS",
            "EPP",};

        // Crear un modelo para el JComboBox con las razones sociales
        DefaultComboBoxModel<String> modelo2 = new DefaultComboBoxModel<>(razonesSociales);

        // Asignar el modelo al JComboBox
        cambiarVentana.setModel(modelo2);

        // Agregar un mensaje inicial (opcional)
        cambiarVentana.insertItemAt("Seleccione una bitacora", 0); // Insertar el mensaje inicial en la posición 0
        cambiarVentana.setSelectedIndex(0); // Establecer el mensaje inicial como seleccionado

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
        //  menuRegiones.setSelected(false);
        menuTerminales.setSelected(false);
        
                bitacorasGeneralExtintores.setVisible(false);

        bitacorasGeneralHumo.setVisible(false);
        bitacorasGeneralGas.setVisible(false);
        bitacorasGeneralEpp.setVisible(false);


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
        bitacorasGeneralExtintores.setVisible(false);

        bitacorasGeneralHumo.setVisible(false);
        bitacorasGeneralGas.setVisible(false);
        bitacorasGeneralEpp.setVisible(false);
        //menuRegiones.setSelected(false);


    }//GEN-LAST:event_menuTerminalesActionPerformed

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
        obj.mostrarTerminales(tableTerminalesAdmin);

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

    private void modernButton2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_modernButton2MouseClicked
        // TODO add your handling code here:
        obj.insertarRegion(nombreRegionAdmin);
        obj.mostrarTerminales(tableTerminalesAdmin);
    }//GEN-LAST:event_modernButton2MouseClicked

    private void tableBItacorasAdminMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableBItacorasAdminMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_tableBItacorasAdminMouseClicked

    private void tableBItacorasAdmin1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableBItacorasAdmin1MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_tableBItacorasAdmin1MouseClicked

    private void tableBItacorasAdmin2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableBItacorasAdmin2MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_tableBItacorasAdmin2MouseClicked

    private void tableBItacorasAdmin3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableBItacorasAdmin3MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_tableBItacorasAdmin3MouseClicked

    private void cambiarVentanaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cambiarVentanaActionPerformed
        // TODO add your handling code here:

        btnUsuarios.setSelected(true);
        //  menuRegiones.setSelected(false);
        menuTerminales.setSelected(false);
        
        String seleccion = (String) cambiarVentana.getSelectedItem();

        if (seleccion == "EXTINTORES") {
           /* bitacorasGeneralExtintores.setVisible(true);
            bitacorasGeneralHumo.setVisible(false);
            bitacorasGeneralGas.setVisible(false);
            bitacorasGeneralEpp.setVisible(false);*/
                    CardLayout layout = (CardLayout) bitacoras.getLayout();
        layout.show(bitacoras, "bitaEXTINTOR");
        }
        if (seleccion == "HUMO") {
            /*bitacorasGeneralExtintores.setVisible(false);
            bitacorasGeneralHumo.setVisible(true);
            bitacorasGeneralGas.setVisible(false);
            bitacorasGeneralEpp.setVisible(false);*/
            
                                CardLayout layout = (CardLayout) bitacoras.getLayout();
        layout.show(bitacoras, "bitaHUMO");
        }
        if (seleccion == "GAS") {
            /*bitacorasGeneralExtintores.setVisible(false);
            bitacorasGeneralHumo.setVisible(false);
            bitacorasGeneralGas.setVisible(true);
            bitacorasGeneralEpp.setVisible(false);*/
             CardLayout layout = (CardLayout) bitacoras.getLayout();
        layout.show(bitacoras, "bitaGAS");
            
        }
        if (seleccion == "EPP") {
            bitacorasGeneralExtintores.setVisible(false);
            bitacorasGeneralHumo.setVisible(false);
            bitacorasGeneralGas.setVisible(false);
            bitacorasGeneralEpp.setVisible(true);
             CardLayout layout = (CardLayout) bitacoras.getLayout();
        layout.show(bitacoras, "bitaEPP");
        }
        // Ejecutar la acción personalizada en base a la selección
        /*switch (seleccion) {
            case "EXTINTORES":
                bitacorasGeneralExtintores.setVisible(true);
                bitacorasGeneralHumo.setVisible(false);
                bitacorasGeneralGas.setVisible(false);
                bitacorasGeneralEpp.setVisible(false);
                //System.out.println("Se seleccionó la Opción 1");
                // Aquí puedes ejecutar la acción correspondiente a la Opción 1
                break;
            case "HUMO":
                bitacorasGeneralExtintores.setVisible(false);
                bitacorasGeneralHumo.setVisible(true);
                bitacorasGeneralGas.setVisible(false);
                bitacorasGeneralEpp.setVisible(false);
                //System.out.println("Se seleccionó la Opción 2");
                // Aquí puedes ejecutar la acción correspondiente a la Opción 2
                break;
            case "GAS":
                bitacorasGeneralExtintores.setVisible(false);
                bitacorasGeneralHumo.setVisible(false);
                bitacorasGeneralGas.setVisible(true);
                bitacorasGeneralEpp.setVisible(false);
                // System.out.println("Se seleccionó la Opción 3");
                // Aquí puedes ejecutar la acción correspondiente a la Opción 3
                break;
            case "EPP":
                bitacorasGeneralExtintores.setVisible(false);
                bitacorasGeneralHumo.setVisible(false);
                bitacorasGeneralGas.setVisible(false);
                bitacorasGeneralEpp.setVisible(true);
                //  System.out.println("Se seleccionó la Opción 4");
                // Aquí puedes ejecutar la acción correspondiente a la Opción 4
                break;
            default:
                System.out.println("Opción no válida");
                break;
        }*/
    }//GEN-LAST:event_cambiarVentanaActionPerformed

    private void jComboBox3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox3ActionPerformed

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
    private javax.swing.JPanel bitacorasGeneralEpp;
    private javax.swing.JPanel bitacorasGeneralExtintores;
    private javax.swing.JPanel bitacorasGeneralGas;
    private javax.swing.JPanel bitacorasGeneralHumo;
    private com.login.buttonsNormas btnUsuarios;
    private javax.swing.JComboBox<String> cambiarVentana;
    private javax.swing.JCheckBox checkActivo;
    private javax.swing.JComboBox<String> comboRegiones;
    private javax.swing.JComboBox<String> comboRoles;
    private javax.swing.JComboBox<String> comboTerminales;
    private javax.swing.JComboBox<String> comboTerminales1;
    private javax.swing.JComboBox<String> comboboxRegionTerminales;
    private javax.swing.JPanel exitBtn;
    private javax.swing.JLabel exitTxt;
    private javax.swing.JTextField idRegionAdmin;
    private javax.swing.JTextField idTerminalAdmin;
    private com.login.ModernButton insertarUser;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JComboBox<String> jComboBox3;
    private javax.swing.JComboBox<String> jComboBox4;
    private javax.swing.JComboBox<String> jComboBox5;
    private javax.swing.JComboBox<String> jComboBox6;
    private javax.swing.JComboBox<String> jComboBox7;
    private javax.swing.JComboBox<String> jComboBox8;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JScrollPane jScrollPane8;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator10;
    private javax.swing.JSeparator jSeparator11;
    private javax.swing.JSeparator jSeparator13;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JSeparator jSeparator7;
    private javax.swing.JSeparator jSeparator8;
    private javax.swing.JLabel labelAreaEPP;
    private javax.swing.JLabel labelAreaEPP1;
    private javax.swing.JLabel labelAreaEPP2;
    private javax.swing.JLabel labelPuestoEPP;
    private javax.swing.JLabel labelPuestoEPP1;
    private javax.swing.JComboBox<String> listaUsuarios;
    private javax.swing.JComboBox<String> listaUsuarios1;
    private javax.swing.JLabel logoDerecha;
    private javax.swing.JPanel menuDeOpciones;
    private com.login.buttonsNormas menuTerminales;
    private javax.swing.JLabel menuUsuario;
    private javax.swing.JLabel menuUsuario1;
    private com.login.ModernButton modernButton1;
    private com.login.ModernButton modernButton2;
    private javax.swing.JTextField nombreRegionAdmin;
    private javax.swing.JTextField nombreTerminalAdmin;
    private javax.swing.JPanel returnPanel;
    private javax.swing.JLabel returnTxt;
    private com.login.ModernButton revocarTerminal;
    private javax.swing.JPanel tablaBitacoras;
    private javax.swing.JPanel tablaBitacoras1;
    private javax.swing.JPanel tablaBitacoras2;
    private javax.swing.JPanel tablaBitacoras3;
    private javax.swing.JPanel tablaTerminales;
    private javax.swing.JTable tablaUsers;
    private javax.swing.JPanel tablaUsuarios;
    private javax.swing.JTable tableBItacorasAdmin;
    private javax.swing.JTable tableBItacorasAdmin1;
    private javax.swing.JTable tableBItacorasAdmin2;
    private javax.swing.JTable tableBItacorasAdmin3;
    private javax.swing.JTable tableTerminalesAdmin;
    private javax.swing.JPanel terminales;
    private javax.swing.JTextField ubicacionTerminalAdmin;
    private javax.swing.JPanel usuarios;
    // End of variables declaration//GEN-END:variables
}
