import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

/**
 * Created by yuliav on 03/03/2019.
 */
public class Seedot extends Pokemon{
    public Seedot(){
        super();
        initSeedot();
    }

    public Seedot(String name, int level) {
        super(name, level);
        initSeedot();
    }

    public void initSeedot() {
        setStats(40, 40, 50, 30, 30, 30);
        setType(Type.GRASS);
        setMove(new SwaggerMove(),
                new ConfideMove());
    }

}
