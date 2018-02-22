package m19_Observer.demo1;

import m19_Observer.Subject;

/**
 * Created by yuanjie.fang on 2018/2/13.
 * 测试观察者模式
 */
public class Client {
    public static void main(String[] args) {
        //1.创建目标
        ConcreteWeatherSubject weather = new ConcreteWeatherSubject();

        //2.创建观察者
        ConcreteObserver observerGirl = new ConcreteObserver();
        observerGirl.setObserverName("女朋友");
        observerGirl.setRemindThing("去约会");

        ConcreteObserver observerMom = new ConcreteObserver();
        observerMom.setObserverName("老妈");
        observerMom.setRemindThing("去购物");

        //3.注册观察者
        weather.attach(observerGirl);
        weather.attach(observerMom);

        //4.目标发布天气
        weather.setweatherContent("明天天气晴朗，蓝天白云，气温28度");


    }
}
