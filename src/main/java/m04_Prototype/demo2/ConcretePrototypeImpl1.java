package m04_Prototype.demo2;

/**
 * Created by yuanjie.fang on 2018/1/22.
 */
public class ConcretePrototypeImpl1 implements Prototype {
    private String name;

    public Prototype clone() {
        ConcretePrototypeImpl1 prototype = new ConcretePrototypeImpl1();
        prototype.setName(this.name);
        return prototype;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Now is Prototype1,name = " + this.name;
    }
}
