import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Stat;
import ru.ifmo.se.pokemon.StatusMove;
import ru.ifmo.se.pokemon.Type;

/**
 * Created by yuliav on 03/03/2019.
 */
public class ConfideMove extends StatusMove {
    public ConfideMove() {
        super(Type.NORMAL, 0.0, 20);
    }

    @Override
    protected void applyOppEffects(Pokemon p) {
        p.setMod(Stat.SPECIAL_ATTACK, -1) ;
    }

    @Override
    protected String describe() {
        return "Attack with Confide Move";
    }
}
