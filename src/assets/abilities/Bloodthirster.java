package assets.abilities;

import assets.Ability;
import assets.PlayerStats;

public class Bloodthirster extends Ability {

    private static int ID = 1;
    private static final String NAME = "Bloodthirster";
    private static final int RAGE_COST = 25;
    private static final int DAMAGE = 40;
    private static final int HEAL = 40;
    private static final int CD = 0;


    public Bloodthirster(){
        super(ID, RAGE_COST, CD);
    }

    @Override
    public void cast(Character character){
        PlayerStats.setCurrentHP(PlayerStats.getCurrentHP() - DAMAGE);//ENEMY
        PlayerStats.setCurrentHP(PlayerStats.getCurrentHP() + HEAL);//SELF
        PlayerStats.setCurrentResourse(PlayerStats.getCurrentResourse() - RAGE_COST);//SELF
    }
}
