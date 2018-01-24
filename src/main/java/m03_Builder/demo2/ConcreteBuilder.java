package m03_Builder.demo2;

/**
 * Created by yuanjie.fang on 2017/8/7.
 * 创建者的具体实现类
 */
public class ConcreteBuilder extends Builder {
    private Product product = new Product();
    public void setPart(String arg1, String arg2) {
        product.setName(arg1);
        product.setType(arg2);
    }

    public Product getProduct() {

        return product;
    }
}
