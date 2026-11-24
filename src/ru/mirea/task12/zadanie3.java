package ru.mirea.task12;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.image.BufferedImage;
import java.io.File;
import javax.imageio.ImageIO;

class Animation extends JFrame {
    BufferedImage[] frames;
    int current = 0;

    public Animation(String path, int frameCount) throws Exception {
        super("Анимация");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        BufferedImage sheet = ImageIO.read(new File(path));

        int w = sheet.getWidth() / frameCount;
        int h = sheet.getHeight();
        frames = new BufferedImage[frameCount];
        for (int i = 0; i < frameCount; i++) {
            frames[i] = sheet.getSubimage(i * w, 0, w, h);
        }
        JPanel panel = new JPanel() {
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                g.drawImage(frames[current], 0, 0, this);
            }
        };
        panel.setPreferredSize(new Dimension(w, h));
        add(panel);

        Timer timer = new Timer(100, new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                current = (current + 1) % frames.length;
                panel.repaint();
            }
        });
        timer.start();

        pack();
        setLocationRelativeTo(null);
    }

    public static void main(String[] args) throws Exception {
        String path = args.length > 0 ? args[0] : "sprite.png";
        int count = args.length > 1 ? Integer.parseInt(args[1]) : 8;
        new Animation(path, count).setVisible(true);
    }
}