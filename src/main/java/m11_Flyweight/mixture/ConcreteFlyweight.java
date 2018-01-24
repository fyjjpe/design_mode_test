package m11_Flyweight.mixture;

/**
 * Created by yuanjie.fang on 2018/1/23.
 */
public class ConcreteFlyweight implements Flyweight {
    private Character intrinsicState = null;

    public ConcreteFlyweight(Character state) {
        this.intrinsicState = state;
    }

    public void operation(String state) {
        System.out.println("Intrinsic State = " + this.intrinsicState);
        System.out.println("Extrinsic State = " + state);
    }
}
