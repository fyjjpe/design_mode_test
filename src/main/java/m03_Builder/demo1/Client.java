package m03_Builder.demo1;

/**
 * Created by yuanjie.fang on 2018/1/22.
 */
public class Client {
    public static void main(String[] args) {
        Builder builder = new WelcomeBuilder();
        Director director = new Director(builder);
        director.construct("123","456");
    }
}
