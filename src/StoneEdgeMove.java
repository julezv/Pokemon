import ru.ifmo.se.pokemon.*;

/**
 * Created by yuliav on 05/03/2019.
 */

/**
 * Stone Edge deals damage and has an increased critical hit ratio (1⁄8 instead of 1⁄16).
 */


public class StoneEdgeMove extends PhysicalMove{
    public StoneEdgeMove() {
        super(Type.ROCK, 100, 80);
    }
    @Override
    protected String describe() {
        return "Attack with Stone Edge Move";
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
    // if deals damage I do not need to override the calcBaseDamage method..

}
