import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    static boolean scoreCardPress = false;
    static boolean scoreRollPress = false;
    static int finalScore = 0;
    static int onesScore = 0;
    static int twosScore = 0;
    static int threesScore = 0;
    static int foursScore = 0;
    static int fivesScore = 0;
    static int sixesScore = 0;
    static int topScore = 0;
 static int threeOfAKindScore = 0;
 static int fourOfAKindScore = 0;
 static int fullHouseScore = 0;
 static int smallStraightScore = 0;
 static int largeStraightScore = 0;
 static int yahtzeeScore = 0;
 static int yahtzeeBonusScore = 0;
 static int chanceScore = 0;
 static int bottomScore = 0;
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
    static boolean fourOfAKindPlayed = false;
    static boolean fullHousePlayed = false;
    static boolean smallStraightPlayed = false;
    static boolean largeStraightPlayed = false;
    static boolean yahtzeePlayed = false;
    static boolean yahtzeeBonusMax = false;
    static int yahtzeeCount = 0;
    static boolean chancePlayed = false;
    static int numberOfPlayers = 0;
    public static void main(String[] args) {

        JFrame frame = new JFrame();
        frame.setSize(1000,800);
        JPanel panel = new JPanel();
        panel.setLayout(null);
        JButton computer1 = new JButton("1 Computer");
        JButton computer2 = new JButton("2 Computers");
        JButton computer3 = new JButton("3 Computers");
        JButton noComputer = new JButton("No Computers");

        JLabel label = new JLabel("Welcome to Yahtzee! How many computers are you going to play against?");
        JButton roll = new JButton("Roll");
        JButton again = new JButton("Restart game");
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
        JButton scoreCard = new JButton("Look at your score card");
        JButton back = new JButton("<--Back");
//button for all the dice
        JButton dice1 = new JButton("");
        JButton dice2 = new JButton("");
        JButton dice3 = new JButton("");
        JButton dice4 = new JButton("");
        JButton dice5 = new JButton("");
        JLabel dice1Label = new JLabel("Saved die: No");
        JLabel dice2Label = new JLabel("Saved die: No");
        JLabel dice3Label = new JLabel("Saved die: No");
        JLabel dice4Label = new JLabel("Saved die: No");
        JLabel dice5Label = new JLabel("Saved die: No");


//scoring buttons
        JButton ones = new JButton("Ones");
        JButton twos = new JButton("Twos");
        JButton threes = new JButton("Threes");
        JButton fours = new JButton("Fours");
        JButton fives = new JButton("Fives");
        JButton sixes = new JButton("Sixes");
        JButton threeOfAKind = new JButton("Three of a Kind");
        JButton fourOfAKind = new JButton("Four of a Kind");
        JButton fullHouse = new JButton("Full House");
        JButton largeStraight = new JButton("Large Straight");
        JButton smallStraight = new JButton("Small Straight");
        JButton yahtzee = new JButton("Yahtzee!");
        JButton chance = new JButton("Chance");
//Score Card Labels
        JLabel scoreCardOnes = new JLabel("");
        JLabel scoreCardTwos = new JLabel("");
        JLabel scoreCardThrees = new JLabel("");
        JLabel scoreCardFours = new JLabel("");
        JLabel scoreCardFives = new JLabel("");
        JLabel scoreCardSixes = new JLabel("");
        JLabel scoreCardTopScore = new JLabel("");
        JLabel scoreCardBonus = new JLabel("");
        JLabel scoreCardTOK = new JLabel("");
        JLabel scoreCardFOK = new JLabel("");
        JLabel scoreCardFH = new JLabel("");
        JLabel scoreCardSS = new JLabel("");
        JLabel scoreCardLS = new JLabel("");
        JLabel scoreCardYAH = new JLabel("");
        JLabel scoreCardChance = new JLabel("");
        JLabel scorecardYAHB = new JLabel("");
        JLabel scoreCardBottom = new JLabel("");
        JLabel scoreCardFinal = new JLabel("");

        panel.add(label);
        //score Label 1
        panel.add(scoreCardOnes);
        scoreCardOnes.setFont(new Font("Serif",Font.PLAIN,30));
        scoreCardOnes.setBounds(300,50,200,50);
        scoreCardOnes.setVisible(false);
        //score label 2
        panel.add(scoreCardTwos);
        scoreCardTwos.setFont(new Font("Serif", Font.PLAIN, 30));
        scoreCardTwos.setBounds(300,100,200,50);
        scoreCardTwos.setVisible(false);
        //score label 3
        panel.add(scoreCardThrees);
        scoreCardThrees.setFont(new Font("Serif", Font.PLAIN, 30));
        scoreCardThrees.setBounds(300,150,200,50);
        scoreCardThrees.setVisible(false);
        //score label 4
        panel.add(scoreCardFours);
        scoreCardFours.setFont(new Font("Serif", Font.PLAIN, 30));
        scoreCardFours.setBounds(300,200,200,50);
        scoreCardFours.setVisible(false);
        //score label 5
        panel.add(scoreCardFives);
        scoreCardFives.setFont(new Font("Serif", Font.PLAIN, 30));
        scoreCardFives.setBounds(300,250,200,50);
        scoreCardFives.setVisible(false);
        //score label 6
        panel.add(scoreCardSixes);
        scoreCardSixes.setFont(new Font("Serif", Font.PLAIN, 30));
        scoreCardSixes.setBounds(300,300,200,50);
        scoreCardSixes.setVisible(false);
        //score label bonus
        panel.add(scoreCardBonus);
        scoreCardBonus.setFont(new Font("Serif", Font.PLAIN, 30));
        scoreCardBonus.setBounds(300,350,400,50);
        scoreCardBonus.setVisible(false);
        //score label top score
        panel.add(scoreCardTopScore);
        scoreCardTopScore.setFont(new Font("Serif",Font.PLAIN,30));
        scoreCardTopScore.setBounds(300,400,400,50);
        scoreCardTopScore.setVisible(false);
        //score label Three of a kind
        panel.add(scoreCardTOK);
        scoreCardTOK.setFont(new Font("Serif",Font.PLAIN,30));
        scoreCardTOK.setBounds(700,50,400,50);
        scoreCardTOK.setVisible(false);
        //score label Four of a kind
        panel.add(scoreCardFOK);
        scoreCardFOK.setFont(new Font("Serif",Font.PLAIN,30));
        scoreCardFOK.setBounds(700,100,400,50);
        scoreCardFOK.setVisible(false);
        //score label Full house
        panel.add(scoreCardFH);
        scoreCardFH.setFont(new Font("Serif",Font.PLAIN,30));
        scoreCardFH.setBounds(700,150,400,50);
        scoreCardFH.setVisible(false);
        //score label Small straight
        panel.add(scoreCardSS);
        scoreCardSS.setFont(new Font("Serif",Font.PLAIN,30));
        scoreCardSS.setBounds(700,200,400,50);
        scoreCardSS.setVisible(false);
        //score label Large Straight
        panel.add(scoreCardLS);
        scoreCardLS.setFont(new Font("Serif",Font.PLAIN,30));
        scoreCardLS.setBounds(700,250,400,50);
        scoreCardLS.setVisible(false);
        //score label Yahtzee
        panel.add(scoreCardYAH);
        scoreCardYAH.setFont(new Font("Serif",Font.PLAIN,30));
        scoreCardYAH.setBounds(700,300,400,50);
        scoreCardYAH.setVisible(false);
        //score label chance
        panel.add(scoreCardChance);
        scoreCardChance.setFont(new Font("Serif",Font.PLAIN,30));
        scoreCardChance.setBounds(700,350,400,50);
        scoreCardChance.setVisible(false);
        //score Label yahtzee bonus
        panel.add(scorecardYAHB);
        scorecardYAHB.setFont(new Font("Serif",Font.PLAIN,30));
        scorecardYAHB.setBounds(700,400,400,50);
        scorecardYAHB.setVisible(false);
        //score label bottom
        panel.add(scoreCardBottom);
        scoreCardBottom.setFont(new Font("Serif",Font.PLAIN,30));
        scoreCardBottom.setBounds(700,450,400,50);
        scoreCardBottom.setVisible(false);
        //score label Final
        panel.add(scoreCardFinal);
        scoreCardFinal.setFont(new Font("Serif",Font.PLAIN,30));
        scoreCardFinal.setBounds(500,500,400,50);
        scoreCardFinal.setVisible(false);
        //computer start
        panel.add(computer1);
        panel.add(computer2);
        panel.add(computer3);
        panel.add(noComputer);
        noComputer.setBounds(751,500,250,100);
        computer3.setBounds(501,500,250,100);
        computer2.setBounds(251,500,250,100);
        computer1.setBounds(0,500,250,100);
panel.add(scoreCard);
panel.add(back);
scoreCard.setBounds(700,100,250,50);
back.setBounds(100,100,100,50);
scoreCard.setVisible(false);
back.setVisible(false);
panel.add(again);
again.setBounds(100,100,100,50);
again.setVisible(false);
        panel.add(dice1);
        panel.add(score);
        score.setBounds(0,frame.getHeight()-300, frame.getWidth(), 50);
        dice1.setBounds(100,200,100,100);
        dice1Label.setBounds(100,310,100,50);
        panel.add(dice1Label);
        dice1Label.setVisible(false);
        dice2.setBounds(275,200,100,100);
        dice2Label.setBounds(275,310,100,50);
        panel.add(dice2Label);
        dice2Label.setVisible(false);
        dice3.setBounds(450,200,100,100);
        dice3Label.setBounds(450,310,100,50);
        panel.add(dice3Label);
        dice3Label.setVisible(false);
        dice4.setBounds(625,200,100,100);
        dice4Label.setBounds(625,310,100,50);
        panel.add(dice4Label);
        dice4Label.setVisible(false);
        dice5.setBounds(800,200,100,100);
        dice5Label.setBounds(800,310,100,50);
        panel.add(dice5Label);
        dice5Label.setVisible(false);
        panel.add(dice2);
        panel.add(dice3);
        panel.add(dice4);
        panel.add(dice5);
        panel.add(roll);
        panel.add(label);
        //scoring buttons to panel
        panel.add(ones);
        ones.setBounds(0,frame.getHeight()-400,175,100);
        ones.setVisible(false);
        panel.add(twos);
        twos.setBounds(176,frame.getHeight()-400,175,100);
        twos.setVisible(false);
        panel.add(threes);
        threes.setBounds(351,frame.getHeight()-400,175,100);
        threes.setVisible(false);
        panel.add(fours);
        fours.setBounds(526,frame.getHeight()-400,175,100);
        fours.setVisible(false);
        panel.add(fives);
        fives.setBounds(700,frame.getHeight()-400,175,100);
        fives.setVisible(false);
        panel.add(sixes);
        sixes.setBounds(876,frame.getHeight()-400,125,100);
        sixes.setVisible(false);
        panel.add(threeOfAKind);
        threeOfAKind.setBounds(0,frame.getHeight()-300,175,100);
        threeOfAKind.setVisible(false);
        panel.add(fourOfAKind);
        fourOfAKind.setBounds(176,frame.getHeight()-300,175,100);
        fourOfAKind.setVisible(false);
        panel.add(fullHouse);
        fullHouse.setBounds(351,frame.getHeight()-300,175,100);
        fullHouse.setVisible(false);
        panel.add(smallStraight);
        smallStraight.setBounds(526,frame.getHeight()-300,175,100);
        smallStraight.setVisible(false);
        panel.add(largeStraight);
        largeStraight.setBounds(700,frame.getHeight()-300,175,100);
        largeStraight.setVisible(false);
        panel.add(chance);
        chance.setBounds(876,frame.getHeight()-300,125,100);
        chance.setVisible(false);
        panel.add(yahtzee);
        yahtzee.setBounds(0, frame.getHeight()-200,frame.getWidth(),100);
        yahtzee.setVisible(false);

        dice1.setVisible(false);
        dice5.setVisible(false);
        dice4.setVisible(false);
        dice2.setVisible(false);
        dice3.setVisible(false);

        roll.setVisible(false);
        score.setVisible(false);
        frame.setResizable(false);

        label.setBounds(300,100,500,100);
        roll.setBounds(0,frame.getHeight()-200,frame.getWidth(),150);
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
                    dice1Label.setText("Saved die: Yes");
                }else{
                    label.setText("You unsaved the first die");
                    Main.saveDie1 = false;
                    dice1Label.setText("Saved die: No");

                }

            }
        });
        dice2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(saveDie2==false) {
                    label.setText("You saved the second die");
                    Main.saveDie2 = true;
                    dice2Label.setText("Saved die: Yes");

                }else{
                    label.setText("You unsaved the second die");
                    Main.saveDie2 = false;
                    dice2Label.setText("Saved die: No");
                }
            }
        });
        dice3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(saveDie3==false) {
                    label.setText("You saved the third die");
                    Main.saveDie3 = true;
                    dice3Label.setText("Saved die: Yes");
                }else{
                    label.setText("You unsaved the third die");
                    Main.saveDie3 = false;
                    dice3Label.setText("Saved die: No");
                }
            }
        });
        dice4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(saveDie4==false) {
                    label.setText("You saved the forth die");
                    Main.saveDie4 = true;
                    dice4Label.setText("Saved die: Yes");
                }else{
                    label.setText("You unsaved the forth die");
                    Main.saveDie4 = false;
                    dice4Label.setText("Saved die: No");
                }
            }
        });
        dice5.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(saveDie5==false) {
                    label.setText("You saved the fifth die");
                    Main.saveDie5 = true;
                    dice5Label.setText("Saved die: Yes");
                }else{
                    label.setText("You unsaved the fifth die");
                    Main.saveDie5 = false;
                    dice5Label.setText("Saved die: No");
                }
            }
        });
        computer1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                AI computerPlayer = new AI();
                numberOfPlayers = 2;
                dice1.setVisible(true);
                dice5.setVisible(true);
                dice4.setVisible(true);
                dice2.setVisible(true);
                dice3.setVisible(true);
                roll.setVisible(true);
                score.setVisible(true);
                scoreCard.setVisible(true);
                back.setVisible(true);
                computer1.setVisible(false);
                computer2.setVisible(false);
                computer3.setVisible(false);
                noComputer.setVisible(false);
                dice1Label.setVisible(true);
                dice2Label.setVisible(true);
                dice3Label.setVisible(true);
                dice4Label.setVisible(true);
                dice5Label.setVisible(true);
                label.setText("Your turn to roll");
                dice5Label.setText("Saved die: No");
                dice4Label.setText("Saved die: No");
                dice3Label.setText("Saved die: No");
                dice2Label.setText("Saved die: No");
                dice1Label.setText("Saved die: No");
            }
        });
        computer2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                AI computerPlayer1 = new AI();
                AI computerPlayer2 = new AI();
                numberOfPlayers = 3;
                dice1.setVisible(true);
                dice5.setVisible(true);
                dice4.setVisible(true);
                dice2.setVisible(true);
                dice3.setVisible(true);
                roll.setVisible(true);
                score.setVisible(true);
                scoreCard.setVisible(true);
                back.setVisible(true);
                computer1.setVisible(false);
                computer2.setVisible(false);
                computer3.setVisible(false);
                noComputer.setVisible(false);
                dice1Label.setVisible(true);
                dice2Label.setVisible(true);
                dice3Label.setVisible(true);
                dice4Label.setVisible(true);
                dice5Label.setVisible(true);
                label.setText("Your turn to roll");
                dice5Label.setText("Saved die: No");
                dice4Label.setText("Saved die: No");
                dice3Label.setText("Saved die: No");
                dice2Label.setText("Saved die: No");
                dice1Label.setText("Saved die: No");
            }
        });
        computer3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                AI computerPlayer1 = new AI();
                AI computerPlayer2 = new AI();
                AI computerPlayer3 = new AI();
                numberOfPlayers = 4;
                dice1.setVisible(true);
                dice5.setVisible(true);
                dice4.setVisible(true);
                dice2.setVisible(true);
                dice3.setVisible(true);
                roll.setVisible(true);
                score.setVisible(true);
                scoreCard.setVisible(true);
                back.setVisible(true);
                computer1.setVisible(false);
                computer2.setVisible(false);
                computer3.setVisible(false);
                noComputer.setVisible(false);
                dice1Label.setVisible(true);
                dice2Label.setVisible(true);
                dice3Label.setVisible(true);
                dice4Label.setVisible(true);
                dice5Label.setVisible(true);
                label.setText("Your turn to roll");
                dice5Label.setText("Saved die: No");
                dice4Label.setText("Saved die: No");
                dice3Label.setText("Saved die: No");
                dice2Label.setText("Saved die: No");
                dice1Label.setText("Saved die: No");
            }
        });
        noComputer.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                numberOfPlayers = 1;
                dice1.setVisible(true);
                dice5.setVisible(true);
                dice4.setVisible(true);
                dice2.setVisible(true);
                dice3.setVisible(true);
                roll.setVisible(true);
                score.setVisible(true);
                scoreCard.setVisible(true);
                back.setVisible(true);
                computer1.setVisible(false);
                computer2.setVisible(false);
                computer3.setVisible(false);
                noComputer.setVisible(false);
                dice1Label.setVisible(true);
                dice2Label.setVisible(true);
                dice3Label.setVisible(true);
                dice4Label.setVisible(true);
                dice5Label.setVisible(true);
                label.setText("Your turn to roll");
                dice5Label.setText("Saved die: No");
                dice4Label.setText("Saved die: No");
                dice3Label.setText("Saved die: No");
                dice2Label.setText("Saved die: No");
                dice1Label.setText("Saved die: No");
            }
        });
        score.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Main.scoreRollPress = true;
                label.setText("What would you like to play");
                roll.setVisible(false);
                score.setVisible(false);
                scoreCard.setVisible(false);
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
                if(fourOfAKindPlayed==false){
                    fourOfAKind.setVisible(true);
                }
                if(fullHousePlayed==false){
                    fullHouse.setVisible(true);
                }
                if(smallStraightPlayed==false){
                    smallStraight.setVisible(true);
                }
                if(largeStraightPlayed==false){
                    largeStraight.setVisible(true);
                }
                if(chancePlayed==false){
                    chance.setVisible(true);
                }
                if(yahtzeePlayed==false){
                    yahtzee.setVisible(true);
                }
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
                if(onesCount==5&&yahtzeeCount>0||twosCount==5&&yahtzeeCount>0||threesCount==5&&yahtzeeCount>0||foursCount==5&&yahtzeeCount>0||fivesCount==5&&yahtzeeCount>0||sixesCount==5&&yahtzeeCount>0){
                    yahtzee.setVisible(true);
                    yahtzee.setText("Yahztee Bonus!");
                }
            }
        });
        ones.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Main.onesPlayed = true;
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

                Main.finalScore += onesScore;
                Main.topScore+=onesScore;
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
                    if (topScore >= 63) {
                        Main.finalScore += 35;
                        Main.topScore+=35;
                    }
                }
                if (onesPlayed && twosPlayed && threesPlayed && foursPlayed && fivesPlayed && sixesPlayed && threeOfAKindPlayed&& fourOfAKindPlayed&&fullHousePlayed&&smallStraightPlayed&&largeStraightPlayed&&yahtzeePlayed&&chancePlayed) {
                    label.setText("GAME OVER!\nYour Final score is: " + finalScore + " points!");
                    ones.setVisible(false);
                    twos.setVisible(false);
                    threes.setVisible(false);
                    fours.setVisible(false);
                    fives.setVisible(false);
                    sixes.setVisible(false);
                    threeOfAKind.setVisible(false);
                    fourOfAKind.setVisible(false);
                    fullHouse.setVisible(false);
                    smallStraight.setVisible(false);
                    largeStraight.setVisible(false);
                    chance.setVisible(false);
                    yahtzee.setVisible(false);
                    dice1.setVisible(false);
                    dice2.setVisible(false);
                    dice3.setVisible(false);
                    dice4.setVisible(false);
                    dice5.setVisible(false);
                    back.setVisible(false);
                    scoreCard.setVisible(true);
                    again.setVisible(true);
                    dice1Label.setVisible(false);
                    dice2Label.setVisible(false);
                    dice3Label.setVisible(false);
                    dice4Label.setVisible(false);
                    dice5Label.setVisible(false);
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
                    fourOfAKind.setVisible(false);
                    fullHouse.setVisible(false);
                    smallStraight.setVisible(false);
                    largeStraight.setVisible(false);
                    chance.setVisible(false);
                    yahtzee.setVisible(false);
                    scoreCard.setVisible(true);
                   Main.scoreRollPress = false;
                    dice5Label.setText("Saved die: No");
                    dice4Label.setText("Saved die: No");
                    dice3Label.setText("Saved die: No");
                    dice2Label.setText("Saved die: No");
                    dice1Label.setText("Saved die: No");
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
                Main.finalScore += twosScore;
                Main.topScore+=twosScore;
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
                    if (topScore >= 63) {
                        Main.finalScore += 35;
                        Main.topScore+=35;
                    }
                }
                if (onesPlayed && twosPlayed && threesPlayed && foursPlayed && fivesPlayed && sixesPlayed && threeOfAKindPlayed&&fourOfAKindPlayed&&fullHousePlayed&&smallStraightPlayed&&largeStraightPlayed&&yahtzeePlayed&&chancePlayed) {
                    label.setText("GAME OVER!\nYour Final score is: " + finalScore + " points!");
                    ones.setVisible(false);
                    twos.setVisible(false);
                    threes.setVisible(false);
                    fours.setVisible(false);
                    fives.setVisible(false);
                    sixes.setVisible(false);
                    threeOfAKind.setVisible(false);
                    fourOfAKind.setVisible(false);
                    fullHouse.setVisible(false);
                    smallStraight.setVisible(false);
                    largeStraight.setVisible(false);
                    chance.setVisible(false);
                    yahtzee.setVisible(false);
                    dice1.setVisible(false);
                    dice2.setVisible(false);
                    dice3.setVisible(false);
                    dice4.setVisible(false);
                    dice5.setVisible(false);
                    back.setVisible(false);
                    scoreCard.setVisible(true);
                    again.setVisible(true);
                    dice1Label.setVisible(false);
                    dice2Label.setVisible(false);
                    dice3Label.setVisible(false);
                    dice4Label.setVisible(false);
                    dice5Label.setVisible(false);
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
                    fourOfAKind.setVisible(false);
                    fullHouse.setVisible(false);
                    smallStraight.setVisible(false);
                    largeStraight.setVisible(false);
                    chance.setVisible(false);
                    yahtzee.setVisible(false);
                    scoreCard.setVisible(true);
                    Main.scoreRollPress = false;
                    dice5Label.setText("Saved die: No");
                    dice4Label.setText("Saved die: No");
                    dice3Label.setText("Saved die: No");
                    dice2Label.setText("Saved die: No");
                    dice1Label.setText("Saved die: No");
                }
            }
        });
        threes.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Main.threesPlayed = true;

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
                Main.finalScore += threesScore;
                Main.topScore+=threesScore;
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
                    if (topScore >= 63) {
                        Main.finalScore += 35;
                        Main.topScore+=35;
                    }
                }
                if (onesPlayed && twosPlayed && threesPlayed && foursPlayed && fivesPlayed && sixesPlayed && threeOfAKindPlayed&&fourOfAKindPlayed&&fullHousePlayed&&smallStraightPlayed&&largeStraightPlayed&&yahtzeePlayed&&chancePlayed) {
                    label.setText("GAME OVER!\nYour Final score is: " + finalScore + " points!");
                    ones.setVisible(false);
                    twos.setVisible(false);
                    threes.setVisible(false);
                    fours.setVisible(false);
                    fives.setVisible(false);
                    sixes.setVisible(false);
                    threeOfAKind.setVisible(false);
                    fourOfAKind.setVisible(false);
                    fullHouse.setVisible(false);
                    smallStraight.setVisible(false);
                    largeStraight.setVisible(false);
                    chance.setVisible(false);
                    yahtzee.setVisible(false);
                    dice1.setVisible(false);
                    dice2.setVisible(false);
                    dice3.setVisible(false);
                    dice4.setVisible(false);
                    dice5.setVisible(false);
                    back.setVisible(false);
                    scoreCard.setVisible(true);
                    again.setVisible(true);
                    dice1Label.setVisible(false);
                    dice2Label.setVisible(false);
                    dice3Label.setVisible(false);
                    dice4Label.setVisible(false);
                    dice5Label.setVisible(false);
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
                    fourOfAKind.setVisible(false);
                    fullHouse.setVisible(false);
                    smallStraight.setVisible(false);
                    largeStraight.setVisible(false);
                    chance.setVisible(false);
                    yahtzee.setVisible(false);
                    scoreCard.setVisible(true);
                    Main.scoreRollPress = false;
                    dice5Label.setText("Saved die: No");
                    dice4Label.setText("Saved die: No");
                    dice3Label.setText("Saved die: No");
                    dice2Label.setText("Saved die: No");
                    dice1Label.setText("Saved die: No");
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
                Main.finalScore += foursScore;
                Main.topScore+=foursScore;
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
                    if (topScore >= 63) {
                        Main.finalScore += 35;
                        Main.topScore+=35;
                    }
                }
                if (onesPlayed && twosPlayed && threesPlayed && foursPlayed && fivesPlayed && sixesPlayed && threeOfAKindPlayed&&fourOfAKindPlayed&&fullHousePlayed&&smallStraightPlayed&&largeStraightPlayed&&yahtzeePlayed&&chancePlayed) {
                    label.setText("GAME OVER!\nYour Final score is: " + finalScore + " points!");
                    ones.setVisible(false);
                    twos.setVisible(false);
                    threes.setVisible(false);
                    fours.setVisible(false);
                    fives.setVisible(false);
                    sixes.setVisible(false);
                    threeOfAKind.setVisible(false);
                    fourOfAKind.setVisible(false);
                    fullHouse.setVisible(false);
                    smallStraight.setVisible(false);
                    largeStraight.setVisible(false);
                    chance.setVisible(false);
                    yahtzee.setVisible(false);
                    dice1.setVisible(false);
                    dice2.setVisible(false);
                    dice3.setVisible(false);
                    dice4.setVisible(false);
                    dice5.setVisible(false);
                    back.setVisible(false);
                    scoreCard.setVisible(true);
                    again.setVisible(true);
                    dice1Label.setVisible(false);
                    dice2Label.setVisible(false);
                    dice3Label.setVisible(false);
                    dice4Label.setVisible(false);
                    dice5Label.setVisible(false);
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
                    fourOfAKind.setVisible(false);
                    fullHouse.setVisible(false);
                    smallStraight.setVisible(false);
                    largeStraight.setVisible(false);
                    chance.setVisible(false);
                    yahtzee.setVisible(false);
                    scoreCard.setVisible(true);
                    Main.scoreRollPress = false;
                    dice5Label.setText("Saved die: No");
                    dice4Label.setText("Saved die: No");
                    dice3Label.setText("Saved die: No");
                    dice2Label.setText("Saved die: No");
                    dice1Label.setText("Saved die: No");
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
                Main.finalScore += fivesScore;
                Main.topScore+=fivesScore;
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
                    if (topScore >= 63) {
                        Main.finalScore += 35;
                        Main.topScore+=35;
                    }
                }
                if (onesPlayed && twosPlayed && threesPlayed && foursPlayed && fivesPlayed && sixesPlayed && threeOfAKindPlayed&&fourOfAKindPlayed&&fullHousePlayed&&smallStraightPlayed&&largeStraightPlayed&&yahtzeePlayed&&chancePlayed) {
                    label.setText("GAME OVER!\nYour Final score is: " + finalScore + " points!");
                    ones.setVisible(false);
                    twos.setVisible(false);
                    threes.setVisible(false);
                    fours.setVisible(false);
                    fives.setVisible(false);
                    sixes.setVisible(false);
                    threeOfAKind.setVisible(false);
                    fourOfAKind.setVisible(false);
                    fullHouse.setVisible(false);
                    smallStraight.setVisible(false);
                    largeStraight.setVisible(false);
                    chance.setVisible(false);
                    yahtzee.setVisible(false);
                    dice1.setVisible(false);
                    dice2.setVisible(false);
                    dice3.setVisible(false);
                    dice4.setVisible(false);
                    dice5.setVisible(false);
                    back.setVisible(false);
                    scoreCard.setVisible(true);
                    again.setVisible(true);
                    dice1Label.setVisible(false);
                    dice2Label.setVisible(false);
                    dice3Label.setVisible(false);
                    dice4Label.setVisible(false);
                    dice5Label.setVisible(false);
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
                    fourOfAKind.setVisible(false);
                    fullHouse.setVisible(false);
                    smallStraight.setVisible(false);
                    largeStraight.setVisible(false);
                    chance.setVisible(false);
                    yahtzee.setVisible(false);
                    scoreCard.setVisible(true);
                    Main.scoreRollPress = false;
                    dice5Label.setText("Saved die: No");
                    dice4Label.setText("Saved die: No");
                    dice3Label.setText("Saved die: No");
                    dice2Label.setText("Saved die: No");
                    dice1Label.setText("Saved die: No");

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
                    Main.sixesScore += Main.saveDie5Num;
                }
                Main.finalScore += sixesScore;
                Main.topScore+=sixesScore;
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
                    if (topScore >= 63) {
                        Main.finalScore += 35;
                        Main.topScore+=35;
                    }
                }
                if (onesPlayed && twosPlayed && threesPlayed && foursPlayed && fivesPlayed && sixesPlayed && threeOfAKindPlayed&&fourOfAKindPlayed&&fullHousePlayed&&smallStraightPlayed&&largeStraightPlayed&&yahtzeePlayed&&chancePlayed) {
                    label.setText("GAME OVER!\nYour Final score is: " + finalScore + " points!");
                    ones.setVisible(false);
                    twos.setVisible(false);
                    threes.setVisible(false);
                    fours.setVisible(false);
                    fives.setVisible(false);
                    sixes.setVisible(false);
                    threeOfAKind.setVisible(false);
                    fourOfAKind.setVisible(false);
                    fullHouse.setVisible(false);
                    smallStraight.setVisible(false);
                    largeStraight.setVisible(false);
                    chance.setVisible(false);
                    yahtzee.setVisible(false);
                    dice1.setVisible(false);
                    dice2.setVisible(false);
                    dice3.setVisible(false);
                    dice4.setVisible(false);
                    dice5.setVisible(false);
                    back.setVisible(false);
                    scoreCard.setVisible(true);
                    again.setVisible(true);
                    dice1Label.setVisible(false);
                    dice2Label.setVisible(false);
                    dice3Label.setVisible(false);
                    dice4Label.setVisible(false);
                    dice5Label.setVisible(false);
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
                    fourOfAKind.setVisible(false);
                    fullHouse.setVisible(false);
                    smallStraight.setVisible(false);
                    largeStraight.setVisible(false);
                    chance.setVisible(false);
                    yahtzee.setVisible(false);
                    scoreCard.setVisible(true);
                    Main.scoreRollPress = false;
                    dice5Label.setText("Saved die: No");
                    dice4Label.setText("Saved die: No");
                    dice3Label.setText("Saved die: No");
                    dice2Label.setText("Saved die: No");
                    dice1Label.setText("Saved die: No");
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
        Main.bottomScore += threeOfAKindScore;
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
        if (onesPlayed && twosPlayed && threesPlayed && foursPlayed && fivesPlayed && sixesPlayed && threeOfAKindPlayed&&fourOfAKindPlayed&&fullHousePlayed&&smallStraightPlayed&&largeStraightPlayed&&yahtzeePlayed&&chancePlayed) {
            label.setText("GAME OVER!\nYour Final score is: " + finalScore + " points!");
            ones.setVisible(false);
            twos.setVisible(false);
            threes.setVisible(false);
            fours.setVisible(false);
            fives.setVisible(false);
            sixes.setVisible(false);
            threeOfAKind.setVisible(false);
            fourOfAKind.setVisible(false);
            fullHouse.setVisible(false);
            smallStraight.setVisible(false);
            largeStraight.setVisible(false);
            chance.setVisible(false);
            yahtzee.setVisible(false);
            dice1.setVisible(false);
            dice2.setVisible(false);
            dice3.setVisible(false);
            dice4.setVisible(false);
            dice5.setVisible(false);
            back.setVisible(false);
            scoreCard.setVisible(true);
            again.setVisible(true);
            dice1Label.setVisible(false);
            dice2Label.setVisible(false);
            dice3Label.setVisible(false);
            dice4Label.setVisible(false);
            dice5Label.setVisible(false);
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
            fourOfAKind.setVisible(false);
            fullHouse.setVisible(false);
            smallStraight.setVisible(false);
            largeStraight.setVisible(false);
            chance.setVisible(false);
            yahtzee.setVisible(false);
            scoreCard.setVisible(true);
            Main.scoreRollPress = false;
            dice5Label.setText("Saved die: No");
            dice4Label.setText("Saved die: No");
            dice3Label.setText("Saved die: No");
            dice2Label.setText("Saved die: No");
            dice1Label.setText("Saved die: No");
        }
    }
});
fourOfAKind.addActionListener(new ActionListener() {
    @Override
    public void actionPerformed(ActionEvent e) {
        Main.fourOfAKindPlayed = true;
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
        if(onesCount>=4||twosCount>=4||threesCount>=4||foursCount>=4||fivesCount>=4||sixesCount>=4){
            fourOfAKindScore = saveDie1Num+saveDie2Num+saveDie3Num+saveDie4Num+saveDie5Num;
        }
        Main.finalScore += fourOfAKindScore;
        Main.bottomScore+= fourOfAKindScore;
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
        if (onesPlayed && twosPlayed && threesPlayed && foursPlayed && fivesPlayed && sixesPlayed && threeOfAKindPlayed&&fourOfAKindPlayed&&fullHousePlayed&&smallStraightPlayed&&largeStraightPlayed&&yahtzeePlayed&&chancePlayed) {
            label.setText("GAME OVER!\nYour Final score is: " + finalScore + " points!");
            ones.setVisible(false);
            twos.setVisible(false);
            threes.setVisible(false);
            fours.setVisible(false);
            fives.setVisible(false);
            sixes.setVisible(false);
            threeOfAKind.setVisible(false);
            fourOfAKind.setVisible(false);
            fullHouse.setVisible(false);
            smallStraight.setVisible(false);
            largeStraight.setVisible(false);
            chance.setVisible(false);
            yahtzee.setVisible(false);
            dice1.setVisible(false);
            dice2.setVisible(false);
            dice3.setVisible(false);
            dice4.setVisible(false);
            dice5.setVisible(false);
            back.setVisible(false);
            scoreCard.setVisible(true);
            again.setVisible(true);
            dice1Label.setVisible(false);
            dice2Label.setVisible(false);
            dice3Label.setVisible(false);
            dice4Label.setVisible(false);
            dice5Label.setVisible(false);
        } else {
            roll.setVisible(true);
            score.setVisible(true);
            scoreCard.setVisible(true);
            ones.setVisible(false);
            twos.setVisible(false);
            threes.setVisible(false);
            fours.setVisible(false);
            fives.setVisible(false);
            sixes.setVisible(false);
            threeOfAKind.setVisible(false);
            fourOfAKind.setVisible(false);
            fullHouse.setVisible(false);
            smallStraight.setVisible(false);
            largeStraight.setVisible(false);
            chance.setVisible(false);
            yahtzee.setVisible(false);
            dice5Label.setText("Saved die: No");
            dice4Label.setText("Saved die: No");
            dice3Label.setText("Saved die: No");
            dice2Label.setText("Saved die: No");
            dice1Label.setText("Saved die: No");
            Main.scoreRollPress = false;
        }
    }
});
fullHouse.addActionListener(new ActionListener() {
    @Override
    public void actionPerformed(ActionEvent e) {
        fullHousePlayed=true;
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
        if(onesCount==3&&twosCount==2||onesCount==3&&threesCount==2||onesCount==3&&foursCount==2||onesCount==3&&fivesCount==2||onesCount==3&&sixesCount==2||twosCount==3&&onesCount==2||twosCount==3&&threesCount==2||twosCount==3&&foursCount==2||twosCount==3&&fivesCount==2||twosCount==3&&sixesCount==2||threesCount==3&&twosCount==2||threesCount==3&&onesCount==2||threesCount==3&&foursCount==2||threesCount==3&&fivesCount==2||threesCount==3&&sixesCount==2||foursCount==3&&twosCount==2||foursCount==3&&threesCount==2||foursCount==3&&onesCount==2||foursCount==3&&fivesCount==2||foursCount==3&&sixesCount==2||fivesCount==3&&twosCount==2||fivesCount==3&&threesCount==2||fivesCount==3&&foursCount==2||fivesCount==3&&onesCount==2||fivesCount==3&&sixesCount==2||sixesCount==3&&twosCount==2||sixesCount==3&&threesCount==2||sixesCount==3&&foursCount==2||sixesCount==3&&fivesCount==2||sixesCount==3&&onesCount==2){
            Main.fullHouseScore = 25;
        }
        Main.finalScore+=fullHouseScore;
        Main.bottomScore+=fullHouseScore;
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
        if (onesPlayed && twosPlayed && threesPlayed && foursPlayed && fivesPlayed && sixesPlayed && threeOfAKindPlayed&&fourOfAKindPlayed&&fullHousePlayed&&smallStraightPlayed&&largeStraightPlayed&&yahtzeePlayed&&chancePlayed){
            label.setText("GAME OVER!\nYour Final score is: " + finalScore + " points!");
            ones.setVisible(false);
            twos.setVisible(false);
            threes.setVisible(false);
            fours.setVisible(false);
            fives.setVisible(false);
            sixes.setVisible(false);
            threeOfAKind.setVisible(false);
            fourOfAKind.setVisible(false);
            fullHouse.setVisible(false);
            smallStraight.setVisible(false);
            largeStraight.setVisible(false);
            chance.setVisible(false);
            yahtzee.setVisible(false);
            dice1.setVisible(false);
            dice2.setVisible(false);
            dice3.setVisible(false);
            dice4.setVisible(false);
            dice5.setVisible(false);
            back.setVisible(false);
            scoreCard.setVisible(true);
            again.setVisible(true);
            dice1Label.setVisible(false);
            dice2Label.setVisible(false);
            dice3Label.setVisible(false);
            dice4Label.setVisible(false);
            dice5Label.setVisible(false);
        } else {
            roll.setVisible(true);
            score.setVisible(true);
            scoreCard.setVisible(true);
            ones.setVisible(false);
            twos.setVisible(false);
            threes.setVisible(false);
            fours.setVisible(false);
            fives.setVisible(false);
            sixes.setVisible(false);
            threeOfAKind.setVisible(false);
            fourOfAKind.setVisible(false);
            fullHouse.setVisible(false);
            smallStraight.setVisible(false);
            largeStraight.setVisible(false);
            chance.setVisible(false);
            yahtzee.setVisible(false);
            dice5Label.setText("Saved die: No");
            dice4Label.setText("Saved die: No");
            dice3Label.setText("Saved die: No");
            dice2Label.setText("Saved die: No");
            dice1Label.setText("Saved die: No");
            Main.scoreRollPress = false;
        }
    }
});
smallStraight.addActionListener(new ActionListener() {
    @Override
    public void actionPerformed(ActionEvent e) {
        Main.smallStraightPlayed=true;
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
        if(onesCount>=1&&twosCount>=1&&threesCount>=1&&foursCount>=1||twosCount>=1&&threesCount>=1&&foursCount>=1&&fivesCount>=1||threesCount>=1&&foursCount>=1&&fivesCount>=1&&sixesCount>=1){
            Main.smallStraightScore = 30;
        }
        Main.finalScore+=smallStraightScore;
        Main.bottomScore+=smallStraightScore;
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
        if (onesPlayed && twosPlayed && threesPlayed && foursPlayed && fivesPlayed && sixesPlayed && threeOfAKindPlayed&&fourOfAKindPlayed&&fullHousePlayed&&smallStraightPlayed&&largeStraightPlayed&&yahtzeePlayed&&chancePlayed){
            label.setText("GAME OVER!\nYour Final score is: " + finalScore + " points!");
            ones.setVisible(false);
            twos.setVisible(false);
            threes.setVisible(false);
            fours.setVisible(false);
            fives.setVisible(false);
            sixes.setVisible(false);
            threeOfAKind.setVisible(false);
            fourOfAKind.setVisible(false);
            fullHouse.setVisible(false);
            smallStraight.setVisible(false);
            largeStraight.setVisible(false);
            chance.setVisible(false);
            yahtzee.setVisible(false);
            dice1.setVisible(false);
            dice2.setVisible(false);
            dice3.setVisible(false);
            dice4.setVisible(false);
            dice5.setVisible(false);
            back.setVisible(false);
            scoreCard.setVisible(true);
            again.setVisible(true);
            dice1Label.setVisible(false);
            dice2Label.setVisible(false);
            dice3Label.setVisible(false);
            dice4Label.setVisible(false);
            dice5Label.setVisible(false);
        } else {
            roll.setVisible(true);
            score.setVisible(true);
            scoreCard.setVisible(true);
            ones.setVisible(false);
            twos.setVisible(false);
            threes.setVisible(false);
            fours.setVisible(false);
            fives.setVisible(false);
            sixes.setVisible(false);
            threeOfAKind.setVisible(false);
            fourOfAKind.setVisible(false);
            fullHouse.setVisible(false);
            smallStraight.setVisible(false);
            largeStraight.setVisible(false);
            chance.setVisible(false);
            yahtzee.setVisible(false);
            dice5Label.setText("Saved die: No");
            dice4Label.setText("Saved die: No");
            dice3Label.setText("Saved die: No");
            dice2Label.setText("Saved die: No");
            dice1Label.setText("Saved die: No");
            Main.scoreRollPress = false;
        }
    }
});
largeStraight.addActionListener(new ActionListener() {
    @Override
    public void actionPerformed(ActionEvent e) {
        Main.largeStraightPlayed=true;
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
        if(onesCount==1&&twosCount==1&&threesCount==1&&foursCount==1&&fivesCount==1||twosCount==1&&threesCount==1&&foursCount==1&&fivesCount==1&&sixesCount==1){
            Main.largeStraightScore = 40;
        }
        Main.finalScore+=largeStraightScore;
        Main.bottomScore+=largeStraightScore;
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
        if (onesPlayed && twosPlayed && threesPlayed && foursPlayed && fivesPlayed && sixesPlayed && threeOfAKindPlayed&&fourOfAKindPlayed&&fullHousePlayed&&smallStraightPlayed&&largeStraightPlayed&&yahtzeePlayed&&chancePlayed){
            label.setText("GAME OVER!\nYour Final score is: " + finalScore + " points!");
            ones.setVisible(false);
            twos.setVisible(false);
            threes.setVisible(false);
            fours.setVisible(false);
            fives.setVisible(false);
            sixes.setVisible(false);
            threeOfAKind.setVisible(false);
            fourOfAKind.setVisible(false);
            fullHouse.setVisible(false);
            smallStraight.setVisible(false);
            largeStraight.setVisible(false);
            chance.setVisible(false);
            yahtzee.setVisible(false);
            dice1.setVisible(false);
            dice2.setVisible(false);
            dice3.setVisible(false);
            dice4.setVisible(false);
            dice5.setVisible(false);
            back.setVisible(false);
            scoreCard.setVisible(true);
            again.setVisible(true);
            dice1Label.setVisible(false);
            dice2Label.setVisible(false);
            dice3Label.setVisible(false);
            dice4Label.setVisible(false);
            dice5Label.setVisible(false);
        } else {
            roll.setVisible(true);
            score.setVisible(true);
            scoreCard.setVisible(true);
            ones.setVisible(false);
            twos.setVisible(false);
            threes.setVisible(false);
            fours.setVisible(false);
            fives.setVisible(false);
            sixes.setVisible(false);
            threeOfAKind.setVisible(false);
            fourOfAKind.setVisible(false);
            fullHouse.setVisible(false);
            smallStraight.setVisible(false);
            largeStraight.setVisible(false);
            chance.setVisible(false);
            yahtzee.setVisible(false);
            dice5Label.setText("Saved die: No");
            dice4Label.setText("Saved die: No");
            dice3Label.setText("Saved die: No");
            dice2Label.setText("Saved die: No");
            dice1Label.setText("Saved die: No");
            Main.scoreRollPress = false;
        }
    }
});
yahtzee.addActionListener(new ActionListener() {
    @Override
    public void actionPerformed(ActionEvent e) {

        int onesCount = 0;
        int twosCount = 0;
        int threesCount = 0;
        int foursCount = 0;
        int fivesCount = 0;
        int sixesCount = 0;
        if (saveDie1Num == 1) {
            onesCount++;
        }
        if (saveDie2Num == 1) {
            onesCount++;
        }
        if (saveDie3Num == 1) {
            onesCount++;
        }
        if (saveDie4Num == 1) {
            onesCount++;
        }
        if (saveDie5Num == 1) {
            onesCount++;
        }
        if (saveDie1Num == 2) {
            twosCount++;
        }
        if (saveDie2Num == 2) {
            twosCount++;
        }
        if (saveDie3Num == 2) {
            twosCount++;
        }
        if (saveDie4Num == 2) {
            twosCount++;
        }
        if (saveDie5Num == 2) {
            twosCount++;
        }
        if (saveDie1Num == 3) {
            threesCount++;
        }
        if (saveDie2Num == 3) {
            threesCount++;
        }
        if (saveDie3Num == 3) {
            threesCount++;
        }
        if (saveDie4Num == 3) {
            threesCount++;
        }
        if (saveDie5Num == 3) {
            threesCount++;
        }
        if (saveDie1Num == 4) {
            foursCount++;
        }
        if (saveDie2Num == 4) {
            foursCount++;
        }
        if (saveDie3Num == 4) {
            foursCount++;
        }
        if (saveDie4Num == 4) {
            foursCount++;
        }
        if (saveDie5Num == 4) {
            foursCount++;
        }
        if (saveDie1Num == 5) {
            fivesCount++;
        }
        if (saveDie2Num == 5) {
            fivesCount++;
        }
        if (saveDie3Num == 5) {
            fivesCount++;
        }
        if (saveDie4Num == 5) {
            fivesCount++;
        }
        if (saveDie5Num == 5) {
            fivesCount++;
        }
        if (saveDie1Num == 6) {
            sixesCount++;
        }
        if (saveDie2Num == 6) {
            sixesCount++;
        }
        if (saveDie3Num == 6) {
            sixesCount++;
        }
        if (saveDie4Num == 6) {
            sixesCount++;
        }
        if (saveDie5Num == 6) {
            sixesCount++;
        }
    if(onesCount==5||twosCount==5||threesCount==5||foursCount==5||fivesCount==5||sixesCount==5){
        if(yahtzeeCount==0) {
            Main.yahtzeeScore = 50;
            Main.finalScore += 50;
            Main.yahtzeeCount++;
            Main.yahtzeePlayed=true;
        }else{
            Main.yahtzeeBonusScore+=100;
            Main.finalScore+=100;
            Main.yahtzeeCount++;
        }
    }if(onesCount<=4&&twosCount<=4&&threesCount<=4&&foursCount<=4&&fivesCount<=4&&sixesCount<=4){
        Main.yahtzeePlayed=true;
        Main.yahtzeeCount=0;
    }
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
        if (onesPlayed && twosPlayed && threesPlayed && foursPlayed && fivesPlayed && sixesPlayed && threeOfAKindPlayed&&fourOfAKindPlayed&&fullHousePlayed&&smallStraightPlayed&&largeStraightPlayed&&yahtzeePlayed&&chancePlayed) {
            label.setText("GAME OVER!\nYour Final score is: " + finalScore + " points!");
            ones.setVisible(false);
            twos.setVisible(false);
            threes.setVisible(false);
            fours.setVisible(false);
            fives.setVisible(false);
            sixes.setVisible(false);
            threeOfAKind.setVisible(false);
            fourOfAKind.setVisible(false);
            fullHouse.setVisible(false);
            smallStraight.setVisible(false);
            largeStraight.setVisible(false);
            chance.setVisible(false);
            yahtzee.setVisible(false);
            dice1.setVisible(false);
            dice2.setVisible(false);
            dice3.setVisible(false);
            dice4.setVisible(false);
            dice5.setVisible(false);
            back.setVisible(false);
            scoreCard.setVisible(true);
            again.setVisible(true);
            dice1Label.setVisible(false);
            dice2Label.setVisible(false);
            dice3Label.setVisible(false);
            dice4Label.setVisible(false);
            dice5Label.setVisible(false);
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
            fourOfAKind.setVisible(false);
            fullHouse.setVisible(false);
            smallStraight.setVisible(false);
            largeStraight.setVisible(false);
            chance.setVisible(false);
            yahtzee.setVisible(false);
            scoreCard.setVisible(true);
            Main.scoreRollPress = false;
            dice5Label.setText("Saved die: No");
            dice4Label.setText("Saved die: No");
            dice3Label.setText("Saved die: No");
            dice2Label.setText("Saved die: No");
            dice1Label.setText("Saved die: No");
        }
    }
});
chance.addActionListener(new ActionListener() {
    @Override
    public void actionPerformed(ActionEvent e) {
        Main.chancePlayed = true;
        Main.chanceScore = saveDie1Num+saveDie2Num+saveDie3Num+saveDie4Num+saveDie5Num;
        Main.finalScore+=chanceScore;
        Main.bottomScore += chanceScore;
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
        if (onesPlayed && twosPlayed && threesPlayed && foursPlayed && fivesPlayed && sixesPlayed && threeOfAKindPlayed&&fourOfAKindPlayed&&fullHousePlayed&&smallStraightPlayed&&largeStraightPlayed&&yahtzeePlayed&&chancePlayed) {
            label.setText("GAME OVER!\nYour Final score is: " + finalScore + " points!");
            ones.setVisible(false);
            twos.setVisible(false);
            threes.setVisible(false);
            fours.setVisible(false);
            fives.setVisible(false);
            sixes.setVisible(false);
            threeOfAKind.setVisible(false);
            fourOfAKind.setVisible(false);
            fullHouse.setVisible(false);
            smallStraight.setVisible(false);
            largeStraight.setVisible(false);
            chance.setVisible(false);
            yahtzee.setVisible(false);
            dice1.setVisible(false);
            dice2.setVisible(false);
            dice3.setVisible(false);
            dice4.setVisible(false);
            dice5.setVisible(false);
            back.setVisible(false);
            scoreCard.setVisible(true);
            again.setVisible(true);
            dice1Label.setVisible(false);
            dice2Label.setVisible(false);
            dice3Label.setVisible(false);
            dice4Label.setVisible(false);
            dice5Label.setVisible(false);
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
            fourOfAKind.setVisible(false);
            fullHouse.setVisible(false);
            smallStraight.setVisible(false);
            largeStraight.setVisible(false);
            chance.setVisible(false);
            yahtzee.setVisible(false);
            scoreCard.setVisible(true);
            Main.scoreRollPress = false;
            dice5Label.setText("Saved die: No");
            dice4Label.setText("Saved die: No");
            dice3Label.setText("Saved die: No");
            dice2Label.setText("Saved die: No");
            dice1Label.setText("Saved die: No");
        }
    }
});
again.addActionListener(new ActionListener() {
    @Override
    public void actionPerformed(ActionEvent e) {
        Main.resetGame();
        again.setVisible(false);
        label.setText("Welcome to Yahtzee! Select a option");
        label.setVisible(true);
        computer1.setVisible(true);
        computer2.setVisible(true);
        computer3.setVisible(true);
        noComputer.setVisible(true);
        scoreCard.setVisible(false);
        scoreCardOnes.setVisible(false);
        scoreCardTwos.setVisible(false);
        scoreCardThrees.setVisible(false);
        scoreCardFours.setVisible(false);
        scoreCardFives.setVisible(false);
        scoreCardSixes.setVisible(false);
        scoreCardBonus.setVisible(false);
        scoreCardTopScore.setVisible(false);
        scoreCardTOK.setVisible(false);
        scoreCardFOK.setVisible(false);
        scoreCardFH.setVisible(false);
        scoreCardSS.setVisible(false);
        scoreCardLS.setVisible(false);
        scoreCardYAH.setVisible(false);
        scorecardYAHB.setVisible(false);
        scoreCardChance.setVisible(false);
        scoreCardBottom.setVisible(false);
        scoreCardFinal.setVisible(false);
    }
});
scoreCard.addActionListener(new ActionListener() {
    @Override
    public void actionPerformed(ActionEvent e) {
        dice1.setVisible(false);
        dice2.setVisible(false);
        dice3.setVisible(false);
        dice4.setVisible(false);
        dice5.setVisible(false);
        roll.setVisible(false);
        score.setVisible(false);
        label.setVisible(false);
        Main.scoreCardPress = true;
        scoreCard.setVisible(false);
scoreCardOnes.setVisible(true);
        scoreCardTwos.setVisible(true);
        scoreCardThrees.setVisible(true);
        scoreCardFours.setVisible(true);
        scoreCardFives.setVisible(true);
        scoreCardSixes.setVisible(true);
        scoreCardBonus.setVisible(true);
        scoreCardTopScore.setVisible(true);
        scoreCardTOK.setVisible(true);
        scoreCardFOK.setVisible(true);
        scoreCardFH.setVisible(true);
        scoreCardSS.setVisible(true);
        scoreCardLS.setVisible(true);
        scoreCardYAH.setVisible(true);
        scorecardYAHB.setVisible(true);
        scoreCardChance.setVisible(true);
        scoreCardBottom.setVisible(true);
        scoreCardFinal.setVisible(true);
        dice5Label.setVisible(false);
        dice4Label.setVisible(false);
        dice3Label.setVisible(false);
        dice2Label.setVisible(false);
        dice1Label.setVisible(false);

scoreCardOnes.setText("Ones: " + onesScore);
scoreCardTwos.setText("Twos: " + twosScore);
scoreCardThrees.setText("Threes: " + threesScore);
scoreCardFours.setText("Fours: " + foursScore);
scoreCardFives.setText("Fives: " + fivesScore);
scoreCardSixes.setText("Sixes: " + sixesScore);
scoreCardTopScore.setText("Top Score: " + topScore);
if(63<=topScore){
    scoreCardBonus.setText("BONUS: ACHIEVED +35");
    Main.topScore+=35;
}else{
    scoreCardBonus.setText("BONUS: NOT ACHIEVED");
}
        scoreCardTOK.setText("Three of a Kind: " + threeOfAKindScore);
        scoreCardFOK.setText("Four of a Kind: " + fourOfAKindScore);
        scoreCardFH.setText("Full House: " + fullHouseScore);
        scoreCardSS.setText("Small Straight: " + smallStraightScore);
        scoreCardLS.setText("Large Straight: " + largeStraightScore);
        scoreCardYAH.setText("Yahtzee: " + yahtzeeScore);
        scoreCardChance.setText("Chance: " + chanceScore);
        scorecardYAHB.setText("Yahztee Bonus: +" + yahtzeeBonusScore);
        scoreCardBottom.setText("Bottom Score: " + bottomScore);
        scoreCardFinal.setText("Total Score: " + finalScore);
    }
});
back.addActionListener(new ActionListener() {
    @Override
    public void actionPerformed(ActionEvent e) {
        if(scoreRollPress){
            roll.setVisible(true);
            score.setVisible(true);
            ones.setVisible(false);
            twos.setVisible(false);
            threes.setVisible(false);
            fours.setVisible(false);
            fives.setVisible(false);
            sixes.setVisible(false);
            threeOfAKind.setVisible(false);
            fourOfAKind.setVisible(false);
            fullHouse.setVisible(false);
            smallStraight.setVisible(false);
            largeStraight.setVisible(false);
            chance.setVisible(false);
            yahtzee.setVisible(false);
            scoreCard.setVisible(true);
            Main.scoreRollPress = false;
        }else if(scoreCardPress){
            dice1.setVisible(true);
            dice2.setVisible(true);
            dice3.setVisible(true);
            dice4.setVisible(true);
            dice5.setVisible(true);
            roll.setVisible(true);
            score.setVisible(true);
            label.setVisible(true);
            dice5Label.setVisible(true);
            dice4Label.setVisible(true);
            dice3Label.setVisible(true);
            dice2Label.setVisible(true);
            dice1Label.setVisible(true);
            scoreCardOnes.setVisible(false);
            scoreCardTwos.setVisible(false);
            scoreCardThrees.setVisible(false);
            scoreCardFours.setVisible(false);
            scoreCardFives.setVisible(false);
            scoreCardSixes.setVisible(false);
            scoreCardBonus.setVisible(false);
            scoreCardTopScore.setVisible(false);
            scoreCardTOK.setVisible(false);
            scoreCardFOK.setVisible(false);
            scoreCardFH.setVisible(false);
            scoreCardSS.setVisible(false);
            scoreCardLS.setVisible(false);
            scoreCardYAH.setVisible(false);
            scorecardYAHB.setVisible(false);
            scoreCardChance.setVisible(false);
            scoreCardBottom.setVisible(false);
            scoreCardFinal.setVisible(false);
            scoreCard.setVisible(true);
            Main.scoreCardPress = false;
        }else{
            label.setText("There is nothing to go back to");
        }
    }
});
    }
    public static void resetGame(){
        Main.onesScore = 0;
        Main.twosScore = 0;
        Main.threesScore = 0;
        Main.foursScore = 0;
        Main.fivesScore = 0;
        Main.sixesScore = 0;
        Main.threeOfAKindScore = 0;
        Main.fourOfAKindScore = 0;
        Main.fullHouseScore = 0;
        Main.smallStraightScore = 0;
        Main.largeStraightScore = 0;
        Main.yahtzeeCount = 0;
        Main.yahtzeeBonusScore = 0;
        Main.yahtzeeScore = 0;
        Main.countRolls = 0;
        Main.chanceScore = 0;
        Main.bottomScore = 0;
        Main.finalScore = 0;
        Main.topScore = 0;
        Main.onesPlayed = false;
        Main.twosPlayed = false;
        Main.threesPlayed = false;
        Main.foursPlayed = false;
        Main.fivesPlayed = false;
        Main.sixesPlayed = false;
        Main.threeOfAKindPlayed = false;
        Main.fourOfAKindPlayed = false;
        Main.fullHousePlayed = false;
        Main.smallStraightPlayed = false;
        Main.largeStraightPlayed = false;
        Main.yahtzeeBonusMax = false;
        Main.yahtzeePlayed = false;
        Main.chancePlayed = false;
    }
}