package m04_Prototype.demo1;

/**
 * Created by yuanjie.fang on 2018/1/22.
 */
public class ConcretePrototype1 implements Prototype {
    public Prototype clone() {
        Prototype prototype = new ConcretePrototype1();
        return prototype;
    }
}
