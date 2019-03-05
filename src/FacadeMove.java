import ru.ifmo.se.pokemon.*;

/**
 * Created by yuliav on 05/03/2019.
 */
//effects : Facade deals damage, and hits with double power (140) if the user is burned, poisoned or paralyzed.
public class FacadeMove extends PhysicalMove {
    public FacadeMove() {
        super();
    }
    public FacadeMove(Type type, double pow, double acc) {
        super(type, pow, acc);
    }
    public FacadeMove(Type type, double pow, double acc, int priority, int hits){
        super(type, pow, acc, priority, hits);
    }
    @Override
    protected void applySelfEffects(Pokemon p){
        if (p.getCondition() == Status.BURN || p.getCondition() == Status.POISON || p.getCondition() == Status.PARALYZE){
            //TODO double power
        }

    }
}
