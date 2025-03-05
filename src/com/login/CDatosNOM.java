package com.login;

import static com.login.globalV.direccion;
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
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import javax.swing.table.TableRowSorter;

public class CDatosNOM {

    String id;
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

    //Administrador
    String nombreUser;
    String correoUser;
    String username;
    String password;
    boolean activoUser;
    int idRegion;
    int idRole;
    int idUsuario;
    String nombreTerminal;
    String ubicacionTerminal;

    public String getNombreTerminal() {
        return nombreTerminal;
    }

    public void setNombreTerminal(String nombreTerminal) {
        this.nombreTerminal = nombreTerminal;
    }

    public String getUbicacionTerminal() {
        return ubicacionTerminal;
    }

    public void setUbicacionTerminal(String ubicacionTerminal) {
        this.ubicacionTerminal = ubicacionTerminal;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }

    public String getNombreUser() {
        return nombreUser;
    }

    public void setNombreUser(String nombreUser) {
        this.nombreUser = nombreUser;
    }

    public String getCorreoUser() {
        return correoUser;
    }

    public void setCorreoUser(String correoUser) {
        this.correoUser = correoUser;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public boolean isActivoUser() {
        return activoUser;
    }

    public void setActivoUser(boolean activoUser) {
        this.activoUser = activoUser;
    }

    public int getIdRegion() {
        return idRegion;
    }

    public void setIdRegion(int idRegion) {
        this.idRegion = idRegion;
    }

    public int getIdRole() {
        return idRole;
    }

    public void setIdRole(int idRole) {
        this.idRole = idRole;
    }

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

    private void actualizarSecuencia(String ext, String nomTabla, String id) {
        //System.out.println("se intenta actualizar");
        String sql = "SELECT setval('" + ext + "', COALESCE((SELECT MAX(" + id + ") FROM " + nomTabla + "), 0) + 1, false)";
        PreparedStatement pst = null;
        try {
            /*Connection conn = null;
            conn = obj.establecerConexion();*/
            pst = globalV.conectar.prepareStatement(sql);
            pst.execute();
            //System.out.println("Secuencia actualizada correctamente.");
        } catch (SQLException e) {
            e.printStackTrace();
            //System.out.println("Error al actualizar la secuencia.");
        }
    }

    public int obtenerIDNorma(String nombreNorma) {
        int idNorma = -1; // Valor predeterminado para indicar que no se encontró un resultado
        PreparedStatement pst = null;
        ResultSet rs = null;

        try {
            // Consulta SQL
            String sql = "SELECT id_norma FROM normas WHERE nombre = ? LIMIT 1;";
            pst = globalV.conectar.prepareStatement(sql);

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
            System.out.println("Error al obtener el ID de la norma: " + e.getMessage());
        } finally {
            // Cerrar solo el PreparedStatement y el ResultSet
            try {
                if (rs != null) {
                    rs.close();
                }
                if (pst != null) {
                    pst.close();
                }
            } catch (Exception ex) {
                System.out.println("Error al cerrar recursos: " + ex.getMessage());
            }
        }

        return idNorma;
    }

    public int obtenerIDUsuarioGeneral(JComboBox<String> listaUsuarios) {
        int idUsuario = -1; // Valor predeterminado para indicar que no se encontró un resultado
        PreparedStatement pst = null;
        ResultSet rs = null;

        try {
            // Obtener el valor seleccionado en el JComboBox
            String nombreUsuarioSeleccionado = (String) listaUsuarios.getSelectedItem();

            // Verificar si se seleccionó un valor válido
            if (nombreUsuarioSeleccionado == null || nombreUsuarioSeleccionado.isEmpty()) {
                System.out.println("No se ha seleccionado un usuario válido.");
                return idUsuario;
            }

            // Consulta SQL para obtener el ID del usuario basado en el nombre
            String sql = "SELECT id_usuarios FROM usuarios WHERE nombre = ?;";
            pst = globalV.conectar.prepareStatement(sql);

            // Asignar el parámetro a la consulta
            pst.setString(1, nombreUsuarioSeleccionado);

            // Ejecutar la consulta
            rs = pst.executeQuery();

            // Obtener el primer resultado
            if (rs.next()) {
                idUsuario = rs.getInt("id_usuarios");
            } else {
                System.out.println("No se encontró el usuario en la base de datos.");
            }
        } catch (Exception e) {
            e.printStackTrace(); // Imprime cualquier error para depuración
            System.out.println("Error al obtener el ID del usuario: " + e.getMessage());
        } finally {
            // Cerrar solo el PreparedStatement y el ResultSet
            try {
                if (rs != null) {
                    rs.close();
                }
                if (pst != null) {
                    pst.close();
                }
            } catch (Exception ex) {
                System.out.println("Error al cerrar recursos: " + ex.getMessage());
            }
        }

        return idUsuario;
    }

    public int obtenerIDUsuario() {
        int idUsuario = -1; // Valor predeterminado para indicar que no se encontró un resultado
        PreparedStatement pst = null;
        ResultSet rs = null;

        try {
            // Consulta SQL
            String sql = "SELECT id_usuarios FROM usuarios WHERE username = ? LIMIT 1;";
            pst = globalV.conectar.prepareStatement(sql);

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
            System.out.println("Error al obtener el ID del usuario: " + e.getMessage());
        } finally {
            // Cerrar solo el PreparedStatement y el ResultSet
            try {
                if (rs != null) {
                    rs.close();
                }
                if (pst != null) {
                    pst.close();
                }
            } catch (Exception ex) {
                System.out.println("Error al cerrar recursos: " + ex.getMessage());
            }
        }

        return idUsuario;
    }

    public int obtenerIDTerminal(String nombreTerminal) {
        int idTerminal = -1; // Valor predeterminado para indicar que no se encontró un resultado
        PreparedStatement pst = null;
        ResultSet rs = null;

        try {
            // Consulta SQL
            String sql = "SELECT id_terminal FROM terminales WHERE nombre = ? LIMIT 1;";
            pst = globalV.conectar.prepareStatement(sql);

            // Asignar el parámetro a la consulta
            pst.setString(1, nombreTerminal);

            // Ejecutar la consulta
            rs = pst.executeQuery();

            // Obtener el primer resultado
            if (rs.next()) {
                idTerminal = rs.getInt("id_terminal");
            }
        } catch (Exception e) {
            e.printStackTrace(); // Imprime cualquier error para depuración
            System.out.println("Error al obtener el ID de la terminal: " + e.getMessage());
        } finally {
            // Cerrar solo el PreparedStatement y el ResultSet
            try {
                if (rs != null) {
                    rs.close();
                }
                if (pst != null) {
                    pst.close();
                }
            } catch (Exception ex) {
                System.out.println("Error al cerrar recursos: " + ex.getMessage());
            }
        }

        return idTerminal;
    }

    public List<String> obtenerNombreTerminales(int idUsuario) {
        List<String> nombresTerminales = new ArrayList<>(); // Inicializar la lista vacía
        PreparedStatement pst = null;
        ResultSet rs = null;

        try {
            // Consulta SQL
            String sql = "SELECT t.nombre "
                    + "FROM terminales t "
                    + "JOIN terminales_usuarios tu ON t.id_terminal = tu.id_terminal "
                    + "JOIN usuarios u ON u.id_usuarios = tu.id_usuario "
                    + "WHERE u.id_usuarios = ?;";
            pst = globalV.conectar.prepareStatement(sql);

            // Asignar el parámetro a la consulta
            pst.setInt(1, idUsuario);

            // Ejecutar la consulta
            rs = pst.executeQuery();

            // Procesar los resultados y agregar a la lista
            while (rs.next()) {
                String nombreTerminal = rs.getString("nombre");
                nombresTerminales.add(nombreTerminal);
            }
        } catch (Exception e) {
            e.printStackTrace(); // Imprime cualquier error para depuración
            System.out.println("Error al obtener nombres de terminales: " + e.getMessage());
        } finally {
            // Cerrar solo el PreparedStatement y el ResultSet
            try {
                if (rs != null) {
                    rs.close();
                }
                if (pst != null) {
                    pst.close();
                }
            } catch (Exception ex) {
                System.out.println("Error al cerrar recursos: " + ex.getMessage());
            }
        }

        return nombresTerminales; // Retornar la lista de nombres
    }

    public List<String> obtenerTerminalesNombre() {
        List<String> nombresRoles = new ArrayList<>(); // Inicializar la lista vacía
        PreparedStatement pst = null;
        ResultSet rs = null;

        try {
            // Consulta SQL
            String sql = "SELECT nombre FROM public.terminales ORDER BY id_terminal ASC;";
            pst = globalV.conectar.prepareStatement(sql);

            // Ejecutar la consulta
            rs = pst.executeQuery();

            // Procesar los resultados y agregar a la lista
            while (rs.next()) {
                String nombreRol = rs.getString("nombre");
                nombresRoles.add(nombreRol);
            }
        } catch (Exception e) {
            e.printStackTrace(); // Imprime cualquier error para depuración
            System.out.println("Error al obtener nombres de roles: " + e.getMessage());
        } finally {
            // Cerrar solo el PreparedStatement y el ResultSet
            try {
                if (rs != null) {
                    rs.close();
                }
                if (pst != null) {
                    pst.close();
                }
            } catch (Exception ex) {
                System.out.println("Error al cerrar recursos: " + ex.getMessage());
            }
        }

        return nombresRoles; // Retornar la lista de nombres
    }

    public List<String> obtenerNombreUsuarios() {
        List<String> nombresRoles = new ArrayList<>(); // Inicializar la lista vacía
        PreparedStatement pst = null;
        ResultSet rs = null;

        try {
            // Consulta SQL
            String sql = "SELECT nombre FROM public.usuarios ORDER BY id_usuarios ASC;";
            pst = globalV.conectar.prepareStatement(sql);

            // Ejecutar la consulta
            rs = pst.executeQuery();

            // Procesar los resultados y agregar a la lista
            while (rs.next()) {
                String nombreRol = rs.getString("nombre");
                nombresRoles.add(nombreRol);
            }
        } catch (Exception e) {
            e.printStackTrace(); // Imprime cualquier error para depuración
            System.out.println("Error al obtener nombres de roles: " + e.getMessage());
        } finally {
            // Cerrar solo el PreparedStatement y el ResultSet
            try {
                if (rs != null) {
                    rs.close();
                }
                if (pst != null) {
                    pst.close();
                }
            } catch (Exception ex) {
                System.out.println("Error al cerrar recursos: " + ex.getMessage());
            }
        }

        return nombresRoles; // Retornar la lista de nombres
    }

    public int obtenerIDRegiones(String nombreRegion) {
        int idTerminal = -1; // Valor predeterminado para indicar que no se encontró un resultado
        PreparedStatement pst = null;
        ResultSet rs = null;

        try {
            // Consulta SQL
            String sql = "SELECT id_region FROM regiones WHERE nombre = ? LIMIT 1;";
            pst = globalV.conectar.prepareStatement(sql);

            // Asignar el parámetro a la consulta
            pst.setString(1, nombreRegion);

            // Ejecutar la consulta
            rs = pst.executeQuery();

            // Obtener el primer resultado
            if (rs.next()) {
                idTerminal = rs.getInt("id_region");
            }
        } catch (Exception e) {
            e.printStackTrace(); // Imprime cualquier error para depuración
            System.out.println("Error al obtener el ID de la terminal: " + e.getMessage());
        } finally {
            // Cerrar solo el PreparedStatement y el ResultSet
            try {
                if (rs != null) {
                    rs.close();
                }
                if (pst != null) {
                    pst.close();
                }
            } catch (Exception ex) {
                System.out.println("Error al cerrar recursos: " + ex.getMessage());
            }
        }

        return idTerminal;
    }

    public int obtenerIDRoles(String nombreRoles) {
        int idTerminal = -1; // Valor predeterminado para indicar que no se encontró un resultado
        PreparedStatement pst = null;
        ResultSet rs = null;

        try {
            // Consulta SQL
            String sql = "SELECT id_rol FROM roles WHERE nombre_rol = ? LIMIT 1;";
            pst = globalV.conectar.prepareStatement(sql);

            // Asignar el parámetro a la consulta
            pst.setString(1, nombreRoles);

            // Ejecutar la consulta
            rs = pst.executeQuery();

            // Obtener el primer resultado
            if (rs.next()) {
                idTerminal = rs.getInt("id_rol");
            }
        } catch (Exception e) {
            e.printStackTrace(); // Imprime cualquier error para depuración
            System.out.println("Error al obtener el ID de la terminal: " + e.getMessage());
        } finally {
            // Cerrar solo el PreparedStatement y el ResultSet
            try {
                if (rs != null) {
                    rs.close();
                }
                if (pst != null) {
                    pst.close();
                }
            } catch (Exception ex) {
                System.out.println("Error al cerrar recursos: " + ex.getMessage());
            }
        }

        return idTerminal;
    }

    public List<String> obtenerNombreRegiones() {
        List<String> nombresRegiones = new ArrayList<>(); // Inicializar la lista vacía
        PreparedStatement pst = null;
        ResultSet rs = null;

        try {
            // Consulta SQL
            String sql = "SELECT nombre FROM public.regiones ORDER BY id_region ASC;";
            pst = globalV.conectar.prepareStatement(sql);

            // Ejecutar la consulta
            rs = pst.executeQuery();

            // Procesar los resultados y agregar a la lista
            while (rs.next()) {
                String nombreRegion = rs.getString("nombre");
                nombresRegiones.add(nombreRegion);
            }
        } catch (Exception e) {
            e.printStackTrace(); // Imprime cualquier error para depuración
            System.out.println("Error al obtener nombres de regiones: " + e.getMessage());
        } finally {
            // Cerrar solo el PreparedStatement y el ResultSet
            try {
                if (rs != null) {
                    rs.close();
                }
                if (pst != null) {
                    pst.close();
                }
            } catch (Exception ex) {
                System.out.println("Error al cerrar recursos: " + ex.getMessage());
            }
        }

        return nombresRegiones; // Retornar la lista de nombres
    }

    public List<String> obtenerNombreRoles() {
        List<String> nombresRoles = new ArrayList<>(); // Inicializar la lista vacía
        PreparedStatement pst = null;
        ResultSet rs = null;

        try {
            // Consulta SQL
            String sql = "SELECT nombre_rol FROM public.roles ORDER BY id_rol ASC;";
            pst = globalV.conectar.prepareStatement(sql);

            // Ejecutar la consulta
            rs = pst.executeQuery();

            // Procesar los resultados y agregar a la lista
            while (rs.next()) {
                String nombreRol = rs.getString("nombre_rol");
                nombresRoles.add(nombreRol);
            }
        } catch (Exception e) {
            e.printStackTrace(); // Imprime cualquier error para depuración
            System.out.println("Error al obtener nombres de roles: " + e.getMessage());
        } finally {
            // Cerrar solo el PreparedStatement y el ResultSet
            try {
                if (rs != null) {
                    rs.close();
                }
                if (pst != null) {
                    pst.close();
                }
            } catch (Exception ex) {
                System.out.println("Error al cerrar recursos: " + ex.getMessage());
            }
        }

        return nombresRoles; // Retornar la lista de nombres
    }

    public String obtenerdireccion(int idUsuario, String nomTerminal) {
        String direccionTerminal = null; // Variable para almacenar la dirección
        PreparedStatement pst = null;
        ResultSet rs = null;

        try {
            // Consulta SQL
            String sql = "SELECT ubicacion "
                    + "FROM terminales t "
                    + "JOIN terminales_usuarios tu ON t.id_terminal = tu.id_terminal "
                    + "JOIN usuarios u ON u.id_usuarios = tu.id_usuario "
                    + "WHERE u.id_usuarios = ? AND t.nombre = ?"; // Usar AND en lugar de coma
            pst = globalV.conectar.prepareStatement(sql);

            // Asignar los parámetros a la consulta
            pst.setInt(1, idUsuario);
            pst.setString(2, nomTerminal);

            // Ejecutar la consulta
            rs = pst.executeQuery();

            // Procesar los resultados
            if (rs.next()) { // Solo obtener el primer resultado
                direccionTerminal = rs.getString("ubicacion");
            }
        } catch (Exception e) {
            e.printStackTrace(); // Imprime cualquier error para depuración
            System.out.println("Error al obtener la dirección de la terminal: " + e.getMessage());
        } finally {
            // Cerrar solo el PreparedStatement y el ResultSet
            try {
                if (rs != null) {
                    rs.close();
                }
                if (pst != null) {
                    pst.close();
                }
            } catch (Exception ex) {
                System.out.println("Error al cerrar recursos: " + ex.getMessage());
            }
        }

        // Retornar la dirección de la terminal (o null si no hay resultados)
        System.out.println("ubicacion=" + direccionTerminal);
        return direccionTerminal;
    }

    public void MostrarExtintores(JTable paramTablaNOM002) {
        // Crear el modelo de la tabla con tipos específicos y celdas no editables
        DefaultTableModel modelo = new DefaultTableModel();
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
            pst = globalV.conectar.prepareStatement(sql);
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
            String nomTerminal = "";

            if (fila >= 0) {
                // Asignar valores a los JTextField
                paramIDUsuario.setText(paramTablaNOM002.getValueAt(fila, 0).toString());
                paramResponsable.setText(paramTablaNOM002.getValueAt(fila, 1).toString());
                paramRegion.setText(paramTablaNOM002.getValueAt(fila, 2).toString());

                nomTerminal = paramTablaNOM002.getValueAt(fila, 3).toString();
                paramTerminales.setText(nomTerminal);
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
            //int idTerminal = obtenerIDTerminal(nomTerminal);
            int iDUsuario = obtenerIDUsuario();
            direccion = obtenerdireccion(iDUsuario, nomTerminal);
            globalV.idter = obtenerIDTerminal(nomTerminal);

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error: " + e.toString());
        }
    }

    public void insertarBitacoraExtin(
            JTextField paramFecha_Revision, JTextField paramUbicacion,
            JTextField paramUltima_Recarga, JTextField paramProxima_Recarga, JTextField paramCapacidad_kgs, JTextField paramTipo_agente_extinguidor,
            JCheckBox paramManguera, JCheckBox paramManometro, JCheckBox paramSoporte, JCheckBox paramPresion,
            JCheckBox paramCilindro, JCheckBox paramLimpieza, JCheckBox paramEtiqueta,
            JCheckBox paramSeguro, JCheckBox paramObstruccion,
            JTextField paramObservaciones, JCheckBox paramFirmado, JTextField paramId_Norma_Fk,
            JTextField paramId_Usuario_Fk, JCheckBox paramSenalizacion, String paramNombreTerminal) {

        setFecha_revision(paramFecha_Revision.getText());
        setUbicacion(paramUbicacion.getText());
        setUltima_fecha_entrega(paramUltima_Recarga.getText());
        setProxima_recarga(paramProxima_Recarga.getText());
        setCapacidad_kgs(paramCapacidad_kgs.getText());
        setTipo_agente_extinguidor(paramTipo_agente_extinguidor.getText());
        //Datos booleanos
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
        setSenalizacion(paramSenalizacion.isSelected());

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
            CallableStatement cs = globalV.conectar.prepareCall(sql);

            cs.setDate(1, java.sql.Date.valueOf(getFecha_revision()));
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

            String ext = "bitacora_epp_id_bitacora_seq";
            String nomTabla = "bitacora_epp";
            id = "id_bitacora";
            actualizarSecuencia(ext, nomTabla, id);

            cs.execute();
            JOptionPane.showMessageDialog(null, "Inserción Existosa");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error" + e.toString());
        }

    }

