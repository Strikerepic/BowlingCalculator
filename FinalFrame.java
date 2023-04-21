public class FinalFrame extends Frame {

    private int throw3Pins = 0;


    public FinalFrame(int throw1Pins, int throw2Pins, int throw3Pins) {
        super(throw1Pins, throw2Pins);
        this.throw3Pins = throw3Pins;
        
    }

    public FinalFrame(int throw1Pins, int throw2Pins) {
        super(throw1Pins, throw2Pins);
    }


    

    @Override
    public void calcFrameScore() {
        frameScore = throw1Pins + throw2Pins + throw3Pins;
    }
    
}
