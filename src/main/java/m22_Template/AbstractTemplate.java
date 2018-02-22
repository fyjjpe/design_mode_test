package m22_Template;

/**
 * Created by yuanjie.fang on 2018/2/22.
 */
public abstract class AbstractTemplate {
    public void templateMethod() {
        abstractMethod();
        hookMethod();
        concreteMethod();
    }

    private void concreteMethod() {
    }

    protected abstract void abstractMethod();

    protected void hookMethod(){

    }
}
