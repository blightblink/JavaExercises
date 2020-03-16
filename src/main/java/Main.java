import java.util.Random;

public class Main {
    private static Random rand = new Random();

    public static void main(String[] args) {
        System.out.println(eldrichBlast());
    }

    /** Create a function that returns the damage of an eldrich blast cast by a lvl 5 WARLOCK !!
     *
     * use the power of the almighty dice generator( @rollADice ) provided by the gm ( @Me )
     * @return x
     */
    public static Integer eldrichBlast(){
        Integer x = null;

        //Write your code here

        return x;
    }

    /**
     *  Only me can touch this, please
     * @param dice
     * @return random number from 0 to x
     */
    public static Integer rollADice(Integer dice) {
        if(dice <= 0) {
            return 0;
        }
        return rand.nextInt(dice);
    }



}
