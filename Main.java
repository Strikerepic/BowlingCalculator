import java.util.Scanner;

public class Main {

    public static int throw1Pins = 0;
    public static int throw2Pins = 0;


    public static void main(String[] args) {

        boolean whenITellYouTo = false;

        Scanner sc = new Scanner(System.in);


        BowlingDisplay display = new BowlingDisplay();

        Frame[] game = new Frame[10];



        for(int i = 0; i < game.length; i++ ) {
                //All but final frame
            if(i < 9) {

                System.out.println("Throw 1 Num Pins:");
                throw1Pins = sc.nextInt();
                System.out.println("Throw 2 Num Pins:");
                throw2Pins = sc.nextInt();


                game[i] = new Frame(throw1Pins, throw2Pins);
                game[i].calcFrameScore();



                //Strike Calculation
                if(i > 0 && game[i-1].getStrike() && !game[i].getStrike()) {
                    game[i-1].setframeScore(10 + game[i].getthrow1Pins() + game[i].getthrow2Pins());
                }
                if(i > 1 && game[i-2].getStrike() && game[i-1].getStrike()) {
                    game[i-2].setframeScore(10 + 10 + game[i].getthrow1Pins());
                }


                if(i > 0 && game[i-1].getSpare()) {
                    game[i-1].setframeScore(10 + game[i].getthrow1Pins());
                }


                game[i] = new Frame(throw1Pins, throw2Pins);
                game[i].calcFrameScore();


                // Final Frame Calculations
            } else {



                System.out.println("FINAL FRAME");
                System.out.println("Throw 1 Num Pins:");
                int throw1Pins = sc.nextInt();
                System.out.println("Throw 2 Num Pins:");
                int throw2Pins = sc.nextInt();

                if(throw1Pins + throw2Pins >= 10) {
                    System.out.println("Throw 3 Num Pins:");
                    int throw3Pins = sc.nextInt();
                    game[game.length-1] = new FinalFrame(throw1Pins, throw2Pins, throw3Pins);

                } else {
                    game[game.length-1] = new FinalFrame(throw1Pins,throw2Pins);
                }

                if(game[i-1].getStrike()) {
                    game[i-1].setframeScore(10 + game[i].getthrow1Pins() + game[i].getthrow2Pins());
                }
                if(game[i-2].getStrike() && game[i-1].getStrike()) {
                    game[i-2].setframeScore(10 + 10 + game[i].getthrow1Pins());
                }

                game[i].calcFrameScore();

                
            }

            System.out.println("frame:" + i + "->" + game[i].getFrameScore());
            try{
            System.out.println("frame:" + (i-1) + "->" + game[i-1].getFrameScore());
            System.out.println("frame:" + (i-2) + "->" + game[i-2].getFrameScore());
            } catch (Exception e) {}



            
        }




        int total = 0;
        for(int i = 0; i < game.length; i++) {
            total += game[i].getFrameScore();
        }

        System.out.println(total);

    }

}
