package assets.effects;

import assets.Effect;
import assets.PlayerStats;

public class Burn extends Effect {

    private static final int ID = 2;
    private static final String NAME = "Burn";
    private static final int duration = 1;
    private static final int DAMAGE = 30;


    public Burn(){
        super(ID,duration);
    }

    public void apply(Character character){
        PlayerStats.setCurrentHP(PlayerStats.getCurrentHP() - DAMAGE);
        //minus 1 from effect table
    }


}
