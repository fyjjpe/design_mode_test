package m13_Chain_of_Responsibility;

/**
 * Created by yuanjie.fang on 2018/1/24.
 */
public class Client {
    public static void main(String[] args) {
        Handler handler1 = new ConcreteHandler();
        Handler handler2 = new ConcreteHandler();
        handler1.setSuccessor(handler2);
        handler1.handleRequest();
    }
}
