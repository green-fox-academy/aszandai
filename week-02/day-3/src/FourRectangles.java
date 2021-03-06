import javax.swing.*;

import java.awt.*;
import java.util.Random;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class FourRectangles {

    public static void mainDraw(Graphics graphics) {
        // draw four different size and color rectangles.
        // avoid code duplication.

        Random random = new Random();
        int x1 = random.nextInt(WIDTH);
        int y1 = random.nextInt(HEIGHT);
        int sizeW = random.nextInt(50);
        int sizeH = random.nextInt(50);

        int counter = 1;

        while (counter <= 4) {
            int red = random.nextInt(256);
            int green = random.nextInt(256);
            int blue = random.nextInt(256);
            graphics.setColor(new Color(red, green, blue));
            graphics.drawRect(x1, y1, sizeW, sizeH);
            x1 = random.nextInt(WIDTH);
            y1 = random.nextInt(HEIGHT);
            sizeW = random.nextInt(50);
            sizeH = random.nextInt(50);
            counter++;
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