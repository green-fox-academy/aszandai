import javax.swing.*;

import java.awt.*;
import java.nio.file.WatchEvent;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class Checkerboard {
    public static void mainDraw(Graphics graphics) {
        // Fill the canvas with a checkerboard pattern.

        int size = 40;
        int position1 = 0;
        int position2 = 0;

        for (int i = 0; i < WIDTH; i++) {
            graphics.fillRect(position2, 0, size, size);
            position2 = position2 + (size * 2);

            graphics.fillRect(position1+40, 40, size, size);
            position1 = position2;

            graphics.fillRect(position1-80, 80, size,size);
            graphics.fillRect(position1-40, 120, size, size);
            graphics.fillRect(position1-160, 160, size,size);
            graphics.fillRect(position1-80, 160, size, size);
            graphics.fillRect(position1-200, 200, size,size);
            graphics.fillRect(position1-120, 200, size, size);
            graphics.fillRect(position1-240, 240, size,size);
            graphics.fillRect(position1-160, 240, size, size);
            graphics.fillRect(position1-280, 280, size, size);
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