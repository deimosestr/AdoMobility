package com.login;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.RenderingHints;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JButton;
import javax.swing.ImageIcon;

public class buttonsNormas extends JButton {

    private boolean over;
    private boolean selected = false; // Atributo para estado seleccionado
    private Color color;
    private Color colorOver;
    private Color colorClick;
    private Color borderColor;
    private int radius = 0;
    private ImageIcon originalIcon;

    public buttonsNormas() {
        setColor(255, 255, 255); // Blanco
        setColorOver(200, 200, 200); // Gris claro
        setColorClick(150, 150, 255); // Azul claro
        setBorderColor(255, 255, 255); // Color del borde
        setFocusPainted(false);
        setContentAreaFilled(false);
        setBorderPainted(false);

        addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent me) {
                if (!selected) { // Cambiar color solo si no está seleccionado
                    setBackground(colorOver);
                }
                over = true;
            }

            @Override
            public void mouseExited(MouseEvent me) {
                if (!selected) { // Restaurar color solo si no está seleccionado
                    setBackground(color);
                }
                over = false;
            }

            @Override
            public void mousePressed(MouseEvent me) {
                // Aquí no es necesario cambiar el color (se maneja con selected)
            }
        });
    }

    // Métodos de colores con RGB
    public void setColor(int r, int g, int b) {
        this.color = new Color(r, g, b);
        if (!selected) {
            setBackground(color);
        }
    }

    public void setColorOver(int r, int g, int b) {
        this.colorOver = new Color(r, g, b);
    }

    public void setColorClick(int r, int g, int b) {
        this.colorClick = new Color(r, g, b);
    }

    public void setBorderColor(int r, int g, int b) {
        this.borderColor = new Color(r, g, b);
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public boolean isSelected() {
        return selected;
    }

    public void setSelected(boolean selected) {
        this.selected = selected;
        if (selected) {
            setBackground(colorClick); // Color de botón seleccionado
        } else {
            setBackground(color); // Color normal
        }
        repaint();
    }

    @Override
    protected void paintComponent(Graphics grphcs) {
        Graphics2D g2 = (Graphics2D) grphcs;
        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);

        // Dibujar borde redondeado
        g2.setColor(borderColor);
        g2.fillRoundRect(0, 0, getWidth(), getHeight(), radius, radius);
        g2.setColor(getBackground());

        // Borde interno de 2 px
        g2.fillRoundRect(2, 2, getWidth() - 4, getHeight() - 4, radius, radius);

        // Dibujar el icono (si existe)
        if (originalIcon != null) {
            Image img = originalIcon.getImage();
            Image scaledImage = img.getScaledInstance(getWidth() - 8, getHeight() - 8, Image.SCALE_SMOOTH);
            g2.drawImage(scaledImage, 4, 4, this);
        }

        super.paintComponent(grphcs);
    }
}

