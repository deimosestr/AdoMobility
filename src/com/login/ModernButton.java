package com.login;

import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.*;

public class ModernButton extends JButton {
    private Color baseBackgroundColor;   // Color base
    private Color baseForegroundColor;  // Color de texto base
    private Color hoverBackgroundColor; // Color de fondo al pasar el mouse
    private Color hoverForegroundColor; // Color de texto al pasar el mouse
    private Color clickBackgroundColor; // Color de fondo al hacer clic
    private Color clickForegroundColor; // Color de texto al hacer clic
    private boolean isHovered = false;

    public ModernButton() {
        super("Button");
        setFont(new Font("ROBOTO", Font.BOLD, 14));
        setFocusPainted(false);
        setContentAreaFilled(false);
        setBorderPainted(false);
        setHorizontalAlignment(SwingConstants.CENTER);

        // Configuración inicial
        baseBackgroundColor = Color.decode("#D2BAD9");
        baseForegroundColor = Color.BLACK;
        hoverBackgroundColor = Color.decode("#733268");
        hoverForegroundColor = Color.decode("#FFFFFF");
        clickBackgroundColor = Color.decode("#592E52");
        clickForegroundColor = Color.WHITE;

        setBackground(baseBackgroundColor);
        setForeground(baseForegroundColor);

        // Listener para animación
        addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                isHovered = true;
                setBackground(hoverBackgroundColor);
                setForeground(hoverForegroundColor);
                repaint();
            }

            @Override
            public void mouseExited(MouseEvent e) {
                isHovered = false;
                setBackground(baseBackgroundColor);
                setForeground(baseForegroundColor);
                repaint();
            }

            @Override
            public void mousePressed(MouseEvent e) {
                setBackground(clickBackgroundColor);
                setForeground(clickForegroundColor);
                repaint();
            }

            @Override
            public void mouseReleased(MouseEvent e) {
                if (isHovered) {
                    setBackground(hoverBackgroundColor);
                    setForeground(hoverForegroundColor);
                } else {
                    setBackground(baseBackgroundColor);
                    setForeground(baseForegroundColor);
                }
                repaint();
            }
        });
    }

    @Override
    protected void paintComponent(Graphics g) {
        Graphics2D g2 = (Graphics2D) g;
        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);

        // Dibujar el fondo redondeado
        g2.setColor(getBackground());
        g2.fillRoundRect(0, 0, getWidth(), getHeight(), 15, 15);

        super.paintComponent(g);
    }

    // Métodos para personalizar colores desde el editor visual
    public void setBaseBackgroundColor(Color color) {
        baseBackgroundColor = color;
        setBackground(color);
    }

    public void setBaseForegroundColor(Color color) {
        baseForegroundColor = color;
        setForeground(color);
    }

    public void setHoverBackgroundColor(Color color) {
        hoverBackgroundColor = color;
    }

    public void setHoverForegroundColor(Color color) {
        hoverForegroundColor = color;
    }

    public void setClickBackgroundColor(Color color) {
        clickBackgroundColor = color;
    }

    public void setClickForegroundColor(Color color) {
        clickForegroundColor = color;
    }
}
