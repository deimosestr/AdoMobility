package com.login;

import static com.login.globalV.fechaR;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JCheckBox;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import javax.swing.table.TableRowSorter;

public class CDatosNOM {

    TConexion obj = new TConexion();


    //Panel info
    int iDbitacora;
    String fecha_revision;
    int idNorma;
    int iDUsuario;
    int idTerminal;
    String usuario;
    String region;
    String terminal;

    //EXTINTORES
    String ubicacion;
    String ultima_fecha_entrega;
    String proxima_recarga;
    String capacidad_kgs;
    String tipo_agente_extinguidor;

    boolean manguera;
    boolean manometro;
    boolean soporte;
    boolean presion;
    boolean cilindro;
    boolean limpieza;
    boolean etiqueta;
    boolean seguro;
    boolean obstruccion;
    String observacion;
    boolean firmado;


    boolean senalizacion;

    //HUMO
    String marca;
    boolean prueba_funcionamiento;
    boolean ubicacion_fisica;

    String nomEmpresa;
    boolean cMalas;
    boolean c_Regular;
    boolean c_Buena;
    String cObservaciones;
    String capacidadTanque;
    String fechaFabricacion;
    String cRegistrada;
    String tObservaciones;
    String marcaTanque;
    String numSerie;
    String diametroEXT;
    String espesor;

    //EPP
    String nombre_epp;
    String area_epp;
    String puesto_epp;
    boolean casco_epp;
    boolean lentes_de_seguridad_epp;
    boolean botas_de_seguridad_epp;
    boolean tapones_auditivos_epp;
    boolean guantes_epp;
    boolean careta_soldar_epp;
    boolean careta_esmerilar_epp;
    boolean mascarilla_epp;
    boolean faja_epp;
    boolean arnes_epp;
    boolean uniforme_epp;
    boolean firmado_epp;

    public String getNombre_epp() {
        return nombre_epp;
    }

    public void setNombre_epp(String nombre_epp) {
        this.nombre_epp = nombre_epp;
    }

    public String getArea_epp() {
        return area_epp;
    }

    public void setArea_epp(String area_epp) {
        this.area_epp = area_epp;
    }

    public String getPuesto_epp() {
        return puesto_epp;
    }

    public void setPuesto_epp(String puesto_epp) {
        this.puesto_epp = puesto_epp;
    }

    public boolean isCasco_epp() {
        return casco_epp;
    }

    public void setCasco_epp(boolean casco_epp) {
        this.casco_epp = casco_epp;
    }

    public boolean isLentes_de_seguridad_epp() {
        return lentes_de_seguridad_epp;
    }

    public void setLentes_de_seguridad_epp(boolean lentes_de_seguridad_epp) {
        this.lentes_de_seguridad_epp = lentes_de_seguridad_epp;
    }

    public boolean isBotas_de_seguridad_epp() {
        return botas_de_seguridad_epp;
    }

    public void setBotas_de_seguridad_epp(boolean botas_de_seguridad_epp) {
        this.botas_de_seguridad_epp = botas_de_seguridad_epp;
    }

    public boolean isTapones_auditivos_epp() {
        return tapones_auditivos_epp;
    }

    public void setTapones_auditivos_epp(boolean tapones_auditivos_epp) {
        this.tapones_auditivos_epp = tapones_auditivos_epp;
    }

    public boolean isGuantes_epp() {
        return guantes_epp;
    }

    public void setGuantes_epp(boolean guantes_epp) {
        this.guantes_epp = guantes_epp;
    }

    public boolean isCareta_soldar_epp() {
        return careta_soldar_epp;
    }

    public void setCareta_soldar_epp(boolean careta_soldar_epp) {
        this.careta_soldar_epp = careta_soldar_epp;
    }

    public boolean isCareta_esmerilar_epp() {
        return careta_esmerilar_epp;
    }

    public void setCareta_esmerilar_epp(boolean careta_esmerilar_epp) {
        this.careta_esmerilar_epp = careta_esmerilar_epp;
    }

    public boolean isMascarilla_epp() {
        return mascarilla_epp;
    }

    public void setMascarilla_epp(boolean mascarilla_epp) {
        this.mascarilla_epp = mascarilla_epp;
    }

    public boolean isFaja_epp() {
        return faja_epp;
    }

    public void setFaja_epp(boolean faja_epp) {
        this.faja_epp = faja_epp;
    }

    public boolean isArnes_epp() {
        return arnes_epp;
    }

    public void setArnes_epp(boolean arnes_epp) {
        this.arnes_epp = arnes_epp;
    }

    public boolean isUniforme_epp() {
        return uniforme_epp;
    }

    public void setUniforme_epp(boolean uniforme_epp) {
        this.uniforme_epp = uniforme_epp;
    }

    public boolean isFirmado_epp() {
        return firmado_epp;
    }

    public void setFirmado_epp(boolean firmado_epp) {
        this.firmado_epp = firmado_epp;
    }

    public TConexion getObj() {
        return obj;
    }

    public String getUsuario() {
        return usuario;
    }
    public String getRegion() {
        return region;
    }
    public String getTerminal() {
        return terminal;
    }

    public String getNomEmpresa() {
        return nomEmpresa;
    }

    public boolean iscMalas() {
        return cMalas;
    }

    public boolean isC_Regular() {
        return c_Regular;
    }

    public boolean isC_Buena() {
        return c_Buena;
    }

    public String getcObservaciones() {
        return cObservaciones;
    }

    public String getCapacidadTanque() {
        return capacidadTanque;
    }

    public String getFechaFabricacion() {
        return fechaFabricacion;
    }

    public String getcRegistrada() {
        return cRegistrada;
    }

    public String gettObservaciones() {
        return tObservaciones;
    }

    public String getMarcaTanque() {
        return marcaTanque;
    }

    public String getNumSerie() {
        return numSerie;
    }

    public String getDiametroEXT() {
        return diametroEXT;
    }

    //Gas
    public String getEspesor() {
        return espesor;
    }

