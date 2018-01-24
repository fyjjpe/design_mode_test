package m13_Chain_of_Responsibility;

/**
 * Created by yuanjie.fang on 2018/1/24.
 */
public class ConcreteHandler extends Handler {
    public void handleRequest() {
        if (getSuccessor() != null) {
            System.out.println("放过请求");
            getSuccessor().handleRequest();
        } else {
            System.out.println("处理请求");
        }
    }
}
