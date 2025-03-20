package com.login;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class TConexion {

    // Atributos estáticos y finales para la configuración de la conexión
    private static final String usuario = "postgres";
    private static final String contrasenia = "190601";//"190601"; //"1906";////
    private static final String bd = "bdADOFinal";
    private static final String ip = "34.55.167.82";//"34.55.167.82";//"localhost";//// // 
    private static final String puerto = "5432"; //sigue siendo el mismo
    private static final String cadena = "jdbc:postgresql://" + ip + ":" + puerto + "/" + bd;

    // Método estático para establecer la conexión
    public static Connection establecerConexion() {
        try {
            Connection conectar = DriverManager.getConnection(cadena, usuario, contrasenia);
            //System.out.println("Conexión exitosa a la base de datos.");
            return conectar;
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al conectar a la base de datos. Verifica los datos de conexión: " + e.getMessage());
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
                   // System.out.println("Conexión cerrada correctamente.");
                }
            } catch (SQLException e) {
                System.err.println("Error al cerrar la conexión: " + e.getMessage());
            }
        } else {
            System.out.println("La conexión es null.");
        }
    }
}
