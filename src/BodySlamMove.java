import ru.ifmo.se.pokemon.*;

/**
 * Created by yuliav on 04/03/2019.
 */

/**
 * Body Slam deals damage and has a 30% chance of paralyzing the target.
 * Electric type Pokémon, those with the
 * ability Limber or those behind a Substitute cannot be paralyzed.
 */


//MA: TODO: 30% + paralize Effect
public class BodySlamMove extends PhysicalMove{
    public BodySlamMove() {
        super(Type.NORMAL, 85, 100);
    }
    @Override
    protected void applyOppEffects(Pokemon p){
        Effect paralyzeByChance = new Effect().condition(Status.PARALYZE).chance(0.3);
        p.setCondition(paralyzeByChance);
    }
    @Override
    protected String describe() {
        return "Attack with Body Slam Move";
    }

}
