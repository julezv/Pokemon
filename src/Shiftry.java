import ru.ifmo.se.pokemon.Type;

/**
 * Created by yuliav on 03/03/2019.
 */
public class Shiftry extends Nuzleaf{
    public Shiftry() {
        super("Shiftry pokemon", 3);
        setStats(90, 100, 60, 90, 60, 80);
        setType(Type.GRASS);
        setType(Type.DARK);
        setMove(new Swagger(Type.NORMAL, 0.0, 85),
                new Confide(Type.NORMAL, 0.0, 20));
    }
    public Shiftry(String name, int level) {
        super(name, level);
    }
}
