import javax.swing.*;
import java.awt.*;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
    frame.setSize(1000,1000);
GridLayout card = new GridLayout(5,3);
    JPanel panel = new JPanel();
    panel.setLayout(card);

    JLabel label = new JLabel("Hello");
    JButton roll = new JButton("Roll");

    panel.add(label);
    panel.add(roll);
    frame.add(panel);
    frame.setVisible(true);

    }
}