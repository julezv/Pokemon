import ru.ifmo.se.pokemon.*;

/**
 * Created by yuliav on 03/03/2019.
 */

/**
 * Thunder deals damage and has a 30% chance of paralyzing the target.
 */


public class ThunderMove extends SpecialMove{
    public ThunderMove() {
        super(Type.ELECTRIC, 110, 70);
    }

    @Override
    protected String describe() {
        return "Attack with Thunder Move";
    }

    @Override
    protected void applyOppEffects(Pokemon p){
        Effect paralyzeByChance = new Effect().condition(Status.PARALYZE).chance(0.3);
        p.setCondition(paralyzeByChance);
    }

}
