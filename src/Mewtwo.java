import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

/**
 * Created by yuliav on 03/03/2019.
 */
public class Mewtwo extends Pokemon {

    public Mewtwo() {
        super("Mewtwo Psychic pokemon", 4);
        setStats(106, 110, 90, 154, 90, 130);
        setType(Type.PSYCHIC);
        setMove(new SwaggerMove(Type.NORMAL, 0.0, 85),new ThunderMove(Type.ELECTRIC, 110, 70),
                new ConfideMove(Type.NORMAL, 0.0, 20), new EnergyBallMove(Type.GRASS, 90, 100));
    }
    public Mewtwo(String name, int level) {
        super(name, level);
    }
}
