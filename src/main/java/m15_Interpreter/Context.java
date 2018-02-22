package m15_Interpreter;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by yuanjie.fang on 2018/2/12.
 */
public class Context {
    private Map<Variable, Boolean> map = new HashMap<Variable, Boolean>();

    public void assign(Variable var, boolean value) {
        map.put(var, new Boolean(value));
    }

    public boolean lookup(Variable var) {
        Boolean value = map.get(var);
        if (value == null) {
            throw new IllegalArgumentException();
        }
        return value.booleanValue();
    }
}
