import ru.ifmo.se.pokemon.*;

/**
 * Created by yuliav on 03/03/2019.
 */

//Thunder deals damage and has a 30% chance of paralyzing the target.

public class ThunderMove extends SpecialMove{
    public ThunderMove() {
        super(Type.ELECTRIC, 110, 70);
    }

    @Override
    protected String describe() {
        return "Attack with Thunder Move";
    }


    // TODO: 17/03/2019 need to finish this
    @Override
    protected void applyOppEffects(Pokemon p){

        Effect.paralyze(p);

    }

    @Override
    protected double calcRandomDamage(Pokemon att,
                                      Pokemon def){
        return Math.random() + 0.0 + 0.33;
    }

}