    public void setObj(TConexion obj) {
        this.obj = obj;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public void setTerminal(String terminal) {
        this.terminal = terminal;
    }

    public void setNomEmpresa(String nomEmpresa) {
        this.nomEmpresa = nomEmpresa;
    }

    public void setcMalas(boolean cMalas) {
        this.cMalas = cMalas;
    }

    public void setC_Regular(boolean c_Regular) {
        this.c_Regular = c_Regular;
    }

    public void setC_Buena(boolean c_Buena) {
        this.c_Buena = c_Buena;
    }

    public void setcObservaciones(String cObservaciones) {
        this.cObservaciones = cObservaciones;
    }

    public void setCapacidadTanque(String capacidadTanque) {
        this.capacidadTanque = capacidadTanque;
    }

    public void setFechaFabricacion(String fechaFabricacion) {
        this.fechaFabricacion = fechaFabricacion;
    }

    public void setcRegistrada(String cRegistrada) {
        this.cRegistrada = cRegistrada;
    }

    public void settObservaciones(String tObservaciones) {
        this.tObservaciones = tObservaciones;
    }

    public void setMarcaTanque(String marcaTanque) {
        this.marcaTanque = marcaTanque;
    }

    public void setNumSerie(String numSerie) {
        this.numSerie = numSerie;
    }

    public void setDiametroEXT(String diametroEXT) {
        this.diametroEXT = diametroEXT;
    }

    public void setEspesor(String espesor) {
        this.espesor = espesor;
    }

    public boolean isPrueba_funcionamiento() {
        return prueba_funcionamiento;
    }

    public void setPrueba_funcionamiento(boolean prueba_funcionamiento) {
        this.prueba_funcionamiento = prueba_funcionamiento;
    }

    public boolean isUbicacion_fisica() {
        return ubicacion_fisica;
    }

    public void setUbicacion_fisica(boolean ubicacion_fisica) {
        this.ubicacion_fisica = ubicacion_fisica;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getiDbitacora() {
        return iDbitacora;
    }

    public void setiDbitacora(int iDbitacora) {
        this.iDbitacora = iDbitacora;
    }

    public String getFecha_revision() {
        return fecha_revision;
    }

    public void setFecha_revision(String fecha_revision) {
        this.fecha_revision = fecha_revision;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }

    public String getUltima_fecha_recarga() {
        return ultima_fecha_entrega;
    }

    public void setUltima_fecha_entrega(String ultima_fecha_entrega) {
        this.ultima_fecha_entrega = ultima_fecha_entrega;
    }

    public String getProxima_recarga() {
        return proxima_recarga;
    }

    public void setProxima_recarga(String proxima_recarga) {
        this.proxima_recarga = proxima_recarga;
    }

    public String getCapacidad_kgs() {
        return capacidad_kgs;
    }

    public void setCapacidad_kgs(String capacidad_kgs) {
        this.capacidad_kgs = capacidad_kgs;
    }

    public String getTipo_agente_extinguidor() {
        return tipo_agente_extinguidor;
    }

    public void setTipo_agente_extinguidor(String tipo_agente_extinguidor) {
        this.tipo_agente_extinguidor = tipo_agente_extinguidor;
    }

    public boolean isManguera() {
        return manguera;
    }

    public void setManguera(boolean manguera) {
        this.manguera = manguera;
    }

    public boolean isManometro() {
        return manometro;
    }

    public void setManometro(boolean manometro) {
        this.manometro = manometro;
    }

    public boolean isSoporte() {
        return soporte;
    }

    public void setSoporte(boolean soporte) {
        this.soporte = soporte;
    }

    public boolean isPresion() {
        return presion;
    }

    public void setPresion(boolean presion) {
        this.presion = presion;
    }

    public boolean isCilindro() {
        return cilindro;
    }

    public void setCilindro(boolean cilindro) {
        this.cilindro = cilindro;
    }

    public boolean isLimpieza() {
        return limpieza;
    }

    public void setLimpieza(boolean limpieza) {
        this.limpieza = limpieza;
    }

    public boolean isEtiqueta() {
        return etiqueta;
    }

    public void setEtiqueta(boolean etiqueta) {
        this.etiqueta = etiqueta;
    }

    public boolean isSeguro() {
        return seguro;
    }

    public void setSeguro(boolean seguro) {
        this.seguro = seguro;
    }

    public boolean isObstruccion() {
        return obstruccion;
    }

    public void setObstruccion(boolean obstruccion) {
        this.obstruccion = obstruccion;
    }

    public String getObservacion() {
        return observacion;
    }

    public void setObservacion(String observacion) {
        this.observacion = observacion;
    }

    public boolean isFirmado() {
        return firmado;
    }

    public void setFirmado(boolean firmado) {
        this.firmado = firmado;
    }

    public int getIdNorma() {
        return idNorma;
    }

    public void setIdNorma(int idNorma) {
        this.idNorma = idNorma;
    }

    public int getiDUsuario() {
        return iDUsuario;
    }

    public void setiDUsuario(int iDUsuario) {
        this.iDUsuario = iDUsuario;
    }

    public boolean isSenalizacion() {
        return senalizacion;
    }

    public void setSenalizacion(boolean senalizacion) {
        this.senalizacion = senalizacion;
    }

    public int getIdTerminal() {
        return idTerminal;
    }

    public void setIdTerminal(int idTerminal) {
        this.idTerminal = idTerminal;
    }

    /*private void sincronizarSecuenciaBitacoraHumo() {
        String sql = "SELECT setval('bitacora_humo_id_bitacora_seq', COALESCE((SELECT MAX(id_bitacora) FROM bitacora_humo), 0) + 1, false);";

        try {
            Connection conn = null;
            conn = obj.establecerConexion(); // Conexión a la base de datos
            PreparedStatement pst = conn.prepareStatement(sql);
            pst.execute();
            System.out.println("Secuencia de bitacora_humo sincronizada correctamente.");
        } catch (SQLException e) {
            e.printStackTrace();
            System.out.println("Error al sincronizar la secuencia de bitacora_humo.");
        }
    }
    


    private void actualizarSecuencia() {
        String sql = "SELECT setval('bitacora_id_bitacora_seq', COALESCE((SELECT MAX(id_bitacora) FROM bitacora), 0) + 1, false)";

        try {
            Connection conn = null;
            conn = obj.establecerConexion();
            PreparedStatement pst = conn.prepareStatement(sql);
            pst.execute();
            System.out.println("Secuencia actualizada correctamente.");
        } catch (SQLException e) {
            e.printStackTrace();
            System.out.println("Error al actualizar la secuencia.");
        }
    }*/
 /*public static String convertirFecha(String fecha) {
    if (fecha == null || fecha.trim().isEmpty()) {
        return "";
    }
    try {
        SimpleDateFormat formatoEntrada = new SimpleDateFormat("yyyy-MM-dd");
        SimpleDateFormat formatoSalida = new SimpleDateFormat("dd/MM/yyyy");
        java.util.Date fechaDate = formatoEntrada.parse(fecha);
        return formatoSalida.format(fechaDate);
    } catch (ParseException e) {
        System.out.println("Error al convertir la fecha: " + fecha);
        return fecha; // Devuelve la fecha original si hay un error
    }
}*/
    /*public static String convertirFecha(String fecha) {
        if (fecha == null || fecha.isEmpty()) {
            return null; // Retorna null en lugar de una cadena vacía
        }
        try {
            SimpleDateFormat formatoEntrada = new SimpleDateFormat("yyyy-MM-dd");
            SimpleDateFormat formatoSalida = new SimpleDateFormat("dd/MM/yyyy");

            java.util.Date fechaDate = formatoEntrada.parse(fecha);
            return formatoSalida.format(fechaDate);
        } catch (ParseException e) {
            System.err.println("Error al convertir la fecha: " + fecha + " - " + e.getMessage());
            return null; // Retorna null en caso de error
        }
    }*/
public static String convertirFecha(String fecha) {
    if (fecha == null || fecha.isEmpty()) {
        return null; // Retorna null si la fecha es nula o vacía
    }
    
    // Lista de formatos de entrada posibles
    String[] formatos = {"yyyy-MM-dd", "dd/MM/yyyy", "MM/dd/yyyy"};
    
    for (String formato : formatos) {
        try {
            // Crear el formato de entrada
            SimpleDateFormat formatoEntrada = new SimpleDateFormat(formato);
            
            // Analizar la fecha
            java.util.Date fechaDate = formatoEntrada.parse(fecha);
            
            // Formato de salida (cambiar a yyyy-MM-dd)
            SimpleDateFormat formatoSalida = new SimpleDateFormat("yyyy-MM-dd");
            
            // Retornar la fecha en el formato deseado
            return formatoSalida.format(fechaDate);
        } catch (ParseException e) {
            // Si ocurre un error, simplemente continuamos con el siguiente formato
            continue;
        }
    }
    
    // Si no se pudo convertir la fecha, retornar null
    System.err.println("Error al convertir la fecha: " + fecha);
    return null;
}


    private void actualizarSecuencia(String ext, String nomTabla) {
        System.out.println("se intenta actualizar");
        String sql = "SELECT setval('" + ext + "', COALESCE((SELECT MAX(id_bitacora) FROM " + nomTabla + "), 0) + 1, false)";

        try {
            Connection conn = null;
            conn = obj.establecerConexion();
            PreparedStatement pst = conn.prepareStatement(sql);
            pst.execute();
            //System.out.println("Secuencia actualizada correctamente.");
        } catch (SQLException e) {
            e.printStackTrace();
            //System.out.println("Error al actualizar la secuencia.");
        }
    }

    public int obtenerIDNorma(String nombreNorma) {
        int idNorma = -1; // Valor predeterminado para indicar que no se encontró un resultado
        Connection conexion = null;
        PreparedStatement pst = null;
        ResultSet rs = null;

        try {
            // Establecer la conexión
            TConexion obj2 = new TConexion();
            conexion = obj2.establecerConexion();

            // Consulta SQL
            String sql = "SELECT id_norma FROM normas WHERE nombre = ? LIMIT 1;";
            pst = conexion.prepareStatement(sql);

            // Asignar el parámetro a la consulta
            pst.setString(1, nombreNorma);

            // Ejecutar la consulta
            rs = pst.executeQuery();

            // Obtener el primer resultado
            if (rs.next()) {
                idNorma = rs.getInt("id_norma");
            }
        } catch (Exception e) {
            e.printStackTrace(); // Imprime cualquier error para depuración
        } finally {
            // Cerrar los recursos
            try {
                if (rs != null) {
                    rs.close();
                }
                if (pst != null) {
                    pst.close();
                }
                if (conexion != null) {
                    conexion.close();
                }
            } catch (Exception ex) {
                ex.printStackTrace();
            }
        }

        return idNorma;
    }

    public int obtenerIDUsuario() {
        int idUsuario = -1; // Valor predeterminado para indicar que no se encontró un resultado
        Connection conexion = null;
        PreparedStatement pst = null;
        ResultSet rs = null;

        try {
            // Establecer la conexión
            TConexion obj2 = new TConexion();
            conexion = obj2.establecerConexion();

            // Consulta SQL
            String sql = "SELECT id_usuarios FROM usuarios WHERE username = ? LIMIT 1;";
            pst = conexion.prepareStatement(sql);

            // Asignar el parámetro a la consulta
            pst.setString(1, globalV.user);

            // Ejecutar la consulta
            rs = pst.executeQuery();

            // Obtener el primer resultado
            if (rs.next()) {
                idUsuario = rs.getInt("id_usuarios");
            }
        } catch (Exception e) {
            e.printStackTrace(); // Imprime cualquier error para depuración
        } finally {
            // Cerrar los recursos
            try {
                if (rs != null) {
                    rs.close();
                }
                if (pst != null) {
                    pst.close();
                }
                if (conexion != null) {
                    conexion.close();
                }
            } catch (Exception ex) {
                ex.printStackTrace();
            }
        }

        return idUsuario;
    }

    public int obtenerIDTerminal(String nombreTerminal) {
        int idTerminal = -1; // Valor predeterminado para indicar que no se encontró un resultado
        Connection conexion = null;
        PreparedStatement pst = null;
        ResultSet rs = null;

        try {
            // Establecer la conexión
            TConexion obj2 = new TConexion();
            conexion = obj2.establecerConexion();

            // Consulta SQL
            String sql = "SELECT id_terminal FROM terminales WHERE nombre = ? LIMIT 1;";
            pst = conexion.prepareStatement(sql);

            // Asignar el parámetro a la consulta
            pst.setString(1, nombreTerminal);

            // Ejecutar la consulta
            rs = pst.executeQuery();

            // Obtener el primer resultado
            if (rs.next()) {
                idNorma = rs.getInt("id_terminal");
            }
        } catch (Exception e) {
            e.printStackTrace(); // Imprime cualquier error para depuración
        } finally {
            // Cerrar los recursos
            try {
                if (rs != null) {
                    rs.close();
                }
                if (pst != null) {
                    pst.close();
                }
                if (conexion != null) {
                    conexion.close();
                }
            } catch (Exception ex) {
                ex.printStackTrace();
            }
        }

        return idNorma;
    }

    public List<String> obtenerNombreTerminales(int idUsuario) {
        List<String> nombresTerminales = new ArrayList<>(); // Inicializar la lista vacía
        Connection conexion = null;
        PreparedStatement pst = null;
        ResultSet rs = null;

        try {
            // Establecer la conexión
            TConexion obj2 = new TConexion();
            conexion = obj2.establecerConexion();

            // Consulta SQL
            String sql = "SELECT t.nombre "
                    + "FROM terminales t "
                    + "JOIN terminales_usuarios tu ON t.id_terminal = tu.id_terminal "
                    + "JOIN usuarios u ON u.id_usuarios = tu.id_usuario "
                    + "WHERE u.id_usuarios = ?;";
            pst = conexion.prepareStatement(sql);

            // Asignar el parámetro a la consulta
            pst.setInt(1, idUsuario);

            // Ejecutar la consulta
            rs = pst.executeQuery();

            // Procesar los resultados y agregar a la lista
            //nombresTerminales.add("Selecciona una terminal");
            while (rs.next()) {
                String nombreTerminal = rs.getString("nombre");
                nombresTerminales.add(nombreTerminal);
            }
        } catch (Exception e) {
            e.printStackTrace(); // Imprime cualquier error para depuración
        } finally {
            // Cerrar los recursos
            try {
                if (rs != null) {
                    rs.close();
                }
                if (pst != null) {
                    pst.close();
                }
                if (conexion != null) {
                    conexion.close();
                }
            } catch (Exception ex) {
                ex.printStackTrace();
            }
        }

        return nombresTerminales; // Retornar la lista de nombres
    }

    public void MostrarExtintores(JTable paramTablaNOM002) {
        TConexion obj2 = new TConexion();

        // Crear el modelo de la tabla con tipos específicos y celdas no editables
        DefaultTableModel modelo = new DefaultTableModel() {
        };

        TableRowSorter<TableModel> OrdenarTabla = new TableRowSorter<>(modelo);
        paramTablaNOM002.setRowSorter(OrdenarTabla);

        // Añadir las columnas al modelo
        modelo.addColumn("ID Usuario");
        modelo.addColumn("Responsable");
        modelo.addColumn("Region");
        modelo.addColumn("Terminal");
        modelo.addColumn("ID Bitacora");
        modelo.addColumn("Fecha Revision");
        modelo.addColumn("Ubicacion");

        modelo.addColumn("Ultima Recarga");
        modelo.addColumn("Proxima Recarga");
        modelo.addColumn("Capacidad");
        modelo.addColumn("Tipo Agente Extinguidor");

        modelo.addColumn("Manguera");
        modelo.addColumn("Manometro");
        modelo.addColumn("Soporte");
        modelo.addColumn("Presion");
        modelo.addColumn("Cilindro");
        modelo.addColumn("Limpieza");
        modelo.addColumn("Señalizacion");
        modelo.addColumn("Etiqueta");
        modelo.addColumn("Seguro");
        modelo.addColumn("Obstruccion");
        modelo.addColumn("Observacion");

        modelo.addColumn("Firmado");
        modelo.addColumn("ID Norma");

        paramTablaNOM002.setModel(modelo);

        String sql = "SELECT DISTINCT "
                + "b.id_usuario_fk, u.nombre AS responsable, r.nombre AS region, "
                + "STRING_AGG(DISTINCT t.nombre, ', ') AS terminales, "
                + "b.id_bitacora, b.fecha_revision, b.ubicacion, b.ultima_recarga, b.proxima_recarga, b.capacidad, b.tipo_agente_extinguidor, "
                + "b.manguera, b.manometro, b.soporte, b.presion, b.cilindro, b.limpieza, b.senalizacion, b.etiqueta, b.seguro, b.obstruccion, "
                + "b.observacion, b.firmado, b.id_norma_fk "
                + "FROM bitacora b "
                + "JOIN usuarios u ON b.id_usuario_fk = u.id_usuarios "
                + "JOIN terminales t ON b.id_terminal_fk = t.id_terminal "
                + "JOIN regiones r ON t.id_region_fk = r.id_region "
                + "LEFT JOIN terminales_usuarios tu ON tu.id_usuario = u.id_usuarios "
                + "WHERE u.username = ? "
                + "GROUP BY "
                + "b.id_bitacora, b.fecha_revision, b.ubicacion, b.ultima_recarga, b.proxima_recarga, b.capacidad, b.tipo_agente_extinguidor, "
                + "b.manguera, b.manometro, b.soporte, b.presion, b.cilindro, b.limpieza, b.senalizacion, b.etiqueta, b.seguro, b.obstruccion, "
                + "b.observacion, b.firmado, b.id_norma_fk, b.id_usuario_fk, u.nombre, r.nombre;";

        Object[] datos = new Object[24]; // Cambiado a Object[] para permitir tanto String como Boolean
        PreparedStatement pst = null;
        ResultSet rs = null;

        try {
            // Establecer conexión y preparar la consulta
            pst = obj2.establecerConexion().prepareStatement(sql);
            pst.setString(1, globalV.user); // Asignar el parámetro a la consulta

            rs = pst.executeQuery();

            while (rs.next()) {
                // Obtener datos de las columnas y convertir las booleanas
                datos[0] = rs.getString(1); // ID usuario
                datos[1] = rs.getString(2); // Responsable
                datos[2] = rs.getString(3); // Region
                datos[3] = rs.getString(4); // terminales
                datos[4] = rs.getString(5); // id_bitacora
                datos[5] = convertirFecha(rs.getString(6)); // fecha_revision
                datos[6] = rs.getString(7); // ubicacion
                datos[7] = rs.getString(8); // ultima recarga
                datos[8] = rs.getString(9); // proxima recarga
                datos[9] = rs.getString(10); // capacidad
                datos[10] = rs.getString(11); // tipo de agente extinguidor
                //Boleanos
                datos[11] = "t".equals(rs.getString(12));
                datos[12] = "t".equals(rs.getString(13));
                datos[13] = "t".equals(rs.getString(14));
                datos[14] = "t".equals(rs.getString(15));
                datos[15] = "t".equals(rs.getString(16));
                datos[16] = "t".equals(rs.getString(17));
                datos[17] = "t".equals(rs.getString(18));
                datos[18] = "t".equals(rs.getString(19));
                datos[19] = "t".equals(rs.getString(20));
                datos[20] = "t".equals(rs.getString(21));
                datos[21] = rs.getString(22); // Observaciones

                datos[22] = "t".equals(rs.getString(23)); // Firmado
                datos[23] = rs.getString(24); // Terminales

                modelo.addRow(datos);
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al mostrar: " + e.toString());
        } finally {
            // Cerrar recursos
            try {
                if (rs != null) {
                    rs.close();
                }
                if (pst != null) {
                    pst.close();
                }
                //obj2.cerrarConexion(); // Método para cerrar conexión en TConexion
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(null, "Error al cerrar conexión: " + ex.toString());
            }
        }
    }
    public void seleccionarExtintores(
            JTable paramTablaNOM002, JTextField paramIDUsuario, JLabel paramResponsable,
            JLabel paramRegion, JLabel paramTerminales, JTextField paramIDBitacora,
            JTextField paramFechaRevision, JTextField paramUbicacion, JTextField paramUltimaRecarga, JTextField paramProxima_recarga, JTextField paramCapacidad_kgs, JTextField paramTipo_agente_extinguidor,
            JCheckBox paramManguera, JCheckBox paramManometro, JCheckBox paramSoporte, JCheckBox paramPresion, JCheckBox paramCilindro, JCheckBox paramLimpieza, JCheckBox paramSenalizacion, JCheckBox paramEtiqueta, JCheckBox paramSeguro, JCheckBox paramObstruccion,
            JTextField paramObservacion, JCheckBox paramFirmado, JTextField paramIDNorma) {
        try {
            int fila = paramTablaNOM002.getSelectedRow();
            if (fila >= 0) {
                // Asignar valores a los JTextField
                paramIDUsuario.setText(paramTablaNOM002.getValueAt(fila, 0).toString());
                paramResponsable.setText(paramTablaNOM002.getValueAt(fila, 1).toString());
                paramRegion.setText(paramTablaNOM002.getValueAt(fila, 2).toString());
                paramTerminales.setText(paramTablaNOM002.getValueAt(fila, 3).toString());
                paramIDBitacora.setText(paramTablaNOM002.getValueAt(fila, 4).toString());
                
                
                //paramFechaRevision.setText(convertirFecha(paramTablaNOM002.getValueAt(fila, 5).toString()));
                
                
                fechaR = convertirFecha(paramTablaNOM002.getValueAt(fila, 5).toString());
                paramFechaRevision.setText(fechaR);
                
                
                paramUbicacion.setText(paramTablaNOM002.getValueAt(fila, 6).toString());
                paramUltimaRecarga.setText(paramTablaNOM002.getValueAt(fila, 7).toString());
                paramProxima_recarga.setText(paramTablaNOM002.getValueAt(fila, 8).toString());
                paramCapacidad_kgs.setText(paramTablaNOM002.getValueAt(fila, 9).toString());
                paramTipo_agente_extinguidor.setText(paramTablaNOM002.getValueAt(fila, 10).toString());
                //Boleanos
                paramManguera.setSelected((Boolean) paramTablaNOM002.getValueAt(fila, 11));
                paramManometro.setSelected((Boolean) paramTablaNOM002.getValueAt(fila, 12));
                paramSoporte.setSelected((Boolean) paramTablaNOM002.getValueAt(fila, 13));
                paramPresion.setSelected((Boolean) paramTablaNOM002.getValueAt(fila, 14));
                paramCilindro.setSelected((Boolean) paramTablaNOM002.getValueAt(fila, 15));
                paramLimpieza.setSelected((Boolean) paramTablaNOM002.getValueAt(fila, 16));
                paramSenalizacion.setSelected((Boolean) paramTablaNOM002.getValueAt(fila, 17));
                paramEtiqueta.setSelected((Boolean) paramTablaNOM002.getValueAt(fila, 18));
                paramSeguro.setSelected((Boolean) paramTablaNOM002.getValueAt(fila, 19));
                paramObstruccion.setSelected((Boolean) paramTablaNOM002.getValueAt(fila, 20));
                //
                paramObservacion.setText(paramTablaNOM002.getValueAt(fila, 21).toString());
                paramFirmado.setSelected((Boolean) paramTablaNOM002.getValueAt(fila, 22));
                paramIDNorma.setText(paramTablaNOM002.getValueAt(fila, 23).toString());
            } else {
                JOptionPane.showMessageDialog(null, "Fila no seleccionada");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error: " + e.toString());
        }
    }

    public void insertarBitacoraExtintores(
            JTextField paramFecha_Revision, JTextField paramUbicacion,
            JTextField paramUltima_Recarga, JTextField paramProxima_Recarga, JTextField paramCapacidad_kgs, JTextField paramTipo_agente_extinguidor,
            JCheckBox paramManguera, JCheckBox paramManometro, JCheckBox paramSoporte, JCheckBox paramPresion,
            JCheckBox paramCilindro, JCheckBox paramLimpieza, JCheckBox paramEtiqueta,
            JCheckBox paramSeguro, JCheckBox paramObstruccion,
            JTextField paramObservaciones, JCheckBox paramFirmado, JTextField paramId_Norma_Fk,
            JTextField paramId_Usuario_Fk, JCheckBox paramSenalizacion, String paramNombreTerminal) {

        //setiDbitacora(Integer.parseInt(paramIDBitacora.getText()));
        setFecha_revision(paramFecha_Revision.getText());
        setUbicacion(paramUbicacion.getText());
        setUltima_fecha_entrega(paramUltima_Recarga.getText());
        setProxima_recarga(paramProxima_Recarga.getText());
        setCapacidad_kgs(paramCapacidad_kgs.getText());
        setTipo_agente_extinguidor(paramTipo_agente_extinguidor.getText());
        //booleanos
        setManguera(paramManguera.isSelected());
        setManometro(paramManometro.isSelected());
        setSoporte(paramSoporte.isSelected());
        setPresion(paramPresion.isSelected());
        setCilindro(paramCilindro.isSelected());
        setLimpieza(paramLimpieza.isSelected());
        setEtiqueta(paramEtiqueta.isSelected());
        setSeguro(paramSeguro.isSelected());
        setObstruccion(paramObstruccion.isSelected());
        setObservacion(paramObservaciones.getText());
        setFirmado(paramFirmado.isSelected());
        //setIdNorma(Integer.parseInt(paramId_Norma_Fk.getText()));
        //setiDUsuario(Integer.parseInt(paramId_Usuario_Fk.getText()));
        setSenalizacion(paramSenalizacion.isSelected());
        //setIdTerminal(Integer.parseInt(paramId_Terminal_Fk.getText()));

        TConexion obj = new TConexion();

        int iDUsuario = obtenerIDUsuario();
        int idNorma_fk = obtenerIDNorma(paramId_Norma_Fk.getText());
        int idTerminal = obtenerIDTerminal(paramNombreTerminal);

        String sql = "INSERT INTO bitacora ("
                + "fecha_revision, ubicacion, ultima_recarga, proxima_recarga, capacidad, "
                + "tipo_agente_extinguidor, manguera, manometro, soporte, presion, cilindro, limpieza, "
                + "etiqueta, seguro, obstruccion, observacion, firmado, id_norma_fk, id_usuario_fk, "
                + "senalizacion, id_terminal_fk) "
                + "VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?);";

        try {
            CallableStatement cs = obj.establecerConexion().prepareCall(sql);

            SimpleDateFormat formato = new SimpleDateFormat("yyyy-MM-dd");
            java.sql.Date fechaRevision = new java.sql.Date(formato.parse(getFecha_revision()).getTime());

            //cs.setInt(1, getiDbitacora());
            cs.setDate(1, fechaRevision);
            cs.setString(2, getUbicacion());
            cs.setString(3, getUltima_fecha_recarga());
            cs.setString(4, getProxima_recarga());
            cs.setString(5, getCapacidad_kgs());
            cs.setString(6, getTipo_agente_extinguidor());
            //booleanos
            cs.setBoolean(7, isManguera());
            cs.setBoolean(8, isManometro());
            cs.setBoolean(9, isSoporte());
            cs.setBoolean(10, isPresion());
            cs.setBoolean(11, isCilindro());
            cs.setBoolean(12, isLimpieza());
            cs.setBoolean(13, isEtiqueta());
            cs.setBoolean(14, isSeguro());
            cs.setBoolean(15, isObstruccion());
            cs.setString(16, getObservacion());
            cs.setBoolean(17, isFirmado());
            cs.setInt(18, idNorma_fk);
            cs.setInt(19, iDUsuario);
            cs.setBoolean(20, isSenalizacion());
            cs.setInt(21, idTerminal);

            String ext = "bitacora_id_bitacora_seq";
            String nomTabla = "bitacora";
            actualizarSecuencia(ext, nomTabla);
            cs.execute();

            JOptionPane.showMessageDialog(null, "Inserción Existosa");

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error" + e.toString());
        }
    }

    public void modificarExtintores(JTextField paramIdBitacora, JTextField paramFechaRevision,
            JTextField paramUbicacion, JTextField paramUltima_fecha_entrega, JTextField paramProxima_recarga,
            JTextField paramCapacidad_kgs, JTextField paramTipo_agente_extinguidor,
            JCheckBox paramManguera, JCheckBox paramManometro, JCheckBox paramSoporte, JCheckBox paramPresion,
            JCheckBox paramCilindro, JCheckBox paramLimpieza, JCheckBox paramEtiqueta, JCheckBox paramSeguro,
            JCheckBox paramObstruccion, JCheckBox paramSenalizacion, JTextField paramObservaciones) {

        setiDbitacora(Integer.parseInt(paramIdBitacora.getText()));
        setFecha_revision(paramFechaRevision.getText());
        setUbicacion(paramUbicacion.getText());
        setUltima_fecha_entrega(paramUltima_fecha_entrega.getText());
        setProxima_recarga(paramProxima_recarga.getText());
        setCapacidad_kgs(paramCapacidad_kgs.getText());
        setTipo_agente_extinguidor(paramTipo_agente_extinguidor.getText());
        //booleanos 
        setManguera(paramManguera.isSelected());
        setManometro(paramManometro.isSelected());
        setSoporte(paramSoporte.isSelected());
        setPresion(paramPresion.isSelected());
        setCilindro(paramCilindro.isSelected());
        setLimpieza(paramLimpieza.isSelected());
        setEtiqueta(paramEtiqueta.isSelected());
        setSeguro(paramSeguro.isSelected());
        setObstruccion(paramObstruccion.isSelected());
        setSenalizacion(paramSenalizacion.isSelected());
        setObservacion(paramObservaciones.getText());
        //setObservacion(paramObservaciones.getText());

        //setFirmado(paramFirmado.isSelected());
        //setIdNorma(Integer.parseInt(paramIdNorma.getText()));
        //setiDUsuario(Integer.parseInt(paramIdUsuario.getText()));
        //setIdTerminal(Integer.parseInt(paramIdTerminal.getText()));
        TConexion obj3 = new TConexion();
        String sql = "UPDATE public.bitacora "
                + "SET fecha_revision = ?, "
                + "ubicacion = ?, "
                + "ultima_recarga = ?, "
                + "proxima_recarga = ?, "
                + "capacidad = ?, "
                + "tipo_agente_extinguidor = ?, "
                + "manguera = ?, "
                + "manometro = ?, "
                + "soporte = ?, "
                + "presion = ?, "
                + "cilindro = ?, "
                + "limpieza = ?, "
                + "etiqueta = ?, "
                + "seguro = ?, "
                + "obstruccion = ?, "
                + "senalizacion = ?, "
                + "observacion = ? "
                + "WHERE id_bitacora = ?";

        try {
            CallableStatement cs = obj3.establecerConexion().prepareCall(sql);

            cs.setString(1, getFecha_revision());
            cs.setString(2, getUbicacion());
            cs.setString(3, getUltima_fecha_recarga());
            cs.setString(4, getProxima_recarga());
            cs.setString(5, getCapacidad_kgs());
            cs.setString(6, getTipo_agente_extinguidor());
            //
            cs.setBoolean(7, isManguera());
            cs.setBoolean(8, isManometro());
            cs.setBoolean(9, isSoporte());
            cs.setBoolean(10, isPresion());
            cs.setBoolean(11, isCilindro());
            cs.setBoolean(12, isLimpieza());
            cs.setBoolean(13, isEtiqueta());
            cs.setBoolean(14, isSeguro());
            cs.setBoolean(15, isObstruccion());
            cs.setBoolean(16, isSenalizacion());
            cs.setString(17, getObservacion());
            cs.setInt(18, getiDbitacora());

            cs.execute();

            JOptionPane.showMessageDialog(null, "Modificación Exitosa");

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "No se modificó, error" + e.toString());
        }
    }

    //METODOS HUMO
    public void MostrarHumo(JTable paramTablaHumo) {
        TConexion obj2 = new TConexion();

        // Crear el modelo de la tabla con tipos específicos y celdas no editables
        DefaultTableModel modelo = new DefaultTableModel() {
        };

        TableRowSorter<TableModel> OrdenarTabla = new TableRowSorter<>(modelo);
        paramTablaHumo.setRowSorter(OrdenarTabla);

        // Añadir las columnas al modelo
        modelo.addColumn("ID Usuario");
        modelo.addColumn("Responsable");
        modelo.addColumn("Region");
        modelo.addColumn("Terminal");
        modelo.addColumn("ID Bitacora");
        modelo.addColumn("Fecha Revision");
        modelo.addColumn("Ubicacion");

        modelo.addColumn("Ultima Fecha");
        modelo.addColumn("Proxima Fecha");
        modelo.addColumn("Marca");
        modelo.addColumn("Tipo Detector");

        modelo.addColumn("Prueba Funcionamiento");
        modelo.addColumn("Soporte");
        modelo.addColumn("Ubicacion Fisica");
        modelo.addColumn("Observacion");
        modelo.addColumn("ID Norma");

        paramTablaHumo.setModel(modelo);

        String sql
                = "SELECT DISTINCT "
                + "    bh.id_usuario_fk, "
                + "    u.nombre AS responsable, "
                + "    r.nombre AS region, "
                + "    STRING_AGG(DISTINCT t.nombre, ', ') AS terminales, "
                + "    bh.id_bitacora, "
                + "    bh.fecha_revision, "
                + "    bh.ubicacion, "
                + "    bh.ultima_fecha_pila AS ultima_fecha, "
                + "    bh.proximo_cambio_pila AS proxima_fecha, "
                + "    bh.marca, "
                + "    bh.tipo_detector, "
                + "    bh.prueba_funcionamiento, "
                + "    bh.soporte, "
                + "    bh.ubicacion_fisica, "
                + "    bh.observacion, "
                + "    bh.id_norma_fk "
                + "FROM bitacora_humo bh "
                + "JOIN usuarios u ON bh.id_usuario_fk = u.id_usuarios "
                + "JOIN terminales t ON bh.id_terminal_fk = t.id_terminal "
                + "JOIN regiones r ON t.id_region_fk = r.id_region "
                + "LEFT JOIN terminales_usuarios tu ON tu.id_usuario = u.id_usuarios "
                + "WHERE u.username = ? "
                + "GROUP BY "
                + "    bh.id_bitacora, "
                + "    bh.fecha_revision, "
                + "    bh.ubicacion, "
                + "    bh.ultima_fecha_pila, "
                + "    bh.proximo_cambio_pila, "
                + "    bh.marca, "
                + "    bh.tipo_detector, "
                + "    bh.prueba_funcionamiento, "
                + "    bh.soporte, "
                + "    bh.ubicacion_fisica, "
                + "    bh.observacion, "
                + "    bh.id_norma_fk, "
                + "    bh.id_usuario_fk, "
                + "    u.nombre, "
                + "    r.nombre;";

        Object[] datos = new Object[16]; // Cambiado a Object[] para permitir tanto String como Boolean
        PreparedStatement pst = null;
        ResultSet rs = null;

        try {
            // Establecer conexión y preparar la consulta
            pst = obj2.establecerConexion().prepareStatement(sql);
            pst.setString(1, globalV.user); // Asignar el parámetro a la consulta

            rs = pst.executeQuery();

            while (rs.next()) {
                // Obtener datos de las columnas y convertir las booleanas
                datos[0] = rs.getString(1); // 
                datos[1] = rs.getString(2); // 
                datos[2] = rs.getString(3); // 
                datos[3] = rs.getString(4); // 
                datos[4] = rs.getString(5); // 
                datos[5] = rs.getString(6); // 
                datos[6] = rs.getString(7); // 
                datos[7] = rs.getString(8); // 
                datos[8] = rs.getString(9); // 
                datos[9] = rs.getString(10); // 
                datos[10] = rs.getString(11); // 
                datos[11] = "t".equals(rs.getString(12));
                //Boleanos
                datos[12] = "t".equals(rs.getString(13));
                datos[13] = "t".equals(rs.getString(14));
                datos[14] = rs.getString(15);

                datos[15] = rs.getString(16);

                modelo.addRow(datos);
            }

            paramTablaHumo.setModel(modelo);

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al mostrar: " + e.toString());
        } finally {
            // Cerrar recursos
            try {
                if (rs != null) {
                    rs.close();
                }
                if (pst != null) {
                    pst.close();
                }
                //obj2.cerrarConexion(); // Método para cerrar conexión en TConexion
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(null, "Error al cerrar conexión: " + ex.toString());
            }
        }
    }

    public void seleccionarHumo(
            JTable paramTablaHumo, JTextField paramIDUsuario, JLabel paramResponsable,
            JLabel paramRegion, JLabel paramTerminales, JTextField paramIDBitacora,
            JTextField paramFechaRevision,
            JTextField paramUbicacion, JTextField paramUltimaFecha, JTextField paramProximaFecha,
            JTextField paramMarca, JTextField paramTipoDetector,
            JCheckBox paramPruebaFuncionamiento, JCheckBox paramSoporte, JCheckBox paramUbicacionFisica,
            JTextField paramObservacion, JTextField paramIDNormaHumo) {
        try {
            int fila = paramTablaHumo.getSelectedRow();
            if (fila >= 0) {
                // Asignar valores a los JTextField
                paramIDUsuario.setText(paramTablaHumo.getValueAt(fila, 0).toString());
                paramResponsable.setText(paramTablaHumo.getValueAt(fila, 1).toString());
                paramRegion.setText(paramTablaHumo.getValueAt(fila, 2).toString());
                paramTerminales.setText(paramTablaHumo.getValueAt(fila, 3).toString());
                paramIDBitacora.setText(paramTablaHumo.getValueAt(fila, 4).toString());
                paramFechaRevision.setText(paramTablaHumo.getValueAt(fila, 5).toString());
                paramUbicacion.setText(paramTablaHumo.getValueAt(fila, 6).toString());
                paramUltimaFecha.setText(paramTablaHumo.getValueAt(fila, 7).toString());
                paramProximaFecha.setText(paramTablaHumo.getValueAt(fila, 8).toString());
                paramMarca.setText(paramTablaHumo.getValueAt(fila, 9).toString());
                paramTipoDetector.setText(paramTablaHumo.getValueAt(fila, 10).toString());
                //
                paramPruebaFuncionamiento.setSelected((Boolean) paramTablaHumo.getValueAt(fila, 11));
                paramSoporte.setSelected((Boolean) paramTablaHumo.getValueAt(fila, 12));
                paramUbicacionFisica.setSelected((Boolean) paramTablaHumo.getValueAt(fila, 13));
                //
                paramObservacion.setText(paramTablaHumo.getValueAt(fila, 14).toString());
                paramIDNormaHumo.setText(paramTablaHumo.getValueAt(fila, 15).toString());
            } else {
                JOptionPane.showMessageDialog(null, "Fila no seleccionada");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error: " + e.toString());
        }
    }

    public void insertarHumo(
            JTextField paramFechaRevision, JTextField paramUbicacion, JTextField paramUltima_Fecha_pila,
            JTextField paramProximo_Cambio, JTextField paramMarca, JTextField paramTipo_Detector, JCheckBox paramPrueba_Funcionamiento,
            JCheckBox paramSoporte, JCheckBox paramUbicacion_Fisica, JTextField paramObservaciones,
            JTextField paramId_Norma_Fk, JTextField paramId_Usuario_Fk, String paramNombreTerminal
    ) {
        setFecha_revision(paramFechaRevision.getText());
        setUbicacion(paramUbicacion.getText());
        setUltima_fecha_entrega(paramUltima_Fecha_pila.getText());
        setProxima_recarga(paramProximo_Cambio.getText());
        setMarca(paramMarca.getText());
        setTipo_agente_extinguidor(paramTipo_Detector.getText());
        setPrueba_funcionamiento(paramPrueba_Funcionamiento.isSelected());
        setSoporte(paramSoporte.isSelected());
        setUbicacion_fisica(paramUbicacion_Fisica.isSelected());
        setObservacion(paramObservaciones.getText());

        TConexion obj = new TConexion();

        int idUsuario = obtenerIDUsuario();
        int idNorma_fk = obtenerIDNorma(paramId_Norma_Fk.getText());
        int idTerminal = obtenerIDTerminal(paramNombreTerminal);

        String sql = "INSERT INTO public.bitacora_humo("
                + "fecha_revision, ubicacion, ultima_fecha_pila, proximo_cambio_pila,"
                + "marca, tipo_detector, prueba_funcionamiento, soporte, ubicacion_fisica, observacion,"
                + "id_norma_fk, id_usuario_fk, id_terminal_fk)"
                + "VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?);";
        try {
            CallableStatement cs = obj.establecerConexion().prepareCall(sql);

            cs.setString(1, getFecha_revision());
            cs.setString(2, getUbicacion());
            cs.setString(3, getUltima_fecha_recarga());
            cs.setString(4, getProxima_recarga());
            cs.setString(5, getMarca());
            cs.setString(6, getTipo_agente_extinguidor());
            //
            cs.setBoolean(7, isPrueba_funcionamiento());
            cs.setBoolean(8, isSoporte());
            cs.setBoolean(9, isUbicacion_fisica());
            cs.setString(10, getObservacion());

            cs.setInt(11, idNorma_fk);
            cs.setInt(12, idUsuario);
            cs.setInt(13, idTerminal);

            String ext = "bitacora_humo_id_bitacora_seq";
            String nomTabla = "bitacora_humo";
            actualizarSecuencia(ext, nomTabla);
            //sincronizarSecuenciaBitacoraHumo();

            cs.execute();
            JOptionPane.showMessageDialog(null, "Inserción Existosa");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error" + e.toString());
        }

    }

    public void modificarHumo(
            JTextField paramIdBitacoraHumo, JTextField paramFechaRevision, JTextField paramUbicacion,
            JTextField paramUltima_Fecha_pila, JTextField paramProximo_Cambio, JTextField paramMarca,
            JTextField paramTipo_Detector, JCheckBox paramPrueba_Funcionamiento,
            JCheckBox paramSoporte, JCheckBox paramUbicacion_Fisica, JTextField paramObservaciones
    ) {
        setiDbitacora(Integer.parseInt(paramIdBitacoraHumo.getText()));
        setFecha_revision(paramFechaRevision.getText());
        setUbicacion(paramUbicacion.getText());
        setUltima_fecha_entrega(paramUltima_Fecha_pila.getText());
        setProxima_recarga(paramProximo_Cambio.getText());
        setMarca(paramMarca.getText());
        setTipo_agente_extinguidor(paramTipo_Detector.getText());
        setPrueba_funcionamiento(paramPrueba_Funcionamiento.isSelected());
        setSoporte(paramSoporte.isSelected());
        setUbicacion_fisica(paramUbicacion_Fisica.isSelected());
        setObservacion(paramObservaciones.getText());

        TConexion obj3 = new TConexion();
        String sql = "UPDATE bitacora_humo "
                + "SET fecha_revision = ?, ubicacion = ?, ultima_fecha_pila = ?, proximo_cambio_pila = ?, marca = ?, "
                + "tipo_detector = ?, prueba_funcionamiento = ?, soporte = ?, ubicacion_fisica = ?, observacion = ? "
                + "WHERE id_bitacora = ?";

        try {
            CallableStatement cs = obj3.establecerConexion().prepareCall(sql);

            cs.setString(1, getFecha_revision());
            cs.setString(2, getUbicacion());
            cs.setString(3, getUltima_fecha_recarga());
            cs.setString(4, getProxima_recarga());
            cs.setString(5, getMarca());
            cs.setString(6, getTipo_agente_extinguidor());
            cs.setBoolean(7, isPrueba_funcionamiento());
            cs.setBoolean(8, isSoporte());
            cs.setBoolean(9, isUbicacion_fisica());
            cs.setString(10, getObservacion());
            cs.setInt(11, getiDbitacora());

            cs.execute();
            JOptionPane.showMessageDialog(null, "Modificación Exitosa");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "No se modificó, error" + e.toString());
        }

    }
    //ALAN--------------------------------------------------------------------------------------------------------

    public List<String> obtenerRutas() { //metodo para obtener rutas de videos
        List<String> rutas = new ArrayList<>();
        Connection conexion = null;
        PreparedStatement pst = null;
        ResultSet rs = null;

        try {
            // Establecer la conexión a la base de datos
            conexion = obj.establecerConexion();

            // Consulta SQL para obtener las rutas
            String sql = "SELECT ruta FROM lista_videos;";
            pst = conexion.prepareStatement(sql);

            // Ejecutar la consulta
            rs = pst.executeQuery();

            // Recorrer el resultado y agregar las rutas a la lista
            while (rs.next()) {
                rutas.add(rs.getString("ruta"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Error al obtener rutas de la BD", "Error", JOptionPane.ERROR_MESSAGE);
        } finally {
            // Cerrar recursos
            try {
                if (rs != null) {
                    rs.close();
                }
                if (pst != null) {
                    pst.close();
                }
                if (conexion != null) {
                    conexion.close();
                }
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
        }

        return rutas;
    }

    // Método para cargar las rutas en un combobox video
    public void cargarRutasEnComboBox(javax.swing.JComboBox<String> comboBox) {
        List<String> rutas = obtenerRutas();
        comboBox.removeAllItems(); // Limpiar el contenido previo del combo box
        if (!rutas.isEmpty()) {
            // Añadir las rutas al combo box
            comboBox.addItem("Seleccione un video");
            System.out.println("PDF generado exitosamente: " );
            System.out.println("PDF generado exitosamente: " );
            System.out.println("PDF generado exitosamente: " );
            for (String ruta : rutas) {
                comboBox.addItem(ruta);
            }
        } else {
            JOptionPane.showMessageDialog(null, "No se encontraron rutas en la BD", "Información", JOptionPane.INFORMATION_MESSAGE);
        }
    }



    public void seleccionarGas(
            JTable paramtablaGas, JTextField paramIDUsuario, JLabel paramlabelResponsable,
            JLabel paramlabelRegion, JLabel paramlabelTerminales, JTextField paramtxtIDBitacora,
            JTextField paramtxtFecha,
            JTextField paramnomEmpresa, JCheckBox paramcMalas, JCheckBox paramc_Buena, JCheckBox paramc_Regular,
            JTextField paramcObservaciones, JTextField paramcapacidadTanque, JTextField paramfechaFabricacion,
            JTextField paramcRegistrada, JTextField paramtObservaciones, JTextField parammarcaTanque,
            JTextField paramnumSerie, JTextField paramdiametroEXT, JTextField paramespesor) {

        // 
        try {
            int fila = paramtablaGas.getSelectedRow();
            if (fila >= 0) {

// Asignar valores a los JTextField
                paramtxtIDBitacora.setText(paramtablaGas.getValueAt(fila, 0).toString());
                paramtxtFecha.setText(paramtablaGas.getValueAt(fila, 1).toString());
                paramIDUsuario.setText(paramtablaGas.getValueAt(fila, 2).toString());
                paramlabelRegion.setText(paramtablaGas.getValueAt(fila, 3).toString());
                paramnomEmpresa.setText(paramtablaGas.getValueAt(fila, 4).toString());
                paramlabelResponsable.setText(paramtablaGas.getValueAt(fila, 5).toString());
                paramlabelTerminales.setText(paramtablaGas.getValueAt(fila, 6).toString());

                paramcMalas.setSelected((Boolean) paramtablaGas.getValueAt(fila, 7));
                paramc_Buena.setSelected((Boolean) paramtablaGas.getValueAt(fila, 8));
                paramc_Regular.setSelected((Boolean) paramtablaGas.getValueAt(fila, 9));

                paramcObservaciones.setText(paramtablaGas.getValueAt(fila, 10).toString());
                paramcapacidadTanque.setText(paramtablaGas.getValueAt(fila, 11).toString());
                paramfechaFabricacion.setText(paramtablaGas.getValueAt(fila, 12).toString());
                //
                paramcRegistrada.setText(paramtablaGas.getValueAt(fila, 13).toString());
                paramtObservaciones.setText(paramtablaGas.getValueAt(fila, 14).toString());
                //
                parammarcaTanque.setText(paramtablaGas.getValueAt(fila, 15).toString());
                paramnumSerie.setText(paramtablaGas.getValueAt(fila, 16).toString());
                paramdiametroEXT.setText(paramtablaGas.getValueAt(fila, 17).toString());
                paramespesor.setText(paramtablaGas.getValueAt(fila, 18).toString());
            } else {
                JOptionPane.showMessageDialog(null, "Fila no seleccionada");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error: " + e.toString());
        }
    }
    public void MostrarGas(JTable paramtablaGas) {
        TConexion obj2 = new TConexion();

        // Crear el modelo de la tabla con tipos específicos y celdas no editables
        DefaultTableModel modelo = new DefaultTableModel() {
        };

        TableRowSorter<TableModel> OrdenarTabla = new TableRowSorter<>(modelo);
        paramtablaGas.setRowSorter(OrdenarTabla);

        // Añadir las columnas al modelo
        modelo.addColumn("ID Bitacora");
        modelo.addColumn("Fecha Revision");
        modelo.addColumn("ID Usuario");
        modelo.addColumn("Region");
        modelo.addColumn("Nom. Empresa");
        modelo.addColumn("Responsable");
        modelo.addColumn("Terminales");
        modelo.addColumn("Condicion mala");

        modelo.addColumn("Condicion Buena");
        modelo.addColumn("Condicion regular");
        modelo.addColumn("Obv. Condicion");
        modelo.addColumn("Cap. Tanque");

        modelo.addColumn("Fecha de fabricacion");
        modelo.addColumn("Cap. Registrada");
        modelo.addColumn("Observaciones");
        modelo.addColumn("Marca");
        modelo.addColumn("Num. Serie");
        modelo.addColumn("Diametro exterior");
        modelo.addColumn("Espesor");

        paramtablaGas.setModel(modelo);

        String sql = "SELECT "
                + "    bh.id_bitacora, "
                + "    bh.fecha_revision, "
                + "    bh.id_usuario_fk, "
                + "    r.nombre AS region, "
                + "    bh.nombre_empresa, "
                + "    u.nombre AS responsable, "
                + "    STRING_AGG(DISTINCT t.nombre, ', ') AS terminales, "
                + "    bh.c_mala, "
                + "    bh.c_buena, "
                + "    bh.c_regular, "
                + "    bh.observaciones_gen_revisor AS obv_condicion, "
                + "    bh.capacidad, "
                + "    bh.fecha_fabricacion, "
                + "    bh.capacidad_reg, "
                + "    bh.observaciones_soportes, "
                + "    bh.marca, "
                + "    bh.serie, "
                + "    bh.diametro, "
                + "    bh.espesor "
                + "FROM "
                + "    public.bitacora_instalacion_de_gas bh "
                + "JOIN "
                + "    public.usuarios u ON bh.id_usuario_fk = u.id_usuarios "
                + "JOIN "
                + "    public.terminales t ON bh.id_terminal_fk = t.id_terminal "
                + "JOIN "
                + "    public.regiones r ON t.id_region_fk = r.id_region "
                + "LEFT JOIN "
                + "    public.terminales_usuarios tu ON tu.id_usuario = u.id_usuarios AND tu.id_terminal = t.id_terminal "
                + "WHERE "
                + "    u.username = ? "
                + "GROUP BY "
                + "    bh.id_bitacora, "
                + "    bh.fecha_revision, "
                + "    bh.id_usuario_fk, "
                + "    bh.nombre_empresa, "
                + "    u.nombre, "
                + "    bh.c_mala, "
                + "    bh.c_buena, "
                + "    bh.c_regular, "
                + "    bh.observaciones_gen_revisor, "
                + "    bh.capacidad, "
                + "    bh.fecha_fabricacion, "
                + "    bh.capacidad_reg, "
                + "    bh.observaciones_soportes, "
                + "    bh.marca, "
                + "    bh.serie, "
                + "    bh.diametro, "
                + "    bh.espesor, "
                + "    r.nombre";
        Object[] datos = new Object[19]; // Cambiado a Object[] para permitir tanto String como Boolean
        PreparedStatement pst = null;
        ResultSet rs = null;

        try {
            // Establecer conexión y preparar la consulta
            pst = obj2.establecerConexion().prepareStatement(sql);
            pst.setString(1, globalV.user); // Asignar el parámetro a la consulta

            rs = pst.executeQuery();

            while (rs.next()) {
                // Obtener datos de las columnas y convertir las booleanas
                datos[0] = rs.getString(1); // 
                datos[1] = rs.getString(2); // 
                datos[2] = rs.getString(3); // 
                datos[3] = rs.getString(4);
                datos[4] = rs.getString(5);// 
                datos[5] = rs.getString(6); //
                datos[6] = rs.getString(7);
                //datos[7] = rs.getBoolean("c_mala"); // Reemplaza por getBoolean
                //datos[8] = rs.getBoolean("c_buena"); // Reemplaza por getBoolean
                //datos[9] = rs.getBoolean("c_regular"); // Reemplaza por getBoolean
                datos[7] = "t".equals(rs.getString(8)); // 
                datos[8] = "t".equals(rs.getString(9)); // 
                datos[9] = "t".equals(rs.getString(10)); // 
                datos[10] = rs.getString(11); // 
                datos[11] = rs.getString(12); // 
                datos[12] = rs.getString(13); // 
                datos[13] = rs.getString(14);
                datos[14] = rs.getString(15);
                datos[15] = rs.getString(16);
                datos[16] = rs.getString(17);
                datos[17] = rs.getString(18);
                datos[18] = rs.getString(19);

                modelo.addRow(datos);
            }

            paramtablaGas.setModel(modelo);

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al mostrar: " + e.toString());
        } finally {
            // Cerrar recursos
            try {
                if (rs != null) {
                    rs.close();
                }
                if (pst != null) {
                    pst.close();
                }
                //obj2.cerrarConexion(); // Método para cerrar conexión en TConexion
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(null, "Error al cerrar conexión: " + ex.toString());
            }
        }
    }

    public void modificarGas(
            JTextField paramIdBitacoraHumo, JTextField paramFechaRevision, JTextField paramnomEmpresa,
            JCheckBox paramcMalas, JCheckBox paramc_Buena, JCheckBox paramc_Regular,
            JTextField paramcObservaciones, JTextField paramcapacidadTanque, JTextField paramfechaFabricacion,
            JTextField paramcRegistrada, JTextField paramtObservaciones, JTextField parammarca,
            JTextField paramnumSerie, JTextField paramdiametroEXT, JTextField paramespesor) {
        setiDbitacora(Integer.parseInt(paramIdBitacoraHumo.getText()));
        setFecha_revision(paramFechaRevision.getText());
        setNomEmpresa(paramnomEmpresa.getText());
        setC_Buena(paramc_Buena.isSelected());
        setcMalas(paramcMalas.isSelected());
        setC_Regular(paramc_Regular.isSelected());
        setcObservaciones(paramcObservaciones.getText());
        setCapacidadTanque(paramcapacidadTanque.getText());
        setFechaFabricacion(paramfechaFabricacion.getText());
        setcRegistrada(paramcRegistrada.getText());
        settObservaciones(paramtObservaciones.getText());
        setMarcaTanque(parammarca.getText());
        setNumSerie(paramnumSerie.getText());
        setDiametroEXT(paramdiametroEXT.getText());
        setEspesor(paramespesor.getText());

        TConexion obj3 = new TConexion();
        String sql = "UPDATE bitacora_instalacion_de_gas "
                + "SET fecha_revision = ?,  nombre_empresa = ?, c_buena = ?, c_regular= ?, c_mala = ?, observaciones_soportes = ?, "
                + "capacidad = ?, fecha_fabricacion = ?, capacidad_reg = ?, observaciones_gen_revisor = ?, marca = ?, serie = ?, "
                + "diametro = ?, espesor = ? "
                + "WHERE id_bitacora = ?";

        try {
            CallableStatement cs = obj3.establecerConexion().prepareCall(sql);

            cs.setString(1, getFecha_revision());
            cs.setString(2, getNomEmpresa());
            cs.setBoolean(3, isC_Buena());
            cs.setBoolean(4, isC_Regular());
            cs.setBoolean(5, iscMalas());
            cs.setString(6, getcObservaciones());
            cs.setString(7, getCapacidadTanque());
            cs.setString(8, getFechaFabricacion());
            cs.setString(9, getcRegistrada());
            cs.setString(10, gettObservaciones());
            cs.setString(11, getMarcaTanque());
            cs.setString(12, getNumSerie());
            cs.setString(13, getDiametroEXT());
            cs.setString(14, getEspesor());
            cs.setInt(15, getiDbitacora());

            cs.execute();
            JOptionPane.showMessageDialog(null, "Modificación Exitosa");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "No se modificó, error" + e.toString());
        }

    }

    public void insertarGas(
            JTextField paramFechaRevision, JTextField paramnomEmpresa, JCheckBox paramcMalas,
            JCheckBox paramc_Buena, JCheckBox paramc_Regular, JTextField paramcObservaciones, JTextField paramCapacidadTanque,
            JTextField paramfechaFabricacion, JTextField paramcRegistrada, JTextField paramtObservaciones,
            JTextField parammarca, JTextField paramnumSerie, JTextField paramdiametroEXT, JTextField paramespesor,
            JTextField paramId_Norma_Fk, JTextField paramId_Usuario_Fk, String paramNombreTerminal
    ) {

        setFecha_revision(paramFechaRevision.getText());
        setNomEmpresa(paramnomEmpresa.getText());
        setC_Buena(paramc_Buena.isSelected());
        setcMalas(paramcMalas.isSelected());
        setC_Regular(paramc_Regular.isSelected());
        setcObservaciones(paramcObservaciones.getText());
        setCapacidadTanque(paramCapacidadTanque.getText());
        setFechaFabricacion(paramfechaFabricacion.getText());
        setcRegistrada(paramcRegistrada.getText());
        settObservaciones(paramtObservaciones.getText());
        setMarcaTanque(parammarca.getText());
        setNumSerie(paramnumSerie.getText());
        setDiametroEXT(paramdiametroEXT.getText());
        setEspesor(paramespesor.getText());

        TConexion obj = new TConexion();

        int idUsuario = obtenerIDUsuario();
        int idNorma_fk = obtenerIDNorma(paramId_Norma_Fk.getText());
        int idTerminal = obtenerIDTerminal(paramNombreTerminal);

        String sql = "INSERT INTO public.bitacora_instalacion_de_gas ("
                + "fecha_revision, nombre_empresa, c_mala, c_buena, c_regular, "
                + "observaciones_gen_revisor, capacidad, fecha_fabricacion, capacidad_reg, "
                + "observaciones_soportes, marca, serie, diametro, espesor,id_norma_fk,id_usuario_fk, id_terminal_fk) "
                + "VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";

        try {
            CallableStatement cs = obj.establecerConexion().prepareCall(sql);

            cs.setString(1, getFecha_revision());
            cs.setString(2, getNomEmpresa());
            cs.setBoolean(3, isC_Buena());
            cs.setBoolean(4, iscMalas());
            cs.setBoolean(5, isC_Regular());
            cs.setString(6, getcObservaciones());
            //
            cs.setString(7, getCapacidadTanque());
            cs.setString(8, getFechaFabricacion());
            cs.setString(9, getcRegistrada());
            cs.setString(10, gettObservaciones());
            cs.setString(11, getMarcaTanque());
            cs.setString(12, getNumSerie());
            cs.setString(13, getDiametroEXT());
            cs.setString(14, getEspesor());
            cs.setInt(15, idNorma_fk);
            cs.setInt(16, idUsuario);
            cs.setInt(17, idTerminal);

            String ext = "bitacora_instalacion_de_gas_id_bitacora_seq";
            String nomTabla = "bitacora_instalacion_de_gas";
            actualizarSecuencia(ext, nomTabla);

            cs.execute();
            JOptionPane.showMessageDialog(null, "Inserción Existosa");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error" + e.toString());
        }

    }

    /*FABIAN----------------------------------*/
    public void MostrarEPP(JTable paramtablaEPP) {
        TConexion obj2 = new TConexion();

        // Crear el modelo de la tabla
        DefaultTableModel modelo = new DefaultTableModel();
        TableRowSorter<TableModel> OrdenarTabla = new TableRowSorter<>(modelo);
        paramtablaEPP.setRowSorter(OrdenarTabla);

        // Añadir las columnas al modelo
        modelo.addColumn("ID Usuario");
        modelo.addColumn("Responsable");
        modelo.addColumn("Region");
        modelo.addColumn("Terminal");
        modelo.addColumn("ID Bitacora");
        modelo.addColumn("Fecha Revision");

        modelo.addColumn("Nombre");
        modelo.addColumn("Area");
        modelo.addColumn("Puesto");

        modelo.addColumn("Casco");
        modelo.addColumn("Lentes de seguridad");
        modelo.addColumn("Botas de seguridad");
        modelo.addColumn("Tapones auditivos");
        modelo.addColumn("Guantes");
        modelo.addColumn("Careta para soldar");
        modelo.addColumn("Careta para esmerilar");
        modelo.addColumn("Mascarilla");
        modelo.addColumn("Faja");
        modelo.addColumn("Arnes");
        modelo.addColumn("Uniforme");
        modelo.addColumn("Firma");
        modelo.addColumn("ID Norma");

        paramtablaEPP.setModel(modelo);

        // Consulta SQL
        String sql = "SELECT DISTINCT "
                + "    bp.id_usuario_fk, "
                + "    u.nombre AS responsable, "
                + "    r.nombre AS region, "
                + "    STRING_AGG(DISTINCT t.nombre, ', ') AS terminales, "
                + "    bp.id_bitacora, "
                + "    bp.fecha_revision, "
                + "    bp.nombre, "
                + "    bp.area, "
                + "    bp.puesto, "
                + "    bp.casco, "
                + "    bp.lentes_de_seguridad, "
                + "    bp.botas_de_seguridad, "
                + "    bp.tapones_auditivos, "
                + "    bp.guantes, "
                + "    bp.careta_soldar, "
                + "    bp.careta_esmerilar, "
                + "    bp.mascarilla, "
                + "    bp.faja, "
                + "    bp.arnes, "
                + "    bp.uniforme, "
                + "    bp.firmado, "
                + "    bp.id_norma_fk "
                + "FROM bitacora_epp bp "
                + "JOIN usuarios u ON bp.id_usuario_fk = u.id_usuarios "
                + "JOIN terminales t ON bp.id_terminal_fk = t.id_terminal "
                + "JOIN regiones r ON t.id_region_fk = r.id_region "
                + "LEFT JOIN terminales_usuarios tu ON tu.id_usuario = u.id_usuarios "
                + "WHERE u.username = ? "
                + "GROUP BY "
                + "    bp.id_usuario_fk, "
                + "    u.nombre, "
                + "    r.nombre, "
                + "    bp.id_bitacora, "
                + "    bp.fecha_revision, "
                + "    bp.nombre, "
                + "    bp.area, "
                + "    bp.puesto, "
                + "    bp.casco, "
                + "    bp.lentes_de_seguridad, "
                + "    bp.botas_de_seguridad, "
                + "    bp.tapones_auditivos, "
                + "    bp.guantes, "
                + "    bp.careta_soldar, "
                + "    bp.careta_esmerilar, "
                + "    bp.mascarilla, "
                + "    bp.faja, "
                + "    bp.arnes, "
                + "    bp.uniforme, "
                + "    bp.firmado, "
                + "    bp.id_norma_fk;";

        Object[] datos = new Object[22]; // Permitir String y Boolean
        PreparedStatement pst = null;
        ResultSet rs = null;

        try {
            // Establecer conexión y preparar la consulta
            pst = obj2.establecerConexion().prepareStatement(sql);
            pst.setString(1, globalV.user); // Asignar el parámetro a la consulta

            rs = pst.executeQuery();

            // Verificar si hay datos antes de acceder a ellos
            if (!rs.isBeforeFirst()) {
                System.out.println("No hay datos en la consulta.");
                return;
            }

            while (rs.next()) {
                // Obtener datos de las columnas y convertir booleanos
                datos[0] = rs.getString(1); // ID Usuario
                datos[1] = rs.getString(2); // Responsable
                datos[2] = rs.getString(3); // Región
                datos[3] = rs.getString(4); // Terminales
                datos[4] = rs.getString(5); // ID Bitácora
                datos[5] = rs.getString(6); // Fecha Revisión
                datos[6] = rs.getString(7); // Nombre
                datos[7] = rs.getString(8); // Área
                datos[8] = rs.getString(9); // Puesto
                datos[9] = "t".equals(rs.getString(10)); // Casco
                datos[10] = "t".equals(rs.getString(11)); // Lentes
                datos[11] = "t".equals(rs.getString(12)); // Botas
                datos[12] = "t".equals(rs.getString(13)); // Tapones
                datos[13] = "t".equals(rs.getString(14)); // Guantes
                datos[14] = "t".equals(rs.getString(15)); // Careta Soldar
                datos[15] = "t".equals(rs.getString(16)); // Careta Esmerilar
                datos[16] = "t".equals(rs.getString(17)); // Mascarilla
                datos[17] = "t".equals(rs.getString(18)); // Faja
                datos[18] = "t".equals(rs.getString(19)); // Arnés
                datos[19] = "t".equals(rs.getString(20)); // Uniforme
                datos[20] = "t".equals(rs.getString(21)); // Firma
                datos[21] = rs.getString(22); // ID Norma

                modelo.addRow(datos);
            }

            paramtablaEPP.setModel(modelo);

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al mostrar: " + e.toString());
        } finally {
            // Cerrar recursos
            try {
                if (rs != null) {
                    rs.close();
                }
                if (pst != null) {
                    pst.close();
                }
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(null, "Error al cerrar conexión: " + ex.toString());
            }
        }
    }

    public void insertarEPP(JTextField paramFechaRevision, JTextField paramNombreEPP, JTextField paramAreaEPP, JTextField paramPuestoEPP,
            JCheckBox paramCascoEPP, JCheckBox paramLentesDeSeguridadEPP, JCheckBox paramBotasDeSeguridadEPP, JCheckBox paramTaponesAuditivosEPP,
            JCheckBox paramGuantesEPP, JCheckBox paramCaretaSoldarEPP, JCheckBox paramCaretaEsmerilarEPP, JCheckBox paramMascarillaEPP,
            JCheckBox paramFajaEPP, JCheckBox paramArnesEPP, JCheckBox paramUniformeEPP, JCheckBox paramFirmadoEPP,
            JTextField paramId_Norma_Fk, JTextField paramId_Usuario_fk, String paramNombreTerminal) {

        setFecha_revision(paramFechaRevision.getText());
        setNombre_epp(paramNombreEPP.getText());
        setArea_epp(paramAreaEPP.getText());
        setPuesto_epp(paramPuestoEPP.getText());
        setCasco_epp(paramCascoEPP.isSelected());
        setLentes_de_seguridad_epp(paramLentesDeSeguridadEPP.isSelected());
        setBotas_de_seguridad_epp(paramBotasDeSeguridadEPP.isSelected());
        setTapones_auditivos_epp(paramTaponesAuditivosEPP.isSelected());
        setGuantes_epp(paramGuantesEPP.isSelected());
        setCareta_soldar_epp(paramCaretaSoldarEPP.isSelected());
        setCareta_esmerilar_epp(paramCaretaEsmerilarEPP.isSelected());
        setMascarilla_epp(paramMascarillaEPP.isSelected());
        setFaja_epp(paramFajaEPP.isSelected());
        setArnes_epp(paramArnesEPP.isSelected());
        setUniforme_epp(paramUniformeEPP.isSelected());
        setFirmado_epp(paramFirmadoEPP.isSelected());

        TConexion obj = new TConexion();

        int idUsuario = obtenerIDUsuario();
        int idNorma_fk = obtenerIDNorma(paramId_Norma_Fk.getText());
        int idTerminal = obtenerIDTerminal(paramNombreTerminal);

        String sql = "INSERT INTO public.bitacora_epp ("
                + "fecha_revision, nombre, area, puesto, casco, "
                + "lentes_de_seguridad, botas_de_seguridad, tapones_auditivos, guantes, "
                + "careta_soldar, careta_esmerilar, mascarilla, faja, arnes, uniforme, firmado, "
                + "id_norma_fk, id_usuario_fk, id_terminal_fk) "
                + "VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?);";

        try {
            CallableStatement cs = obj.establecerConexion().prepareCall(sql);

            cs.setDate(1, java.sql.Date.valueOf(getFecha_revision()));
            cs.setString(2, getNombre_epp());
            cs.setString(3, getArea_epp());
            cs.setString(4, getPuesto_epp());
            //BOOLEANOS
            cs.setBoolean(5, isCasco_epp());
            cs.setBoolean(6, isLentes_de_seguridad_epp());
            cs.setBoolean(7, isBotas_de_seguridad_epp());
            cs.setBoolean(8, isTapones_auditivos_epp());
            cs.setBoolean(9, isGuantes_epp());
            cs.setBoolean(10, isCareta_soldar_epp());
            cs.setBoolean(11, isCareta_esmerilar_epp());
            cs.setBoolean(12, isMascarilla_epp());
            cs.setBoolean(13, isFaja_epp());
            cs.setBoolean(14, isArnes_epp());
            cs.setBoolean(15, isUniforme_epp());
            cs.setBoolean(16, isFirmado_epp());
            cs.setInt(17, idNorma_fk);
            cs.setInt(18, idUsuario);
            cs.setInt(19, idTerminal);

            String ext = "bitacora_epp_id_bitacora_seq";
            String nomTabla = "bitacora_epp";
            actualizarSecuencia(ext, nomTabla);

            cs.execute();
            JOptionPane.showMessageDialog(null, "Inserción Existosa");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error" + e.toString());
        }
    }

    public void seleccionarEPP(
            JTable paramTablaEPP, JTextField paramIDUsuario, JLabel paramlabelResponsable,
            JLabel paramlabelRegion, JLabel paramlabelTerminales, JTextField paramtxtIDBitacora,
            JTextField paramtxtFecha,
            JTextField paramNombreEPP, JTextField paramAreaEPP, JTextField paramPuestoEPP,
            JCheckBox paramCascoEPP, JCheckBox paramLentesDeSeguridadEPP, JCheckBox paramBotasDeSeguridadEPP, JCheckBox paramTaponesAuditivosEPP,
            JCheckBox paramGuantesEPP, JCheckBox paramCaretaSoldarEPP, JCheckBox paramCaretaEsmerilarEPP, JCheckBox paramMascarillaEPP,
            JCheckBox paramFajaEPP, JCheckBox paramArnesEPP, JCheckBox paramUniformeEPP, JCheckBox paramFirmadoEPP, JTextField paramIDNorma) {

        // 
        try {
            int fila = paramTablaEPP.getSelectedRow();
            if (fila >= 0) {

                // Asignar valores a los JTextField
                paramIDUsuario.setText(paramTablaEPP.getValueAt(fila, 0).toString());
                paramlabelResponsable.setText(paramTablaEPP.getValueAt(fila, 1).toString());
                paramlabelRegion.setText(paramTablaEPP.getValueAt(fila, 2).toString());
                paramlabelTerminales.setText(paramTablaEPP.getValueAt(fila, 3).toString());
                paramtxtIDBitacora.setText(paramTablaEPP.getValueAt(fila, 4).toString());
                paramtxtFecha.setText(paramTablaEPP.getValueAt(fila, 5).toString());
                //
                paramNombreEPP.setText(paramTablaEPP.getValueAt(fila, 6).toString());
                paramAreaEPP.setText(paramTablaEPP.getValueAt(fila, 7).toString());
                paramPuestoEPP.setText(paramTablaEPP.getValueAt(fila, 8).toString());
                //
                paramCascoEPP.setSelected((Boolean) paramTablaEPP.getValueAt(fila, 9));
                paramLentesDeSeguridadEPP.setSelected((Boolean) paramTablaEPP.getValueAt(fila, 10));
                paramBotasDeSeguridadEPP.setSelected((Boolean) paramTablaEPP.getValueAt(fila, 11));
                paramTaponesAuditivosEPP.setSelected((Boolean) paramTablaEPP.getValueAt(fila, 12));
                paramGuantesEPP.setSelected((Boolean) paramTablaEPP.getValueAt(fila, 13));
                paramCaretaSoldarEPP.setSelected((Boolean) paramTablaEPP.getValueAt(fila, 14));
                paramCaretaEsmerilarEPP.setSelected((Boolean) paramTablaEPP.getValueAt(fila, 15));
                paramMascarillaEPP.setSelected((Boolean) paramTablaEPP.getValueAt(fila, 16));
                paramFajaEPP.setSelected((Boolean) paramTablaEPP.getValueAt(fila, 17));
                paramArnesEPP.setSelected((Boolean) paramTablaEPP.getValueAt(fila, 18));
                paramUniformeEPP.setSelected((Boolean) paramTablaEPP.getValueAt(fila, 19));
                paramFirmadoEPP.setSelected((Boolean)paramTablaEPP.getValueAt(fila, 20));
                //
                paramIDNorma.setText(paramTablaEPP.getValueAt(fila, 21).toString());
                
                
                
            } else {
                JOptionPane.showMessageDialog(null, "Fila no seleccionada");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error: " + e.toString());
        }
    }
    
    public void modificarEPP(JTextField paramIdBitacora, JTextField paramFechaRevision ) {

        setiDbitacora(Integer.parseInt(paramIdBitacora.getText()));
        
        
        /*setFecha_revision(paramFechaRevision.getText());
        setUbicacion(paramUbicacion.getText());
        setUltima_fecha_entrega(paramUltima_fecha_entrega.getText());
        setProxima_recarga(paramProxima_recarga.getText());
        setCapacidad_kgs(paramCapacidad_kgs.getText());
        setTipo_agente_extinguidor(paramTipo_agente_extinguidor.getText());
        //booleanos 
        setManguera(paramManguera.isSelected());
        setManometro(paramManometro.isSelected());
        setSoporte(paramSoporte.isSelected());
        setPresion(paramPresion.isSelected());
        setCilindro(paramCilindro.isSelected());
        setLimpieza(paramLimpieza.isSelected());
        setEtiqueta(paramEtiqueta.isSelected());
        setSeguro(paramSeguro.isSelected());
        setObtruccion(paramObstruccion.isSelected());
        setSenalizacion(paramSenalizacion.isSelected());
        setObservacion(paramObservaciones.getText());
        //setObservacion(paramObservaciones.getText());*/

        //setFirmado(paramFirmado.isSelected());
        //setIdNorma(Integer.parseInt(paramIdNorma.getText()));
        //setiDUsuario(Integer.parseInt(paramIdUsuario.getText()));
        //setIdTerminal(Integer.parseInt(paramIdTerminal.getText()));
        TConexion obj3 = new TConexion();
        String sql = "UPDATE public.bitacora "
                + "SET fecha_revision = ?, "
                + "ubicacion = ?, "
                + "ultima_recarga = ?, "
                + "proxima_recarga = ?, "
                + "capacidad = ?, "
                + "tipo_agente_extinguidor = ?, "
                + "manguera = ?, "
                + "manometro = ?, "
                + "soporte = ?, "
                + "presion = ?, "
                + "cilindro = ?, "
                + "limpieza = ?, "
                + "etiqueta = ?, "
                + "seguro = ?, "
                + "obstruccion = ?, "
                + "senalizacion = ?, "
                + "observacion = ? "
                + "WHERE id_bitacora = ?";

        try {
            CallableStatement cs = obj3.establecerConexion().prepareCall(sql);

            cs.setString(1, getFecha_revision());
            cs.setString(2, getUbicacion());
            cs.setString(3, getUltima_fecha_recarga());
            cs.setString(4, getProxima_recarga());
            cs.setString(5, getCapacidad_kgs());
            cs.setString(6, getTipo_agente_extinguidor());
            //
            cs.setBoolean(7, isManguera());
            cs.setBoolean(8, isManometro());
            cs.setBoolean(9, isSoporte());
            cs.setBoolean(10, isPresion());
            cs.setBoolean(11, isCilindro());
            cs.setBoolean(12, isLimpieza());
            cs.setBoolean(13, isEtiqueta());
            cs.setBoolean(14, isSeguro());
            cs.setBoolean(15, isObstruccion());
            cs.setBoolean(16, isSenalizacion());
            cs.setString(17, getObservacion());
            cs.setInt(18, getiDbitacora());

            cs.execute();

            JOptionPane.showMessageDialog(null, "Modificación Exitosa");

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "No se modificó, error" + e.toString());
        }
    }

}
