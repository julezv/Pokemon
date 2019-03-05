import ru.ifmo.se.pokemon.*;

/**
 * Created by yuliav on 05/03/2019.
 */
// effects : Stone Edge deals damage and has an increased critical hit ratio (1⁄8 instead of 1⁄16).


public class StoneEdgeMove extends PhysicalMove{
    public StoneEdgeMove() {
        super();
    }
    public StoneEdgeMove(Type type, double pow, double acc) {
        super(type, pow, acc);
    }
    public StoneEdgeMove(Type type, double pow, double acc, int priority, int hits){
        super(type, pow, acc, priority, hits);
    }
    @Override
    protected double calcCriticalHit(Pokemon att,
                                     Pokemon def){
        //TODO: need to redefine
        if(att.getStat(Stat.SPEED) / 512.0D > Math.random()) {
            return 2.0D;
        } else {
            return 1.0D;
        }

    }

}
