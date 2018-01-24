package m01_AbstractFactory;

/**
 * Created by yuanjie.fang on 2017/7/17.
 */
public class Client {
    public static void main(String[] args) {
        IFactory factory = new Factory();
        factory.createProduct1().show();
        factory.createProduct2().show();
    }
}
