import javax.imageio.plugins.tiff.TIFFImageReadParam;
import java.awt.*;

public class AI {
    private int[] scores;
    static private boolean[] scorePlayed;
    public AI(){
        scores = new int[14];
        scorePlayed = new boolean[14];
    }
    public void scoreRoll(int s, int p){
        scores[p] = s;
        scorePlayed[p] = true;
    }
    public static int calculateScore(int[] dice) {
        int score = 0;
        if(isYahtzee(dice)){
            score = 50;
        }
        else if (isThreeOfAKind(dice)) {
            score = sumOfDice(dice);
        }
        else if(isFourOfAKind(dice)){
            score = sumOfDice(dice);
        }
        else if(isFullHouse(dice)){
            score = 25;
        }
        else if(shouldKeepForStraight(dice)){
            int ones = 0;
            int twos = 0;
            int threes = 0;
            int fours = 0;
            int fives = 0;
            int sixes = 0;
            for (int count : dice) {
                if (count == 1) {
                    ones++;
                }
                if (count == 2) {
                    twos++;
                }
                if (count == 3) {
                    threes++;
                }
                if (count == 4) {
                    fours++;
                }
                if (count == 5) {
                    fives++;
                }
                if (count == 6) {
                    sixes++;
                }
            }
            if(ones>=1&&twos>=1&&threes>=1&&fours>=1||twos>=1&&threes>=1&&fours>=1&&fives>=1||threes>=1&&fours>=1&&fives>=1&&sixes>=1){
                score = 30;
            }
            else if(ones==1&&twos==1&&threes==1&&fours==1&&fives==1||twos==1&&threes==1&&fours==1&&fives==1&&sixes==1){
                score = 40;
            }
        }
       else if(shouldKeepForTopSection(dice,1,0)){
            score = sumOfDiceS(dice,1);
        }
       else if(shouldKeepForTopSection(dice,2,1)){
            score = sumOfDiceS(dice,2);
        }
       else if(shouldKeepForTopSection(dice,3,2)){
            score = sumOfDiceS(dice,3);
        }
       else if(shouldKeepForTopSection(dice, 4, 3)){
           score = sumOfDiceS(dice,4);
        }
       else if(shouldKeepForTopSection(dice, 5,4)){
           score = sumOfDiceS(dice,5);
        }
       else if(shouldKeepForTopSection(dice, 6, 5)){
           score = sumOfDiceS(dice,6);
        }
        else if(scorePlayed[13]==false){
            score = sumOfDice(dice);
        }
        return score;
    }
public static boolean isFullHouse(int[]dice){
    int ones = 0;
    int twos = 0;
    int threes = 0;
    int fours = 0;
    int fives = 0;
    int sixes = 0;
    for (int count : dice) {
        if (count == 1) {
            ones++;
        }
        if (count == 2) {
            twos++;
        }
        if (count == 3) {
            threes++;
        }
        if (count == 4) {
            fours++;
        }
        if (count == 5) {
            fives++;
        }
        if (count == 6) {
            sixes++;
        }
    }
    if(ones==3&&twos==2||ones==3&&threes==2||ones==3&&fours==2||ones==3&&fives==2||ones==3&&sixes==2||twos==3&&ones==2||twos==3&&threes==2||twos==3&&fours==2||twos==3&&fives==2||twos==3&&sixes==2||threes==3&&twos==2||threes==3&&ones==2||threes==3&&fours==2||threes==3&&fives==2||threes==3&&sixes==2||fours==3&&twos==2||fours==3&&threes==2||fours==3&&ones==2||fours==3&&fives==2||fours==3&&sixes==2||fives==3&&twos==2||fives==3&&threes==2||fives==3&&fours==2||fives==3&&ones==2||fives==3&&sixes==2||sixes==3&&twos==2||sixes==3&&threes==2||sixes==3&&fours==2||sixes==3&&fives==2||sixes==3&&ones==2){
return true;
    }
    return false;
}
public static boolean isYahtzee(int[] dice){
        for(int i = 1; i<=6;i++){
            int count = 0;
            for(int die : dice){
                if(die == i){
                    count++;
                }
            }
            if(count==5){
                return true;
            }
        }
        return false;
}

    // Checks if the dice have a "Three of a Kind" combination
    public static boolean isThreeOfAKind(int[] dice) {
        for (int i = 1; i <= 6; i++) {
            int count = 0;
            for (int die : dice) {
                if (die == i) {
                    count++;
                }
            }
            if (count >= 3&&scorePlayed[6]==false) {
                return true;
            }
        }
        return false;
    }
public static boolean isFourOfAKind(int[]dice){
        for(int i = 1; i<=6;i++){
            int count = 0;
            for(int die : dice){
                if(die==i){
                    count++;
                }
            }
            if(count >=4&&scorePlayed[7]==false){
                return true;
            }
        }
        return false;
}
public static boolean shouldKeepForTopSection(int[]dice,int value,int v){
        int count = 0;
        for(int die : dice){
            if(die==value){
                count++;
            }
        }
        if(count>=2&&scorePlayed[v]==false){
            return true;
        }
        return false;
}
    // Calculates the sum of all dice values
    public static int sumOfDice(int[] dice) {
        int sum = 0;
        for (int die : dice) {
            sum += die;
        }
        return sum;
    }
public static int sumOfDiceS(int[] d,int v){
        int sum = 0;
        for(int die : d){
            if(die==v){
                sum+=die;
            }
        }
        return sum;
}
public static boolean shouldKeepForStraight(int[] dice) {
    int ones = 0;
    int twos = 0;
    int threes = 0;
    int fours = 0;
    int fives = 0;
    int sixes = 0;
    for (int count : dice) {
        if (count == 1) {
            ones++;
        }
        if (count == 2) {
            twos++;
        }
        if (count == 3) {
            threes++;
        }
        if (count == 4) {
            fours++;
        }
        if (count == 5) {
            fives++;
        }
        if (count == 6) {
            sixes++;
        }
    }
    if (ones >= 1 && twos >= 1 && threes >= 1 || ones >= 1 && threes >= 1 && fours >= 1||ones>=1&&fours>=1&&fives>=1||twos>=1&&threes>=1&&fours>=1||twos>=1&&fours>=1&&fives>=1||twos>=1&&fives>=1&&sixes>=1||threes>=1&&fours>=1&&fives>=1||threes>=1&&fives>=1&&sixes>=1||fours>=1&&fives>=1&&sixes>=1) {
    return true;
    }
    return false;
}

}
