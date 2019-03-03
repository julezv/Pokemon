import ru.ifmo.se.pokemon.*;
import java.util.List;


/**
 * Created by yuliav on 27/02/2019.
 */

/**Each pokemon
 kind should have one or two types and standard base stats: HP, attack, defense, special attack,
 special defense and speed.
 You should set pokémon types and base stats in the
 constructor. Add your new pokémon to the team and start the battle.
 **/

public class Slugma extends Pokemon {

    public Slugma() {
        super("slugma baby pokemon", 1);
        setStats(40, 40, 40, 40, 70 ,20);
        setType(Type.FIRE);
        setMove(new Confide(Type.NORMAL, 0.0, 20));

    }

    public Slugma(String name, int level) {
        super(name, level);
    }

}

