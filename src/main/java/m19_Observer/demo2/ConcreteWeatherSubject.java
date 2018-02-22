package m19_Observer.demo2;

import java.util.Observable;

/**
 * Created by yuanjie.fang on 2018/2/13.
 * 测试jdk为我们提供的观察者模式
 *
 * 目标的实现
 */
public class ConcreteWeatherSubject extends Observable {
    //天气情况内容
    private String content;


    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
        //通知所有的观察者
        //在使用java中的Observer模式时，下面这句话不可少
        this.setChanged();
        //然后主动通知
        this.notifyObservers(content);//推模型的实现

        //this.notifyObservers();//拉模型的实现
    }
}
