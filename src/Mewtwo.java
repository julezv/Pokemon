import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

/**
 * Created by yuliav on 03/03/2019.
 */
public class Mewtwo extends Pokemon {

    public Mewtwo() {
        super();
        initMewtwo();
    }

    public Mewtwo(String name, int level) {
        super(name, level);
        initMewtwo();
    }

    public void initMewtwo() {
        setStats(106, 110, 90, 154, 90, 130);
        setType(Type.PSYCHIC);
        setMove(new SwaggerMove(),new ThunderMove(),
                new ConfideMove(), new EnergyBallMove());
    }
}
