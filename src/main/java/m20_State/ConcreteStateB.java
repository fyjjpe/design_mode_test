package m20_State;

/**
 * Created by yuanjie.fang on 2018/2/14.
 */
public class ConcreteStateB implements State {
    public void handle(String sampleParameter) {
        System.out.println("ConcreteStateB handle：" + sampleParameter);
    }
}
