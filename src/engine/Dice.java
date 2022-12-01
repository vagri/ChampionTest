package engine;

import java.util.Random;

public class Dice {

    public static int use(){
        Random rand = new Random();
        return rand.nextInt(100);
    }
}
