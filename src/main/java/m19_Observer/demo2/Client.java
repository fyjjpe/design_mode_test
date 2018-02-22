package m19_Observer.demo2;

/**
 * Created by yuanjie.fang on 2018/2/13.
 */
public class Client {
    public static void main(String[] args) {
        ConcreteWeatherSubject subject = new ConcreteWeatherSubject();
        ConcreteObserver girl = new ConcreteObserver();
        girl.setObserverName("女朋友");

        ConcreteObserver mum = new ConcreteObserver();
        mum.setObserverName("老妈");

        //注册观察者
        subject.addObserver(girl);
        subject.addObserver(mum);

        //目标更新天气情况
        subject.setContent("天气晴朗");

    }
}
