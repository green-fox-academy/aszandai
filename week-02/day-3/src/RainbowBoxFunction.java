import javax.swing.*;

import java.awt.*;
import java.util.Random;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class RainbowBoxFunction {
    public static void mainDraw(Graphics graphics) {
        // Create a square drawing function that takes 3 parameters:
        // The square size, the fill color, graphics
        // and draws a square of that size and color to the center of the canvas.
        // Create a loop that fills the canvas with rainbow colored squares (red, orange, yellow, green, blue, indigo, violet).

        int size = 0;
        Color[] colors = {
                new Color(0,0,0),
                new Color(0xe5, 0x00, 0x00),
                new Color(0xf9, 0x73, 0x06),
                new Color(0xff, 0xff, 0x14),
                new Color(0x15, 0xb0, 0x1a),
                new Color(0x03, 0x43, 0xdf),
                new Color(0x38, 0x02, 0x82),
                new Color(0x9a, 0x0e, 0xea)
        };

        for (int i = 0; i < colors.length; i++) {
            graphics.setColor(colors[i]);
            graphics.fillRect(size, size, WIDTH, HEIGHT);
            size = i * (WIDTH / 7);
        }
    }

    // Don't touch the code below
    static int WIDTH = 320;
    static int HEIGHT = 320;

    public static void main(String[] args) {
        JFrame jFrame = new JFrame("Drawing");
        jFrame.setDefaultCloseOperation(EXIT_ON_CLOSE);
        ImagePanel panel = new ImagePanel();
        panel.setPreferredSize(new Dimension(WIDTH, HEIGHT));
        jFrame.add(panel);
        jFrame.setLocationRelativeTo(null);
        jFrame.setVisible(true);
        jFrame.pack();
    }

    static class ImagePanel extends JPanel {
        @Override
        protected void paintComponent(Graphics graphics) {
            super.paintComponent(graphics);
            mainDraw(graphics);
        }
    }
}