package assets.effects;

import assets.Effect;
import assets.PlayerStats;

public class Bleed extends Effect {

    private static final int ID = 0;
    private static final String NAME = "Bleed";
    private static final int duration = 2;
    private static final int DAMAGE = 20;


    public Bleed(){
        super(ID,duration);
    }

    public void apply(Character character){
        PlayerStats.setCurrentHP(PlayerStats.getCurrentHP() - DAMAGE);
        //minus 1 from effect table
    }

}
