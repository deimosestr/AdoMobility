package com.login;

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
import static javafx.scene.paint.Color.color;

public class screenOrganizacion extends javax.swing.JFrame {

    int xMouse, yMouse;
    TConexion conexion = new TConexion();
    CDatosNOM obj = new CDatosNOM();

    public screenOrganizacion() {
        initComponents();
        setSize(790, 500);
        setLocationRelativeTo(null);
        llenarComboBox();
        //llenarComboBoxHumo();
        //bitacoras.setVisible(false);
        obj.MostrarEPP(tablaEPP);

        bitacoras.add(epp, "epp");
        //bitacoras.add(epp, "humo");
        bitacoras.add(gas, "gas");

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
        btnEPP = new com.login.buttonsNormas();
        btnHumo = new com.login.buttonsNormas();
        btnGas = new com.login.buttonsNormas();
        bitacoras = new javax.swing.JPanel();
        gas = new javax.swing.JPanel();
        titulo = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        nomEmpresa = new javax.swing.JTextField();
        cMalas = new javax.swing.JCheckBox();
        c_Buena = new javax.swing.JCheckBox();
        c_Regular = new javax.swing.JCheckBox();
        cObservaciones = new javax.swing.JTextField();
        capacidadTanque = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        fechaFabricacion = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        cRegistrada = new javax.swing.JTextField();
        tObservaciones = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        marca = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        numSerie = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        diametroEXT = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        espesor = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        tbGas = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaGas = new javax.swing.JTable();
        extintores = new javax.swing.JPanel();
        informacion1 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tbExtintores = new javax.swing.JTable();
        labelUbicacion = new javax.swing.JLabel();
        ubicacion = new javax.swing.JTextField();
        labelUltimaRecarga = new javax.swing.JLabel();
        ultimaRecarga = new javax.swing.JTextField();
        labelProximaRecarga = new javax.swing.JLabel();
        proximaRecarga = new javax.swing.JTextField();
        labelCapacidad = new javax.swing.JLabel();
        capacidad = new javax.swing.JTextField();
        labelAgenteExtinguidor = new javax.swing.JLabel();
        jSeparator4 = new javax.swing.JSeparator();
        jSeparator15 = new javax.swing.JSeparator();
        jSeparator9 = new javax.swing.JSeparator();
        jSeparator7 = new javax.swing.JSeparator();
        jSeparator8 = new javax.swing.JSeparator();
        agenteExtinguidor = new javax.swing.JTextField();
        chckManguera = new javax.swing.JCheckBox();
        chckManometro = new javax.swing.JCheckBox();
        chckSoporte = new javax.swing.JCheckBox();
        chckPresion = new javax.swing.JCheckBox();
        chckCilindro = new javax.swing.JCheckBox();
        chckLimpieza = new javax.swing.JCheckBox();
        chckSenalizacion = new javax.swing.JCheckBox();
        chckEtiqueta = new javax.swing.JCheckBox();
        chckSeguro = new javax.swing.JCheckBox();
        chckObstrucciones = new javax.swing.JCheckBox();
        observaciones = new javax.swing.JTextField();
        firma = new javax.swing.JCheckBox();
        jPanel5 = new javax.swing.JPanel();
        epp = new javax.swing.JPanel();
        tbEPP = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        tablaEPP = new javax.swing.JTable();
        labelNombreEPP = new javax.swing.JLabel();
        nombreEPP = new javax.swing.JTextField();
        labelAreaEPP = new javax.swing.JLabel();
        areaEPP = new javax.swing.JTextField();
        labelPuestoEPP = new javax.swing.JLabel();
        puestoEPP = new javax.swing.JTextField();
        cascoEPP = new javax.swing.JCheckBox();
        lentesDeSeguridadEPP = new javax.swing.JCheckBox();
        botasSegEPP = new javax.swing.JCheckBox();
        jSeparator5 = new javax.swing.JSeparator();
        jSeparator10 = new javax.swing.JSeparator();
        jSeparator12 = new javax.swing.JSeparator();
        taponesAuditivosEPP = new javax.swing.JCheckBox();
        guantesEPP = new javax.swing.JCheckBox();
        caretaSoldarEPP = new javax.swing.JCheckBox();
        caretaEsmerilarEPP = new javax.swing.JCheckBox();
        mascarillaEPP = new javax.swing.JCheckBox();
        fajaEPP = new javax.swing.JCheckBox();
        arnesEPP = new javax.swing.JCheckBox();
        uniformeEPP = new javax.swing.JCheckBox();
        firmadoEPP = new javax.swing.JCheckBox();
        panelinfo = new javax.swing.JPanel();
        listNom = new javax.swing.JComboBox<>();
        labelUsuario = new javax.swing.JLabel();
        txtiDUsuario = new javax.swing.JTextField();
        labelResponsable = new javax.swing.JLabel();
        labelRegiones = new javax.swing.JLabel();
        labelBitacora = new javax.swing.JLabel();
        txtIDBitacora = new javax.swing.JTextField();
        txtFecha = new javax.swing.JTextField();
        labelFecha = new javax.swing.JLabel();
        labelTerminales = new javax.swing.JLabel();
        labelNorma = new javax.swing.JLabel();
        txtIDNorma = new javax.swing.JTextField();
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

        btnEPP.setText("EPP");
        btnEPP.setFont(new java.awt.Font("Roboto Black", 1, 14)); // NOI18N
        btnEPP.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnEPPMouseClicked(evt);
            }
        });
        btnEPP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEPPActionPerformed(evt);
            }
        });
        menuDeOpciones.add(btnEPP, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 60, 180, 35));

        btnHumo.setText("COMISIONES S.H");
        btnHumo.setFont(new java.awt.Font("Roboto Black", 1, 14)); // NOI18N
        btnHumo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnHumoMouseClicked(evt);
            }
        });
        btnHumo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHumoActionPerformed(evt);
            }
        });
        menuDeOpciones.add(btnHumo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 110, 180, 40));

        btnGas.setText("GAS1");
        btnGas.setFont(new java.awt.Font("Roboto Black", 1, 14)); // NOI18N
        btnGas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnGasMouseClicked(evt);
            }
        });
        btnGas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGasActionPerformed(evt);
            }
        });
        menuDeOpciones.add(btnGas, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 170, 180, 40));

        bgHomeScreen.add(menuDeOpciones, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 180, 500));

        bitacoras.setBackground(new java.awt.Color(255, 255, 255));
        bitacoras.setLayout(new java.awt.CardLayout());

        gas.setBackground(new java.awt.Color(255, 255, 255));
        gas.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        titulo.setBackground(new java.awt.Color(255, 255, 255));
        titulo.setText("Condicion General de soportes");
        gas.add(titulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 20, -1, -1));

        jLabel2.setText("Nombre de la empresa:");
        gas.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, -1, -1));

        nomEmpresa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nomEmpresaActionPerformed(evt);
            }
        });
        gas.add(nomEmpresa, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 0, 190, 20));

        cMalas.setBackground(new java.awt.Color(255, 255, 255));
        cMalas.setText("         Malas");
        cMalas.setBorder(null);
        cMalas.setBorderPainted(true);
        cMalas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cMalasActionPerformed(evt);
            }
        });
        gas.add(cMalas, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 40, 100, 20));

        c_Buena.setBackground(new java.awt.Color(255, 255, 255));
        c_Buena.setText("         Buena");
        c_Buena.setBorder(null);
        c_Buena.setBorderPainted(true);
        c_Buena.setMaximumSize(new java.awt.Dimension(80, 20));
        c_Buena.setMinimumSize(new java.awt.Dimension(80, 20));
        c_Buena.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                c_BuenaActionPerformed(evt);
            }
        });
        gas.add(c_Buena, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, 100, 20));

        c_Regular.setBackground(new java.awt.Color(255, 255, 255));
        c_Regular.setText("         Regular");
        c_Regular.setBorder(null);
        c_Regular.setBorderPainted(true);
        c_Regular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                c_RegularActionPerformed(evt);
            }
        });
        gas.add(c_Regular, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 40, 100, 20));

        cObservaciones.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(41, 43, 45)), "Observaciones", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION));
        cObservaciones.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cObservacionesActionPerformed(evt);
            }
        });
        gas.add(cObservaciones, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 160, 230, 80));

        capacidadTanque.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                capacidadTanqueActionPerformed(evt);
            }
        });
        gas.add(capacidadTanque, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 180, 70, -1));

        jLabel1.setText("Capacidad del tanque");
        gas.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 180, -1, -1));

        jLabel3.setText("Fecha de fabricacion");
        gas.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 210, -1, -1));

        fechaFabricacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fechaFabricacionActionPerformed(evt);
            }
        });
        gas.add(fechaFabricacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 210, 70, -1));

        jLabel4.setText("Capacidad registrada");
        gas.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 10, 120, 20));
        gas.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 120, -1, -1));

        cRegistrada.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cRegistradaActionPerformed(evt);
            }
        });
        gas.add(cRegistrada, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 10, 70, -1));

        tObservaciones.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(41, 43, 45)), "Observaciones", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION));
        tObservaciones.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tObservacionesActionPerformed(evt);
            }
        });
        gas.add(tObservaciones, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, 310, 90));

        jLabel6.setText("Marca");
        gas.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 40, -1, -1));

        marca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                marcaActionPerformed(evt);
            }
        });
        gas.add(marca, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 40, 70, -1));

        jLabel7.setText("# Serie");
        gas.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 70, -1, -1));

        numSerie.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                numSerieActionPerformed(evt);
            }
        });
        gas.add(numSerie, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 70, 120, -1));

        jLabel8.setText("Diametro exterior");
        gas.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 100, -1, -1));
        gas.add(diametroEXT, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 100, 80, -1));

        jLabel9.setText("Espesor");
        gas.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 130, -1, -1));

        espesor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                espesorActionPerformed(evt);
            }
        });
        gas.add(espesor, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 130, 70, -1));

        jLabel10.setText("Especificaciones del Tanque");
        gas.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 160, -1, -1));

        jScrollPane1.setBorder(null);
        jScrollPane1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jScrollPane1MouseClicked(evt);
            }
        });

        tablaGas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        tablaGas.setAutoResizeMode(0);
        tablaGas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablaGasMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tablaGas);

        javax.swing.GroupLayout tbGasLayout = new javax.swing.GroupLayout(tbGas);
        tbGas.setLayout(tbGasLayout);
        tbGasLayout.setHorizontalGroup(
            tbGasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 510, Short.MAX_VALUE)
        );
        tbGasLayout.setVerticalGroup(
            tbGasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, tbGasLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        gas.add(tbGas, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 240, 510, 100));

        bitacoras.add(gas, "card4");

        extintores.setBackground(new java.awt.Color(255, 255, 255));
        extintores.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        informacion1.setBackground(new java.awt.Color(255, 255, 255));
        informacion1.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(41, 43, 45)), "Información", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Roboto Light", 1, 12))); // NOI18N

        tbExtintores.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        tbExtintores.setAutoResizeMode(0);
        tbExtintores.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbExtintoresMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tbExtintores);

        javax.swing.GroupLayout informacion1Layout = new javax.swing.GroupLayout(informacion1);
        informacion1.setLayout(informacion1Layout);
        informacion1Layout.setHorizontalGroup(
            informacion1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 570, Short.MAX_VALUE)
        );
        informacion1Layout.setVerticalGroup(
            informacion1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 98, Short.MAX_VALUE)
        );

        extintores.add(informacion1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 220, 580, 120));

        labelUbicacion.setFont(new java.awt.Font("Roboto Light", 1, 12)); // NOI18N
        labelUbicacion.setText("Ubicacion");
        extintores.add(labelUbicacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, -1, 20));

        ubicacion.setFont(new java.awt.Font("Roboto Light", 1, 12)); // NOI18N
        ubicacion.setBorder(null);
        extintores.add(ubicacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 20, 150, -1));

        labelUltimaRecarga.setFont(new java.awt.Font("Roboto Light", 1, 12)); // NOI18N
        labelUltimaRecarga.setText("Ultima Recarga");
        extintores.add(labelUltimaRecarga, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, 100, -1));

        ultimaRecarga.setFont(new java.awt.Font("Roboto Light", 1, 12)); // NOI18N
        ultimaRecarga.setBorder(null);
        extintores.add(ultimaRecarga, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 60, 150, -1));

        labelProximaRecarga.setFont(new java.awt.Font("Roboto Light", 1, 12)); // NOI18N
        labelProximaRecarga.setText("Proxima Recarga");
        extintores.add(labelProximaRecarga, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, 100, -1));

        proximaRecarga.setFont(new java.awt.Font("Roboto Light", 1, 12)); // NOI18N
        proximaRecarga.setBorder(null);
        extintores.add(proximaRecarga, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 100, 150, 20));

        labelCapacidad.setFont(new java.awt.Font("Roboto Light", 1, 12)); // NOI18N
        labelCapacidad.setText("Capacidad (KGS)");
        extintores.add(labelCapacidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 140, -1, -1));

        capacidad.setFont(new java.awt.Font("Roboto Light", 1, 12)); // NOI18N
        capacidad.setBorder(null);
        extintores.add(capacidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 140, 150, -1));

        labelAgenteExtinguidor.setFont(new java.awt.Font("Roboto Light", 1, 12)); // NOI18N
        labelAgenteExtinguidor.setText("Tipo A. Extinguidor");
        extintores.add(labelAgenteExtinguidor, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 180, 110, -1));

        jSeparator4.setBackground(new java.awt.Color(197, 172, 204));
        jSeparator4.setForeground(new java.awt.Color(197, 172, 204));
        extintores.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 40, 150, 10));

        jSeparator15.setBackground(new java.awt.Color(197, 172, 204));
        jSeparator15.setForeground(new java.awt.Color(197, 172, 204));
        extintores.add(jSeparator15, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 80, 150, 10));

        jSeparator9.setBackground(new java.awt.Color(197, 172, 204));
        jSeparator9.setForeground(new java.awt.Color(197, 172, 204));
        jSeparator9.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        extintores.add(jSeparator9, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 120, 150, 10));

        jSeparator7.setBackground(new java.awt.Color(197, 172, 204));
        jSeparator7.setForeground(new java.awt.Color(197, 172, 204));
        extintores.add(jSeparator7, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 160, 150, 10));

        jSeparator8.setBackground(new java.awt.Color(197, 172, 204));
        jSeparator8.setForeground(new java.awt.Color(197, 172, 204));
        jSeparator8.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        extintores.add(jSeparator8, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 200, 150, 10));

        agenteExtinguidor.setFont(new java.awt.Font("Roboto Light", 1, 12)); // NOI18N
        agenteExtinguidor.setBorder(null);
        extintores.add(agenteExtinguidor, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 180, 150, -1));

        chckManguera.setBackground(new java.awt.Color(255, 255, 255));
        chckManguera.setFont(new java.awt.Font("Roboto Light", 1, 12)); // NOI18N
        chckManguera.setText("Manguera");
        chckManguera.setToolTipText("");
        chckManguera.setContentAreaFilled(false);
        extintores.add(chckManguera, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 10, 100, 20));

        chckManometro.setBackground(new java.awt.Color(255, 255, 255));
        chckManometro.setFont(new java.awt.Font("Roboto Light", 1, 12)); // NOI18N
        chckManometro.setText("Manometro");
        extintores.add(chckManometro, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 10, 100, 20));

        chckSoporte.setBackground(new java.awt.Color(255, 255, 255));
        chckSoporte.setFont(new java.awt.Font("Roboto Light", 1, 12)); // NOI18N
        chckSoporte.setText("Soporte");
        extintores.add(chckSoporte, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 10, 80, -1));

        chckPresion.setBackground(new java.awt.Color(255, 255, 255));
        chckPresion.setFont(new java.awt.Font("Roboto Light", 1, 12)); // NOI18N
        chckPresion.setText("Presión");
        extintores.add(chckPresion, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 40, 80, -1));

        chckCilindro.setBackground(new java.awt.Color(255, 255, 255));
        chckCilindro.setFont(new java.awt.Font("Roboto Light", 1, 12)); // NOI18N
        chckCilindro.setText("Cilindro");
        extintores.add(chckCilindro, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 40, 80, -1));

        chckLimpieza.setBackground(new java.awt.Color(255, 255, 255));
        chckLimpieza.setFont(new java.awt.Font("Roboto Light", 1, 12)); // NOI18N
        chckLimpieza.setText("Limpieza");
        extintores.add(chckLimpieza, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 40, 90, -1));

        chckSenalizacion.setBackground(new java.awt.Color(255, 255, 255));
        chckSenalizacion.setFont(new java.awt.Font("Roboto Light", 1, 12)); // NOI18N
        chckSenalizacion.setText("Señalización");
        extintores.add(chckSenalizacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 70, 100, -1));

        chckEtiqueta.setBackground(new java.awt.Color(255, 255, 255));
        chckEtiqueta.setFont(new java.awt.Font("Roboto Light", 1, 12)); // NOI18N
        chckEtiqueta.setText("Etiqueta");
        extintores.add(chckEtiqueta, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 70, 80, -1));

        chckSeguro.setBackground(new java.awt.Color(255, 255, 255));
        chckSeguro.setFont(new java.awt.Font("Roboto Light", 1, 12)); // NOI18N
        chckSeguro.setText("Seguro");
        chckSeguro.setToolTipText("");
        extintores.add(chckSeguro, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 70, 80, -1));

        chckObstrucciones.setBackground(new java.awt.Color(255, 255, 255));
        chckObstrucciones.setFont(new java.awt.Font("Roboto Light", 1, 12)); // NOI18N
        chckObstrucciones.setText("Obstrucciones");
        extintores.add(chckObstrucciones, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 100, 120, -1));

        observaciones.setFont(new java.awt.Font("Roboto Light", 1, 12)); // NOI18N
        observaciones.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(41, 43, 45)), "Observaciones", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Roboto Light", 1, 12))); // NOI18N
        extintores.add(observaciones, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 130, 310, 80));

        firma.setBackground(new java.awt.Color(255, 255, 255));
        firma.setFont(new java.awt.Font("Roboto Light", 1, 12)); // NOI18N
        firma.setText("Firmado");
        extintores.add(firma, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 100, -1, -1));

        bitacoras.add(extintores, "card2");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 610, Short.MAX_VALUE)
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 350, Short.MAX_VALUE)
        );

        bitacoras.add(jPanel5, "card5");

        epp.setBackground(new java.awt.Color(255, 255, 255));
        epp.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tbEPP.setBackground(new java.awt.Color(255, 255, 255));
        tbEPP.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(41, 43, 45)), "Información", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Roboto Light", 1, 12))); // NOI18N

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
            .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 570, Short.MAX_VALUE)
        );
        tbEPPLayout.setVerticalGroup(
            tbEPPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 138, Short.MAX_VALUE)
        );

        epp.add(tbEPP, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 180, 580, 160));

        labelNombreEPP.setFont(new java.awt.Font("Roboto Light", 1, 12)); // NOI18N
        labelNombreEPP.setText("Nombre");
        epp.add(labelNombreEPP, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, -1, 20));

        nombreEPP.setFont(new java.awt.Font("Roboto Light", 1, 12)); // NOI18N
        nombreEPP.setBorder(null);
        epp.add(nombreEPP, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 20, 150, -1));

        labelAreaEPP.setFont(new java.awt.Font("Roboto Light", 1, 12)); // NOI18N
        labelAreaEPP.setText("Area");
        epp.add(labelAreaEPP, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, 100, -1));

        areaEPP.setFont(new java.awt.Font("Roboto Light", 1, 12)); // NOI18N
        areaEPP.setBorder(null);
        epp.add(areaEPP, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 60, 150, 20));

        labelPuestoEPP.setFont(new java.awt.Font("Roboto Light", 1, 12)); // NOI18N
        labelPuestoEPP.setText("Puesto");
        epp.add(labelPuestoEPP, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, 110, -1));

        puestoEPP.setFont(new java.awt.Font("Roboto Light", 1, 12)); // NOI18N
        puestoEPP.setBorder(null);
        epp.add(puestoEPP, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 100, 150, -1));

        cascoEPP.setBackground(new java.awt.Color(255, 255, 255));
        cascoEPP.setFont(new java.awt.Font("Roboto Light", 1, 12)); // NOI18N
        cascoEPP.setText("Casco");
        cascoEPP.setToolTipText("");
        cascoEPP.setContentAreaFilled(false);
        epp.add(cascoEPP, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 20, 70, 20));

        lentesDeSeguridadEPP.setBackground(new java.awt.Color(255, 255, 255));
        lentesDeSeguridadEPP.setFont(new java.awt.Font("Roboto Light", 1, 12)); // NOI18N
        lentesDeSeguridadEPP.setText("Lentes de Seguridad");
        epp.add(lentesDeSeguridadEPP, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 140, 150, 20));

        botasSegEPP.setBackground(new java.awt.Color(255, 255, 255));
        botasSegEPP.setFont(new java.awt.Font("Roboto Light", 1, 12)); // NOI18N
        botasSegEPP.setText("Botas Seguridad");
        epp.add(botasSegEPP, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 20, 120, 20));

        jSeparator5.setBackground(new java.awt.Color(197, 172, 204));
        jSeparator5.setForeground(new java.awt.Color(197, 172, 204));
        epp.add(jSeparator5, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 40, 150, 10));

        jSeparator10.setBackground(new java.awt.Color(197, 172, 204));
        jSeparator10.setForeground(new java.awt.Color(197, 172, 204));
        jSeparator10.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        epp.add(jSeparator10, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 80, 150, 10));

        jSeparator12.setBackground(new java.awt.Color(197, 172, 204));
        jSeparator12.setForeground(new java.awt.Color(197, 172, 204));
        jSeparator12.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        epp.add(jSeparator12, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 120, 150, 10));

        taponesAuditivosEPP.setBackground(new java.awt.Color(255, 255, 255));
        taponesAuditivosEPP.setFont(new java.awt.Font("Roboto Light", 1, 12)); // NOI18N
        taponesAuditivosEPP.setText("Tapones Auditivos");
        epp.add(taponesAuditivosEPP, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 50, -1, -1));

        guantesEPP.setBackground(new java.awt.Color(255, 255, 255));
        guantesEPP.setFont(new java.awt.Font("Roboto Light", 1, 12)); // NOI18N
        guantesEPP.setText("Guantes");
        epp.add(guantesEPP, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 80, -1, 20));

        caretaSoldarEPP.setBackground(new java.awt.Color(255, 255, 255));
        caretaSoldarEPP.setFont(new java.awt.Font("Roboto Light", 1, 12)); // NOI18N
        caretaSoldarEPP.setText("Careta para soldar");
        epp.add(caretaSoldarEPP, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 140, -1, -1));

        caretaEsmerilarEPP.setBackground(new java.awt.Color(255, 255, 255));
        caretaEsmerilarEPP.setFont(new java.awt.Font("Roboto Light", 1, 12)); // NOI18N
        caretaEsmerilarEPP.setText("Careta para esmerilar");
        epp.add(caretaEsmerilarEPP, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 140, -1, -1));

        mascarillaEPP.setBackground(new java.awt.Color(255, 255, 255));
        mascarillaEPP.setFont(new java.awt.Font("Roboto Light", 1, 12)); // NOI18N
        mascarillaEPP.setText("Mascarilla");
        epp.add(mascarillaEPP, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 110, -1, -1));

        fajaEPP.setBackground(new java.awt.Color(255, 255, 255));
        fajaEPP.setFont(new java.awt.Font("Roboto Light", 1, 12)); // NOI18N
        fajaEPP.setText("Faja");
        epp.add(fajaEPP, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 50, -1, -1));

        arnesEPP.setBackground(new java.awt.Color(255, 255, 255));
        arnesEPP.setFont(new java.awt.Font("Roboto Light", 1, 12)); // NOI18N
        arnesEPP.setText("Arnes");
        epp.add(arnesEPP, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 110, -1, -1));

        uniformeEPP.setBackground(new java.awt.Color(255, 255, 255));
        uniformeEPP.setText("Uniforme");
        epp.add(uniformeEPP, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 80, -1, -1));

        firmadoEPP.setBackground(new java.awt.Color(255, 255, 255));
        firmadoEPP.setFont(new java.awt.Font("Roboto Light", 1, 12)); // NOI18N
        firmadoEPP.setText("Firmado");
        epp.add(firmadoEPP, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 140, -1, -1));

        bitacoras.add(epp, "card3");

        bgHomeScreen.add(bitacoras, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 100, 610, 350));

        panelinfo.setBackground(new java.awt.Color(255, 255, 255));
        panelinfo.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        listNom.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        listNom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                listNomActionPerformed(evt);
            }
        });
        panelinfo.add(listNom, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, -1, -1));

        labelUsuario.setFont(new java.awt.Font("Roboto Light", 1, 12)); // NOI18N
        labelUsuario.setText("ID: ");
        panelinfo.add(labelUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 30, 30, 20));

        txtiDUsuario.setFont(new java.awt.Font("Roboto Light", 1, 12)); // NOI18N
        txtiDUsuario.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtiDUsuario.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(197, 172, 204), 3));
        panelinfo.add(txtiDUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 30, 30, -1));

        labelResponsable.setFont(new java.awt.Font("Roboto Light", 1, 12)); // NOI18N
        labelResponsable.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/imagenes/usuario.png"))); // NOI18N
        labelResponsable.setText("Usuario");
        panelinfo.add(labelResponsable, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 20));

        labelRegiones.setFont(new java.awt.Font("Roboto Light", 1, 12)); // NOI18N
        labelRegiones.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/imagenes/marcador-de-posicion.png"))); // NOI18N
        labelRegiones.setText("Region");
        panelinfo.add(labelRegiones, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 0, -1, 30));

        labelBitacora.setFont(new java.awt.Font("Roboto Light", 1, 12)); // NOI18N
        labelBitacora.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelBitacora.setText("Bitacora:");
        panelinfo.add(labelBitacora, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 0, 60, 20));

        txtIDBitacora.setFont(new java.awt.Font("Roboto Light", 1, 12)); // NOI18N
        txtIDBitacora.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtIDBitacora.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(197, 172, 204), 3, true));
        panelinfo.add(txtIDBitacora, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 0, 30, -1));

        txtFecha.setFont(new java.awt.Font("Roboto", 1, 10)); // NOI18N
        txtFecha.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(197, 172, 204), 3), "Fecha", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.BELOW_BOTTOM, new java.awt.Font("Roboto", 1, 12))); // NOI18N
        txtFecha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFechaActionPerformed(evt);
            }
        });
        panelinfo.add(txtFecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 0, 70, 50));

        labelFecha.setFont(new java.awt.Font("Roboto Light", 1, 12)); // NOI18N
        labelFecha.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelFecha.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/imagenes/calendario2.png"))); // NOI18N
        panelinfo.add(labelFecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 0, -1, 40));

        labelTerminales.setFont(new java.awt.Font("Roboto Light", 1, 12)); // NOI18N
        labelTerminales.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/imagenes/parada-de-autobus (1).png"))); // NOI18N
        labelTerminales.setText("Terminal");
        panelinfo.add(labelTerminales, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 0, -1, -1));

        labelNorma.setFont(new java.awt.Font("Roboto Light", 1, 12)); // NOI18N
        labelNorma.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelNorma.setText("Norma:");
        panelinfo.add(labelNorma, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 30, 50, 20));

        txtIDNorma.setEditable(false);
        txtIDNorma.setBackground(new java.awt.Color(255, 255, 255));
        txtIDNorma.setFont(new java.awt.Font("Roboto Light", 1, 12)); // NOI18N
        txtIDNorma.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtIDNorma.setText("NOM-017-STPS-2008");
        txtIDNorma.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(197, 172, 204), 3));
        txtIDNorma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIDNormaActionPerformed(evt);
            }
        });
        panelinfo.add(txtIDNorma, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 30, 130, 20));

        bgHomeScreen.add(panelinfo, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 40, 610, 60));

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
        if (txtFecha.getText().trim().isEmpty()
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
        }

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
        listNom.setModel(modelo);

    }

    private void actBtnMenu() {

    }


    private void exitTxtMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitTxtMouseClicked
        // TODO add your handling code here:
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

    private void btnEPPMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEPPMouseClicked
        CardLayout layout = (CardLayout) bitacoras.getLayout();
        layout.show(bitacoras, "epp"); // Cambia a panel1

        btnEPP.setSelected(true);
        btnHumo.setSelected(false);
        btnGas.setSelected(false);

    }//GEN-LAST:event_btnEPPMouseClicked

    private void btnHumoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnHumoMouseClicked

    }//GEN-LAST:event_btnHumoMouseClicked

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

    private void tbExtintoresMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbExtintoresMouseClicked
        // TODO add your handling code here:
        obj.seleccionarExtintores(tbExtintores, txtiDUsuario, labelResponsable,
                labelRegiones, labelTerminales,
                txtIDBitacora, txtFecha,
                ubicacion, ultimaRecarga,
                proximaRecarga, capacidad,
                agenteExtinguidor,
                chckManguera, chckManometro, chckSoporte,
                chckPresion, chckCilindro, chckLimpieza,
                chckSenalizacion, chckEtiqueta, chckSeguro,
                chckObstrucciones, observaciones, firma,
                txtIDNorma);
    }//GEN-LAST:event_tbExtintoresMouseClicked

    private void tablaEPPMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaEPPMouseClicked
        // TODO add your handling code here:
        obj.seleccionarEPP(tablaEPP, txtiDUsuario, labelResponsable, labelRegiones,
                labelTerminales, txtIDBitacora, txtFecha, nombreEPP,
                areaEPP, puestoEPP, cascoEPP, lentesDeSeguridadEPP, 
                lentesDeSeguridadEPP, taponesAuditivosEPP, guantesEPP, 
                caretaSoldarEPP, caretaEsmerilarEPP, mascarillaEPP, fajaEPP, 
                arnesEPP, uniformeEPP, firmadoEPP, txtIDNorma);
        
    }//GEN-LAST:event_tablaEPPMouseClicked

    private void btnModificarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnModificarMouseClicked
        // TODO add your handling code here:

        /*  if (btnExtintor.isSelected()) {
            obj.modificarExtintores(
                    txtIDBitacora, txtFecha, ubicacion, ultimaRecarga,
                    proximaRecarga, capacidad, agenteExtinguidor,
                    chckManguera, chckManometro, chckSoporte, chckPresion,
                    chckCilindro, chckLimpieza, chckEtiqueta, chckSeguro,
                    chckObstrucciones, chckSenalizacion, observaciones);
            obj.MostrarExtintores(tbExtintores);

        }

        if (btnHumo.isSelected()) {
            obj.modificarHumo(txtIDBitacora, txtFecha, ubicacionHumo,
                    ultimaFechaHumo, proximaFechaHumo, marcaHumo,
                    tipoDetectorHumo, pruebaFuncionamiento, soporteHumo,
                    ubicacionFisica, observacionesHumo);
            obj.MostrarHumo(tablaHumo);
        }

        if (btnGas.isSelected()) {
            obj.modificarGas(
                    
                     txtIDBitacora,txtFecha, 
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

        if (btnEPP.isSelected()) {

            PDFExporter ejemplo = new PDFExporter(8f);
            try {
                ejemplo.ExtintorPDF();
            } catch (IOException ex) {
                Logger.getLogger(homeScreen.class.getName()).log(Level.SEVERE, null, ex);
            }

        }

        if (btnHumo.isSelected()) {

        }

        if (btnGas.isSelected()) {

        }

    }//GEN-LAST:event_btnExportarMouseClicked

    private void btnHumoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHumoActionPerformed

        CardLayout layout = (CardLayout) bitacoras.getLayout();
        layout.show(bitacoras, "humo");

        btnEPP.setSelected(false);
        btnHumo.setSelected(true);
        btnGas.setSelected(false);


    }//GEN-LAST:event_btnHumoActionPerformed

    private void btnExportarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExportarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnExportarActionPerformed

    private void txtFechaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFechaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtFechaActionPerformed

    private void cMalasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cMalasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cMalasActionPerformed

    private void c_BuenaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_c_BuenaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_c_BuenaActionPerformed

    private void c_RegularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_c_RegularActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_c_RegularActionPerformed

    private void cObservacionesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cObservacionesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cObservacionesActionPerformed

    private void capacidadTanqueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_capacidadTanqueActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_capacidadTanqueActionPerformed

    private void fechaFabricacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fechaFabricacionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fechaFabricacionActionPerformed

    private void cRegistradaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cRegistradaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cRegistradaActionPerformed

    private void marcaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_marcaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_marcaActionPerformed

    private void numSerieActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_numSerieActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_numSerieActionPerformed

    private void espesorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_espesorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_espesorActionPerformed

    private void tObservacionesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tObservacionesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tObservacionesActionPerformed

    private void btnGasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGasActionPerformed
        CardLayout layout = (CardLayout) bitacoras.getLayout();
        layout.show(bitacoras, "gas"); // Cambia al panel humo.

        btnEPP.setSelected(false);
        btnHumo.setSelected(false);
        btnGas.setSelected(true);

        // Cambiar color de botón seleccionado

    }//GEN-LAST:event_btnGasActionPerformed

    private void btnGasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnGasMouseClicked

        epp.setVisible(false);    }//GEN-LAST:event_btnGasMouseClicked

    private void listNomActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_listNomActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_listNomActionPerformed

    private void btnEPPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEPPActionPerformed

    }//GEN-LAST:event_btnEPPActionPerformed

    private void txtIDNormaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIDNormaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtIDNormaActionPerformed

    private void nomEmpresaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nomEmpresaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nomEmpresaActionPerformed

    private void jScrollPane1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jScrollPane1MouseClicked

    }//GEN-LAST:event_jScrollPane1MouseClicked

    private void tablaGasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaGasMouseClicked
        obj.seleccionarGas(
                tablaGas, txtiDUsuario, labelResponsable, labelRegiones,
                labelTerminales, txtIDBitacora, txtFecha,
                nomEmpresa, cMalas, c_Buena, c_Regular,
                cObservaciones, capacidadTanque, fechaFabricacion,
                cRegistrada, tObservaciones, marca, numSerie,
                diametroEXT, espesor);
    }//GEN-LAST:event_tablaGasMouseClicked

    private void btnInsertar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInsertar1ActionPerformed

        if (btnEPP.isSelected()) {
            obj.insertarEPP(txtFecha, nombreEPP, areaEPP, puestoEPP,
                    cascoEPP, lentesDeSeguridadEPP, botasSegEPP, taponesAuditivosEPP, guantesEPP, caretaSoldarEPP, caretaEsmerilarEPP,
                    mascarillaEPP, fajaEPP, arnesEPP, uniformeEPP, firmadoEPP, txtIDNorma, txtiDUsuario, listNom.getSelectedItem().toString());
            obj.MostrarEPP(tablaEPP);

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
    private javax.swing.JTextField agenteExtinguidor;
    private javax.swing.JTextField areaEPP;
    private javax.swing.JCheckBox arnesEPP;
    private javax.swing.JPanel barNavMov;
    private javax.swing.JPanel bgHomeScreen;
    private javax.swing.JPanel bitacoras;
    private javax.swing.JCheckBox botasSegEPP;
    private com.login.buttonsNormas btnEPP;
    private com.login.ModernButton btnExportar;
    private com.login.buttonsNormas btnGas;
    private com.login.buttonsNormas btnHumo;
    private com.login.ModernButton btnInsertar1;
    private com.login.ModernButton btnModificar;
    private javax.swing.JCheckBox cMalas;
    private javax.swing.JTextField cObservaciones;
    private javax.swing.JTextField cRegistrada;
    private javax.swing.JCheckBox c_Buena;
    private javax.swing.JCheckBox c_Regular;
    private javax.swing.JTextField capacidad;
    private javax.swing.JTextField capacidadTanque;
    private javax.swing.JCheckBox caretaEsmerilarEPP;
    private javax.swing.JCheckBox caretaSoldarEPP;
    private javax.swing.JCheckBox cascoEPP;
    private javax.swing.JCheckBox chckCilindro;
    private javax.swing.JCheckBox chckEtiqueta;
    private javax.swing.JCheckBox chckLimpieza;
    private javax.swing.JCheckBox chckManguera;
    private javax.swing.JCheckBox chckManometro;
    private javax.swing.JCheckBox chckObstrucciones;
    private javax.swing.JCheckBox chckPresion;
    private javax.swing.JCheckBox chckSeguro;
    private javax.swing.JCheckBox chckSenalizacion;
    private javax.swing.JCheckBox chckSoporte;
    private javax.swing.JTextField diametroEXT;
    private javax.swing.JPanel epp;
    private javax.swing.JTextField espesor;
    private javax.swing.JPanel exitBtn;
    private javax.swing.JLabel exitTxt;
    private javax.swing.JPanel extintores;
    private javax.swing.JCheckBox fajaEPP;
    private javax.swing.JTextField fechaFabricacion;
    private javax.swing.JCheckBox firma;
    private javax.swing.JCheckBox firmadoEPP;
    private javax.swing.JPanel gas;
    private javax.swing.JCheckBox guantesEPP;
    private javax.swing.JPanel informacion1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JSeparator jSeparator10;
    private javax.swing.JSeparator jSeparator12;
    private javax.swing.JSeparator jSeparator15;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator7;
    private javax.swing.JSeparator jSeparator8;
    private javax.swing.JSeparator jSeparator9;
    private javax.swing.JLabel labelAgenteExtinguidor;
    private javax.swing.JLabel labelAreaEPP;
    private javax.swing.JLabel labelBitacora;
    private javax.swing.JLabel labelCapacidad;
    private javax.swing.JLabel labelFecha;
    private javax.swing.JLabel labelNombreEPP;
    private javax.swing.JLabel labelNorma;
    private javax.swing.JLabel labelProximaRecarga;
    private javax.swing.JLabel labelPuestoEPP;
    private javax.swing.JLabel labelRegiones;
    private javax.swing.JLabel labelResponsable;
    private javax.swing.JLabel labelTerminales;
    private javax.swing.JLabel labelUbicacion;
    private javax.swing.JLabel labelUltimaRecarga;
    private javax.swing.JLabel labelUsuario;
    private javax.swing.JCheckBox lentesDeSeguridadEPP;
    private javax.swing.JComboBox<String> listNom;
    private javax.swing.JLabel logoDerecha;
    private javax.swing.JTextField marca;
    private javax.swing.JCheckBox mascarillaEPP;
    private javax.swing.JPanel menuDeOpciones;
    private javax.swing.JTextField nomEmpresa;
    private javax.swing.JTextField nombreEPP;
    private javax.swing.JTextField numSerie;
    private javax.swing.JTextField observaciones;
    private javax.swing.JPanel panelinfo;
    private javax.swing.JTextField proximaRecarga;
    private javax.swing.JTextField puestoEPP;
    private javax.swing.JPanel returnPanel;
    private javax.swing.JLabel returnTxt;
    private javax.swing.JTextField tObservaciones;
    private javax.swing.JTable tablaEPP;
    private javax.swing.JTable tablaGas;
    private javax.swing.JCheckBox taponesAuditivosEPP;
    private javax.swing.JPanel tbEPP;
    private javax.swing.JTable tbExtintores;
    private javax.swing.JPanel tbGas;
    private javax.swing.JLabel titulo;
    private javax.swing.JTextField txtFecha;
    private javax.swing.JTextField txtIDBitacora;
    private javax.swing.JTextField txtIDNorma;
    private javax.swing.JTextField txtiDUsuario;
    private javax.swing.JTextField ubicacion;
    private javax.swing.JTextField ultimaRecarga;
    private javax.swing.JCheckBox uniformeEPP;
    // End of variables declaration//GEN-END:variables
}
