package assets.abilities;

import assets.Ability;
import assets.PlayerStats;

public class ManaShard extends Ability {


    private static int ID = 5;
    private static final String NAME = "Mana Shard";
    private static final int SELF_MANA_GAIN = 100;
    private static final int MANA_GAIN = 60;
    private static final int MANA_COST = 0;
    private static final int CD = 0;

    public ManaShard(){
        super(ID, MANA_COST, CD);
    }

    @Override
    public void cast(Character character){
        PlayerStats.setCurrentResourse(PlayerStats.getCurrentResourse() + SELF_MANA_GAIN);//SELF
        PlayerStats.setCurrentResourse(PlayerStats.getCurrentResourse() + MANA_GAIN);//ALLY
    }

}
