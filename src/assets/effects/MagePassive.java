package assets.effects;

import assets.Effect;
import engine.Dice;

public class MagePassive extends Effect {

    private static int ID = 3;
    private static final String NAME = "Spellbook";
    private static final int duration = -1;

    public MagePassive(){
        super(ID, duration);
    }

    public void apply(Character character){


    }

    public static void init(){

    }
}
