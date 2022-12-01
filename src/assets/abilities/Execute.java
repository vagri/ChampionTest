package assets.abilities;

import assets.Ability;
import assets.PlayerStats;

public class Execute extends Ability {

    private static int ID = 3;
    private static final String NAME = "Execute";
    private static final int RAGE_COST = 0;
    private static final int DAMAGE = 55;
    private static final int RAGE_GAIN = 20;
    private static final int CD = 0;

    public Execute(){
        super(ID, RAGE_COST, CD);
    }

    @Override
    public void cast(Character character){
        PlayerStats.setCurrentHP(PlayerStats.getCurrentHP() - DAMAGE);
        PlayerStats.setCurrentResourse(PlayerStats.getCurrentResourse() + RAGE_GAIN);
    }


}
