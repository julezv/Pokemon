import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Stat;
import ru.ifmo.se.pokemon.StatusMove;
import ru.ifmo.se.pokemon.Type;

/**
 * Created by yuliav on 04/03/2019.
 */

/**
 *
 * Growth raises the user's Attack and Special Attack by one stage each.
 * During harsh sunlight it raises each stat by two stages.
 * Stats can be raised to a maximum of +6 stages each
 */

public class GrowthMove extends StatusMove{
    public GrowthMove() {
        super(Type.NORMAL, 0.0, 100);
    }
    @Override
    protected void applySelfEffects(Pokemon p){
        p.setMod(Stat.SPECIAL_ATTACK, +1);
        p.setMod(Stat.ATTACK, +1);
    }
    @Override
    protected String describe() {
        return "Attack with Growth Move";
    }
}
