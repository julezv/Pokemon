import ru.ifmo.se.pokemon.Type;

/**
 * Created by yuliav on 27/02/2019.
 */
public class Magcargo extends Slugma {

    public Magcargo() {
        super("magcargo baby pokemon", 4);
        setStats(60, 50, 120, 90, 80, 230);
        setType(Type.PSYCHIC);
        setMove(new ConfideMove(Type.NORMAL, 0.0, 20),
                new FacadeMove(),
                new BodySlamMove(Type.NORMAL, 85, 100),
                new StoneEdgeMove(Type.ROCK, 100, 80));
    }

}
