import ru.ifmo.se.pokemon.PhysicalMove;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Stat;
import ru.ifmo.se.pokemon.Type;

/**
 * Created by yuliav on 04/03/2019.
 */

// effects: Rock Tomb deals damage and lowers the target's Speed by one stage.

public class RockTombMove extends PhysicalMove {
    public RockTombMove() {
        super();
    }
    public RockTombMove(Type type, double pow, double acc) {
        super(type, pow, acc);
    }
    public RockTombMove(Type type, double pow, double acc, int priority, int hits){
        super(type, pow, acc, priority, hits);
    }
    @Override
    protected void applyOppEffects(Pokemon p){
        p.setMod(Stat.SPEED, -1) ;
    }
}
