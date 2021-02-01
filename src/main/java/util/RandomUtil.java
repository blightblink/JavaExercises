package util;

import java.util.Random;

import streams.model.Coffee;
import streams.model.CoffeeType;
import streams.model.Size;

public class RandomUtil {

    private static Random rand = new Random();


    public static int randInt(int i){
        return rand.nextInt(i) + 1;

    }

    /**
     * @return a value up to x.9
     */
    public static double randomPrice(int x){

        return (randInt((x*10))+10)/10.0;
    }

    public static boolean randomBoolean(){
        return randInt(2) == 1 ;

    }



    public static Size randomSize(){
        switch (randInt(5)){
            case 1:
                return Size.S;
            case 2:
                return Size.M;
            case 3:
                return Size.L;
            case 4:
                return Size.XL;
            case 5:
                return Size.JUMBO;
            default:
                return Size.L;

        }
    }

    public static CoffeeType randomCoffeeName(){
        switch (randInt(5)){
            case 1:
                return CoffeeType.FREDDO_ESPRESSO;
            case 2:
                return CoffeeType.FREDDO_CAPPUCINO;
            case 3:
                return CoffeeType.ESPRESSO;
            case 4:
                return CoffeeType.CAPPUCINO;
            case 5:
                return CoffeeType.FRAPPE;
            default:
                return CoffeeType.GREEK_COFFEE;

        }
    }
    public static String randomSugarLevel(){
        switch (randInt(5)){
            case 1:
                return "Sketos";
            case 2:
                return "Oligi";
            case 3:
                return "Metrios";
            case 4:
                return "Glikos";
            case 5:
                return "Polu glikos";
            default:
                return "diavitis";

        }

    }

    public static Coffee randomCoffee(){
        Coffee coffee = new Coffee();

        coffee.setName(randomCoffeeName());
        coffee.setPrice(randomPrice(5));
        coffee.setBrownSugar(randomBoolean());
        coffee.setSize(randomSize());
        coffee.setSugarLevel(randomSugarLevel());

        return coffee;
    }

}
