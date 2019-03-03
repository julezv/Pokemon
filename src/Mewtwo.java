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
        setMove(new Swagger(Type.NORMAL, 0.0, 85),new Thunder(Type.ELECTRIC, 110, 70),
                new Confide(Type.NORMAL, 0.0, 20), new EnergyBall(Type.GRASS, 90, 100));
    }
    public Mewtwo(String name, int level) {
        super(name, level);
    }
}
