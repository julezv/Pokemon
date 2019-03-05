import ru.ifmo.se.pokemon.SpecialMove;
import ru.ifmo.se.pokemon.Type;

/**
 * Created by yuliav on 03/03/2019.
 */
public class EnergyBallMove extends SpecialMove {
    public EnergyBallMove() {
        super();
    }
    public EnergyBallMove(Type type, double pow, double acc) {
        super(type, pow, acc);
    }
    public EnergyBallMove(Type type, double pow, double acc, int priority, int hits){
        super(type, pow, acc, priority, hits);
    }
}
