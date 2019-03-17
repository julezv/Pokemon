import ru.ifmo.se.pokemon.SpecialMove;
import ru.ifmo.se.pokemon.Type;

/**
 * Created by yuliav on 03/03/2019.
 */
public class EnergyBallMove extends SpecialMove {
    public EnergyBallMove() {
        super(Type.GRASS, 90, 100);
    }

    @Override
    protected String describe() {
        return "Attack with Energy Ball Move";
    }

}
