import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Stat;
import ru.ifmo.se.pokemon.StatusMove;
import ru.ifmo.se.pokemon.Type;

/**
 * Created by yuliav on 04/03/2019.
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
