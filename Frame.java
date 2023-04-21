public class Frame {


    protected int frameScore = 0;
    protected boolean strike = false;
    protected boolean spare = false;
    protected int throw1Pins = 0;
    protected int throw2Pins = 0;


    public Frame(int throw1Pins, int throw2Pins) {

        this.throw1Pins = throw1Pins;
        this.throw2Pins = throw2Pins;

    }


    public void calcFrameScore() {

        if(throw1Pins == 10) {
            // Strike
            strike = true;
        } else if( throw1Pins + throw2Pins == 10) {
            //Spare
            spare = true;
        } else {
            frameScore = throw1Pins + throw2Pins;
        }
        
    }










    public int getFrameScore() {
        return frameScore;
    }

    public int getthrow1Pins() {
        return throw1Pins;
    }

    public int getthrow2Pins() {
        return throw2Pins;
    }

    public void setframeScore(int score) {
        frameScore = score;
    }

    public boolean getStrike() {
        return strike;
    }

    public boolean getSpare() {
        return spare;
    }
    
}
