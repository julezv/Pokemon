import ru.ifmo.se.pokemon.Type;

/**
 * Created by yuliav on 27/02/2019.
 */
public class Magcargo extends Slugma {
    public Magcargo() {
        super();
        initMagcargo();
    }

    public Magcargo(String name, int level) {
        super(name, level);
        initMagcargo();
    }
    public void initMagcargo() {
        setStats(60, 50, 120, 90, 80, 230);
        setType(Type.PSYCHIC);
        setMove(new ConfideMove(),
                new FacadeMove(),
                new BodySlamMove(),
                new StoneEdgeMove());
    }
}
