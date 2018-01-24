package m12_Proxy;

/**
 * Created by yuanjie.fang on 2018/1/24.
 */
public class Client {
    public static void main(String[] args) {
        AbstractObject obj = new ProxyObject();
        obj.operation();
    }
}
