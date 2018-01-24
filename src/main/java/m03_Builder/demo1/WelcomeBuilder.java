package m03_Builder.demo1;

/**
 * Created by yuanjie.fang on 2018/1/22.
 * 具体建造者WelcomeBuilder
 */
public class WelcomeBuilder extends Builder {

    public WelcomeBuilder() {
        msg = new WelcomeMessage();
    }

    public void buildSubject() {
        System.out.println("欢迎标题");
    }

    public void buildBody() {
        System.out.println("欢迎内容");
    }
}
