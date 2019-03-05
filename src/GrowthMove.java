import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Stat;
import ru.ifmo.se.pokemon.StatusMove;
import ru.ifmo.se.pokemon.Type;

/**
 * Created by yuliav on 04/03/2019.
 */
public class GrowthMove extends StatusMove{
    public GrowthMove() {
        super();
    }
    public GrowthMove(Type type, double pow, double acc) {
        super(type, pow, acc);
    }
    public GrowthMove(Type type, double pow, double acc, int priority, int hits){
        super(type, pow, acc, priority, hits);
    }

    @Override
    protected void applySelfEffects(Pokemon p){
        p.setMod(Stat.SPECIAL_ATTACK, +1);
        p.setMod(Stat.ATTACK, +1);
    }
}
