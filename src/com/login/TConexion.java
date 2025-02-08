package com.login;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class TConexion {

    private Connection conectar = null;

    private final String usuario = "postgres";
    private final String contrasenia = "1906";
    private final String bd = "bdMobility";
    private final String ip = "localhost";
    private final String puerto = "5432";

    private final String cadena = "jdbc:postgresql://" + ip + ":" + puerto + "/" + bd;

    public Connection establecerConexion() {
        try {
            Class.forName("org.postgresql.Driver");
            conectar = DriverManager.getConnection(cadena, usuario, contrasenia);
            //System.out.println("Conexión exitosa a la base de datos.");
            return conectar;
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al conectar a la base de datos: " + e.getMessage());
            e.printStackTrace();
            return null;
        } catch (ClassNotFoundException e) {
            JOptionPane.showMessageDialog(null, "Driver de PostgreSQL no encontrado: " + e.getMessage());
            e.printStackTrace();
            return null;
        }
    }

    public void cerrarConexion() {
        try {
            if (conectar != null && !conectar.isClosed()) {
                conectar.close();
               // System.out.println("Conexión cerrada correctamente.");
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al cerrar la conexión: " + e.toString());
        }
    }
}
