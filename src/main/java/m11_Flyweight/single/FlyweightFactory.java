package m11_Flyweight.single;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by yuanjie.fang on 2018/1/23.
 */
public class FlyweightFactory {
    private Map<Character, Flyweight> files = new HashMap<Character, Flyweight>();

    public Flyweight factory(Character state) {
        Flyweight fly = files.get(state);
        if (fly == null) {
            fly = new ConcreteFlyweight(state);
            files.put(state, fly);
        }
        return fly;
    }

}
