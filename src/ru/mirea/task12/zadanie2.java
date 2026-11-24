package ru.mirea.task12;

import javax.swing.*;
import java.awt.*;

class ImageWindow extends JFrame {

    public ImageWindow(String path) {
        super("Картинка: " + path);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        ImageIcon icon = new ImageIcon(path);

        if (icon.getIconWidth() <= 0) {
            JOptionPane.showMessageDialog(null,
                    "Не удалось загрузить картинку: " + path,
                    "Ошибка", JOptionPane.ERROR_MESSAGE);
            System.exit(1);
        }

        JLabel label = new JLabel(icon);
        add(label, BorderLayout.CENTER);

        pack();
        setLocationRelativeTo(null);
    }

    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("Укажите путь к картинке: java ImageWindow <путь>");
            return;
        }
        new ImageWindow(args[0]).setVisible(true);
    }
}