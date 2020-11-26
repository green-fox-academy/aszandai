import javax.swing.*;

import java.awt.*;
import java.util.Random;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class StarryNight {
    public static void mainDraw(Graphics graphics) {
        // Draw the night sky:
        //  - The background should be black
        //  - The stars can be small squares
        //  - The stars should have random positions on the canvas
        //  - The stars should have random color (some shade of grey)

        Random random = new Random();
        int starNumber = random.nextInt(100);
        int counter = 1;
        Color[] colorGray = {
                new Color(220, 220, 220),
                new Color(211, 211, 211),
                new Color(192, 192, 192),
                new Color(169, 169, 169),
                new Color(128, 128, 128),
                new Color(105, 105, 105),
                new Color(119, 136, 153),
                new Color(112, 128, 144),
                new Color(47, 79, 79)
        };

        for (int i = 0; i < starNumber; i++) {
            int randomGray = random.nextInt(colorGray.length);
            graphics.setColor(colorGray[randomGray]);
            int x1 = random.nextInt(WIDTH);
            int y1 = random.nextInt(HEIGHT);
            int size = random.nextInt(5);
            graphics.fillRect(x1, y1, size, size);
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
            setBackground(Color.BLACK);
        }
    }
}