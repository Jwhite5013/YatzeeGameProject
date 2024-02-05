import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

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
    ImageIcon die1 = new ImageIcon("Images/Images copy 2/dice1.png");
    ImageIcon die2 = new ImageIcon("Images/Images copy 2/Dice2.png");
    ImageIcon die3 = new ImageIcon("Images/Images copy 2/Three.png");
    ImageIcon die4 = new ImageIcon("Images/Images copy 2/Die4.png");
    ImageIcon die5 = new ImageIcon("Images/Images copy 2/side_5_pips.png");
    ImageIcon die6 = new ImageIcon("Images/Images copy 2/images.png");
    JButton dice1 = new JButton("");
    JButton dice2 = new JButton("");
    JButton dice3 = new JButton("");
    JButton dice4 = new JButton("");
    JButton dice5 = new JButton("");
    JLabel image1 = new JLabel();
    JLabel image2 = new JLabel();
    JLabel image3 = new JLabel();
    JLabel image4 = new JLabel();
    JLabel image5 = new JLabel();
    panel.add(label);
        panel.add(image1);
        panel.add(image2);
        panel.add(image3);
        panel.add(image4);
        panel.add(image5);
    panel.add(dice1);
    image1.setBounds(113,315,75,75);
    image2.setBounds(288,315,75,75);
    image3.setBounds(463,315,75,75);
    image4.setBounds(638,315,75,75);
    image5.setBounds(813,315,75,75);
    dice1.setBounds(100,300,100,100);
    dice2.setBounds(275,300,100,100);
    dice3.setBounds(450,300,100,100);
    dice4.setBounds(625,300,100,100);
    dice5.setBounds(800,300,100,100);
    panel.add(dice2);
    panel.add(dice3);
    panel.add(dice4);
    panel.add(dice5);
    panel.add(roll);
    roll.setBounds(0,frame.getHeight()-350,frame.getWidth(),100);
    frame.add(panel);
    frame.setVisible(true);
    roll.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            int dieRoll1 = (int)(Math.random()*6)+1;
            int dieRoll2 = (int)(Math.random()*6)+1;
            int dieRoll3 = (int)(Math.random()*6)+1;
            int dieRoll4 = (int)(Math.random()*6)+1;
            int dieRoll5 = (int)(Math.random()*6)+1;
            if(dieRoll1==1){
            dice1.setIcon(die1);
            } else if(dieRoll1==2){
                dice1.setIcon(die2);
            }else if(dieRoll1==3){
                dice1.setIcon(die3);
            }else if(dieRoll1 == 4){
                dice1.setIcon(die4);
            }else if(dieRoll1==5){
                dice1.setIcon(die5);
            }else if(dieRoll1==6){
                dice1.setIcon(die6);
            }
            if(dieRoll2==1){
                dice2.setIcon(die1);
            } else if(dieRoll2==2){
                dice2.setIcon(die2);
            }else if(dieRoll2==3){
                dice2.setIcon(die3);
            }else if(dieRoll2 == 4){
                dice2.setIcon(die4);
            }else if(dieRoll2==5){
                dice2.setIcon(die5);
            }else if(dieRoll2==6){
                dice2.setIcon(die6);
            }
            if(dieRoll3==1){
                dice3.setIcon(die1);
            } else if(dieRoll3==2){
                dice3.setIcon(die2);
            }else if(dieRoll3==3){
                dice3.setIcon(die3);
            }else if(dieRoll3 == 4){
                dice3.setIcon(die4);
            }else if(dieRoll3==5){
                dice3.setIcon(die5);
            }else if(dieRoll3==6){
                dice3.setIcon(die6);
            }
            if(dieRoll4==1){
                dice4.setIcon(die1);
            } else if(dieRoll4==2){
                dice4.setIcon(die2);
            }else if(dieRoll4==3){
                dice4.setIcon(die3);
            }else if(dieRoll4 == 4){
                dice4.setIcon(die4);
            }else if(dieRoll4==5){
                dice4.setIcon(die5);
            }else if(dieRoll4==6){
                dice4.setIcon(die6);
            }
            if(dieRoll5==1){
                dice5.setIcon(die1);
            } else if(dieRoll5==2){
                dice5.setIcon(die2);
            }else if(dieRoll5==3){
                dice5.setIcon(die3);
            }else if(dieRoll5 == 4){
                dice5.setIcon(die4);
            }else if(dieRoll5==5){
                dice5.setIcon(die5);
            }else if(dieRoll5==6){
                dice5.setIcon(die6);
            }
        }
    });
    }
}