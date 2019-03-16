import ru.ifmo.se.pokemon.*;

/**
 * Created by yuliav on 05/03/2019.
 */
//effects : Facade deals damage, and hits with double power (140) if the user is burned, poisoned or paralyzed.
public class FacadeMove extends PhysicalMove {
    public FacadeMove() {
        super(Type.NORMAL, 70, 100);
    }

    @Override
    protected String describe() {
        return "использует атаку Facade Move";
    }

    /*@Override
    protected void applySelfEffects(Pokemon p){
        if (p.getCondition() == Status.BURN || p.getCondition() == Status.POISON || p.getCondition() == Status.PARALYZE){
            //TODO double power
        }
    }*/

    @Override
    protected double calcBaseDamage(Pokemon pokemon, Pokemon pokemon1) {
        if (pokemon.getCondition() == Status.BURN)
            return 2 * super.calcBaseDamage(pokemon, pokemon1);
        return super.calcBaseDamage(pokemon, pokemon1);
    }
}
