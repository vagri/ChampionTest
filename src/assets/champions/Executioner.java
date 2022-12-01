package assets.champions;

import assets.Champion;
import assets.PlayerStats;

public class Executioner extends Champion {

    private static int ID = 0;
    private static final String NAME = "Executioner";
    private static final int HP = 320;
    private static final int resourceID = 0;
    private static final int resource = 100;
    private static final int[] abilityIDs = new int[]{0, 1, 2, 3};
    private static final int passiveID = 1;


    public Executioner(){
        super(ID);
    }

    public static void pick(){
        PlayerStats.setMaxHP(HP);
        PlayerStats.setCurrentHP(HP);
        PlayerStats.setMaxResource(resource);
        PlayerStats.setCurrentResourse(resource);
        PlayerStats.setChampionID(ID);
    }


}
