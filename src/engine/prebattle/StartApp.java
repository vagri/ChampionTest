package engine.prebattle;

import assets.Players;
import assets.abilities.MortalStrike;

public class StartApp {

    public static void main(String[] args) {
        Players.chooseCharacter();
        MortalStrike.cast(0 ,1);


    }
}
