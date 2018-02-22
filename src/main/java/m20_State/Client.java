package m20_State;

/**
 * Created by yuanjie.fang on 2018/2/14.
 */
public class Client {
    public static void main(String[] args) {
        State state = new ConcreteStateB();
        Context context = new Context();
        context.setState(state);
        context.request("test");
    }
}
