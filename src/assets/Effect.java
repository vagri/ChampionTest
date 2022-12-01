package assets;

public abstract class Effect {

    private static int effectID;
    private static int duration;

    public Effect(int ID, int duration){
        this.effectID = ID;
        this.duration = duration;
    }

    public abstract void apply(Character character);


    public static int getEffectID() {
        return effectID;
    }

    public static void setEffectID(int effectID) {
        effectID = effectID;
    }

    public static int getDuration() {
        return duration;
    }

    public static void setDuration(int duration) {
        duration = duration;
    }
}

