import ru.ifmo.se.pokemon.SpecialMove;
import ru.ifmo.se.pokemon.Type;

/**
 * Created by yuliav on 03/03/2019.
 */
public class EnergyBall extends SpecialMove {
    public EnergyBall() {
        super();
    }
    public EnergyBall(Type type, double pow, double acc) {
        super(type, pow, acc);
    }
    public EnergyBall(Type type, double pow, double acc, int priority, int hits){
        super(type, pow, acc, priority, hits);
    }
}
