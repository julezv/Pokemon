import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Stat;
import ru.ifmo.se.pokemon.StatusMove;
import ru.ifmo.se.pokemon.Type;

/**
 * Created by yuliav on 03/03/2019.
 */

/*
* Confide lowers the target's Special Attack by one stage.
Stats can be lowered to a minimum of -6 stages each.
* */

//MA: OK
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
