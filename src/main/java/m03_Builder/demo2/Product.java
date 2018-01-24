package m03_Builder.demo2;

/**
 * Created by yuanjie.fang on 2017/8/7.
 */
public class Product {
    private String name;
    private String type;

    public void showProduct() {
        System.out.println("名称：" + name);
        System.out.println("型号：" + type);
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setType(String type) {
        this.type = type;
    }
}
