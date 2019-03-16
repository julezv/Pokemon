import ru.ifmo.se.pokemon.Battle;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Stat;

/**
 * Created by yuliav on 20/02/2019.
 */
public class MainClass {
    public static void main(String[] args) {
        Battle b = new Battle();
        Pokemon p1 = new Slugma("Alien", 1);
        Pokemon p2 = new Pokemon("Predator", 1);


        Slugma slugma = new Slugma("Slugma baby pokemon", 1);
        System.out.println(slugma);

        Slugma magcargo = new Magcargo();
        System.out.println(magcargo);

        b.addAlly(slugma);
        b.addFoe(new Mewtwo());
        b.go();



    }


}
