public class AI {
    private int[] scores;
    private boolean[] scorePlayed;
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
        if (isThreeOfAKind(dice)) {
            score = sumOfDice(dice);
        }
        if(isFourOfAKind(dice)){
            score = sumOfDice(dice);
        }
        return score;
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
            if (count >= 3) {
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
            if(count >=4){
                return true;
            }
        }
        return false;
}
public static boolean shouldKeepForTopSection(int[]dice,int value){
        int count = 0;
        for(int die : dice){
            if(die==value){
                count++;
            }
        }
        if(count>=value){
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

    // Utility method to convert dice array to a string for printing
    public static String diceToString(int[] dice) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < dice.length; i++) {
            sb.append(dice[i]);
            if (i < dice.length - 1) {
                sb.append(", ");
            }
        }
        return sb.toString();
    }
}
