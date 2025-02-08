package com.login;

import com.itextpdf.io.font.FontConstants;
import com.itextpdf.kernel.font.PdfFont;
import com.itextpdf.kernel.font.PdfFontFactory;
import com.itextpdf.kernel.pdf.PdfDocument;
import com.itextpdf.kernel.pdf.PdfReader;
import com.itextpdf.kernel.pdf.PdfWriter;
import com.itextpdf.layout.Document;
import com.itextpdf.layout.element.Table;
import com.itextpdf.layout.element.Cell;
import com.itextpdf.layout.element.Paragraph;
import java.io.IOException;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class PDFExporter {

    private final String usuario = "postgres";
    private final String contrasenia = "1906";
    private final String bd = "bdMobility";
    private final String ip = "localhost";
    private final String puerto = "5432";
            String url = "jdbc:postgresql://" + ip + ":" + puerto + "/" + bd;

    private float titleFont;

    public PDFExporter(float titleFont) {
        this.titleFont = titleFont;
    }

    /*public static void main(String[] args) throws IOException {
        PDFExporter ejemplo = new PDFExporter(8f);
        ejemplo.generarPDF();
    }*/

    public void ExtintorPDF() throws IOException {

        String plantilla = "C:\\Users\\Alan\\Downloads\\plantilla.pdf";
        String destino = "C:\\Users\\Alan\\Desktop\\exportaciones\\plantillaPgadmin.pdf";

        PdfFont font = PdfFontFactory.createFont(FontConstants.HELVETICA);
        PdfFont bold = PdfFontFactory.createFont(FontConstants.HELVETICA_BOLD);

        try (Connection conn = DriverManager.getConnection(url, usuario, contrasenia)) {
            System.out.println("Conexión exitosa con la base de datos.");

            String sql = "SELECT DISTINCT b.ubicacion, b.ultima_recarga, b.proxima_recarga, b.capacidad, b.tipo_agente_extinguidor, "
                    + "b.manguera, b.manometro, b.soporte, b.presion, b.cilindro, b.limpieza, b.senalizacion, "
                    + "b.etiqueta, b.seguro, b.obstruccion, b.observacion "
                    + "FROM bitacora b "
                    + "JOIN usuarios u ON b.id_usuario_fk = u.id_usuarios "
                    + "WHERE u.username = 'deimos' "
                    + "GROUP BY b.ubicacion, b.ultima_recarga, b.proxima_recarga, b.capacidad, b.tipo_agente_extinguidor, "
                    + "b.manguera, b.manometro, b.soporte, b.presion, b.cilindro, b.limpieza, b.senalizacion, "
                    + "b.etiqueta, b.seguro, b.obstruccion, b.observacion;";

            PreparedStatement statement = conn.prepareStatement(sql);
            ResultSet resultSet = statement.executeQuery();

            PdfDocument pdfDoc = new PdfDocument(new PdfReader(plantilla), new PdfWriter(destino));
            Document document = new Document(pdfDoc);

            Table table = new Table(new float[]{2, 1, 1, 1, 2, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 2});

            table.addHeaderCell(new Cell().add(new Paragraph("Ubicación")).setFontSize(titleFont));
            table.addHeaderCell(new Cell().add(new Paragraph("U. Recarga")).setFontSize(titleFont));
            table.addHeaderCell(new Cell().add(new Paragraph("P. Recarga")).setFontSize(titleFont));
            table.addHeaderCell(new Cell().add(new Paragraph("Capacidad")).setFontSize(titleFont));
            table.addHeaderCell(new Cell().add(new Paragraph("Tipo A Extintor")).setFontSize(titleFont));
            table.addHeaderCell(new Cell().add(new Paragraph("Manguera")).setFontSize(titleFont));
            table.addHeaderCell(new Cell().add(new Paragraph("Manómetro")).setFontSize(titleFont));
            table.addHeaderCell(new Cell().add(new Paragraph("Soporte")).setFontSize(titleFont));
            table.addHeaderCell(new Cell().add(new Paragraph("Presión")).setFontSize(titleFont));
            table.addHeaderCell(new Cell().add(new Paragraph("Cilindro")).setFontSize(titleFont));
            table.addHeaderCell(new Cell().add(new Paragraph("Limpieza")).setFontSize(titleFont));
            table.addHeaderCell(new Cell().add(new Paragraph("Señalización")).setFontSize(titleFont));
            table.addHeaderCell(new Cell().add(new Paragraph("Etiqueta")).setFontSize(titleFont));
            table.addHeaderCell(new Cell().add(new Paragraph("Seguro")).setFontSize(titleFont));
            table.addHeaderCell(new Cell().add(new Paragraph("Obstrucción")).setFontSize(titleFont));
            table.addHeaderCell(new Cell().add(new Paragraph("Observación")).setFontSize(titleFont));

            while (resultSet.next()) {
                table.addCell(new Cell().add(new Paragraph(resultSet.getString("ubicacion")).setFontSize(8f)));
                table.addCell(new Cell().add(new Paragraph(resultSet.getString("ultima_recarga")).setFontSize(8f)));
                table.addCell(new Cell().add(new Paragraph(resultSet.getString("proxima_recarga")).setFontSize(8f)));
                table.addCell(new Cell().add(new Paragraph(resultSet.getString("capacidad")).setFontSize(8f)));
                table.addCell(new Cell().add(new Paragraph(resultSet.getString("tipo_agente_extinguidor")).setFontSize(8f)));
                table.addCell(new Cell().add(new Paragraph(resultSet.getString("manguera")).setFontSize(8f)));
                table.addCell(new Cell().add(new Paragraph(resultSet.getString("manometro")).setFontSize(8f)));
                table.addCell(new Cell().add(new Paragraph(resultSet.getString("soporte")).setFontSize(8f)));
                table.addCell(new Cell().add(new Paragraph(resultSet.getString("presion")).setFontSize(8f)));
                table.addCell(new Cell().add(new Paragraph(resultSet.getString("cilindro")).setFontSize(8f)));
                table.addCell(new Cell().add(new Paragraph(resultSet.getString("limpieza")).setFontSize(8f)));
                table.addCell(new Cell().add(new Paragraph(resultSet.getString("senalizacion")).setFontSize(8f)));
                table.addCell(new Cell().add(new Paragraph(resultSet.getString("etiqueta")).setFontSize(8f)));
                table.addCell(new Cell().add(new Paragraph(resultSet.getString("seguro")).setFontSize(8f)));
                table.addCell(new Cell().add(new Paragraph(resultSet.getString("obstruccion")).setFontSize(8f)));
                table.addCell(new Cell().add(new Paragraph(resultSet.getString("observacion")).setFontSize(8f)));
            }

            // Configurar la posición de la tabla
            float x = 80; // Posición desde el borde izquierdo
            float y = 230; // Posición desde el borde inferior
            float width = 500; // Ancho de la tabla
            table.setFixedPosition(x, y, width);

            document.add(table);
            document.close();
            System.out.println("PDF generado exitosamente: " + destino);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
        public void HumoPDF() throws IOException {

        String plantilla = "C:\\Users\\Alan\\Downloads\\plantillaHumo.pdf";
        String destino = "C:\\Users\\Alan\\Desktop\\exportaciones\\plantillaHumo.pdf";

        PdfFont font = PdfFontFactory.createFont(FontConstants.HELVETICA);
        PdfFont bold = PdfFontFactory.createFont(FontConstants.HELVETICA_BOLD);

        try (Connection conn = DriverManager.getConnection(url, usuario, contrasenia)) {
            System.out.println("Conexión exitosa con la base de datos.");

            String sql = "SELECT DISTINCT b.ubicacion, b.ultima_recarga, b.proxima_recarga, b.capacidad, b.tipo_agente_extinguidor, "
                    + "b.manguera, b.manometro, b.soporte, b.presion, b.cilindro, b.limpieza, b.senalizacion, "
                    + "b.etiqueta, b.seguro, b.obstruccion, b.observacion "
                    + "FROM bitacora b "
                    + "JOIN usuarios u ON b.id_usuario_fk = u.id_usuarios "
                    + "WHERE u.username = 'deimos' "
                    + "GROUP BY b.ubicacion, b.ultima_recarga, b.proxima_recarga, b.capacidad, b.tipo_agente_extinguidor, "
                    + "b.manguera, b.manometro, b.soporte, b.presion, b.cilindro, b.limpieza, b.senalizacion, "
                    + "b.etiqueta, b.seguro, b.obstruccion, b.observacion;";

            PreparedStatement statement = conn.prepareStatement(sql);
            ResultSet resultSet = statement.executeQuery();

            PdfDocument pdfDoc = new PdfDocument(new PdfReader(plantilla), new PdfWriter(destino));
            Document document = new Document(pdfDoc);

            Table table = new Table(new float[]{2, 1, 1, 1, 2, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 2});

            table.addHeaderCell(new Cell().add(new Paragraph("Ubicación")).setFontSize(titleFont));
            table.addHeaderCell(new Cell().add(new Paragraph("U. Recarga")).setFontSize(titleFont));
            table.addHeaderCell(new Cell().add(new Paragraph("P. Recarga")).setFontSize(titleFont));
            table.addHeaderCell(new Cell().add(new Paragraph("Capacidad")).setFontSize(titleFont));
            table.addHeaderCell(new Cell().add(new Paragraph("Tipo A Extintor")).setFontSize(titleFont));
            table.addHeaderCell(new Cell().add(new Paragraph("Manguera")).setFontSize(titleFont));
            table.addHeaderCell(new Cell().add(new Paragraph("Manómetro")).setFontSize(titleFont));
            table.addHeaderCell(new Cell().add(new Paragraph("Soporte")).setFontSize(titleFont));
            table.addHeaderCell(new Cell().add(new Paragraph("Presión")).setFontSize(titleFont));
            table.addHeaderCell(new Cell().add(new Paragraph("Cilindro")).setFontSize(titleFont));
            table.addHeaderCell(new Cell().add(new Paragraph("Limpieza")).setFontSize(titleFont));
            table.addHeaderCell(new Cell().add(new Paragraph("Señalización")).setFontSize(titleFont));
            table.addHeaderCell(new Cell().add(new Paragraph("Etiqueta")).setFontSize(titleFont));
            table.addHeaderCell(new Cell().add(new Paragraph("Seguro")).setFontSize(titleFont));
            table.addHeaderCell(new Cell().add(new Paragraph("Obstrucción")).setFontSize(titleFont));
            table.addHeaderCell(new Cell().add(new Paragraph("Observación")).setFontSize(titleFont));

            while (resultSet.next()) {
                table.addCell(new Cell().add(new Paragraph(resultSet.getString("ubicacion")).setFontSize(8f)));
                table.addCell(new Cell().add(new Paragraph(resultSet.getString("ultima_recarga")).setFontSize(8f)));
                table.addCell(new Cell().add(new Paragraph(resultSet.getString("proxima_recarga")).setFontSize(8f)));
                table.addCell(new Cell().add(new Paragraph(resultSet.getString("capacidad")).setFontSize(8f)));
                table.addCell(new Cell().add(new Paragraph(resultSet.getString("tipo_agente_extinguidor")).setFontSize(8f)));
                table.addCell(new Cell().add(new Paragraph(resultSet.getString("manguera")).setFontSize(8f)));
                table.addCell(new Cell().add(new Paragraph(resultSet.getString("manometro")).setFontSize(8f)));
                table.addCell(new Cell().add(new Paragraph(resultSet.getString("soporte")).setFontSize(8f)));
                table.addCell(new Cell().add(new Paragraph(resultSet.getString("presion")).setFontSize(8f)));
                table.addCell(new Cell().add(new Paragraph(resultSet.getString("cilindro")).setFontSize(8f)));
                table.addCell(new Cell().add(new Paragraph(resultSet.getString("limpieza")).setFontSize(8f)));
                table.addCell(new Cell().add(new Paragraph(resultSet.getString("senalizacion")).setFontSize(8f)));
                table.addCell(new Cell().add(new Paragraph(resultSet.getString("etiqueta")).setFontSize(8f)));
                table.addCell(new Cell().add(new Paragraph(resultSet.getString("seguro")).setFontSize(8f)));
                table.addCell(new Cell().add(new Paragraph(resultSet.getString("obstruccion")).setFontSize(8f)));
                table.addCell(new Cell().add(new Paragraph(resultSet.getString("observacion")).setFontSize(8f)));
            }

            // Configurar la posición de la tabla
            float x = 80; // Posición desde el borde izquierdo
            float y = 230; // Posición desde el borde inferior
            float width = 500; // Ancho de la tabla
            table.setFixedPosition(x, y, width);

            document.add(table);
            document.close();
            System.out.println("PDF generado exitosamente: " + destino);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
