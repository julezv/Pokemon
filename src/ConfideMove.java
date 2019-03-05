import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Stat;
import ru.ifmo.se.pokemon.StatusMove;
import ru.ifmo.se.pokemon.Type;

/**
 * Created by yuliav on 03/03/2019.
 */
public class ConfideMove extends StatusMove {
    public ConfideMove() {
        super();
    }
    public ConfideMove(Type type, double pow, double acc) {
        super(type, pow, acc);
    }
    public ConfideMove(Type type, double pow, double acc, int priority, int hits){
        super(type, pow, acc, priority, hits);
    }
    @Override
    protected void applyOppEffects(Pokemon p){
        p.setMod(Stat.SPECIAL_ATTACK, -1) ;
    }
}
