import ru.ifmo.se.pokemon.Move;
import ru.ifmo.se.pokemon.StatusMove;
import ru.ifmo.se.pokemon.Type;

/**
 * Created by yuliav on 03/03/2019.
 */
public class Swagger extends StatusMove {
    public Swagger() {
        super();
    }
    public Swagger(Type type, double pow, double acc) {
        super(type, pow, acc);
    }
    public Swagger(Type type, double pow, double acc, int priority, int hits){
        super(type, pow, acc, priority, hits);
    }
}
