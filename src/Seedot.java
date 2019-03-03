import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

/**
 * Created by yuliav on 03/03/2019.
 */
public class Seedot extends Pokemon{

    public Seedot() {
        super("Seedot pokemon", 3);
        setStats(40, 40, 50, 30, 30, 30);
        setType(Type.GRASS);
        setMove(new Swagger(Type.NORMAL, 0.0, 85),
                new Confide(Type.NORMAL, 0.0, 20));
    }
    public Seedot(String name, int level) {
        super(name, level);
    }
}
