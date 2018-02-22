package m15_Interpreter;


/**
 * Created by yuanjie.fang on 2018/2/12.
 */
public class Constant extends Expression {
    private boolean value;

    public Constant(boolean value) {
        this.value = value;
    }

    public boolean interpret(Context ctx) {
        return false;
    }

    public boolean equals(Object obj) {
        if (obj != null && obj instanceof Constant) {
            return this.value == ((Constant) obj).value;
        }
        return value;
    }

    public int hashCode() {
        return this.toString().hashCode();
    }

    public String toString() {
        return new Boolean(value).toString();
    }
}
