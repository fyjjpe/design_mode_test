package m03_Builder.demo1;

/**
 * Created by yuanjie.fang on 2018/1/22.
 */
public class GoodbyeBuilder extends Builder {

    public GoodbyeBuilder() {
        msg = new GoodbyeMessage();
    }

    public void buildSubject() {
        System.out.println("欢送标题");
    }

    public void buildBody() {
        System.out.println("欢送内容");
    }
}
