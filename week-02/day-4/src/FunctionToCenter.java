import javax.swing.*;

import java.awt.*;
import java.nio.file.WatchEvent;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class FunctionToCenter {
    public static void mainDraw(Graphics graphics) {
        // Create a function that draws a single line and takes 3 parameters:
        // The x and y coordinates of the line's starting point and the graphics
        // and draws a line from that point to the center of the canvas.
        // Fill the canvas with lines from the edges, every 20 px, to the center.

        int center = WIDTH / 2;
        int x = 0;
        int y = 0;
        int refill = HEIGHT;

        // In pairs, both set of functions are working and showing the expected results
        // Diagonal half - left and bottom
//        for (int i = 0; i <= (HEIGHT / 20); i++) {
//            graphics.drawLine(center, middleY, x, y);
//            y = y + 20;
//        }
//        for (int i = 0; i <= (WIDTH / 20); i++) {
//            graphics.drawLine(center, middleY, x, HEIGHT);
//            x = x + 20;
//        }
//        // Diagonal half - right and upper
//        for (int i = 0; i <= (320 / 20); i++) {
//            graphics.drawLine(center, middleY, x, y);
//            x = x + 20;
//        }
//        for (int i = 0; i <= (320 / 20); i++) {
//            graphics.drawLine(center, middleY, WIDTH, y);
//            y = y + 20;
//        }


        for (int i = 0; i < (WIDTH / 20); i++) {
            graphics.drawLine(center, center, x, y);
            y = y + 20;
        }
        for (int i = 0; i < (HEIGHT / 20); i++) {
            graphics.drawLine(center, center, x, HEIGHT);
            x = x + 20;
        }
        // Width refresh. When the loop finishes, the value will be 0.
        WIDTH = refill;
        for (int j = 0; j < (WIDTH / 20); j++) {
            graphics.drawLine(center, center, WIDTH, HEIGHT);
            HEIGHT = HEIGHT - 20;
        }

        // Height refresh. When the loop finishes, the value will be 0.
        HEIGHT = refill;
        for (int j = 0; j < (HEIGHT / 20); j++) {
            graphics.drawLine(center, center, WIDTH, 0);
            WIDTH = WIDTH - 20;
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