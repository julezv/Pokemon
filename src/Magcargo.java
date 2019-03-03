import ru.ifmo.se.pokemon.Stat;
import ru.ifmo.se.pokemon.Type;

import java.util.List;

/**
 * Created by yuliav on 27/02/2019.
 */
public class Magcargo extends Slugma {

    public Magcargo() {
        super("magcargo baby pokemon", 2);
        setStats(60, 50, 120, 90, 80, 230);
        setType(Type.PSYCHIC);
        setMove(new Confide(Type.NORMAL, 0.0, 20));
    }

}
