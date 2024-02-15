import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    static int finalScore = 0;
    static int onesScore = 0;
    static int twosScore = 0;
    static int threesScore = 0;
    static int foursScore = 0;
    static int fivesScore = 0;
    static int sixesScore = 0;
 static int threeOfAKindScore = 0;
    static int countRolls = 0;
    static boolean saveDie1 = false;
    static boolean saveDie2 = false;
    static boolean saveDie3 = false;
    static boolean saveDie4 = false;
    static boolean saveDie5 = false;
    static int saveDie1Num;
    static int saveDie2Num;
    static int saveDie3Num;
    static int saveDie4Num;
    static int saveDie5Num;
    static boolean onesPlayed = false;
    static boolean twosPlayed = false;
    static boolean threesPlayed = false;
    static boolean foursPlayed = false;
    static boolean fivesPlayed = false;
    static boolean sixesPlayed = false;
    static boolean threeOfAKindPlayed = false;
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
        //Images set
        ImageIcon blank = new ImageIcon("Images/Images copy 2/Blank.png");
        blank.setImage(blank.getImage().getScaledInstance(75,75,Image.SCALE_DEFAULT));
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
//button for all the dice
        JButton dice1 = new JButton("");
        JButton dice2 = new JButton("");
        JButton dice3 = new JButton("");
        JButton dice4 = new JButton("");
        JButton dice5 = new JButton("");

        JButton ones = new JButton("Ones");
        JButton twos = new JButton("Twos");
        JButton threes = new JButton("Threes");
        JButton fours = new JButton("Fours");
        JButton fives = new JButton("Fives");
        JButton sixes = new JButton("Sixes");
        JButton threeOfAKind = new JButton("Three of a Kind");


        panel.add(label);
        panel.add(computer1);
        panel.add(computer2);
        panel.add(computer3);
        panel.add(noComputer);
        noComputer.setBounds(751,500,250,100);
        computer3.setBounds(501,500,250,100);
        computer2.setBounds(251,500,250,100);
        computer1.setBounds(0,500,250,100);


        panel.add(dice1);
        panel.add(score);
        score.setBounds(0,frame.getHeight()-400, frame.getWidth(), 50);
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
        panel.add(ones);
        ones.setBounds(0,500,175,100);
        ones.setVisible(false);
        panel.add(twos);
        twos.setBounds(176,500,175,100);
        twos.setVisible(false);
        panel.add(threes);
        threes.setBounds(351,500,175,100);
        threes.setVisible(false);
        panel.add(fours);
        fours.setBounds(526,500,175,100);
        fours.setVisible(false);
        panel.add(fives);
        fives.setBounds(700,500,175,100);
        fives.setVisible(false);
        panel.add(sixes);
        sixes.setBounds(876,500,125,100);
        sixes.setVisible(false);
        panel.add(threeOfAKind);
        threeOfAKind.setBounds(0,650,175,100);
        threeOfAKind.setVisible(false);

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
                if (countRolls <= 2) {
                    int dieRoll1 = (int) (Math.random() * 6) + 1;
                    int dieRoll2 = (int) (Math.random() * 6) + 1;
                    int dieRoll3 = (int) (Math.random() * 6) + 1;
                    int dieRoll4 = (int) (Math.random() * 6) + 1;
                    int dieRoll5 = (int) (Math.random() * 6) + 1;
                    if (dieRoll1 == 1 && saveDie1 == false) {
                        dice1.setIcon(die1);
                        Main.saveDie1Num = dieRoll1;
                    } else if (dieRoll1 == 2 & saveDie1 == false) {
                        dice1.setIcon(die2);
                        Main.saveDie1Num = dieRoll1;
                    } else if (dieRoll1 == 3 & saveDie1 == false) {
                        dice1.setIcon(die3);
                        Main.saveDie1Num = dieRoll1;
                    } else if (dieRoll1 == 4 & saveDie1 == false) {
                        dice1.setIcon(die4);
                        Main.saveDie1Num = dieRoll1;
                    } else if (dieRoll1 == 5 & saveDie1 == false) {
                        dice1.setIcon(die5);
                        Main.saveDie1Num = dieRoll1;
                    } else if (dieRoll1 == 6 & saveDie1 == false) {
                        dice1.setIcon(die6);
                        Main.saveDie1Num = dieRoll1;
                    }
                    if (dieRoll2 == 1 && saveDie2 == false) {
                        dice2.setIcon(die1);
                        Main.saveDie2Num = dieRoll2;
                    } else if (dieRoll2 == 2 && saveDie2 == false) {
                        dice2.setIcon(die2);
                        Main.saveDie2Num = dieRoll2;
                    } else if (dieRoll2 == 3 && saveDie2 == false) {
                        dice2.setIcon(die3);
                        Main.saveDie2Num = dieRoll2;
                    } else if (dieRoll2 == 4 && saveDie2 == false) {
                        dice2.setIcon(die4);
                        Main.saveDie2Num = dieRoll2;
                    } else if (dieRoll2 == 5 && saveDie2 == false) {
                        dice2.setIcon(die5);
                        Main.saveDie2Num = dieRoll2;
                    } else if (dieRoll2 == 6 && saveDie2 == false) {
                        dice2.setIcon(die6);
                        Main.saveDie2Num = dieRoll2;
                    }
                    if (dieRoll3 == 1 && saveDie3 == false) {
                        dice3.setIcon(die1);
                        Main.saveDie3Num = dieRoll3;
                    } else if (dieRoll3 == 2 && saveDie3 == false) {
                        dice3.setIcon(die2);
                        Main.saveDie3Num = dieRoll3;
                    } else if (dieRoll3 == 3 && saveDie3 == false) {
                        dice3.setIcon(die3);
                        Main.saveDie3Num = dieRoll3;
                    } else if (dieRoll3 == 4 && saveDie3 == false) {
                        dice3.setIcon(die4);
                        Main.saveDie3Num = dieRoll3;
                    } else if (dieRoll3 == 5 && saveDie3 == false) {
                        dice3.setIcon(die5);
                        Main.saveDie3Num = dieRoll3;
                    } else if (dieRoll3 == 6 && saveDie3 == false) {
                        dice3.setIcon(die6);
                        Main.saveDie3Num = dieRoll3;
                    }
                    if (dieRoll4 == 1 && saveDie4 == false) {
                        dice4.setIcon(die1);
                        Main.saveDie4Num = dieRoll4;
                    } else if (dieRoll4 == 2 && saveDie4 == false) {
                        dice4.setIcon(die2);
                        Main.saveDie4Num = dieRoll4;
                    } else if (dieRoll4 == 3 && saveDie4 == false) {
                        dice4.setIcon(die3);
                        Main.saveDie4Num = dieRoll4;
                    } else if (dieRoll4 == 4 && saveDie4 == false) {
                        dice4.setIcon(die4);
                        Main.saveDie4Num = dieRoll4;
                    } else if (dieRoll4 == 5 && saveDie4 == false) {
                        dice4.setIcon(die5);
                        Main.saveDie4Num = dieRoll4;
                    } else if (dieRoll4 == 6 && saveDie4 == false) {
                        dice4.setIcon(die6);
                        Main.saveDie4Num = dieRoll4;
                    }
                    if (dieRoll5 == 1 && saveDie5 == false) {
                        dice5.setIcon(die1);
                        Main.saveDie5Num = dieRoll5;
                    } else if (dieRoll5 == 2 && saveDie5 == false) {
                        dice5.setIcon(die2);
                        Main.saveDie5Num = dieRoll5;
                    } else if (dieRoll5 == 3 && saveDie5 == false) {
                        dice5.setIcon(die3);
                        Main.saveDie5Num = dieRoll5;
                    } else if (dieRoll5 == 4 && saveDie5 == false) {
                        dice5.setIcon(die4);
                        Main.saveDie5Num = dieRoll5;
                    } else if (dieRoll5 == 5 && saveDie5 == false) {
                        dice5.setIcon(die5);
                        Main.saveDie5Num = dieRoll5;
                    } else if (dieRoll5 == 6 && saveDie5 == false) {
                        dice5.setIcon(die6);
                        Main.saveDie5Num = dieRoll5;
                    }
                    Main.countRolls++;
                } else {
                    label.setText("You ran out of Rolls. You must play this roll");
                }
            }
        });
        dice1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(saveDie1==false) {
                    label.setText("You saved the first die");
                    Main.saveDie1 = true;
                }else{
                    label.setText("You unsaved the first die");
                    Main.saveDie1 = false;
                }

            }
        });
        dice2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(saveDie2==false) {
                    label.setText("You saved the second die");
                    Main.saveDie2 = true;
                }else{
                    label.setText("You unsaved the second die");
                    Main.saveDie2 = false;
                }
            }
        });
        dice3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(saveDie3==false) {
                    label.setText("You saved the third die");
                    Main.saveDie3 = true;
                }else{
                    label.setText("You unsaved the third die");
                    Main.saveDie3 = false;
                }
            }
        });
        dice4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(saveDie4==false) {
                    label.setText("You saved the forth die");
                    Main.saveDie4 = true;
                }else{
                    label.setText("You unsaved the forth die");
                    Main.saveDie4 = false;
                }
            }
        });
        dice5.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(saveDie5==false) {
                    label.setText("You saved the fifth die");
                    Main.saveDie5 = true;
                }else{
                    label.setText("You unsaved the fifth die");
                    Main.saveDie5 = false;
                }
            }
        });
        computer1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dice1.setVisible(true);
                dice5.setVisible(true);
                dice4.setVisible(true);
                dice2.setVisible(true);
                dice3.setVisible(true);
                roll.setVisible(true);
                score.setVisible(true);
                computer1.setVisible(false);
                computer2.setVisible(false);
                computer3.setVisible(false);
                noComputer.setVisible(false);
                label.setText("Your turn to roll");
            }
        });
        computer2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dice1.setVisible(true);
                dice5.setVisible(true);
                dice4.setVisible(true);
                dice2.setVisible(true);
                dice3.setVisible(true);
                roll.setVisible(true);
                score.setVisible(true);
                computer1.setVisible(false);
                computer2.setVisible(false);
                computer3.setVisible(false);
                noComputer.setVisible(false);
                label.setText("Your turn to roll");
            }
        });
        computer3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dice1.setVisible(true);
                dice5.setVisible(true);
                dice4.setVisible(true);
                dice2.setVisible(true);
                dice3.setVisible(true);
                roll.setVisible(true);
                score.setVisible(true);
                computer1.setVisible(false);
                computer2.setVisible(false);
                computer3.setVisible(false);
                noComputer.setVisible(false);
                label.setText("Your turn to roll");
            }
        });
        noComputer.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dice1.setVisible(true);
                dice5.setVisible(true);
                dice4.setVisible(true);
                dice2.setVisible(true);
                dice3.setVisible(true);
                roll.setVisible(true);
                score.setVisible(true);
                computer1.setVisible(false);
                computer2.setVisible(false);
                computer3.setVisible(false);
                noComputer.setVisible(false);
                label.setText("Your turn to roll");
            }
        });
        score.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                label.setText("What would you like to play");
                roll.setVisible(false);
                score.setVisible(false);
                if (onesPlayed == false) {
                    ones.setVisible(true);
                }
                if(twosPlayed == false) {
                    twos.setVisible(true);
                }
                if(threesPlayed == false){
                    threes.setVisible(true);
                }
                if(foursPlayed == false){
                    fours.setVisible(true);
                }
                if(fivesPlayed == false){
                    fives.setVisible(true);
                }
                if(sixesPlayed==false){
                    sixes.setVisible(true);
                }
                if(threeOfAKindPlayed==false){
                    threeOfAKind.setVisible(true);
                }
            }
        });
        ones.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Main.onesPlayed = true;
                Main.countRolls = 0;
                if(saveDie1Num==1){
                    Main.onesScore += Main.saveDie1Num;
                }
                if(saveDie2Num==1){
                    Main.onesScore += Main.saveDie2Num;
                }
                if(saveDie3Num==1){
                    Main.onesScore += Main.saveDie3Num;
                }
                if(saveDie4Num==1){
                    Main.onesScore += Main.saveDie4Num;
                }
                if(saveDie5Num==1){
                    Main.onesScore += Main.saveDie5Num;
                }

                Main.finalScore = onesScore;
                Main.countRolls = 0;
                dice1.setIcon(blank);
                Main.saveDie1 = false;
                dice2.setIcon(blank);
                Main.saveDie2= false;
                dice3.setIcon(blank);
                Main.saveDie3 = false;
                dice4.setIcon(blank);
                Main.saveDie4 = false;
                dice5.setIcon(blank);
                Main.saveDie5= false;
                if(onesPlayed&&twosPlayed&&threesPlayed&&foursPlayed&&fivesPlayed&&sixesPlayed) {
                    int topBonusCheck = onesScore+twosScore+threesScore+foursScore+fivesScore+sixesScore;
                    if (topBonusCheck >= 63) {
                        Main.finalScore += 35;
                    }
                }
                if (onesPlayed && twosPlayed && threesPlayed && foursPlayed && fivesPlayed && sixesPlayed && threeOfAKindPlayed) {
                    label.setText("GAME OVER!\nYour Final score is: " + finalScore + " points!");
                    ones.setVisible(false);
                    twos.setVisible(false);
                    threes.setVisible(false);
                    fours.setVisible(false);
                    fives.setVisible(false);
                    sixes.setVisible(false);
                    threeOfAKind.setVisible(false);
                    dice1.setVisible(false);
                    dice2.setVisible(false);
                    dice3.setVisible(false);
                    dice4.setVisible(false);
                    dice5.setVisible(false);
                } else {
                    roll.setVisible(true);
                    score.setVisible(true);
                    ones.setVisible(false);
                    twos.setVisible(false);
                    threes.setVisible(false);
                    fours.setVisible(false);
                    fives.setVisible(false);
                    sixes.setVisible(false);
                    threeOfAKind.setVisible(false);
                }
            }
        });
        twos.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Main.twosPlayed = true;

                if(saveDie1Num==2){
                    Main.twosScore += Main.saveDie1Num;
                }
                if(saveDie2Num==2){
                    Main.twosScore += Main.saveDie2Num;
                }
                if(saveDie3Num==2){
                    Main.twosScore += Main.saveDie3Num;
                }
                if(saveDie4Num==2){
                    Main.twosScore += Main.saveDie4Num;
                }
                if(saveDie5Num==2){
                    Main.twosScore += Main.saveDie5Num;
                }
                Main.finalScore = twosScore;
                Main.countRolls = 0;
                dice1.setIcon(blank);
                Main.saveDie1 = false;
                dice2.setIcon(blank);
                Main.saveDie2= false;
                dice3.setIcon(blank);
                Main.saveDie3 = false;
                dice4.setIcon(blank);
                Main.saveDie4 = false;
                dice5.setIcon(blank);
                Main.saveDie5= false;
                if(onesPlayed&&twosPlayed&&threesPlayed&&foursPlayed&&fivesPlayed&&sixesPlayed) {
                    int topBonusCheck = onesScore+twosScore+threesScore+foursScore+fivesScore+sixesScore;
                    if (topBonusCheck >= 63) {
                        Main.finalScore += 35;
                    }
                }
                if (onesPlayed && twosPlayed && threesPlayed && foursPlayed && fivesPlayed && sixesPlayed && threeOfAKindPlayed) {
                    label.setText("GAME OVER!\nYour Final score is: " + finalScore + " points!");
                    ones.setVisible(false);
                    twos.setVisible(false);
                    threes.setVisible(false);
                    fours.setVisible(false);
                    fives.setVisible(false);
                    sixes.setVisible(false);
                    threeOfAKind.setVisible(false);
                    dice1.setVisible(false);
                    dice2.setVisible(false);
                    dice3.setVisible(false);
                    dice4.setVisible(false);
                    dice5.setVisible(false);
                } else {
                    roll.setVisible(true);
                    score.setVisible(true);
                    ones.setVisible(false);
                    twos.setVisible(false);
                    threes.setVisible(false);
                    fours.setVisible(false);
                    fives.setVisible(false);
                    sixes.setVisible(false);
                    threeOfAKind.setVisible(false);
                }
            }
        });
        threes.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Main.threesPlayed = true;
                Main.countRolls = 0;

                if (saveDie1Num == 3) {
                    Main.threesScore += Main.saveDie1Num;
                }
                if (saveDie2Num == 3) {
                    Main.threesScore += Main.saveDie2Num;
                }
                if (saveDie3Num == 3) {
                    Main.threesScore += Main.saveDie3Num;
                }
                if (saveDie4Num == 3) {
                    Main.threesScore += Main.saveDie4Num;
                }
                if (saveDie5Num == 3) {
                    Main.threesScore += Main.saveDie5Num;
                }
                Main.finalScore = threesScore;
                Main.countRolls = 0;
                dice1.setIcon(blank);
                Main.saveDie1 = false;
                dice2.setIcon(blank);
                Main.saveDie2= false;
                dice3.setIcon(blank);
                Main.saveDie3 = false;
                dice4.setIcon(blank);
                Main.saveDie4 = false;
                dice5.setIcon(blank);
                Main.saveDie5= false;
                if(onesPlayed&&twosPlayed&&threesPlayed&&foursPlayed&&fivesPlayed&&sixesPlayed) {
                    int topBonusCheck = onesScore+twosScore+threesScore+foursScore+fivesScore+sixesScore;
                    if (topBonusCheck >= 63) {
                        Main.finalScore += 35;
                    }
                }
                if (onesPlayed && twosPlayed && threesPlayed && foursPlayed && fivesPlayed && sixesPlayed && threeOfAKindPlayed) {
                    label.setText("GAME OVER!\nYour Final score is: " + finalScore + " points!");
                    ones.setVisible(false);
                    twos.setVisible(false);
                    threes.setVisible(false);
                    fours.setVisible(false);
                    fives.setVisible(false);
                    sixes.setVisible(false);
                    threeOfAKind.setVisible(false);
                    dice1.setVisible(false);
                    dice2.setVisible(false);
                    dice3.setVisible(false);
                    dice4.setVisible(false);
                    dice5.setVisible(false);
                } else {
                    roll.setVisible(true);
                    score.setVisible(true);
                    ones.setVisible(false);
                    twos.setVisible(false);
                    threes.setVisible(false);
                    fours.setVisible(false);
                    fives.setVisible(false);
                    sixes.setVisible(false);
                    threeOfAKind.setVisible(false);
                }
            }
        });
        fours.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Main.foursPlayed = true;

                if(saveDie1Num==4){
                    Main.foursScore += Main.saveDie1Num;
                }
                if(saveDie2Num==4){
                    Main.foursScore += Main.saveDie2Num;
                }
                if(saveDie3Num==4){
                    Main.foursScore += Main.saveDie3Num;
                }
                if(saveDie4Num==4){
                    Main.foursScore += Main.saveDie4Num;
                }
                if(saveDie5Num==4){
                    Main.foursScore += Main.saveDie5Num;
                }
                Main.finalScore = foursScore;
                Main.countRolls = 0;
                dice1.setIcon(blank);
                Main.saveDie1 = false;
                dice2.setIcon(blank);
                Main.saveDie2= false;
                dice3.setIcon(blank);
                Main.saveDie3 = false;
                dice4.setIcon(blank);
                Main.saveDie4 = false;
                dice5.setIcon(blank);
                Main.saveDie5= false;
                if(onesPlayed&&twosPlayed&&threesPlayed&&foursPlayed&&fivesPlayed&&sixesPlayed) {
                    int topBonusCheck = onesScore+twosScore+threesScore+foursScore+fivesScore+sixesScore;
                    if (topBonusCheck >= 63) {
                        Main.finalScore += 35;
                    }
                }
                if (onesPlayed && twosPlayed && threesPlayed && foursPlayed && fivesPlayed && sixesPlayed && threeOfAKindPlayed) {
                    label.setText("GAME OVER!\nYour Final score is: " + finalScore + " points!");
                    ones.setVisible(false);
                    twos.setVisible(false);
                    threes.setVisible(false);
                    fours.setVisible(false);
                    fives.setVisible(false);
                    sixes.setVisible(false);
                    threeOfAKind.setVisible(false);
                    dice1.setVisible(false);
                    dice2.setVisible(false);
                    dice3.setVisible(false);
                    dice4.setVisible(false);
                    dice5.setVisible(false);
                } else {
                    roll.setVisible(true);
                    score.setVisible(true);
                    ones.setVisible(false);
                    twos.setVisible(false);
                    threes.setVisible(false);
                    fours.setVisible(false);
                    fives.setVisible(false);
                    sixes.setVisible(false);
                    threeOfAKind.setVisible(false);
                }
            }
        });
        fives.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Main.fivesPlayed = true;

                if(saveDie1Num==5){
                    Main.fivesScore += Main.saveDie1Num;
                }
                if(saveDie2Num==5){
                    Main.fivesScore += Main.saveDie2Num;
                }
                if(saveDie3Num==5){
                    Main.fivesScore += Main.saveDie3Num;
                }
                if(saveDie4Num==5){
                    Main.fivesScore += Main.saveDie4Num;
                }
                if(saveDie5Num==5){
                    Main.fivesScore += Main.saveDie5Num;
                }
                Main.finalScore = fivesScore;
                Main.countRolls = 0;
                dice1.setIcon(blank);
                Main.saveDie1 = false;
                dice2.setIcon(blank);
                Main.saveDie2= false;
                dice3.setIcon(blank);
                Main.saveDie3 = false;
                dice4.setIcon(blank);
                Main.saveDie4 = false;
                dice5.setIcon(blank);
                Main.saveDie5= false;
                if(onesPlayed&&twosPlayed&&threesPlayed&&foursPlayed&&fivesPlayed&&sixesPlayed) {
                    int topBonusCheck = onesScore+twosScore+threesScore+foursScore+fivesScore+sixesScore;
                    if (topBonusCheck >= 63) {
                        Main.finalScore += 35;
                    }
                }
                if (onesPlayed && twosPlayed && threesPlayed && foursPlayed && fivesPlayed && sixesPlayed && threeOfAKindPlayed) {
                    label.setText("GAME OVER!\nYour Final score is: " + finalScore + " points!");
                    ones.setVisible(false);
                    twos.setVisible(false);
                    threes.setVisible(false);
                    fours.setVisible(false);
                    fives.setVisible(false);
                    sixes.setVisible(false);
                    threeOfAKind.setVisible(false);
                    dice1.setVisible(false);
                    dice2.setVisible(false);
                    dice3.setVisible(false);
                    dice4.setVisible(false);
                    dice5.setVisible(false);
                } else {
                    roll.setVisible(true);
                    score.setVisible(true);
                    ones.setVisible(false);
                    twos.setVisible(false);
                    threes.setVisible(false);
                    fours.setVisible(false);
                    fives.setVisible(false);
                    sixes.setVisible(false);
                    threeOfAKind.setVisible(false);
                }
            }
        });
        sixes.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Main.sixesPlayed = true;

                if(saveDie1Num==6){
                    Main.sixesScore += Main.saveDie1Num;
                }
                if(saveDie2Num==6){
                    Main.sixesScore += Main.saveDie2Num;
                }
                if(saveDie3Num==6){
                    Main.sixesScore += Main.saveDie3Num;
                }
                if(saveDie4Num==6){
                    Main.sixesScore+=Main.saveDie4Num;
                }
                if(saveDie5Num==6){
                    Main.twosScore += Main.saveDie5Num;
                }
                Main.finalScore = sixesScore;
                Main.countRolls = 0;
                dice1.setIcon(blank);
                Main.saveDie1 = false;
                dice2.setIcon(blank);
                Main.saveDie2= false;
                dice3.setIcon(blank);
                Main.saveDie3 = false;
                dice4.setIcon(blank);
                Main.saveDie4 = false;
                dice5.setIcon(blank);
                Main.saveDie5= false;
                if(onesPlayed&&twosPlayed&&threesPlayed&&foursPlayed&&fivesPlayed&&sixesPlayed) {
                    int topBonusCheck = onesScore+twosScore+threesScore+foursScore+fivesScore+sixesScore;
                    if (topBonusCheck >= 63) {
                        Main.finalScore += 35;
                    }
                }
                if (onesPlayed && twosPlayed && threesPlayed && foursPlayed && fivesPlayed && sixesPlayed && threeOfAKindPlayed) {
                    label.setText("GAME OVER!\nYour Final score is: " + finalScore + " points!");
                    ones.setVisible(false);
                    twos.setVisible(false);
                    threes.setVisible(false);
                    fours.setVisible(false);
                    fives.setVisible(false);
                    sixes.setVisible(false);
                    threeOfAKind.setVisible(false);
                    dice1.setVisible(false);
                    dice2.setVisible(false);
                    dice3.setVisible(false);
                    dice4.setVisible(false);
                    dice5.setVisible(false);
                } else {
                    roll.setVisible(true);
                    score.setVisible(true);
                    ones.setVisible(false);
                    twos.setVisible(false);
                    threes.setVisible(false);
                    fours.setVisible(false);
                    fives.setVisible(false);
                    sixes.setVisible(false);
                    threeOfAKind.setVisible(false);
                }
            }
        });
