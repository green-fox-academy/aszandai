import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class EnvelopeStar {
    public static void mainDraw(Graphics graphics) {
        int zero = 0;
        int mid = 160;
        int full = 320;
        int step = full / 40;

        for (int i = 0; zero < WIDTH / 2; i++) {
            graphics.setColor(new Color(97, 173, 5));
            graphics.drawLine(zero, HEIGHT / 2, WIDTH / 2, mid - step);
            zero += step;
            mid -= step;
        }

        zero = 0;
        mid = 160;

        for (int i = 0; mid < WIDTH; i++) {
            graphics.setColor(new Color(97, 173, 5));
            graphics.drawLine(WIDTH / 2, zero, mid + step, HEIGHT / 2);
            mid += step;
            zero += step;
        }

        zero = 0;
        mid = 160;

        for (int i = 0; mid < HEIGHT; i++) {
            graphics.setColor(new Color(97, 173, 5));
            graphics.drawLine(zero, HEIGHT / 2, WIDTH / 2, mid + step);
            zero += step;
            mid += step;
        }

        mid = 160;
        full = 320;

        for (int i = 0; mid < WIDTH; i++) {
            graphics.setColor(new Color(97, 173, 5));
            graphics.drawLine(WIDTH / 2, full, mid + step, HEIGHT / 2);
            mid += step;
            full -= step;
        }

//        int step = 320 / 40;
//        int x1 = 0;
//        int y1 = 160;
//        int x2 = 160;
//        int y2 = 0;
//        int x3 = 0;
//        int y3 = 160;
//        int x4 = 160;
//        int y4 = 320;
//
//        for (int i = 0; x1 < WIDTH / 2; i++) {
//            graphics.setColor(new Color(97, 173, 5));
//            graphics.drawLine(x1, HEIGHT / 2, WIDTH / 2, y1 - step);
//            x1 += step;
//            y1 -= step;
//        }
//
//        for (int i = 0; x2 < WIDTH; i++) {
//            graphics.setColor(new Color(97, 173, 5));
//            graphics.drawLine(WIDTH / 2, y2, x2 + step, HEIGHT / 2);
//            x2 += step;
//            y2 += step;
//        }
//
//        for (int i = 0; y3 < HEIGHT; i++) {
//            graphics.setColor(new Color(97, 173, 5));
//            graphics.drawLine(x3, HEIGHT / 2, WIDTH / 2, y3 + step);
//            x3 += step;
//            y3 += step;
//        }
//
//        for (int i = 0; x4 < WIDTH; i++) {
//            graphics.setColor(new Color(97, 173, 5));
//            graphics.drawLine(WIDTH / 2, y4, x4 + step, HEIGHT / 2);
//            x4 += step;
//            y4 -= step;
//        }
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