package com.video;

import java.awt.BorderLayout;
import java.io.File;
import javafx.embed.swing.JFXPanel;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.media.Media;
import javafx.scene.media.MediaException;
import javafx.scene.media.MediaPlayer;
import javafx.scene.media.MediaView;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class Reproductor {

    private JFXPanel jfxPanel;
    private JPanel jpanel;
    private MediaPlayer mediaPlayer;
    private Media media;
    private MediaView view;
    private Scene escena;
    private File file;
    private String ruta;

    public Reproductor() {
        this.jfxPanel = new JFXPanel();
    }

    /**
     * @param ruta the ruta to set
     */
    public void setRuta(String ruta) {
        this.ruta = ruta;
    }

    /**
     * @param jpanel the jpanel to set
     */
    public void setJpanel(JPanel jpanel) {
        this.jpanel = jpanel;
    }

    public void reproducir() {

        if (mediaPlayer != null) {
            mediaPlayer.play();
        } else {
            JOptionPane.showMessageDialog(null, "No se ha cargado ningún video para reproducir.", "Error", JOptionPane.ERROR_MESSAGE);

        }
    }

    public void pausar() {
        try {
            getMediaPlayer().pause();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public void parar() {
        try {
            getMediaPlayer().stop();
        } catch (MediaException e) {
            System.out.println(e.getMessage());
        }
    }

    public void setVolumen(double value) {
        try {
            getMediaPlayer().setVolume(value);
        } catch (Exception e) {
        }
    }

    public MediaPlayer getMediaPlayer() {
        return mediaPlayer;
    }

public void mostrarVideo() {
    try {
        // Validar que la ruta no sea nula o vacía
        if (ruta == null || ruta.isEmpty()) {
            throw new IllegalArgumentException("La ruta del video no es válida.");
        }

        // Validar que el archivo exista
        this.file = new File(this.ruta);
        if (!file.exists()) {
            throw new IllegalArgumentException("El archivo no existe en la ruta proporcionada.");
        }

        // Dimensiones del panel
        int x = this.jpanel.getHeight();
        int y = this.jpanel.getWidth();

        // Inicializar Media y MediaPlayer
        /*if (this.mediaPlayer != null) {
            // Detener el reproductor actual
            this.mediaPlayer.stop();
            // Liberar recursos del reproductor anterior
            this.liberaRecursos();
        }*/

        this.media = new Media(this.file.toURI().toString());
        this.mediaPlayer = new MediaPlayer(this.media);

        // Configuración de MediaView
        this.view = new MediaView(this.mediaPlayer);
        this.view.setFitHeight(x);
        this.view.setFitWidth(y);

        // Verifica si JFXPanel es null, y crea uno nuevo si es necesario
        if (this.jfxPanel == null) {
            this.jfxPanel = new JFXPanel();  // Inicializa si es null
        }

        // Configuración de la escena y asociación con el JFXPanel
        escena = new Scene(new Group(view));
        this.jfxPanel.setSize(this.jpanel.getSize());
        this.jfxPanel.setScene(escena);
        this.mediaPlayer.setCycleCount(MediaPlayer.INDEFINITE);

        // Agregar el JFXPanel al JPanel si no está agregado aún
        if (!this.jpanel.isAncestorOf(jfxPanel)) {
            this.jpanel.setLayout(new BorderLayout());
            this.jpanel.add(jfxPanel, BorderLayout.CENTER);
        }

        // Iniciar el video
        this.mediaPlayer.play();

    } catch (IllegalArgumentException e) {
        JOptionPane.showMessageDialog(null, e.getMessage(), "Error de reproducción", JOptionPane.ERROR_MESSAGE);
    } catch (MediaException e) {
        JOptionPane.showMessageDialog(null, "Error al cargar el archivo de video.", "Error de Media", JOptionPane.ERROR_MESSAGE);
    }
}

    public void liberaRecursos() {
        if (this.mediaPlayer != null) {
            this.mediaPlayer.stop();  // Detenemos el reproductor
            this.mediaPlayer = null;  // Liberamos el reproductor actual
            this.view = null;  // Eliminamos el MediaView asociado
            this.media = null;  // Eliminamos la referencia al archivo
        }
    }

}