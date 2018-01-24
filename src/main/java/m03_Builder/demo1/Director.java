package m03_Builder.demo1;

/**
 * Created by yuanjie.fang on 2018/1/22.
 */
public class Director {
    Builder builder;

    public Director(Builder builder) {
        this.builder = builder;
    }

    /**
     * 产品构造方法，负责调用各零件的建造方法
     */
    public void construct(String toAddress, String fromAddress) {
        this.builder.buildTo(toAddress);
        this.builder.buildFrom(fromAddress);
        this.builder.buildSubject();
        this.builder.buildBody();
        this.builder.buildBody();
        this.builder.sendMessage();
    }
}
