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

        //alpha ( = Math.random() ) in U[0; 1)
        //P(alpha in [0; x]) = x
        //P(att.getStat(Stat.SPEED) / 512.0D > alpha) = P(alpha in [0; att.getStat(Stat.SPEED) / 512.0D)) =
        //= att.getStat(Stat.SPEED) / 512.0D
        //int a = 5;
        //int b = 3;
        //((double)a) / b
        //(a * 1.0) / b
        //a / b * 1.0;


        if((1.0 / 8) > Math.random()) {
            return 2.0D;
        } else {
            return 1.0D;
        }

    }
    // if deals damage I do not need to override the calcBaseDamage method..

}
