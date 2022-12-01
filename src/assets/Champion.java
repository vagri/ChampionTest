package assets;

import assets.champions.Executioner;

public abstract class Champion {

    private int championID;

    public Champion(int ID){
        this.championID = ID;
    }

    public static void pick() {
    }

    public int getID(){
        return championID;
    }


}
