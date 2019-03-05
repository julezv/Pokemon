import ru.ifmo.se.pokemon.*;

/**
 * Created by yuliav on 04/03/2019.
 */
// Body Slam deals damage and has a 30% chance of paralyzing the target.
// Electric type Pokémon, those with the
// ability Limber or those behind a Substitute cannot be paralyzed.

public class BodySlamMove extends PhysicalMove{
    public BodySlamMove() {
        super();
    }
    public BodySlamMove(Type type, double pow, double acc) {
        super(type, pow, acc);
    }
    public BodySlamMove(Type type, double pow, double acc, int priority, int hits){
        super(type, pow, acc, priority, hits);
    }
    @Override
    protected void applyOppEffects(Pokemon p){
        Effect paralyzeByChance = new Effect().chance(0.33);
        paralyzeByChance.paralyze(p);
        // ?
        // why can do p.paralyze() and Effect.paralyze(p)
    }
}
