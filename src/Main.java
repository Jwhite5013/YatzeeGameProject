import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {

   static int countRolls = 0;
   static boolean saveDie1 = false;
    static boolean saveDie2 = false;
    static boolean saveDie3 = false;
   static boolean saveDie4 = false;
    static boolean saveDie5 = false;
    public static void main(String[] args) {

        JFrame frame = new JFrame();
    frame.setSize(1000,1000);
    JPanel panel = new JPanel();
    panel.setLayout(null);
    JButton computer1 = new JButton("1 Computer");
        JButton computer2 = new JButton("2 Computers");
        JButton computer3 = new JButton("3 Computers");
        JButton noComputer = new JButton("No Computers");

    JLabel label = new JLabel("Welcome to Yahtzee! How many computers are you going to play against?");
    JButton roll = new JButton("Roll");
    ImageIcon die1 = new ImageIcon("Images/Images copy 2/dice1.png");
    die1.setImage(die1.getImage().getScaledInstance(75,75,Image.SCALE_DEFAULT));
    ImageIcon die2 = new ImageIcon("Images/Images copy 2/Dice2.png");
        die2.setImage(die2.getImage().getScaledInstance(75,75,Image.SCALE_DEFAULT));
    ImageIcon die3 = new ImageIcon("Images/Images copy 2/Three.png");
        die3.setImage(die3.getImage().getScaledInstance(75,75,Image.SCALE_DEFAULT));
    ImageIcon die4 = new ImageIcon("Images/Images copy 2/Die4.jpeg");
        die4.setImage(die4.getImage().getScaledInstance(75,75,Image.SCALE_DEFAULT));
    ImageIcon die5 = new ImageIcon("Images/Images copy 2/side_5_pips.png");
        die5.setImage(die5.getImage().getScaledInstance(75,75,Image.SCALE_DEFAULT));
    ImageIcon die6 = new ImageIcon("Images/Images copy 2/images.png");
        die6.setImage(die6.getImage().getScaledInstance(75,75,Image.SCALE_DEFAULT));
JButton score = new JButton("Score this roll");
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
    panel.add(computer1);
    panel.add(computer2);
    panel.add(computer3);
    panel.add(noComputer);
    noComputer.setBounds(751,500,250,100);
    computer3.setBounds(501,500,250,100);
    computer2.setBounds(251,500,250,100);
    computer1.setBounds(0,500,250,100);
        panel.add(image1);
        panel.add(image2);
        panel.add(image3);
        panel.add(image4);
        panel.add(image5);

    panel.add(dice1);
    panel.add(score);
    score.setBounds(0,frame.getHeight()-400, frame.getWidth(), 50);
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
    panel.add(label);
    dice1.setVisible(false);
        dice5.setVisible(false);
        dice4.setVisible(false);
        dice2.setVisible(false);
        dice3.setVisible(false);

    roll.setVisible(false);
    score.setVisible(false);

    label.setBounds(300,100,500,100);
    roll.setBounds(0,frame.getHeight()-350,frame.getWidth(),100);
    frame.add(panel);

    frame.setVisible(true);
    roll.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            if(countRolls <=2) {
                int dieRoll1 = (int) (Math.random() * 6) + 1;
                int dieRoll2 = (int) (Math.random() * 6) + 1;
                int dieRoll3 = (int) (Math.random() * 6) + 1;
                int dieRoll4 = (int) (Math.random() * 6) + 1;
                int dieRoll5 = (int) (Math.random() * 6) + 1;
                if (dieRoll1 == 1 && saveDie1 == false) {
                    image1.setIcon(die1);
                } else if (dieRoll1 == 2 & saveDie1 == false) {
                    image1.setIcon(die2);
                } else if (dieRoll1 == 3 & saveDie1 == false) {
                    image1.setIcon(die3);
                } else if (dieRoll1 == 4 & saveDie1 == false) {
                    image1.setIcon(die4);
                } else if (dieRoll1 == 5 & saveDie1 == false) {
                    image1.setIcon(die5);
                } else if (dieRoll1 == 6 & saveDie1 == false) {
                    image1.setIcon(die6);
                }
                if (dieRoll2 == 1 && saveDie2 == false) {
                    image2.setIcon(die1);
                } else if (dieRoll2 == 2 && saveDie2 == false) {
                    image2.setIcon(die2);
                } else if (dieRoll2 == 3 && saveDie2 == false) {
                    image2.setIcon(die3);
                } else if (dieRoll2 == 4 && saveDie2 == false) {
                    image2.setIcon(die4);
                } else if (dieRoll2 == 5 && saveDie2 == false) {
                    image2.setIcon(die5);
                } else if (dieRoll2 == 6 && saveDie2 == false) {
                    image2.setIcon(die6);
                }
                if (dieRoll3 == 1 && saveDie3 == false) {
                    image3.setIcon(die1);
                } else if (dieRoll3 == 2 && saveDie3 == false) {
                    image3.setIcon(die2);
                } else if (dieRoll3 == 3 && saveDie3 == false) {
                    image3.setIcon(die3);
                } else if (dieRoll3 == 4 && saveDie3 == false) {
                    image3.setIcon(die4);
                } else if (dieRoll3 == 5 && saveDie3 == false) {
                    image3.setIcon(die5);
                } else if (dieRoll3 == 6 && saveDie3 == false) {
                    image3.setIcon(die6);
                }
                if (dieRoll4 == 1 && saveDie4 == false) {
                    image4.setIcon(die1);
                } else if (dieRoll4 == 2 && saveDie4 == false) {
                    image4.setIcon(die2);
                } else if (dieRoll4 == 3 && saveDie4 == false) {
                    image4.setIcon(die3);
                } else if (dieRoll4 == 4 && saveDie4 == false) {
                    image4.setIcon(die4);
                } else if (dieRoll4 == 5 && saveDie4 == false) {
                    image4.setIcon(die5);
                } else if (dieRoll4 == 6 && saveDie4 == false) {
                    image4.setIcon(die6);
                }
                if (dieRoll5 == 1 && saveDie5 == false) {
                    image5.setIcon(die1);
                } else if (dieRoll5 == 2 && saveDie5 == false) {
                    image5.setIcon(die2);
                } else if (dieRoll5 == 3 && saveDie5 == false) {
                    image5.setIcon(die3);
                } else if (dieRoll5 == 4 && saveDie5 == false) {
                    image5.setIcon(die4);
                } else if (dieRoll5 == 5 && saveDie5 == false) {
                    image5.setIcon(die5);
                } else if (dieRoll5 == 6 && saveDie5 == false) {
                    image5.setIcon(die6);
                }
                Main.countRolls++;
            }else{
label.setText("You ran out of Rolls. You must play this roll");
            }
        }
    });
    dice1.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {



        }
    });
    //hahahah
    }
}