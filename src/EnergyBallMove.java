import ru.ifmo.se.pokemon.*;

/**
 * Created by yuliav on 03/03/2019.
 */
/*
* Energy Ball deals damage and has a 10% chance of
* lowering the target's Special Defense by one stage.
* */

//MA: TODO: Energy Ball deals damage and has a 10% chance of lowering the target's Special Defense by one stage.
public class EnergyBallMove extends SpecialMove {
    public EnergyBallMove() {
        super(Type.GRASS, 90, 100);
    }

    @Override
    protected String describe() {
        return "Attack with Energy Ball Move";
    }

    @Override
    protected void applyOppEffects(Pokemon p){
        Effect LowerSpecialDefense = new Effect().chance(0.1).stat(Stat.SPECIAL_DEFENSE, -1);;
        p.setCondition(LowerSpecialDefense);
    }
}
