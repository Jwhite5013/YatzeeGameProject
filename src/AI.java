public class AI {
    private int[] scores;
    private boolean[] scorePlayed;
    public AI(){
        scores = new int[14];
        scorePlayed = new boolean[14];
    }
    public boolean[] makeKeep(int d1, int d2, int d3, int d4, int d5){
        boolean[] keep = new boolean[5];
        if(keepOnes(d1,d2,d3,d4,d5)){
            if(d1==1){
                keep[0]=true;
            }
            if(d2==1){
                keep[1]=true;
            }
            if(d3==1){
                keep[2] = true;
            }
            if(d4==1){
                keep[3]=true;
            }
            if(d5==1){
                keep[4]=true;
            }
        }

        return keep;
    }
    public boolean keepOnes(int d1, int d2, int d3, int d4, int d5){
        int count = 2;
        if(d1==1){
            count++;
        }
        if(d2==1){
            count++;
        }
        if(d3==1){
            count++;
        }
        if(d4==1){
            count++;
        }
        if(d5==1){
            count++;
        }
        if(count>=3&&scorePlayed[0]==false||scorePlayed[1]==true&&scorePlayed[2]==true&&scorePlayed[3]==true&&scorePlayed[4]==true&&scorePlayed[5]==true&&scorePlayed[6]==true&&scorePlayed[7]==true&&scorePlayed[8]==true&&scorePlayed[9]==true&&scorePlayed[10]==true&&scorePlayed[11]==true&&scorePlayed[12]==true&&scorePlayed[13]==true||){
            return true;
        }
        else {
           return false;
        }
    }
    public boolean keepTwos(int d1, int d2, int d3, int d4, int d5){
        int count = 0;
        if(d1==2){
            count++;
        }
        if(d2==2){
            count++;
        }
        if(d3==2){
            count++;
        }
        if(d4==2){
            count++;
        }
        if(d5==2){
            count++;
        }
        if(count>=3&&scorePlayed[1]==false){
            return true;
        }
        else {
            return false;
        }
    }
    public boolean bestChoice(int d1, int d2, int d3, int d4, int d5){
        int onesCount = 0;
        int twosCount = 0;
        int threesCount = 0;
        int foursCount = 0;
        int fivesCount = 0;
        int sixesCount =0;
        if(d1==1){
            onesCount++;
        }
        if(d2==1){
            onesCount++;
        }
        if(d3==1){
            onesCount++;
        }
        if(d4==1){
            onesCount++;
        }
        if(d5==1){
            onesCount++;
        }
        if(d1==2){
            twosCount++;
        }
        if(d2==2){
            twosCount++;
        }
        if(d3==2){
            twosCount++;
        }
        if(d4==2){
            twosCount++;
        }
        if(d5==2){
            twosCount++;
        }
        if(d1==3){
            threesCount++;
        }
        if(d2==3){
            threesCount++;
        }
        if(d3==3){
            threesCount++;
        }
        if(d4==3){
            threesCount++;
        }
        if(d5==3){
            threesCount++;
        }
        if(d1==4){
            foursCount++;
        }
        if(d2==4){
            foursCount++;
        }
        if(d3==4){
            foursCount++;
        }
        if(d4==4){
            foursCount++;
        }
        if(d5==4){
            foursCount++;
        }
        if(d1==5){
            fivesCount++;
        }
        if(d2==5){
            fivesCount++;
        }
        if(d3==5){
            fivesCount++;
        }
        if(d4==5){
            fivesCount++;
        }
        if(d5==5){
            fivesCount++;
        }
        if(d1==6){
            sixesCount++;
        }
        if(d2==6){
            sixesCount++;
        }
        if(d3==6){
            sixesCount++;
        }
        if(d4==6){
            sixesCount++;
        }
        if(d5==6){
            sixesCount++;
        }

    }
}
