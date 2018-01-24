package m03_Builder.demo2;

/**
 * Created by yuanjie.fang on 2017/8/7.
 */
public class Client {
    public static void main(String[] args) {
        Director director = new Director();
        Product product1 = director.getAProduct();
        product1.showProduct();

        Product product2 = director.getBProduct();
        product2.showProduct();
    }
}
