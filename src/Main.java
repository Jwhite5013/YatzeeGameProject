import javax.swing.*;
import java.awt.*;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
    frame.setSize(1000,1000);
    JPanel panel = new JPanel();
    panel.setLayout(null);
    JLabel label = new JLabel("Hello");
    JButton roll = new JButton("Roll");
    panel.add(label);
    panel.add(roll);
    roll.setBounds(0,frame.getHeight()-350,frame.getWidth(),100);
    frame.add(panel);
    frame.setVisible(true);

    }
}