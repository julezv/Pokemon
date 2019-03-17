import ru.ifmo.se.pokemon.Type;

/**
 * Created by yuliav on 03/03/2019.
 */
public class Shiftry extends Nuzleaf{

    public Shiftry(){
        super();
        initShiftry();
    }

    public Shiftry(String name, int level) {
        super(name, level);
        initShiftry();
    }

    public void  initShiftry() {
        setStats(90, 100, 60, 90, 60, 80);
        setType(Type.GRASS);
        setType(Type.DARK);
        setMove(new SwaggerMove(),
                new ConfideMove(),
                new RockTombMove(),
                new GrowthMove());
    }

}
