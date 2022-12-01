package assets.champions;

import assets.Champion;
import assets.PlayerStats;

public class Mage extends Champion {


    private static int ID = 1;
    private static final String NAME = "Mage";
    private static final int HP = 200;
    private static final int resourceID = 1;
    private static final int resource = 400;
    private static final int[] abilityIDs = new int[]{4, 5, 6, 7};
    private static final int passiveID = 3;


    public Mage(){
        super(ID);
    }

    public void pick(Character character){
        PlayerStats.setMaxHP(HP);
        PlayerStats.setCurrentHP(HP);
        PlayerStats.setMaxResource(resource);
        PlayerStats.setCurrentResourse(resource);
        PlayerStats.setChampionID(ID);
    }



}
