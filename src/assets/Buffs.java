package assets;

public class Buffs extends Effect {

    private Buffs buffTable[][];
    private Players champID2;

    public Buffs(int ID, int duration) {
        super(ID, duration);
    }


    public void passiveInit(){
            int i = 0;
            int p = 2;

            do{
                if(champID2.getPlayerTable(i, 4).equals(0)){
                    buffTable[i][1].getDuration();
                }else if(champID2.getPlayerTable(i, 4).equals(1)){
                    //
                }else if(champID2.getPlayerTable(i, 4).equals(2)){

                }

                i++;
            }while(i<p);
    }

    public static void check(){

    }

    public Players getchampID2() {
        return champID2;
    }

    @Override
    public void apply(Character character) {

    }
}
