import ru.ifmo.se.pokemon.*;

/**
 * Created by yuliav on 03/03/2019.
 */

// Effect: Raises the target's Attack by two stages, then confuses it. If the target's Attack cannot be raised by two stages,
// the confusion is not applied.


public class SwaggerMove extends StatusMove {
    public SwaggerMove() {
        super(Type.NORMAL, 0.0, 85);
    }
    @Override
    protected String describe() {
        return "Attack with Swagger Move";
    }

    @Override
    protected void applyOppEffects(Pokemon p){
        if(p.getStat(Stat.ATTACK) < 5){
            p.setMod(Stat.ATTACK, +2);
            Effect.confuse(p);
        }
    }
}
