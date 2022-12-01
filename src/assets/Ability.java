package assets;

public abstract class Ability {

    private int abilityID;
    private int cost;
    private int CD;

    public Ability(int ID, int cost, int cd){
        this.abilityID = ID;
        this.cost = cost;
        this.cost = cd;
    }

    public abstract void cast(Character character);

    public int getID(){
        return abilityID;
    }

    public int getCost(){
        return cost;
    }

}
