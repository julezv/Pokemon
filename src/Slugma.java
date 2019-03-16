import ru.ifmo.se.pokemon.*;


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
        super();
        initSlugma();

    }

    public Slugma(String name, int level) {
        super(name, level);
        initSlugma();
    }

    private void initSlugma() {
        setStats(40, 40, 40, 40, 70 ,20);
        setType(Type.FIRE);
        setMove(new ConfideMove(Type.NORMAL, 0.0, 20),
                new BodySlamMove(Type.NORMAL, 85, 100),
                new FacadeMove()); //new FacadeMove()
    }

}

