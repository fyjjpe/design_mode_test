package m15_Interpreter;


/**
 * Created by yuanjie.fang on 2018/2/12.
 */
public class Variable extends Expression {
    private String name;

    public Variable(String name) {
        this.name = name;
    }

    public boolean interpret(Context ctx) {

        return (Boolean) ctx.lookup(this);

    }

    public boolean equals(Object obj) {
        if (obj != null && obj instanceof Variable) {
            return this.name.equals(((Variable) obj).name);
        }
        return false;
    }

    public int hashCode() {
        return this.toString().hashCode();
    }

    public String toString() {
        return name;
    }
}
