package m02_Factory;

/**
 * Created by yuanjie.fang on 2017/7/17.
 */
public class Client {
    public static void main(String[] args) {
        IFactory factory = new Factory();
        IProduct product = factory.createProduct();
        product.productMethod();
    }
}
