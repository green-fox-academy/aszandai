import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class EnvelopeStarV2 {
    public static void mainDraw(Graphics graphics) {
        int zero = 0;
        int mid = HEIGHT / 2;
        int full = HEIGHT;
        int step = full / 40;

        drawEnvelopeStar(graphics, zero, mid, full, step);

    }

    private static void drawEnvelopeStar(Graphics graphics, int zero, int mid, int full, int step) {
        getUpperLeft(graphics, zero, mid, step);
        getBottomLeft(graphics, zero, mid, step);
        getUpperRight(graphics, zero, mid, step);
        getBottomRight(graphics, mid, full, step);
    }

    private static void getBottomRight(Graphics graphics, int mid, int full, int step) {
        for (int i = 0; mid < WIDTH; i++) {
            graphics.setColor(new Color(97, 173, 5));
            graphics.drawLine(WIDTH / 2, full, mid + step, HEIGHT / 2);
            mid += step;
            full -= step;
        }
    }

    private static void getUpperRight(Graphics graphics, int zero, int mid, int step) {
        for (int i = 0; mid < HEIGHT; i++) {
            graphics.setColor(new Color(97, 173, 5));
            graphics.drawLine(zero, HEIGHT / 2, WIDTH / 2, mid + step);
            zero += step;
            mid += step;
        }
    }

    private static void getBottomLeft(Graphics graphics, int zero, int mid, int step) {
        for (int i = 0; mid < WIDTH; i++) {
            graphics.setColor(new Color(97, 173, 5));
            graphics.drawLine(WIDTH / 2, zero, mid + step, HEIGHT / 2);
            mid += step;
            zero += step;
        }
    }

    private static void getUpperLeft(Graphics graphics, int zero, int mid, int step) {
        for (int i = 0; zero < WIDTH / 2; i++) {
            graphics.setColor(new Color(97, 173, 5));
            graphics.drawLine(zero, HEIGHT / 2, WIDTH / 2, mid - step);
            zero += step;
            mid -= step;
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