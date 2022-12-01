package assets.abilities;

import assets.Ability;
import assets.PlayerStats;
import assets.Players;

import static assets.PlayerStats.*;

public class MortalStrike extends Ability {

    private static int ID = 0;
    private static final String NAME = "Mortal Strike";
    private static final int RAGE_COST = 0;
    private static final int DAMAGE = 55;
    private static final int RAGE_GAIN = 20;
    private static final int CD = 0;


    public MortalStrike(){
        super(ID, RAGE_COST, CD);
    }

    public static void cast(int targetID, int selfID){
        System.out.println("Casting Mortal Strike");
        setCurrentHP(getCurrentHP() - DAMAGE);
        PlayerStats currentHP = null;
        currentHP.getCurrentHP();
        Players.setPlayerTable(targetID, 1 , currentHP);
        setCurrentResourse(getCurrentResourse() + RAGE_GAIN);//SELF
    }

    @Override
    public void cast(Character character) {

    }
}
