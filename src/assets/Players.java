package assets;

import assets.champions.Executioner;

public class Players extends PlayerStats {

    private static PlayerStats[][] playerTable = null;
    private static PlayerStats playerVar;

    public Players(int maxHealth, int health, int maxResource, int resourse, int championID) {
        super(maxHealth, health, maxResource, resourse, championID);
    }


    public static void initStats(int i){
        PlayerStats[][] playerTable = new PlayerStats[8][4];
        for (int j=0;j<4;j++) {
            playerTable[i][j] = new PlayerStats();
        }
        playerTable[i][0].getMaxHP();
        playerTable[i][1].getCurrentHP();
        playerTable[i][2].getMaxResource();
        playerTable[i][3].getCurrentResourse();
    }

    public static void chooseCharacter(){
        int idChoise = 0;
        int i = 0;
        int p = 2;

        do{
            if(idChoise == 0){//getPlayerTable(i, 4).equals(0)
                setChampionID(1);
                Executioner.pick();
            }else if(idChoise == 1){
                //magepick
            }else if(idChoise == 2){

            }
            initStats(i);
            i++;
        }while(i<p);
    }

    public static PlayerStats getPlayerTable(int player, int stat) {
        return playerVar = playerTable[player][stat];
    }

    public static void setPlayerTable(int player, int stat, PlayerStats var) {
        playerVar = var;
        playerTable[player][stat].getCurrentHP();
    }


}