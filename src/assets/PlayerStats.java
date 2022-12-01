package assets;

public class PlayerStats {

    private static int maxHP;
    private static int currentHP;
    private static int maxResource;
    private static int currentResourse;
    private static int championID;

    public PlayerStats(int maxHealth, int health, int maxResource, int resourse, int championID) {
        this.maxHP = maxHealth;
        this.currentHP = health;
        this.maxResource = maxResource;
        this.currentResourse = resourse;
        this.championID = championID;
    }

    public PlayerStats() {

    }


    public static int getCurrentHP() {
        return currentHP;
    }

    public static void setCurrentHP(int health) {
        currentHP = health;
    }

    public static int getMaxHP() {
        return maxHP;
    }

    public static void setMaxHP(int maxHealth) {
        maxHP = maxHealth;
    }

    public static int getMaxResource() {
        return maxResource;
    }

    public static void setMaxResource(int maxResource) {
        maxResource = maxResource;
    }

    public static int getCurrentResourse() {
        return currentResourse;
    }

    public static void setCurrentResourse(int resourse) {
        currentResourse = resourse;
    }

    public static int getChampionID() {
        return championID;
    }

    public static void setChampionID(int championID) {
        championID = championID;
    }

}
