package com.login;

import static com.login.globalV.conectar;
import java.awt.CardLayout;

import java.awt.Color;
import java.io.IOException;
import java.net.URISyntaxException;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import java.util.List;

import java.util.logging.Level;
import java.util.logging.Logger;

public class screenOrganizacion extends javax.swing.JFrame {

    int xMouse, yMouse;
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
        // bitacoras.add(gas, "gas");

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
        minimizarPanel = new javax.swing.JPanel();
        minimizarTxt = new javax.swing.JLabel();
        menuDeOpciones = new javax.swing.JPanel();
        btnEPP = new com.login.buttonsNormas();
        modernButton1 = new com.login.ModernButton();
        bitacoras = new javax.swing.JPanel();
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
        listRazon = new javax.swing.JComboBox<>();

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

        minimizarPanel.setBackground(new java.awt.Color(255, 255, 255));
        minimizarPanel.setPreferredSize(new java.awt.Dimension(40, 40));

        minimizarTxt.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        minimizarTxt.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/imagenes/minimizar.png"))); // NOI18N
        minimizarTxt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                minimizarTxtMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                minimizarTxtMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                minimizarTxtMouseExited(evt);
            }
        });

        javax.swing.GroupLayout minimizarPanelLayout = new javax.swing.GroupLayout(minimizarPanel);
        minimizarPanel.setLayout(minimizarPanelLayout);
        minimizarPanelLayout.setHorizontalGroup(
            minimizarPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(minimizarTxt, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
        );
        minimizarPanelLayout.setVerticalGroup(
            minimizarPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, minimizarPanelLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(minimizarTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        barNavMov.add(minimizarPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 0, 40, 40));

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

        listNom.setBackground(new java.awt.Color(255, 255, 255));
        listNom.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        listNom.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(197, 172, 204), 1, true)));
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
        labelRegiones.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/imagenes/region.png"))); // NOI18N
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
        jPanel1.add(btnInsertar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 10, -1, -1));

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
        jPanel1.add(btnModificar, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 10, -1, -1));

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
        jPanel1.add(btnExportar, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 10, -1, -1));

        listRazon.setBackground(new java.awt.Color(255, 255, 255));
        listRazon.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        listRazon.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(197, 172, 204), 1, true));
        jPanel1.add(listRazon, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 220, -1));

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

    private boolean validarCamposEPP() {
        if (txtFecha.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "El campo de fecha es obligatorio", "Error", JOptionPane.ERROR_MESSAGE);
            return false;
        }
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

        // Crear una lista de razones sociales
        String[] razonesSociales = {
            "Autobuses alas de oro S.A de C.V",
            "Ómnibus Cristóbal Colón S.A de C.V",};

        // Crear un modelo para el JComboBox con las razones sociales
        DefaultComboBoxModel<String> modelo2 = new DefaultComboBoxModel<>(razonesSociales);

        // Asignar el modelo al JComboBox
        listRazon.setModel(modelo2);

        // Agregar un mensaje inicial (opcional)
        listRazon.insertItemAt("Seleccione razón social", 0); // Insertar el mensaje inicial en la posición 0
        listRazon.setSelectedIndex(0); // Establecer el mensaje inicial como seleccionado
    }

    private void actBtnMenu() {

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

    private void btnEPPMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEPPMouseClicked
        CardLayout layout = (CardLayout) bitacoras.getLayout();
        layout.show(bitacoras, "epp"); // Cambia a panel1

        btnEPP.setSelected(true);
        // btnHumo.setSelected(false);
        // btnGas.setSelected(false);

    }//GEN-LAST:event_btnEPPMouseClicked

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

        if (btnEPP.isSelected()) {
            obj.modificarEPP(txtIDBitacora, txtFecha, nombreEPP, areaEPP,
                    puestoEPP, cascoEPP, lentesDeSeguridadEPP, lentesDeSeguridadEPP,
                    taponesAuditivosEPP, guantesEPP, caretaSoldarEPP,
                    caretaEsmerilarEPP, mascarillaEPP, fajaEPP, arnesEPP, uniformeEPP, firmadoEPP);
            labelResponsable.setText("Usuario");
            txtIDBitacora.setText("");
            labelRegiones.setText("Region");
            labelTerminales.setText("Terminal");
            txtFecha.setText("");
            txtiDUsuario.setText("");
            txtIDNorma.setText("NOM-017-STPS-2008");
            ////
            nombreEPP.setText("");
            areaEPP.setText("");
            puestoEPP.setText("");
            lentesDeSeguridadEPP.setSelected(false);
            caretaEsmerilarEPP.setSelected(false);
            cascoEPP.setSelected(false);
            botasSegEPP.setSelected(false);
            fajaEPP.setSelected(false);
            taponesAuditivosEPP.setSelected(false);
            guantesEPP.setSelected(false);
            uniformeEPP.setSelected(false);
            mascarillaEPP.setSelected(false);
            arnesEPP.setSelected(false);
            caretaSoldarEPP.setSelected(false);
            firmadoEPP.setSelected(false);
            obj.MostrarEPP(tablaEPP);

        }

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
        String seleccion = (String) listRazon.getSelectedItem();

        // Verificar si el mensaje inicial está seleccionado
        if ("Seleccione razón social".equals(seleccion)) {
            JOptionPane.showMessageDialog(this, "Por favor, seleccione una razón social válida.", "Error", JOptionPane.ERROR_MESSAGE);
            return; // Detener la ejecución si no se ha seleccionado una razón social válida
        }
        if (btnEPP.isSelected()) {

            PDFExporter ejemplo = new PDFExporter();
            try {
                ejemplo.EppPDF(seleccion);
            } catch (IOException ex) {
                Logger.getLogger(homeScreen.class.getName()).log(Level.SEVERE, null, ex);
            } catch (URISyntaxException ex) {
                Logger.getLogger(screenOrganizacion.class.getName()).log(Level.SEVERE, null, ex);
            }

        }

    }//GEN-LAST:event_btnExportarMouseClicked

    private void btnExportarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExportarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnExportarActionPerformed

    private void btnEPPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEPPActionPerformed

    }//GEN-LAST:event_btnEPPActionPerformed

    private void btnInsertar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInsertar1ActionPerformed

        if (btnEPP.isSelected()) {
            if (validarCamposEPP()) {
                    obj.insertarEPP(txtFecha, nombreEPP, areaEPP, puestoEPP,
                            cascoEPP, lentesDeSeguridadEPP, botasSegEPP, taponesAuditivosEPP, guantesEPP, caretaSoldarEPP, caretaEsmerilarEPP,
                            mascarillaEPP, fajaEPP, arnesEPP, uniformeEPP, firmadoEPP, txtIDNorma, txtiDUsuario, listNom.getSelectedItem().toString());
                    labelResponsable.setText("Usuario");
                    txtIDBitacora.setText("");
                    labelRegiones.setText("Region");
                    labelTerminales.setText("Terminal");
                    txtFecha.setText("");
                    txtiDUsuario.setText("");
                    txtIDNorma.setText("NOM-017-STPS-2008");
                    ////
                    nombreEPP.setText("");
                    areaEPP.setText("");
                    puestoEPP.setText("");
                    lentesDeSeguridadEPP.setSelected(false);
                    caretaEsmerilarEPP.setSelected(false);
                    cascoEPP.setSelected(false);
                    botasSegEPP.setSelected(false);
                    fajaEPP.setSelected(false);
                    taponesAuditivosEPP.setSelected(false);
                    guantesEPP.setSelected(false);
                    uniformeEPP.setSelected(false);
                    mascarillaEPP.setSelected(false);
                    arnesEPP.setSelected(false);
                    caretaSoldarEPP.setSelected(false);
                    firmadoEPP.setSelected(false);
                    obj.MostrarEPP(tablaEPP);
            }
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

    private void tablaEPPMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaEPPMouseClicked
        // TODO add your handling code here:
        obj.seleccionarEPP(tablaEPP, txtiDUsuario, labelResponsable, labelRegiones,
                labelTerminales, txtIDBitacora, txtFecha, nombreEPP,
                areaEPP, puestoEPP, cascoEPP, lentesDeSeguridadEPP,
                lentesDeSeguridadEPP, taponesAuditivosEPP, guantesEPP,
                caretaSoldarEPP, caretaEsmerilarEPP, mascarillaEPP, fajaEPP,
                arnesEPP, uniformeEPP, firmadoEPP, txtIDNorma);
    }//GEN-LAST:event_tablaEPPMouseClicked

    private void txtIDNormaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIDNormaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtIDNormaActionPerformed

    private void txtFechaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFechaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtFechaActionPerformed

    private void listNomActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_listNomActionPerformed
        // TODO add your handling code here:


    }//GEN-LAST:event_listNomActionPerformed

    private void modernButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_modernButton1MouseClicked
        // TODO add your handling code here:
        labelResponsable.setText("Usuario");
        txtIDBitacora.setText("");
        labelRegiones.setText("Region");
        labelTerminales.setText("Terminal");
        txtFecha.setText("");
        txtiDUsuario.setText("");
        txtIDNorma.setText("NOM-017-STPS-2008");
        ////
        nombreEPP.setText("");
        areaEPP.setText("");
        puestoEPP.setText("");
        lentesDeSeguridadEPP.setSelected(false);
        caretaEsmerilarEPP.setSelected(false);
        cascoEPP.setSelected(false);
        botasSegEPP.setSelected(false);
        fajaEPP.setSelected(false);
        taponesAuditivosEPP.setSelected(false);
        guantesEPP.setSelected(false);
        uniformeEPP.setSelected(false);
        mascarillaEPP.setSelected(false);
        arnesEPP.setSelected(false);
        caretaSoldarEPP.setSelected(false);
        firmadoEPP.setSelected(false);
    }//GEN-LAST:event_modernButton1MouseClicked

    private void minimizarTxtMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_minimizarTxtMouseClicked
        // TODO add your handling code here:
        this.setExtendedState(ICONIFIED);
    }//GEN-LAST:event_minimizarTxtMouseClicked

    private void minimizarTxtMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_minimizarTxtMouseEntered
        // TODO add your handling code here:
        minimizarPanel.setBackground(new Color(197, 172, 204));
        minimizarPanel.setForeground(Color.white);
    }//GEN-LAST:event_minimizarTxtMouseEntered

    private void minimizarTxtMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_minimizarTxtMouseExited
        // TODO add your handling code here:
        minimizarPanel.setBackground(Color.white);
        minimizarPanel.setForeground(Color.black);
    }//GEN-LAST:event_minimizarTxtMouseExited


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField areaEPP;
    private javax.swing.JCheckBox arnesEPP;
    private javax.swing.JPanel barNavMov;
    private javax.swing.JPanel bgHomeScreen;
    private javax.swing.JPanel bitacoras;
    private javax.swing.JCheckBox botasSegEPP;
    private com.login.buttonsNormas btnEPP;
    private com.login.ModernButton btnExportar;
    private com.login.ModernButton btnInsertar1;
    private com.login.ModernButton btnModificar;
    private javax.swing.JCheckBox caretaEsmerilarEPP;
    private javax.swing.JCheckBox caretaSoldarEPP;
    private javax.swing.JCheckBox cascoEPP;
    private javax.swing.JPanel epp;
    private javax.swing.JPanel exitBtn;
    private javax.swing.JLabel exitTxt;
    private javax.swing.JCheckBox fajaEPP;
    private javax.swing.JCheckBox firmadoEPP;
    private javax.swing.JCheckBox guantesEPP;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JSeparator jSeparator10;
    private javax.swing.JSeparator jSeparator12;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JLabel labelAreaEPP;
    private javax.swing.JLabel labelBitacora;
    private javax.swing.JLabel labelFecha;
    private javax.swing.JLabel labelNombreEPP;
    private javax.swing.JLabel labelNorma;
    private javax.swing.JLabel labelPuestoEPP;
    private javax.swing.JLabel labelRegiones;
    private javax.swing.JLabel labelResponsable;
    private javax.swing.JLabel labelTerminales;
    private javax.swing.JLabel labelUsuario;
    private javax.swing.JCheckBox lentesDeSeguridadEPP;
    private javax.swing.JComboBox<String> listNom;
    private javax.swing.JComboBox<String> listRazon;
    private javax.swing.JLabel logoDerecha;
    private javax.swing.JCheckBox mascarillaEPP;
    private javax.swing.JPanel menuDeOpciones;
    private javax.swing.JPanel minimizarPanel;
    private javax.swing.JLabel minimizarTxt;
    private com.login.ModernButton modernButton1;
    private javax.swing.JTextField nombreEPP;
    private javax.swing.JPanel panelinfo;
    private javax.swing.JTextField puestoEPP;
    private javax.swing.JPanel returnPanel;
    private javax.swing.JLabel returnTxt;
    private javax.swing.JTable tablaEPP;
    private javax.swing.JCheckBox taponesAuditivosEPP;
    private javax.swing.JPanel tbEPP;
    private javax.swing.JTextField txtFecha;
    private javax.swing.JTextField txtIDBitacora;
    private javax.swing.JTextField txtIDNorma;
    private javax.swing.JTextField txtiDUsuario;
    private javax.swing.JCheckBox uniformeEPP;
    // End of variables declaration//GEN-END:variables
}