threeOfAKind.addActionListener(new ActionListener() {
    @Override
    public void actionPerformed(ActionEvent e) {
        Main.threeOfAKindPlayed = true;
        int onesCount = 0;
        int twosCount = 0;
        int threesCount = 0;
        int foursCount = 0;
        int fivesCount = 0;
        int sixesCount =0;
        if(saveDie1Num==1){
            onesCount++;
        }
        if(saveDie2Num==1){
            onesCount++;
        }
        if(saveDie3Num==1){
            onesCount++;
        }
        if(saveDie4Num==1){
            onesCount++;
        }
        if(saveDie5Num==1){
            onesCount++;
        }
        if(saveDie1Num==2){
            twosCount++;
        }
        if(saveDie2Num==2){
            twosCount++;
        }
        if(saveDie3Num==2){
            twosCount++;
        }
        if(saveDie4Num==2){
            twosCount++;
        }
        if(saveDie5Num==2){
            twosCount++;
        }
        if(saveDie1Num==3){
            threesCount++;
        }
        if(saveDie2Num==3){
            threesCount++;
        }
        if(saveDie3Num==3){
            threesCount++;
        }
        if(saveDie4Num==3){
            threesCount++;
        }
        if(saveDie5Num==3){
            threesCount++;
        }
        if(saveDie1Num==4){
            foursCount++;
        }
        if(saveDie2Num==4){
            foursCount++;
        }
        if(saveDie3Num==4){
            foursCount++;
        }
        if(saveDie4Num==4){
            foursCount++;
        }
        if(saveDie5Num==4){
            foursCount++;
        }
        if(saveDie1Num==5){
            fivesCount++;
        }
        if(saveDie2Num==5){
            fivesCount++;
        }
        if(saveDie3Num==5){
            fivesCount++;
        }
        if(saveDie4Num==5){
            fivesCount++;
        }
        if(saveDie5Num==5){
            fivesCount++;
        }
        if(saveDie1Num==6){
            sixesCount++;
        }
        if(saveDie2Num==6){
            sixesCount++;
        }
        if(saveDie3Num==6){
            sixesCount++;
        }
        if(saveDie4Num==6){
            sixesCount++;
        }
        if(saveDie5Num==6){
            sixesCount++;
        }
        if(onesCount>=3||twosCount>=3||threesCount>=3||foursCount>=3||fivesCount>=3||sixesCount>=3){
            threeOfAKindScore = saveDie1Num+saveDie2Num+saveDie3Num+saveDie4Num+saveDie5Num;
        }
        Main.finalScore += threeOfAKindScore;
        Main.countRolls = 0;
        dice1.setIcon(blank);
        Main.saveDie1 = false;
        dice2.setIcon(blank);
        Main.saveDie2= false;
        dice3.setIcon(blank);
        Main.saveDie3 = false;
        dice4.setIcon(blank);
        Main.saveDie4 = false;
        dice5.setIcon(blank);
        Main.saveDie5= false;
        if (onesPlayed && twosPlayed && threesPlayed && foursPlayed && fivesPlayed && sixesPlayed && threeOfAKindPlayed) {
            label.setText("GAME OVER!\nYour Final score is: " + finalScore + " points!");
            ones.setVisible(false);
            twos.setVisible(false);
            threes.setVisible(false);
            fours.setVisible(false);
            fives.setVisible(false);
            sixes.setVisible(false);
            threeOfAKind.setVisible(false);
            dice1.setVisible(false);
            dice2.setVisible(false);
            dice3.setVisible(false);
            dice4.setVisible(false);
            dice5.setVisible(false);
        } else {
            roll.setVisible(true);
            score.setVisible(true);
            ones.setVisible(false);
            twos.setVisible(false);
            threes.setVisible(false);
            fours.setVisible(false);
            fives.setVisible(false);
            sixes.setVisible(false);
            threeOfAKind.setVisible(false);
        }
    }
});
    }
}