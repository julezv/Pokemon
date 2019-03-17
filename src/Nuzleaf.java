import ru.ifmo.se.pokemon.Type;

/**
 * Created by yuliav on 03/03/2019.
 */
public class Nuzleaf extends Seedot {

    public Nuzleaf(){
        super();
        initNuzleaf();
    }

    public Nuzleaf(String name, int level) {

        super(name, level);
        initNuzleaf();
    }

    public void initNuzleaf() {
        setStats(70, 70, 40, 60, 40, 60);
        setType(Type.GRASS);
        setType(Type.DARK);
        setMove(new SwaggerMove(),
                new ConfideMove(),
                new GrowthMove());
    }

}

