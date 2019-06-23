package sda.com.Swing;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SwingMain {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            JFrame frame = new JFrame("My first Swing app ");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.add(new JLabel("Hello World"));
            frame.add(new JLabel("Hello World2"));
            frame.add(new JLabel("Hello World3"));
            frame.add(new JLabel("Hello World4"));
            frame.setLayout(new GridLayout(2, 2));
            frame.setMinimumSize(new Dimension(100, 200));
            JButton button = new JButton("close");
            frame.add(button);
            button.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    frame.add(new JCheckBox());
                }
            });

            frame.setVisible(true);
        });
    }
}