    //METODOS HUMO
    public void MostrarHumo(JTable paramTablaHumo) {
        // Crear el modelo de la tabla con tipos específicos y celdas no editables
        DefaultTableModel modelo = new DefaultTableModel();

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
            pst = globalV.conectar.prepareStatement(sql);
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

    public void modificarBitacoraExtintores(
            JTextField paramIdBitacora, JTextField paramFechaRevision,
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

        String sql = "UPDATE public.bitacora SET fecha_revision = ?, ubicacion = ?, ultima_recarga = ?, proxima_recarga = ?, "
                + "capacidad = ?, tipo_agente_extinguidor = ?, manguera = ?, manometro = ?, "
                + "soporte = ?, presion = ?, cilindro = ?, limpieza = ?, "
                + "etiqueta = ?, seguro = ?, obstruccion = ?, senalizacion = ?, "
                + "observacion = ? WHERE id_bitacora = ?";

        PreparedStatement pst = null;

        try {
            // Validar y convertir la fecha
            String fechaTexto = paramFechaRevision.getText().trim(); // Eliminar espacios en blanco
            SimpleDateFormat formato = new SimpleDateFormat("yyyy-MM-dd");
            formato.setLenient(false); // Evita que acepte fechas inválidas como "2025/02/30"

            java.util.Date fechaUtil;
            try {
                fechaUtil = formato.parse(fechaTexto);
            } catch (ParseException e) {
                JOptionPane.showMessageDialog(null, "Formato de fecha incorrecto. Usa yyyy-MM-dd.");
                return;
            }
            java.sql.Date fechaSQL = new java.sql.Date(fechaUtil.getTime());

            // Usar la conexión global
            pst = globalV.conectar.prepareStatement(sql);

            // Asignar los parámetros a la consulta
            pst.setDate(1, fechaSQL);
            pst.setString(2, getUbicacion());
            pst.setString(3, getUltima_fecha_recarga());
            pst.setString(4, getProxima_recarga());
            pst.setString(5, getCapacidad_kgs());
            pst.setString(6, getTipo_agente_extinguidor());
            pst.setBoolean(7, isManguera());
            pst.setBoolean(8, isManometro());
            pst.setBoolean(9, isSoporte());
            pst.setBoolean(10, isPresion());
            pst.setBoolean(11, isCilindro());
            pst.setBoolean(12, isLimpieza());
            pst.setBoolean(13, isEtiqueta());
            pst.setBoolean(14, isSeguro());
            pst.setBoolean(15, isObstruccion());
            pst.setBoolean(16, isSenalizacion());
            pst.setString(17, getObservacion());
            pst.setInt(18, getiDbitacora());

            // Ejecutar la actualización
            pst.executeUpdate();
            JOptionPane.showMessageDialog(null, "Modificación Exitosa");

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al modificar: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        } finally {
            // Cerrar solo el PreparedStatement
            try {
                if (pst != null) {
                    pst.close();
                }
            } catch (SQLException ex) {
                System.out.println("Error al cerrar el PreparedStatement: " + ex.getMessage());
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
            String nomTerminal = "";
            if (fila >= 0) {
                // Asignar valores a los JTextField
                paramIDUsuario.setText(paramTablaHumo.getValueAt(fila, 0).toString());
                paramResponsable.setText(paramTablaHumo.getValueAt(fila, 1).toString());
                paramRegion.setText(paramTablaHumo.getValueAt(fila, 2).toString());

                nomTerminal = paramTablaHumo.getValueAt(fila, 3).toString();
                paramTerminales.setText(nomTerminal);
                paramIDBitacora.setText(paramTablaHumo.getValueAt(fila, 4).toString());
                fechaR = convertirFecha(paramTablaHumo.getValueAt(fila, 5).toString());
                paramFechaRevision.setText(fechaR);
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
            int iDUsuario = obtenerIDUsuario();
            direccion = obtenerdireccion(iDUsuario, nomTerminal);

            globalV.idter = obtenerIDTerminal(nomTerminal);
            System.out.println(globalV.idter);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error: " + e.toString());
        }
    }

    public void insertarHumo(
            JTextField paramFechaRevision, JTextField paramUbicacion, JTextField paramUltima_Fecha_pila,
            JTextField paramProximo_Cambio, JTextField paramMarca, JTextField paramTipo_Detector, JCheckBox paramPrueba_Funcionamiento,
            JCheckBox paramSoporte, JCheckBox paramUbicacion_Fisica, JTextField paramObservaciones,
            JTextField paramId_Norma_Fk, JTextField paramId_Usuario_Fk, String paramNombreTerminal) {

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

        int idUsuario = obtenerIDUsuario();
        int idNorma_fk = obtenerIDNorma(paramId_Norma_Fk.getText());
        int idTerminal = obtenerIDTerminal(paramNombreTerminal);

        String sql = "INSERT INTO public.bitacora_humo("
                + "fecha_revision, ubicacion, ultima_fecha_pila, proximo_cambio_pila,"
                + "marca, tipo_detector, prueba_funcionamiento, soporte, ubicacion_fisica, observacion,"
                + "id_norma_fk, id_usuario_fk, id_terminal_fk)"
                + "VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?);";
        try {
            CallableStatement cs = globalV.conectar.prepareCall(sql);

            cs.setDate(1, java.sql.Date.valueOf(getFecha_revision()));
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
            id = "id_bitacora";
            actualizarSecuencia(ext, nomTabla, id);
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
            JCheckBox paramSoporte, JCheckBox paramUbicacion_Fisica, JTextField paramObservaciones) {

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

        String sql = "UPDATE bitacora_humo "
                + "SET fecha_revision = ?, ubicacion = ?, ultima_fecha_pila = ?, proximo_cambio_pila = ?, marca = ?, "
                + "tipo_detector = ?, prueba_funcionamiento = ?, soporte = ?, ubicacion_fisica = ?, observacion = ? "
                + "WHERE id_bitacora = ?";
        PreparedStatement cs = null;

        try {
            String fechaTexto = paramFechaRevision.getText().trim(); // Eliminar espacios en blanco

            // Verificar qué formato tiene realmente la fecha ingresada
            //System.out.println("Fecha ingresada: " + fechaTexto);
            SimpleDateFormat formato = new SimpleDateFormat("yyyy-MM-dd");
            formato.setLenient(false); // Evita que acepte fechas inválidas como "2025/02/30"

            java.util.Date fechaUtil;

            try {
                fechaUtil = formato.parse(fechaTexto);
            } catch (ParseException e) {
                JOptionPane.showMessageDialog(null, "Formato de fecha incorrecto. Usa yyyy-MM-dd.");
                return;
            }

            java.sql.Date fechaSQL = new java.sql.Date(fechaUtil.getTime());
            cs = globalV.conectar.prepareCall(sql);

            cs.setDate(1, fechaSQL);
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
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al modificar: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        } finally {
            // Cerrar solo el PreparedStatement
            try {
                if (cs != null) {
                    cs.close();
                }
            } catch (SQLException ex) {
                System.out.println("Error al cerrar el PreparedStatement: " + ex.getMessage());
            }
        }

    }
    //ALAN--------------------------------------------------------------------------------------------------------

    public List<String> obtenerRutas() {
        List<String> rutas = new ArrayList<>(); // Lista para almacenar las rutas de los videos
        PreparedStatement pst = null;
        ResultSet rs = null;

        try {
            // Consulta SQL para obtener las rutas
            String sql = "SELECT ruta FROM lista_videos;";
            pst = globalV.conectar.prepareStatement(sql);

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
            // Cerrar solo el PreparedStatement y el ResultSet
            try {
                if (rs != null) {
                    rs.close();
                }
                if (pst != null) {
                    pst.close();
                }
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
        }

        return rutas; // Retornar la lista de rutas
    }

    // Método para cargar las rutas en un combobox video
    public void cargarRutasEnComboBox(javax.swing.JComboBox<String> comboBox) {
        List<String> rutas = obtenerRutas();
        comboBox.removeAllItems(); // Limpiar el contenido previo del combo box
        if (!rutas.isEmpty()) {
            // Añadir las rutas al combo box
            comboBox.addItem("Seleccione un video");
            System.out.println("PDF generado exitosamente: ");
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
        try {
            int fila = paramtablaGas.getSelectedRow();
            String nomTerminal = "";

            if (fila >= 0) {

                // Asignar valores a los JTextField
                paramtxtIDBitacora.setText(paramtablaGas.getValueAt(fila, 0).toString());

                fechaR = convertirFecha(paramtablaGas.getValueAt(fila, 1).toString());
                paramtxtFecha.setText(fechaR);
                paramIDUsuario.setText(paramtablaGas.getValueAt(fila, 2).toString());
                paramlabelRegion.setText(paramtablaGas.getValueAt(fila, 3).toString());
                paramnomEmpresa.setText(paramtablaGas.getValueAt(fila, 4).toString());
                paramlabelResponsable.setText(paramtablaGas.getValueAt(fila, 5).toString());

                nomTerminal = paramtablaGas.getValueAt(fila, 6).toString();
                paramlabelTerminales.setText(nomTerminal);

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
        // Crear el modelo de la tabla con tipos específicos y celdas no editables
        DefaultTableModel modelo = new DefaultTableModel();
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
            pst = globalV.conectar.prepareStatement(sql);
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

        String sql = "UPDATE bitacora_instalacion_de_gas "
                + "SET fecha_revision = ?,  nombre_empresa = ?, c_buena = ?, c_regular= ?, c_mala = ?, observaciones_soportes = ?, "
                + "capacidad = ?, fecha_fabricacion = ?, capacidad_reg = ?, observaciones_gen_revisor = ?, marca = ?, serie = ?, "
                + "diametro = ?, espesor = ? "
                + "WHERE id_bitacora = ?";

        PreparedStatement cs = null;

        try {
            // Validar y convertir la fecha
            String fechaTexto = paramFechaRevision.getText().trim(); // Eliminar espacios en blanco
            SimpleDateFormat formato = new SimpleDateFormat("yyyy-MM-dd");
            formato.setLenient(false); // Evita que acepte fechas inválidas como "2025/02/30"

            java.util.Date fechaUtil;
            try {
                fechaUtil = formato.parse(fechaTexto);
            } catch (ParseException e) {
                JOptionPane.showMessageDialog(null, "Formato de fecha incorrecto. Usa yyyy-MM-dd.");
                return;
            }
            java.sql.Date fechaSQL = new java.sql.Date(fechaUtil.getTime());
            cs = globalV.conectar.prepareStatement(sql);

            cs.setDate(1, fechaSQL);
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
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al modificar: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        } finally {
            // Cerrar solo el PreparedStatement
            try {
                if (cs != null) {
                    cs.close();
                }
            } catch (SQLException ex) {
                System.out.println("Error al cerrar el PreparedStatement: " + ex.getMessage());
            }
        }

    }

    public void insertarGas(
            JTextField paramFechaRevision, JTextField paramnomEmpresa, JCheckBox paramcMalas,
            JCheckBox paramc_Buena, JCheckBox paramc_Regular, JTextField paramcObservaciones, JTextField paramCapacidadTanque,
            JTextField paramfechaFabricacion, JTextField paramcRegistrada, JTextField paramtObservaciones,
            JTextField parammarca, JTextField paramnumSerie, JTextField paramdiametroEXT, JTextField paramespesor,
            JTextField paramId_Norma_Fk, JTextField paramId_Usuario_Fk, String paramNombreTerminal) {

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

        int idUsuario = obtenerIDUsuario();
        int idNorma_fk = obtenerIDNorma(paramId_Norma_Fk.getText());
        int idTerminal = obtenerIDTerminal(paramNombreTerminal);

        String sql = "INSERT INTO public.bitacora_instalacion_de_gas ("
                + "fecha_revision, nombre_empresa, c_mala, c_buena, c_regular, "
                + "observaciones_gen_revisor, capacidad, fecha_fabricacion, capacidad_reg, "
                + "observaciones_soportes, marca, serie, diametro, espesor,id_norma_fk,id_usuario_fk, id_terminal_fk) "
                + "VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";

        try {
            CallableStatement cs = globalV.conectar.prepareCall(sql);

            cs.setDate(1, java.sql.Date.valueOf(getFecha_revision()));
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
            id = "id_bitacora";
            actualizarSecuencia(ext, nomTabla, id);

            cs.execute();
            JOptionPane.showMessageDialog(null, "Inserción Existosa");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error" + e.toString());
        }

    }

    /*FABIAN----------------------------------*/
    public void MostrarEPP(JTable paramtablaEPP) {
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
            // Usar la conexión global
            pst = globalV.conectar.prepareStatement(sql);
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
            // Cerrar solo el PreparedStatement y el ResultSet
            try {
                if (rs != null) {
                    rs.close();
                }
                if (pst != null) {
                    pst.close();
                }
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(null, "Error al cerrar recursos: " + ex.toString());
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
            CallableStatement cs = globalV.conectar.prepareCall(sql);

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
            id = "id_bitacora";
            actualizarSecuencia(ext, nomTabla, id);

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
            String nomTerminales;

            if (fila >= 0) {

                // Asignar valores a los JTextField
                paramIDUsuario.setText(paramTablaEPP.getValueAt(fila, 0).toString());
                paramlabelResponsable.setText(paramTablaEPP.getValueAt(fila, 1).toString());
                paramlabelRegion.setText(paramTablaEPP.getValueAt(fila, 2).toString());

                nomTerminales = paramTablaEPP.getValueAt(fila, 3).toString();
                paramlabelTerminales.setText(nomTerminales);
                paramtxtIDBitacora.setText(paramTablaEPP.getValueAt(fila, 4).toString());

                globalV.fechaR = paramTablaEPP.getValueAt(fila, 5).toString();
                paramtxtFecha.setText(globalV.fechaR);

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
                paramFirmadoEPP.setSelected((Boolean) paramTablaEPP.getValueAt(fila, 20));
                //
                paramIDNorma.setText(paramTablaEPP.getValueAt(fila, 21).toString());

            } else {
                JOptionPane.showMessageDialog(null, "Fila no seleccionada");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error: " + e.toString());
        }
    }

    public void modificarEPP(JTextField paramIdBitacora, JTextField paramFechaRevisionEPP, JTextField paramNombreEPP,
            JTextField paramAreaEPP, JTextField paramPuestoEPP, JCheckBox paramCascoEPP, JCheckBox paramLentesDeSeguridadEPP,
            JCheckBox paramBotasDeSeguridadEPP, JCheckBox paramTaponesAuditivosEPP, JCheckBox paramGuantesEPP,
            JCheckBox paramCaretaSoldarEPP, JCheckBox paramCaretaEsmerilarEPP,
            JCheckBox paramMascarillaEPP, JCheckBox paramFajaEPP, JCheckBox paramArnesEPP, JCheckBox paramUniformeEPP, JCheckBox paramFirmadoEPP) {

        setiDbitacora(Integer.parseInt(paramIdBitacora.getText()));
        setFecha_revision(paramFechaRevisionEPP.getText());
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

        String sql = "UPDATE public.bitacora_epp "
                + "SET fecha_revision=?, nombre=?, area=?, puesto=?, casco=?, "
                + "lentes_de_seguridad=?, botas_de_seguridad=?, tapones_auditivos=?, guantes=?, "
                + "careta_soldar=?, careta_esmerilar=?, mascarilla=?, faja=?, arnes=?, uniforme=?, "
                + "firmado=? WHERE id_bitacora = ?";

        PreparedStatement ps = null;
        try {
            String fechaTexto = paramFechaRevisionEPP.getText().trim(); // Eliminar espacios en blanco

            // Verificar qué formato tiene realmente la fecha ingresada
            //System.out.println("Fecha ingresada: " + fechaTexto);
            SimpleDateFormat formato = new SimpleDateFormat("yyyy-MM-dd");
            formato.setLenient(false); // Evita que acepte fechas inválidas como "2025/02/30"

            java.util.Date fechaUtil;

            try {
                fechaUtil = formato.parse(fechaTexto);
            } catch (ParseException e) {
                JOptionPane.showMessageDialog(null, "Formato de fecha incorrecto. Usa yyyy/MM/dd.");
                return;
            }

            java.sql.Date fechaSQL = new java.sql.Date(fechaUtil.getTime());
            ps = globalV.conectar.prepareStatement(sql);

            ps.setDate(1, fechaSQL); // Se usa setDate en lugar de setString
            ps.setString(2, getNombre_epp());
            ps.setString(3, getArea_epp());
            ps.setString(4, getPuesto_epp());
            ps.setBoolean(5, isCasco_epp());
            ps.setBoolean(6, isLentes_de_seguridad_epp());
            ps.setBoolean(7, isBotas_de_seguridad_epp());
            ps.setBoolean(8, isTapones_auditivos_epp());
            ps.setBoolean(9, isGuantes_epp());
            ps.setBoolean(10, isCareta_soldar_epp());
            ps.setBoolean(11, isCareta_esmerilar_epp());
            ps.setBoolean(12, isMascarilla_epp());
            ps.setBoolean(13, isFaja_epp());
            ps.setBoolean(14, isArnes_epp());
            ps.setBoolean(15, isUniforme_epp());
            ps.setBoolean(16, isFirmado_epp());
            ps.setInt(17, getiDbitacora());

            ps.executeUpdate();
            JOptionPane.showMessageDialog(null, "Modificación Exitosa");
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al modificar: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        } finally {
            // Cerrar solo el PreparedStatement
            try {
                if (ps != null) {
                    ps.close();
                }
            } catch (SQLException ex) {
                System.out.println("Error al cerrar el PreparedStatement: " + ex.getMessage());
            }
        }
    }

    //METODOS ADMINISTRADOR
    public void mostrarUsuarios(JTable paramTablaUsuarios) {
        // Crear el modelo de la tabla con tipos específicos y celdas no editables
        DefaultTableModel modelo = new DefaultTableModel();
        TableRowSorter<TableModel> OrdenarTabla = new TableRowSorter<>(modelo);
        paramTablaUsuarios.setRowSorter(OrdenarTabla);

        // Añadir las columnas al modelo
        modelo.addColumn("ID Usuario");
        modelo.addColumn("Nombre");
        modelo.addColumn("Correo");
        modelo.addColumn("Username");
        modelo.addColumn("Password");
        modelo.addColumn("Activo");
        modelo.addColumn("Region");
        modelo.addColumn("Rol");
        modelo.addColumn("Terminales Asignadas");

        paramTablaUsuarios.setModel(modelo);

        String sql = "SELECT "
                + "u.id_usuarios, "
                + "u.nombre, "
                + "u.correo, "
                + "u.username, "
                + "u.password, "
                + "u.activo, "
                + "r.nombre AS nombre_region, "
                + // Nombre de la región
                "ro.nombre_rol AS nombre_rol, "
                + // Nombre del rol
                "CASE "
                + "    WHEN COUNT(t.nombre) > 0 THEN '{' || STRING_AGG(t.nombre, ', ') || '}' "
                + "    ELSE '{}' "
                + "END AS nombre_terminales "
                + "FROM "
                + "public.usuarios u "
                + "LEFT JOIN "
                + "public.regiones r ON u.id_region_fk = r.id_region "
                + // JOIN para obtener el nombre de la región
                "LEFT JOIN "
                + "public.roles ro ON u.id_role_fk = ro.id_rol "
                + // JOIN para obtener el nombre del rol
                "LEFT JOIN "
                + "public.terminales_usuarios tu ON u.id_usuarios = tu.id_usuario "
                + "LEFT JOIN "
                + "public.terminales t ON tu.id_terminal = t.id_terminal "
                + "GROUP BY "
                + "u.id_usuarios, u.nombre, u.correo, u.username, u.password, u.activo, r.nombre, ro.nombre_rol "
                + "ORDER BY "
                + "u.id_usuarios ASC;";
        Object[] datos = new Object[9]; // Cambiado a Object[] para permitir tanto String como Boolean
        PreparedStatement pst = null;
        ResultSet rs = null;

        try {
            // Establecer conexión y preparar la consulta
            pst = globalV.conectar.prepareStatement(sql);
            //pst.setString(0, globalV.user); // Asignar el parámetro a la consulta

            rs = pst.executeQuery();

            while (rs.next()) {
                // Obtener datos de las columnas y convertir las booleanas
                datos[0] = rs.getString(1); // ID usuario
                datos[1] = rs.getString(2); // Responsable
                datos[2] = rs.getString(3); // Region
                datos[3] = rs.getString(4); // terminales
                datos[4] = rs.getString(5); // id_bitacora
                datos[5] = "t".equals(rs.getString(6));
                datos[6] = rs.getString(7); // ubicacion
                datos[7] = rs.getString(8); // ultima recarga
                datos[8] = rs.getString(9); // ultima recarga

                modelo.addRow(datos);
            }
            paramTablaUsuarios.setModel(modelo);

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

    public void insertarUSUARIO(JTextField paramNombreUsuario, JTextField paramCorreo, JTextField paramUsername,
            JTextField paramPassword, JCheckBox paramActivo, String paramIDRegion, String paramIDRol) {

        setNombreUser(paramNombreUsuario.getText());
        setCorreoUser(paramCorreo.getText());
        setUsername(paramUsername.getText());
        setPassword(paramPassword.getText());
        setActivoUser(paramActivo.isSelected());
        int idRegion = obtenerIDRegiones(paramIDRegion);
        int idRol = obtenerIDRoles(paramIDRol);

        //int idUsuario = obtenerIDUsuario();
        //int idNorma_fk = obtenerIDNorma(paramId_Norma_Fk.getText());
        //int idTerminal = obtenerIDTerminal(paramNombreTerminal);
        String sql = "INSERT INTO public.usuarios(nombre, correo, username, password, activo, id_region_fk, id_role_fk) VALUES (?, ?, ?, ?, ?, ?, ? )";

        try {
            CallableStatement cs = globalV.conectar.prepareCall(sql);

            cs.setString(1, getNombreUser());
            cs.setString(2, getCorreoUser());
            cs.setString(3, getUsername());
            cs.setString(4, getPassword());
            cs.setBoolean(5, isActivoUser());
            cs.setInt(6, idRegion);
            cs.setInt(7, idRol);

            String ext = "usuarios_id_usuarios_seq";
            String nomTabla = "usuarios";
            id = "id_usuarios";
            actualizarSecuencia(ext, nomTabla, id);

            cs.execute();
            JOptionPane.showMessageDialog(null, "Inserción Existosa");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error" + e.toString());
        }
    }

    public void seleccionarUsuario(JTable paramTablaUsuarios, JTextField paramIDUsuario, JTextField paramNombreUsuarios,
            JTextField paramCorreoUsuarios, JTextField paramUsername, JTextField paramPassword, JCheckBox paramActivo,
            JComboBox paramRegion, JComboBox paramRoles) {
        try {
            int fila = paramTablaUsuarios.getSelectedRow();
            if (fila >= 0) {

                // Asignar valores a los JTextField
                paramIDUsuario.setText(paramTablaUsuarios.getValueAt(fila, 0).toString());
                paramNombreUsuarios.setText(paramTablaUsuarios.getValueAt(fila, 1).toString());
                paramCorreoUsuarios.setText(paramTablaUsuarios.getValueAt(fila, 2).toString());
                paramUsername.setText(paramTablaUsuarios.getValueAt(fila, 3).toString());
                paramPassword.setText(paramTablaUsuarios.getValueAt(fila, 4).toString());
                paramActivo.setSelected((Boolean) paramTablaUsuarios.getValueAt(fila, 5));
                String regionSeleccionada = paramTablaUsuarios.getValueAt(fila, 6).toString(); // Región
                String rolSeleccionado = paramTablaUsuarios.getValueAt(fila, 7).toString(); // Rol

                // Establecer la región seleccionada en el JComboBox
                paramRegion.setSelectedItem(regionSeleccionada);

                // Establecer el rol seleccionado en el JComboBox
                paramRoles.setSelectedItem(rolSeleccionado);

            } else {
                JOptionPane.showMessageDialog(null, "Fila no seleccionada");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error: " + e.toString());
        }

    }

    public void asignarTerminal(JComboBox<String> listaUsuarios, String paramIDTerminal) {
        // Obtener el ID del usuario seleccionado en el JComboBox
        int idUsuario = obtenerIDUsuarioGeneral(listaUsuarios);

        // Verificar si se obtuvo un ID de usuario válido
        if (idUsuario == -1) {
            JOptionPane.showMessageDialog(null, "No se pudo obtener el ID del usuario.");
            return;
        }

        // Obtener el ID de la terminal
        int idTerminal = obtenerIDTerminal(paramIDTerminal);

        // Verificar si se obtuvo un ID de terminal válido
        if (idTerminal == -1) {
            JOptionPane.showMessageDialog(null, "No se pudo obtener el ID de la terminal.");
            return;
        }

        // Consulta SQL para la inserción
        String sql = "INSERT INTO public.terminales_usuarios(id_usuario, id_terminal) VALUES (?, ?);";

        try {
            // Preparar la sentencia
            CallableStatement cs = globalV.conectar.prepareCall(sql);

            // Asignar los parámetros
            cs.setInt(1, idUsuario);
            cs.setInt(2, idTerminal);

            // Actualizar la secuencia (si es necesario)
            String ext = "terminales_usuarios_id_usuarios_seq";
            String nomTabla = "terminales_usuarios";
            String id = "id_usuario";
            actualizarSecuencia(ext, nomTabla, id);

            // Ejecutar la inserción
            cs.execute();

            // Mostrar mensaje de éxito
            JOptionPane.showMessageDialog(null, "Asignación Exitosa");
        } catch (Exception e) {
            // Mostrar mensaje de error
            JOptionPane.showMessageDialog(null, "Error: " + e.toString());
        }
    }

    public void revocarTerminal(JComboBox nombreUsuario, String nombreTerminal) {
        // Obtener el ID del usuario desde el nombre
        int idUsuario = obtenerIDUsuarioGeneral(nombreUsuario);
        if (idUsuario == -1) {
            JOptionPane.showMessageDialog(null, "No se pudo obtener el ID del usuario.");
            return;
        }

        // Obtener el ID de la terminal
        int idTerminal = obtenerIDTerminal(nombreTerminal);
        if (idTerminal == -1) {
            JOptionPane.showMessageDialog(null, "No se pudo obtener el ID de la terminal.");
            return;
        }

        // Query para eliminar la asignación
        String sql = "DELETE FROM public.terminales_usuarios WHERE id_usuario = ? AND id_terminal = ?;";

        // Usar PreparedStatement en lugar de CallableStatement
        try (PreparedStatement pstmt = globalV.conectar.prepareStatement(sql)) {
            // Asignar los parámetros
            pstmt.setInt(1, idUsuario);
            pstmt.setInt(2, idTerminal);

            // Ejecutar la sentencia
            int filasAfectadas = pstmt.executeUpdate();

            // Verificar si se eliminó alguna fila
            if (filasAfectadas > 0) {
                JOptionPane.showMessageDialog(null, "Revocación Exitosa");
            } else {
                JOptionPane.showMessageDialog(null, "No se encontró la asignación para revocar");
            }
        } catch (SQLException e) {
            // Manejar errores de SQL
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Error al revocar la terminal: " + e.getMessage());
        } catch (Exception e) {
            // Manejar otros errores
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Error inesperado: " + e.getMessage());
        }
    }

    public void insertarTerminal(JTextField paramNombreTerminal, JTextField paramUbicacionTerminal, String paramIDRegion) {
        setNombreTerminal(paramNombreTerminal.getText());
        setUbicacionTerminal(paramUbicacionTerminal.getText());
        int idRegion = obtenerIDRegiones(paramIDRegion);

        String sql = "INSERT INTO public.terminales (nombre, ubicacion, id_region_fk) VALUES (?, ?, ?);";

        try {
            CallableStatement cs = globalV.conectar.prepareCall(sql);

            cs.setString(1, getNombreTerminal());
            cs.setString(2, getUbicacionTerminal());
            cs.setInt(3, idRegion);

            String ext = "terminales_id_terminal_seq";
            String nomTabla = "terminales";
            id = "id_terminal";
            actualizarSecuencia(ext, nomTabla, id);

            cs.execute();
            JOptionPane.showMessageDialog(null, "Inserción Existosa");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error" + e.toString());
        }
    }

    public void mostrarTerminales(JTable paramTablaTerminales) {
        // Crear el modelo de la tabla con tipos específicos y celdas no editables
        DefaultTableModel modelo = new DefaultTableModel();
        TableRowSorter<TableModel> OrdenarTabla = new TableRowSorter<>(modelo);
        paramTablaTerminales.setRowSorter(OrdenarTabla);

        // Añadir las columnas al modelo
        modelo.addColumn("ID Terminal");
        modelo.addColumn("Nombre");
        modelo.addColumn("Ubicacion");
        modelo.addColumn("Region");
        paramTablaTerminales.setModel(modelo);

        String sql = "SELECT t.id_terminal, t.nombre, t.ubicacion, r.nombre AS nombre_region "
                + "FROM public.terminales t "
                + "JOIN public.regiones r ON t.id_region_fk = r.id_region "
                + "ORDER BY t.id_terminal ASC";
        Object[] datos = new Object[4]; // Cambiado a Object[] para permitir tanto String como Boolean
        PreparedStatement pst = null;
        ResultSet rs = null;

        try {
            // Establecer conexión y preparar la consulta
            pst = globalV.conectar.prepareStatement(sql);
            //pst.setString(0, globalV.user); // Asignar el parámetro a la consulta

            rs = pst.executeQuery();

            while (rs.next()) {
                // Obtener datos de las columnas y convertir las booleanas
                datos[0] = rs.getString(1); // 
                datos[1] = rs.getString(2); // 
                datos[2] = rs.getString(3);
                datos[3] = rs.getString(4); // 

                modelo.addRow(datos);
            }
            paramTablaTerminales.setModel(modelo);

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


    /* public void insertarUsuario(String nombre, String correo, String username, String password, boolean activo,
            String nombreRegion, String nombreRol) {
        PreparedStatement pst = null;

        try {
            // Consulta SQL para insertar un nuevo usuario
            String sql = "INSERT INTO public.usuarios (nombre, correo, username, password, activo, id_region_fk, id_role_fk) "
                    + "VALUES (?, ?, ?, ?, ?, (SELECT id_region FROM public.regiones WHERE nombre = ?), "
                    + "(SELECT id_rol FROM public.roles WHERE nombre = ?));";

            // Crear el PreparedStatement
            pst = globalV.conectar.prepareStatement(sql);

            // Asignar los valores a los parámetros de la consulta
            pst.setString(1, nombre);
            pst.setString(2, correo);
            pst.setString(3, username);
            pst.setString(4, password);
            pst.setBoolean(5, activo);
            pst.setString(6, nombreRegion); // Obtener el ID de la región a partir del nombre
            pst.setString(7, nombreRol);   // Obtener el ID del rol a partir del nombre

            // Ejecutar la inserción
            int filasAfectadas = pst.executeUpdate();

            // Verificar si la inserción fue exitosa
            if (filasAfectadas > 0) {
                System.out.println("Usuario insertado correctamente.");
            } else {
                System.out.println("No se pudo insertar el usuario.");
            }
        } catch (SQLException e) {
            e.printStackTrace(); // Imprime cualquier error para depuración
            System.out.println("Error al insertar usuario: " + e.getMessage());
        } finally {
            // Cerrar el PreparedStatement
            try {
                if (pst != null) {
                    pst.close();
                }
            } catch (Exception ex) {
                System.out.println("Error al cerrar recursos: " + ex.getMessage());
            }
        }
    }*/
}
