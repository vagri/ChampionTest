package assets.effects;

import assets.PlayerStats;
import engine.Dice;
import assets.Effect;

public abstract class ExecutionerPassive extends Effect {

    private static int ID = 1;
    private static final String NAME = "Grievious Wounds";
    private static final int duration = -1;
    private static final int BLEED_CHANCE = 25;

    public ExecutionerPassive(){
        super(ID, duration);
    }

    @Override
    public void apply(Character character){
        int dice = Dice.use();
        if (dice <25){
            // add bleed effect on effect table
        }
    }

    public static void init(){
        Effect.setDuration(duration);
    }

}
