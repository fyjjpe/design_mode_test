package m12_Proxy;

/**
 * Created by yuanjie.fang on 2018/1/24.
 */
public class ProxyObject extends AbstractObject {
    RealObject realObject = new RealObject();
    public void operation() {
        System.out.println("before");
        realObject.operation();
        System.out.println("after");
    }
}
