package m01_AbstractFactory;

/**
 * Created by yuanjie.fang on 2017/7/17.
 */
public class Factory implements IFactory{
    public IProduct1 createProduct1() {
        return new Product1();
    }

    public IProduct2 createProduct2() {
        return new Product2();
    }
}
