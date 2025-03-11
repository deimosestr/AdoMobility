package com.login;

import com.itextpdf.io.font.FontConstants;
import com.itextpdf.kernel.colors.ColorConstants;
import com.itextpdf.kernel.font.PdfFont;
import com.itextpdf.kernel.font.PdfFontFactory;
import com.itextpdf.kernel.pdf.PdfDocument;
import com.itextpdf.kernel.pdf.PdfPage;
import com.itextpdf.kernel.pdf.PdfReader;
import com.itextpdf.kernel.pdf.PdfWriter;
import com.itextpdf.kernel.pdf.canvas.PdfCanvas;
import com.itextpdf.layout.Document;
import com.itextpdf.layout.borders.SolidBorder;
import com.itextpdf.layout.element.Table;
import com.itextpdf.layout.element.Cell;
import com.itextpdf.layout.element.Div;
import com.itextpdf.layout.element.Paragraph;
import com.itextpdf.layout.property.TextAlignment;
import com.itextpdf.layout.property.UnitValue;
import com.itextpdf.layout.property.VerticalAlignment;
import java.io.IOException;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.HashMap;
import java.util.Map;

public class PDFExporter {

    private final String usuario = "postgres";
    private final String contrasenia = "1906";
    private final String bd = "bdMobility";
    private final String ip = "localhost";
    private final String puerto = "5432";
    String url = "jdbc:postgresql://" + ip + ":" + puerto + "/" + bd;

    private int contador = 0;
    private int rowCount = 0;

    private String convertirBooleano(String valor) {
        if (valor == null) {
            return "N/A"; // Si el valor es nulo, devolver "N/A"
        }
        return valor.equalsIgnoreCase("T") ? "X" : "N/A"; // Convertir "T" a "X" y cualquier otro valor a "N/A"
    }

    private String convertirBooleano2(String valor) {
        if (valor == null) {
            return ""; // Si el valor es nulo, devolver "N/A"
        }
        return valor.equalsIgnoreCase("T") ? "X" : ""; // Convertir "T" a "X" y cualquier otro valor a "N/A"
    }

