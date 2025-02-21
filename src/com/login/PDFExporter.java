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
import com.itextpdf.layout.element.Table;
import com.itextpdf.layout.element.Cell;
import com.itextpdf.layout.element.Div;
import com.itextpdf.layout.element.Paragraph;
import com.itextpdf.layout.property.TextAlignment;
import com.itextpdf.layout.property.UnitValue;
import com.itextpdf.layout.property.VerticalAlignment;
import java.awt.Canvas;
import java.io.IOException;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class PDFExporter {

    private final String usuario = "postgres";
    private final String contrasenia = "1906";
    private final String bd = "bdMobility";
    private final String ip = "localhost";
    private final String puerto = "5432";
    String url = "jdbc:postgresql://" + ip + ":" + puerto + "/" + bd;

    private int contador = 0;
    private int rowCount = 0;

    /*public static void main(String[] args) throws IOException {
        PDFExporter ejemplo = new PDFExporter(8f);
        ejemplo.generarPDF();
    }*/
    public void ExtintorPDF() throws IOException {

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

            //LocalDate fecha = LocalDate.parse(globalV.fechaR);  // Asegúrate que globalV.fechaR esté en formato correcto
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
                table.addCell(new Cell().add(new Paragraph(resultSet.getString("manguera")).setFontSize(7f)));
                table.addCell(new Cell().add(new Paragraph(resultSet.getString("manometro")).setFontSize(7f)));
                table.addCell(new Cell().add(new Paragraph(resultSet.getString("soporte")).setFontSize(7f)));
                table.addCell(new Cell().add(new Paragraph(resultSet.getString("presion")).setFontSize(7f)));
                table.addCell(new Cell().add(new Paragraph(resultSet.getString("cilindro")).setFontSize(7f)));
                table.addCell(new Cell().add(new Paragraph(resultSet.getString("limpieza")).setFontSize(7f)));
                table.addCell(new Cell().add(new Paragraph(resultSet.getString("senalizacion")).setFontSize(7f)));
                table.addCell(new Cell().add(new Paragraph(resultSet.getString("etiqueta")).setFontSize(7f)));
                table.addCell(new Cell().add(new Paragraph(resultSet.getString("seguro")).setFontSize(7f)));
                table.addCell(new Cell().add(new Paragraph(resultSet.getString("obstruccion")).setFontSize(7f)));
                table.addCell(new Cell().add(new Paragraph(resultSet.getString("observacion")).setFontSize(7f)));
            }

            Table tabla2 = new Table(new float[]{50});
            tabla2.addHeaderCell(new Cell().add(new Paragraph("FIRMA DE QUIEN REALIZA LA REVISION")).setFontSize(5.5f).setTextAlignment(TextAlignment.CENTER).setVerticalAlignment(VerticalAlignment.MIDDLE));
            tabla2.addCell(new Cell().setHeight(20));
            Div div = new Div().setTextAlignment(TextAlignment.CENTER).setWidth(UnitValue.createPercentValue(100)).add(tabla2);

            tabla2.setWidth(400);

            float pageHeight = pdfDoc.getDefaultPageSize().getHeight();
// Configurar la posición inicial de la tabla
            float x = 50; // Desde el borde izquierdo
            float initialY = pageHeight - 50; // Posición desde arriba (50 de margen)
            float width = 718; // Ancho de la tabla

// Agregar tabla directamente sin setFixedPosition
            table.setWidth(width);
            document.add(table.setMarginTop(103)); // Asegura que no se desplace hacia abajo
            document.add(div.setMarginTop(5).setMarginLeft(160));

            // Crear un PdfCanvas para sobreponer texto
            // Crear un Canvas para sobreponer texto
// Crear un PdfCanvas para sobreponer texto
            PdfPage page = pdfDoc.getLastPage(); // Obtener la última página
            PdfCanvas pdfCanvas = new PdfCanvas(page); // Crear un PdfCanvas en la página
// Definir la posición del texto (x, y)
            float z = 150; // Posición horizontal (ajusta según sea necesario)
            float y = 489.3f;
            ; // Posición vertical (ajusta según sea necesario)

// Dibujar el texto sobrepuesto
            pdfCanvas.beginText() // Iniciar el modo de texto
                    .setFontAndSize(PdfFontFactory.createFont(FontConstants.TIMES_BOLD), 7.5f) // Fuente y tamaño
                    .setFillColor(ColorConstants.BLACK) // Color del texto
                    .moveText(z, y) // Mover a la posición (x, y)
                    .showText(globalV.fechaR) // Dibujar el texto
                    .endText(); // Finalizar el modo de texto

// Definir la posición del texto (x, y)
            float m = 200; // Posición horizontal (ajusta según sea necesario)
            float n = 503;
            ; // Posición vertical (ajusta según sea necesario)
// Dibujar el texto sobrepuesto
            pdfCanvas.beginText() // Iniciar el modo de texto
                    .setFontAndSize(PdfFontFactory.createFont(FontConstants.TIMES_BOLD), 7.5f) // Fuente y tamaño
                    .setFillColor(ColorConstants.BLACK) // Color del texto
                    .moveText(m, n) // Mover a la posición (x, y)
                    .showText(globalV.direccion) // Dibujar el texto
                    .endText(); // Finalizar el modo de texto
            document.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
        public void HumoPDF() throws IOException {
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
                + "AND EXTRACT(YEAR FROM b.fecha_revision) = ?";

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
            table.addCell(new Cell().add(new Paragraph(resultSet.getString("prueba_funcionamiento")).setFontSize(7f)));
            table.addCell(new Cell().add(new Paragraph(resultSet.getString("soporte")).setFontSize(7f)));
            table.addCell(new Cell().add(new Paragraph(resultSet.getString("ubicacion_fisica")).setFontSize(7f)));
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

        // Cerrar el documento
        document.close();
    } catch (Exception e) {
        e.printStackTrace();
    }
}
}
