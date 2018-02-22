package m15_Interpreter;


/**
 * Created by yuanjie.fang on 2018/2/12.
 */
public abstract class Expression {
    public abstract boolean interpret(Context ctx);

    public abstract boolean equals(Object obj);

    public abstract int hashCode();

    public abstract String toString();
}
