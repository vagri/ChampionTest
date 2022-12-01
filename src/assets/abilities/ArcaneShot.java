package assets.abilities;

import assets.Ability;
import assets.PlayerStats;

public class ArcaneShot extends Ability {

    private static int ID = 4;
    private static final String NAME = "Arcane Shot";
    private static final int MANA_COST = 60;
    private static final int DAMAGE = 60;
    private static final int CD = 0;



    public ArcaneShot(){
        super(ID, MANA_COST, CD);
    }

    @Override
    public void cast(Character character){
        PlayerStats.setCurrentHP(PlayerStats.getCurrentHP() - DAMAGE);//ENEMY
        PlayerStats.setCurrentResourse(PlayerStats.getCurrentResourse() - MANA_COST);//SELF
    }
}
