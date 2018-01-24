package m02_Factory;

/**
 * Created by yuanjie.fang on 2017/7/17.
 */
public class Factory implements IFactory {
    public IProduct createProduct() {
        return new Product();
    }
}
