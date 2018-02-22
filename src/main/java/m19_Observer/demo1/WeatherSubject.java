package m19_Observer.demo1;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by yuanjie.fang on 2018/2/13.
 * 目标对象，它知道观察它的观察者，并提供注册(添加)和删除观察者的接口
 */
public class WeatherSubject {
    //观察者对象集合
    private List<Observer> observers = new ArrayList<Observer>();

    //添加集合中观察者
    public void attach(Observer observer){
        observers.add(observer);
    }

    //删除集合中观察者
    public void detach(Observer observer){
        observers.remove(observer);
    }

    //通知所有注册的观察者对象
    protected void notifyObservers(){
        for (Observer observer : observers) {
            observer.update(this);
        }
    }

}