    public void ExtintorPDF(String razonSocial) throws IOException {
        String plantilla = "C:\\Users\\Alan Cruz Garcia\\Desktop\\Plantillanom002.pdf";
        String destino = "C:\\Users\\Alan Cruz Garcia\\Desktop\\exportaciones\\plantilla.pdf";

        PdfFont font = PdfFontFactory.createFont(FontConstants.HELVETICA);
        PdfFont bold = PdfFontFactory.createFont(FontConstants.HELVETICA_BOLD);

        try (Connection conn = DriverManager.getConnection(url, usuario, contrasenia)) {
            System.out.println("Conexión exitosa con la base de datos.");

            String sql = "SELECT DISTINCT "
                    + "b.ubicacion, b.ultima_recarga, b.proxima_recarga, b.capacidad, "
                    + "b.tipo_agente_extinguidor, b.manguera, b.manometro, b.soporte, "
                    + "b.presion, b.cilindro, b.limpieza, b.senalizacion, b.etiqueta, "
                    + "b.seguro, b.obstruccion, b.observacion, b.fecha_revision "
                    + "FROM bitacora b "
                    + "JOIN usuarios u ON b.id_usuario_fk = u.id_usuarios "
                    + "WHERE u.username = ? "
                    + "AND EXTRACT(MONTH FROM b.fecha_revision) = ? " // Filtra por mes
                    + "AND EXTRACT(YEAR FROM b.fecha_revision) = ?";   // Filtra por año

            PreparedStatement statement = conn.prepareStatement(sql);

            LocalDate fecha = LocalDate.parse(globalV.fechaR, DateTimeFormatter.ofPattern("yyyy-MM-dd"));
            System.out.println(globalV.fechaR);
            int mes = fecha.getMonthValue();
            int ano = fecha.getYear();
            statement.setString(1, globalV.user);  // Asegúrate de que "globalV.user" esté definido
            statement.setInt(2, mes);
            statement.setInt(3, ano);
            ResultSet resultSet = statement.executeQuery();

            PdfDocument pdfDoc = new PdfDocument(new PdfReader(plantilla), new PdfWriter(destino));
            Document document = new Document(pdfDoc);

            Table table = new Table(new float[]{0.5f, 2, 1, 1, 1, 2, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 2});

            table.addHeaderCell(new Cell().add(new Paragraph("#")).setFontSize(7f));
            table.addHeaderCell(new Cell().add(new Paragraph("Ubicación")).setFontSize(7f));
            table.addHeaderCell(new Cell().add(new Paragraph("U. Recarga")).setFontSize(7f));
            table.addHeaderCell(new Cell().add(new Paragraph("P. Recarga")).setFontSize(7f));
            table.addHeaderCell(new Cell().add(new Paragraph("Capacidad")).setFontSize(7f));
            table.addHeaderCell(new Cell().add(new Paragraph("Tipo A Extintor")).setFontSize(7f));
            table.addHeaderCell(new Cell().add(new Paragraph("Manguera")).setFontSize(7f));
            table.addHeaderCell(new Cell().add(new Paragraph("Manómetro")).setFontSize(7f));
            table.addHeaderCell(new Cell().add(new Paragraph("Soporte")).setFontSize(7f));
            table.addHeaderCell(new Cell().add(new Paragraph("Presión")).setFontSize(7f));
            table.addHeaderCell(new Cell().add(new Paragraph("Cilindro")).setFontSize(7f));
            table.addHeaderCell(new Cell().add(new Paragraph("Limpieza")).setFontSize(7f));
            table.addHeaderCell(new Cell().add(new Paragraph("Señalización")).setFontSize(7f));
            table.addHeaderCell(new Cell().add(new Paragraph("Etiqueta")).setFontSize(7f));
            table.addHeaderCell(new Cell().add(new Paragraph("Seguro")).setFontSize(7f));
            table.addHeaderCell(new Cell().add(new Paragraph("Obstrucción")).setFontSize(7f));
            table.addHeaderCell(new Cell().add(new Paragraph("Observación")).setFontSize(7f));

            contador = 0;
            while (resultSet.next()) {
                contador++;
                table.addCell(new Cell().add(new Paragraph("" + contador).setFontSize(7f)));
                table.addCell(new Cell().add(new Paragraph(resultSet.getString("ubicacion")).setFontSize(7f)));
                table.addCell(new Cell().add(new Paragraph(resultSet.getString("ultima_recarga")).setFontSize(7f)));
                table.addCell(new Cell().add(new Paragraph(resultSet.getString("proxima_recarga")).setFontSize(7f)));
                table.addCell(new Cell().add(new Paragraph(resultSet.getString("capacidad")).setFontSize(7f)));
                table.addCell(new Cell().add(new Paragraph(resultSet.getString("tipo_agente_extinguidor")).setFontSize(7f)));

                // Convertir valores booleanos a "X" o "N/A"
                table.addCell(new Cell().add(new Paragraph(convertirBooleano(resultSet.getString("manguera"))).setFontSize(7f)));
                table.addCell(new Cell().add(new Paragraph(convertirBooleano(resultSet.getString("manometro"))).setFontSize(7f)));
                table.addCell(new Cell().add(new Paragraph(convertirBooleano(resultSet.getString("soporte"))).setFontSize(7f)));
                table.addCell(new Cell().add(new Paragraph(convertirBooleano(resultSet.getString("presion"))).setFontSize(7f)));
                table.addCell(new Cell().add(new Paragraph(convertirBooleano(resultSet.getString("cilindro"))).setFontSize(7f)));
                table.addCell(new Cell().add(new Paragraph(convertirBooleano(resultSet.getString("limpieza"))).setFontSize(7f)));
                table.addCell(new Cell().add(new Paragraph(convertirBooleano(resultSet.getString("senalizacion"))).setFontSize(7f)));
                table.addCell(new Cell().add(new Paragraph(convertirBooleano(resultSet.getString("etiqueta"))).setFontSize(7f)));
                table.addCell(new Cell().add(new Paragraph(convertirBooleano(resultSet.getString("seguro"))).setFontSize(7f)));
                table.addCell(new Cell().add(new Paragraph(convertirBooleano(resultSet.getString("obstruccion"))).setFontSize(7f)));
                table.addCell(new Cell().add(new Paragraph(resultSet.getString("observacion")).setFontSize(7f)));
            }

            Table tabla2 = new Table(new float[]{50});
            tabla2.addHeaderCell(new Cell().add(new Paragraph("FIRMA DE QUIEN REALIZA LA REVISION")).setFontSize(5.5f).setTextAlignment(TextAlignment.CENTER).setVerticalAlignment(VerticalAlignment.MIDDLE));
            tabla2.addCell(new Cell().setHeight(20));
            Div div = new Div().setTextAlignment(TextAlignment.CENTER).setWidth(UnitValue.createPercentValue(100)).add(tabla2);

            tabla2.setWidth(400);

            float pageHeight = pdfDoc.getDefaultPageSize().getHeight();
            float x = 50; // Desde el borde izquierdo
            float initialY = pageHeight - 50; // Posición desde arriba (50 de margen)
            float width = 718; // Ancho de la tabla

            table.setWidth(width);
            document.add(table.setMarginTop(103)); // Asegura que no se desplace hacia abajo
            document.add(div.setMarginTop(5).setMarginLeft(160));

            PdfPage page = pdfDoc.getLastPage();
            PdfCanvas pdfCanvas = new PdfCanvas(page);

            float z = 150;
            float y = 489.3f;
            pdfCanvas.beginText()
                    .setFontAndSize(PdfFontFactory.createFont(FontConstants.TIMES_BOLD), 7.5f)
                    .setFillColor(ColorConstants.BLACK)
                    .moveText(z, y)
                    .showText(globalV.fechaR)
                    .endText();

            float m = 200;
            float n = 503;
            pdfCanvas.beginText()
                    .setFontAndSize(PdfFontFactory.createFont(FontConstants.TIMES_BOLD), 7.5f)
                    .setFillColor(ColorConstants.BLACK)
                    .moveText(m, n)
                    .showText(globalV.direccion)
                    .endText();

            //impresion de razon social
            float j = 200;
            float k = 517;
            pdfCanvas.beginText()
                    .setFontAndSize(PdfFontFactory.createFont(FontConstants.TIMES_BOLD), 7.5f)
                    .setFillColor(ColorConstants.BLACK)
                    .moveText(j, k)
                    .showText(razonSocial)
                    .endText();

            document.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

// Método para convertir valores booleanos
    public void HumoPDF(String razonSocial) throws IOException {
        String plantilla = "C:\\Users\\Alan Cruz Garcia\\Desktop\\plantilla humo.pdf";
        String destino = "C:\\Users\\Alan Cruz Garcia\\Desktop\\exportaciones\\plantilla humo prueba.pdf";

        PdfFont font = PdfFontFactory.createFont(FontConstants.HELVETICA);
        PdfFont bold = PdfFontFactory.createFont(FontConstants.HELVETICA_BOLD);

        try (Connection conn = DriverManager.getConnection(url, usuario, contrasenia)) {
            System.out.println("Conexión exitosa con la base de datos.");

            String sql = "SELECT "
                    + "b.ubicacion, b.ultima_fecha_pila, b.proximo_cambio_pila, b.marca, "
                    + "b.tipo_detector, b.prueba_funcionamiento, b.soporte, b.ubicacion_fisica, "
                    + "b.observacion, b.id_norma_fk, b.id_terminal_fk, b.fecha_revision "
                    + "FROM bitacora_humo b "
                    + "JOIN usuarios u ON b.id_usuario_fk = u.id_usuarios "
                    + "WHERE u.username = ? "
                    + "AND EXTRACT(MONTH FROM b.fecha_revision) = ? "
                    + "AND EXTRACT(YEAR FROM b.fecha_revision) = ? "
                    + "AND b.id_terminal_fk = ? ";

            PreparedStatement statement = conn.prepareStatement(sql);

            // Validar que globalV.fechaR no sea null o esté vacía
            if (globalV.fechaR == null || globalV.fechaR.isEmpty()) {
                throw new IllegalArgumentException("La fecha no puede ser nula o vacía.");
            }

            // Parsear la fecha
            LocalDate fecha = LocalDate.parse(globalV.fechaR, DateTimeFormatter.ofPattern("yyyy-MM-dd"));
            int mes = fecha.getMonthValue();
            int ano = fecha.getYear();

            statement.setString(1, globalV.user);
            statement.setInt(2, mes);
            statement.setInt(3, ano);
            statement.setInt(4, globalV.idter);
            ResultSet resultSet = statement.executeQuery();

            // Crear el documento PDF
            PdfDocument pdfDoc = new PdfDocument(new PdfReader(plantilla), new PdfWriter(destino));
            Document document = new Document(pdfDoc);

            // Crear la tabla con anchos de columna definidos
            Table table = new Table(new float[]{0.4f, 1.8f, 1.8f, 1.8f, 1.3f, 1.5f, 1.8f, 1.5f, 1.5f, 1.5f});
            table.setWidth(UnitValue.createPercentValue(94.8f)); // Ajustar el ancho de la tabla

            // Agregar encabezados
            table.addHeaderCell(new Cell().add(new Paragraph("#")).setFontSize(7f));
            table.addHeaderCell(new Cell().add(new Paragraph("Ubicación")).setFontSize(7f));
            table.addHeaderCell(new Cell().add(new Paragraph("Última fecha de pila")).setFontSize(7f));
            table.addHeaderCell(new Cell().add(new Paragraph("Próximo cambio de pila")).setFontSize(7f));
            table.addHeaderCell(new Cell().add(new Paragraph("Marca")).setFontSize(7f));
            table.addHeaderCell(new Cell().add(new Paragraph("Tipo de detector")).setFontSize(7f));
            table.addHeaderCell(new Cell().add(new Paragraph("Prueba de funcionamiento")).setFontSize(7f));
            table.addHeaderCell(new Cell().add(new Paragraph("Soporte")).setFontSize(7f));
            table.addHeaderCell(new Cell().add(new Paragraph("Ubicación física")).setFontSize(7f));
            table.addHeaderCell(new Cell().add(new Paragraph("Observación")).setFontSize(7f));

            int contador = 0;
            while (resultSet.next()) {
                contador++;
                table.addCell(new Cell().add(new Paragraph(String.valueOf(contador)).setFontSize(7f)));
                table.addCell(new Cell().add(new Paragraph(resultSet.getString("ubicacion")).setFontSize(7f)));
                table.addCell(new Cell().add(new Paragraph(resultSet.getString("ultima_fecha_pila")).setFontSize(7f)));
                table.addCell(new Cell().add(new Paragraph(resultSet.getString("proximo_cambio_pila")).setFontSize(7f)));
                table.addCell(new Cell().add(new Paragraph(resultSet.getString("marca")).setFontSize(7f)));
                table.addCell(new Cell().add(new Paragraph(resultSet.getString("tipo_detector")).setFontSize(7f)));
                table.addCell(new Cell().add(new Paragraph(convertirBooleano(resultSet.getString("prueba_funcionamiento"))).setFontSize(7f)));
                table.addCell(new Cell().add(new Paragraph(convertirBooleano(resultSet.getString("soporte"))).setFontSize(7f)));
                table.addCell(new Cell().add(new Paragraph(convertirBooleano(resultSet.getString("ubicacion_fisica"))).setFontSize(7f)));
                table.addCell(new Cell().add(new Paragraph(resultSet.getString("observacion")).setFontSize(7f)));
            }

            // Agregar la tabla al documento
            document.add(table.setMarginTop(112).setMarginLeft(35.5f)); // Ajustar margen superior

            // Crear tabla de firma
            Table tabla2 = new Table(new float[]{50});
            tabla2.addHeaderCell(new Cell().add(new Paragraph("FIRMA DE QUIEN REALIZA LA REVISIÓN"))
                    .setFontSize(5.5f)
                    .setTextAlignment(TextAlignment.CENTER)
                    .setVerticalAlignment(VerticalAlignment.MIDDLE));
            tabla2.addCell(new Cell().setHeight(20));

            Div div = new Div()
                    .setTextAlignment(TextAlignment.CENTER)
                    .setWidth(UnitValue.createPercentValue(100))
                    .add(tabla2);
            tabla2.setWidth(400);

            // Agregar la tabla de firma al documento
            document.add(div.setMarginTop(5).setMarginLeft(160));

            // Sobreescribir texto en el PDF
            PdfPage page = pdfDoc.getLastPage();
            PdfCanvas pdfCanvas = new PdfCanvas(page);

            // Sobreescribir la dirección
            float m = 215; // Ajusta según sea necesario
            float n = 497; // Ajusta según sea necesario
            pdfCanvas.beginText()
                    .setFontAndSize(PdfFontFactory.createFont(FontConstants.TIMES_BOLD), 7.5f)
                    .setFillColor(ColorConstants.BLACK)
                    .moveText(m, n)
                    .showText(globalV.direccion)
                    .endText();

            // Sobreescribir la dirección
            float x = 215; // Ajusta según sea necesario
            float y = 482; // Ajusta según sea necesario
            pdfCanvas.beginText()
                    .setFontAndSize(PdfFontFactory.createFont(FontConstants.TIMES_BOLD), 7.5f)
                    .setFillColor(ColorConstants.BLACK)
                    .moveText(x, y)
                    .showText(globalV.fechaR)
                    .endText();
            System.out.println(globalV.fechaR);

            //impresion de razon social
            float j = 215;
            float k = 512;
            pdfCanvas.beginText()
                    .setFontAndSize(PdfFontFactory.createFont(FontConstants.TIMES_BOLD), 7.5f)
                    .setFillColor(ColorConstants.BLACK)
                    .moveText(j, k)
                    .showText(razonSocial)
                    .endText();

            // Cerrar el documento
            document.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void GasPDF(String razonSocial) throws IOException {
        String plantilla = "C:\\Users\\Alan Cruz Garcia\\Desktop\\bitacora gas final.pdf";
        String destino = "C:\\Users\\Alan Cruz Garcia\\Desktop\\exportaciones\\Bitacora gas.pdf";

        CDatosNOM cdatosnom = new CDatosNOM();
        PdfFont font = PdfFontFactory.createFont(FontConstants.HELVETICA);
        PdfFont bold = PdfFontFactory.createFont(FontConstants.HELVETICA_BOLD);

        Map<String, Object> bitacora = new HashMap<>();

        try (Connection conn = DriverManager.getConnection(url, usuario, contrasenia)) {
            System.out.println("Conexión exitosa con la base de datos.");

            String sql = "SELECT id_bitacora, fecha_revision, id_norma_fk, id_usuario_fk, id_terminal_fk, "
                    + "nombre_empresa, c_buena, c_regular, c_mala, observaciones_soportes, "
                    + "capacidad, fecha_fabricacion, capacidad_reg, observaciones_gen_revisor, "
                    + "marca, serie, diametro, espesor "
                    + "FROM public.bitacora_instalacion_de_gas "
                    + "WHERE id_usuario_fk = ? AND fecha_revision = TO_DATE(?, 'YYYY-MM-DD')";

            PreparedStatement statement = conn.prepareStatement(sql);

            if (globalV.fechaR == null || globalV.fechaR.isEmpty()) {
                throw new IllegalArgumentException("La fecha no puede ser nula o vacía.");
            }

            CDatosNOM usuarioDAO = new CDatosNOM();
            int id = usuarioDAO.obtenerIDUsuario();

            statement.setInt(1, id);
            statement.setString(2, globalV.fechaR);

            ResultSet rs = statement.executeQuery();

            int idterm;

            if (rs.next()) {

                bitacora.put("id_bitacora", rs.getString("id_bitacora"));
                bitacora.put("fecha_revision", rs.getDate("fecha_revision"));
                bitacora.put("id_norma_fk", rs.getString("id_norma_fk"));
                bitacora.put("id_usuario_fk", rs.getString("id_usuario_fk"));
                idterm = rs.getInt("id_terminal_fk");
                bitacora.put("id_terminal_fk", idterm);
                bitacora.put("nombre_empresa", (razonSocial));
                bitacora.put("c_buena", convertirBooleano2(rs.getString("c_buena")));
                bitacora.put("c_regular", convertirBooleano2(rs.getString("c_regular")));
                bitacora.put("c_mala", convertirBooleano2(rs.getString("c_mala")));
                bitacora.put("observaciones_soportes", rs.getString("observaciones_soportes"));
                bitacora.put("capacidad", rs.getString("capacidad"));
                bitacora.put("fecha_fabricacion", rs.getString("fecha_fabricacion"));
                bitacora.put("capacidad_reg", rs.getString("capacidad_reg"));
                bitacora.put("observaciones_gen_revisor", rs.getString("observaciones_gen_revisor"));
                bitacora.put("marca", rs.getString("marca"));
                bitacora.put("serie", rs.getString("serie"));
                bitacora.put("diametro", rs.getString("diametro"));
                bitacora.put("espesor", rs.getString("espesor"));
            } else {
                System.out.println("No se encontraron registros.");
                return;
            }

            System.out.println("id terminal :" + idterm);
            String termi = cdatosnom.obtenerNomTerminal(idterm);
            // Cargar la plantilla PDF
            PdfDocument pdfDoc = new PdfDocument(new PdfReader(plantilla), new PdfWriter(destino));
            Document document = new Document(pdfDoc);
            PdfPage page = pdfDoc.getLastPage();
            PdfCanvas pdfCanvas = new PdfCanvas(page);

            // Aquí defines las posiciones exactas para cada campo
            Map<String, float[]> posiciones = new HashMap<>();
            //posiciones.put("id_bitacora", new float[]{50, 700});
            posiciones.put("fecha_revision", new float[]{370, 780});
            posiciones.put("nombre_empresa", new float[]{370, 798});
            posiciones.put("capacidad", new float[]{77, 616});
            posiciones.put("capacidad_reg", new float[]{65, 577});
            posiciones.put("fecha_fabricacion", new float[]{143, 616});
            posiciones.put("marca", new float[]{140, 507});
            posiciones.put("serie", new float[]{199, 507});
            posiciones.put("diametro", new float[]{423, 507});
            posiciones.put("espesor", new float[]{528, 507});
            posiciones.put("observaciones_gen_revisor", new float[]{310, 577});
            posiciones.put("observaciones_soportes", new float[]{468, 675});
            posiciones.put("c_buena", new float[]{331, 664});
            posiciones.put("c_mala", new float[]{439, 664});
            posiciones.put("c_regular", new float[]{388, 664});

            for (Map.Entry<String, float[]> entry : posiciones.entrySet()) {
                String campo = entry.getKey();
                float x = entry.getValue()[0];
                float y = entry.getValue()[1];

                Object valor = bitacora.get(campo);
                if (valor != null) {
                    pdfCanvas.beginText()
                            .setFontAndSize(font, 8f)
                            .setFillColor(ColorConstants.BLACK)
                            .moveText(x, y)
                            .showText(valor.toString())
                            .endText();
                }
            }

            float j = 227;
            float k = 523;
            pdfCanvas.beginText()
                    .setFontAndSize(PdfFontFactory.createFont(FontConstants.TIMES_BOLD), 5.5f)
                    .setFillColor(ColorConstants.BLACK)
                    .moveText(j, k)
                    .showText("")
                    .endText();

            float a = 267;
            float b = 756;
            pdfCanvas.beginText()
                    .setFontAndSize(PdfFontFactory.createFont(FontConstants.TIMES_BOLD), 5.5f)
                    .setFillColor(ColorConstants.WHITE)
                    .moveText(a, b)
                    .showText("BITACORA DE CONTROL, REVISION Y MANTENIMIENTO.")
                    .moveText(0, -10)
                    .showText("INSTALACIONES DE GAS(" + termi + ")")
                    .endText();
            //impresion de razon social

            document.close();
            pdfDoc.close();
            System.out.println("PDF generado con éxito en: " + destino);

        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Error al generar el PDF: " + e.getMessage());
        }
    }

    public void EppPDF(String razonSocial) throws IOException {
        String plantilla = "C:\\Users\\Alan Cruz Garcia\\Desktop\\plantilla EPP.pdf";
        String destino = "C:\\Users\\Alan Cruz Garcia\\Desktop\\exportaciones\\PLANTILLA EPP.pdf";

        PdfFont font = PdfFontFactory.createFont(FontConstants.HELVETICA);
        PdfFont bold = PdfFontFactory.createFont(FontConstants.HELVETICA_BOLD);

        try (Connection conn = DriverManager.getConnection(url, usuario, contrasenia)) {
            System.out.println("Conexión exitosa con la base de datos.");

            String sql = "SELECT DISTINCT "
                    + "b.nombre, b.area, b.puesto, "
                    + "b.casco, b.lentes_de_seguridad, b.botas_de_seguridad, "
                    + "b.tapones_auditivos, b.guantes, b.careta_soldar, "
                    + "b.careta_esmerilar, b.mascarilla, b.faja, b.arnes, b.uniforme "
                    + "FROM bitacora_epp b "
                    + "JOIN usuarios u ON b.id_usuario_fk = u.id_usuarios "
                    + "WHERE u.username = ? "
                    + "AND EXTRACT(MONTH FROM b.fecha_revision) = ? " // Filtra por mes
                    + "AND EXTRACT(YEAR FROM b.fecha_revision) = ?";   // Filtra por año

            PreparedStatement statement = conn.prepareStatement(sql);

            LocalDate fecha = LocalDate.parse(globalV.fechaR, DateTimeFormatter.ofPattern("yyyy-MM-dd"));
            System.out.println(globalV.fechaR);
            int mes = fecha.getMonthValue();
            int ano = fecha.getYear();
            statement.setString(1, globalV.user);  // Asegúrate de que "globalV.user" esté definido
            statement.setInt(2, mes);
            statement.setInt(3, ano);
            ResultSet resultSet = statement.executeQuery();

            PdfDocument pdfDoc = new PdfDocument(new PdfReader(plantilla), new PdfWriter(destino));
            Document document = new Document(pdfDoc);

            // Crear la tabla sin cabecera
            Table table = new Table(new float[]{0.1f, 2f, .5f, .5f, 0.1f, .5f, .5f, .5f, .5f, .5f, .5f, .5f, .5f, .5f, .5f, 2});

            table.addHeaderCell(new Cell().add(new Paragraph("#")).setFontSize(4f));
            table.addHeaderCell(new Cell().add(new Paragraph("NOMBRE")).setFontSize(4f));
            table.addHeaderCell(new Cell().add(new Paragraph("AREA")).setFontSize(4f));
            table.addHeaderCell(new Cell().add(new Paragraph("PUESTO")).setFontSize(4f));
            table.addHeaderCell(new Cell().add(new Paragraph("CASCO")).setFontSize(4f));
            table.addHeaderCell(new Cell().add(new Paragraph("LENTES DE SEGURIDAD")).setFontSize(4f));
            table.addHeaderCell(new Cell().add(new Paragraph("BOTAS DE SEGURIDAD")).setFontSize(4f));
            table.addHeaderCell(new Cell().add(new Paragraph("TAPONES AUDITIVOS")).setFontSize(4f));
            table.addHeaderCell(new Cell().add(new Paragraph("GUANTES")).setFontSize(4f));
            table.addHeaderCell(new Cell().add(new Paragraph("CARETA PARA SOLDAR")).setFontSize(4f));
            table.addHeaderCell(new Cell().add(new Paragraph("CARETA PARA ESMERILAR")).setFontSize(4f));
            table.addHeaderCell(new Cell().add(new Paragraph("MASCARILLA")).setFontSize(4f));
            table.addHeaderCell(new Cell().add(new Paragraph("FAJA")).setFontSize(4f));
            table.addHeaderCell(new Cell().add(new Paragraph("ARNES")).setFontSize(4f));
            table.addHeaderCell(new Cell().add(new Paragraph("UNIFORME")).setFontSize(4f));
            table.addHeaderCell(new Cell().add(new Paragraph("FIRMA")).setFontSize(4f));

            contador = 0;
            while (resultSet.next()) {
                contador++;
                table.addCell(new Cell().add(new Paragraph(String.valueOf(contador)).setFontSize(4f)));
                table.addCell(new Cell().add(new Paragraph(resultSet.getString("nombre")).setFontSize(4f)));
                table.addCell(new Cell().add(new Paragraph(resultSet.getString("area")).setFontSize(4f)));
                table.addCell(new Cell().add(new Paragraph(resultSet.getString("puesto")).setFontSize(4f)));
                table.addCell(new Cell().add(new Paragraph(convertirBooleano(resultSet.getString("casco"))).setFontSize(4f)));
                table.addCell(new Cell().add(new Paragraph(convertirBooleano(resultSet.getString("lentes_de_seguridad"))).setFontSize(4f)));
                table.addCell(new Cell().add(new Paragraph(convertirBooleano(resultSet.getString("botas_de_seguridad"))).setFontSize(4f)));
                table.addCell(new Cell().add(new Paragraph(convertirBooleano(resultSet.getString("tapones_auditivos"))).setFontSize(4f)));
                table.addCell(new Cell().add(new Paragraph(convertirBooleano(resultSet.getString("guantes"))).setFontSize(4f)));
                table.addCell(new Cell().add(new Paragraph(convertirBooleano(resultSet.getString("careta_soldar"))).setFontSize(4f)));
                table.addCell(new Cell().add(new Paragraph(convertirBooleano(resultSet.getString("careta_esmerilar"))).setFontSize(4f)));
                table.addCell(new Cell().add(new Paragraph(convertirBooleano(resultSet.getString("mascarilla"))).setFontSize(4f)));
                table.addCell(new Cell().add(new Paragraph(convertirBooleano(resultSet.getString("faja"))).setFontSize(4f)));
                table.addCell(new Cell().add(new Paragraph(convertirBooleano(resultSet.getString("arnes"))).setFontSize(4f)));
                table.addCell(new Cell().add(new Paragraph(convertirBooleano(resultSet.getString("uniforme"))).setFontSize(4f)));
                table.addCell(new Cell().add(new Paragraph(("")).setFontSize(4f)));
            }
            System.out.println("ya se imprimio la primera tabla");

            // Agregar la tabla al documento
            table.setMarginLeft(35); // Mueve la tabla 20 unidades hacia la derecha

            table.setWidth(649.3f); // Ancho de la tabla
            document.add(table.setMarginTop(56.3f)); // Asegura que no se desplace hacia abajo

            PdfPage page = pdfDoc.getLastPage();
            PdfCanvas pdfCanvas = new PdfCanvas(page);

            // Sobreescribir la dirección
            float m = 525; // Ajusta según sea necesario
            float n = 523.3f; // Ajusta según sea necesario
            pdfCanvas.beginText()
                    .setFontAndSize(PdfFontFactory.createFont(FontConstants.TIMES_BOLD), 5.5f)
                    .setFillColor(ColorConstants.BLACK)
                    .moveText(m, n)
                    .showText(globalV.fechaR)
                    .endText();
            float j = 227;
            float k = 523;
            pdfCanvas.beginText()
                    .setFontAndSize(PdfFontFactory.createFont(FontConstants.TIMES_BOLD), 5.5f)
                    .setFillColor(ColorConstants.BLACK)
                    .moveText(j, k)
                    .showText(razonSocial)
                    .endText();

            Table tabla2 = new Table(new float[]{2, 2, 2}); // Columnas con anchos personalizados

// Encabezados con bordes y estilos
            tabla2.addHeaderCell(new Cell().add(new Paragraph("NOMBRE DE QUIEN REALIZA LA SUPERVISIÓN"))
                    .setFontSize(5.5f)
                    .setTextAlignment(TextAlignment.CENTER)
                    .setVerticalAlignment(VerticalAlignment.MIDDLE)
                    .setBorderBottom(new SolidBorder(1))); // Borde inferior

            tabla2.addHeaderCell(new Cell().add(new Paragraph("PUESTO"))
                    .setFontSize(5.5f)
                    .setTextAlignment(TextAlignment.CENTER)
                    .setVerticalAlignment(VerticalAlignment.MIDDLE)
                    .setBorderBottom(new SolidBorder(1))); // Borde inferior

            tabla2.addHeaderCell(new Cell().add(new Paragraph("FIRMA"))
                    .setFontSize(5.5f)
                    .setTextAlignment(TextAlignment.CENTER)
                    .setVerticalAlignment(VerticalAlignment.MIDDLE)
                    .setBorderBottom(new SolidBorder(1))); // Borde inferior

// Celdas vacías con bordes
            tabla2.addCell(new Cell().setHeight(20).setBorderBottom(new SolidBorder(1))); // Nombre
            tabla2.addCell(new Cell().setHeight(20).setBorderBottom(new SolidBorder(1))); // Puesto
            tabla2.addCell(new Cell().setHeight(20).setBorderBottom(new SolidBorder(1))); // Firma

// Div para centrar la tabla
            Div div = new Div()
                    .setTextAlignment(TextAlignment.CENTER)
                    .setWidth(UnitValue.createPercentValue(120))
                    .add(tabla2);

            div.setMarginLeft(265); // Ajusta este valor según sea necesario

            div.setMarginTop(10);

            document.add(div); // ¡Este es el paso que faltaba!

            System.out.println("Segunda tabla agregada al documento.");
            System.out.println("se imprimio la segundatabla");
// Ajustar el ancho de la tabla
            tabla2.setWidth(900);

            document.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
