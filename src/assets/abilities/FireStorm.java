package assets.abilities;

import assets.Ability;
import assets.PlayerStats;
import assets.effects.Burn;

public class FireStorm extends Ability {

    private static int ID = 7;
    private static final String NAME = "Firestorm";
    private static final int MANA_COST = 140;
    private static final int DAMAGE = 120;
    private static final int CD = 3;



    public FireStorm(){
        super(ID, MANA_COST, CD);
    }

    @Override
    public void cast(Character character){
        PlayerStats.setCurrentHP(PlayerStats.getCurrentHP() - DAMAGE);//ENEMY
        PlayerStats.setCurrentResourse(PlayerStats.getCurrentResourse() - MANA_COST);//SELF
        //add burn on effect table
    }

}
