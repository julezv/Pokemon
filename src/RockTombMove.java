import ru.ifmo.se.pokemon.PhysicalMove;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Stat;
import ru.ifmo.se.pokemon.Type;

/**
 * Created by yuliav on 04/03/2019.
 */

/**
 * Rock Tomb deals damage and lowers the target's Speed by one stage.
 */

public class RockTombMove extends PhysicalMove {
    public RockTombMove() {
        super(Type.ROCK,60, 95);
    }
    @Override
    protected void applyOppEffects(Pokemon p){
        p.setMod(Stat.SPEED, -1) ;
    }

    @Override
    protected String describe() {
        return "Attack with Rock Tomb Move";
    }
}
