package m04_Prototype.demo2;

/**
 * Created by yuanjie.fang on 2018/1/22.
 */
public class ConcretePrototypeImpl2 implements Prototype {
    private String name;

    public Prototype clone() {
        ConcretePrototypeImpl2 prototype2 = new ConcretePrototypeImpl2();
        prototype2.setName(name);
        return prototype2;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Now in Prototype2 , name = " + this.name;
    }
}
