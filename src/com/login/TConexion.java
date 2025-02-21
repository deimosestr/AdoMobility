package com.login;

import static com.login.globalV.conectar;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class TConexion {

    // Atributos estáticos
    //private static Connection conectar = null;

    private static final String usuario = "postgres";
    private static final String contrasenia = "1906";
    private static final String bd = "bdMobility";
    private static final String ip = "localhost";
    private static final String puerto = "5432";

    private static final String cadena = "jdbc:postgresql://" + ip + ":" + puerto + "/" + bd;

    // Método estático para establecer la conexión
    public static Connection establecerConexion() {
        try {
            Class.forName("org.postgresql.Driver");
            conectar = DriverManager.getConnection(cadena, usuario, contrasenia);
            System.out.println("Conexión exitosa a la base de datos.");
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

    // Método estático para cerrar la conexión
    public static void cerrarConexion(Connection conexion) {
        if (conexion != null) {
            try {
                if (!conexion.isClosed()) {
                    conexion.close();
                    System.out.println("Conexión cerrada correctamente.");
                }
            } catch (SQLException e) {
                System.err.println("Error al cerrar la conexión: " + e.getMessage());
            }
        } else {
            System.out.println("La conexión es null.");
        }
    }
}
