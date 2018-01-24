package m05_Singleton;

/**
 * Created by yuanjie.fang on 2017/7/17.
 * 饿汉式单例--优先使用饿汉式单例模式
 */
public class Singleton1 {
    private static Singleton1 singleton1 = new Singleton1();

    private Singleton1() {

    }

    public static Singleton1 getInstance() {
        return singleton1;
    }
}
