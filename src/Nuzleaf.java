import ru.ifmo.se.pokemon.Type;

/**
 * Created by yuliav on 03/03/2019.
 */
public class Nuzleaf extends Seedot {

    public Nuzleaf() {
        super("Nuzleaf pokemon", 3);
        setStats(70, 70, 40, 60, 40, 60);
        setType(Type.GRASS);
        setType(Type.DARK);
        setMove(new Swagger(Type.NORMAL, 0.0, 85),
                new Confide(Type.NORMAL, 0.0, 20));
    }
    public Nuzleaf(String name, int level) {
        super(name, level);
    }
}

