import ru.ifmo.se.pokemon.SpecialMove;
import ru.ifmo.se.pokemon.Type;

/**
 * Created by yuliav on 03/03/2019.
 */
public class ThunderMove extends SpecialMove{
    public ThunderMove() {
        super(Type.ELECTRIC, 110, 70);
    }

    @Override
    protected String describe() {
        return "Attack with Thunder Move";
    }

}
