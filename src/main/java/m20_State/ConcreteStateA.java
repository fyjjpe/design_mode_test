package m20_State;

/**
 * Created by yuanjie.fang on 2018/2/14.
 */
public class ConcreteStateA implements State {
    public void handle(String sampleParameter) {
        System.out.println("ConcreteStateA handle：" + sampleParameter);
    }
}
