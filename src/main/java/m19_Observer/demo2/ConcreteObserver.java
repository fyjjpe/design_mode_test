package m19_Observer.demo2;


import java.util.Observable;
import java.util.Observer;

/**
 * Created by yuanjie.fang on 2018/2/13.
 */
public class ConcreteObserver implements Observer {
    private String observerName;

    public String getObserverName() {
        return observerName;
    }

    public void setObserverName(String observerName) {
        this.observerName = observerName;
    }

    public void update(Observable o, Object arg) {
        //第一种是推模型的方式
        System.out.println(observerName + "收到消息，目标推送的是" + arg);
        //第二种是拉模型的方式
        System.out.println(observerName+"收到消息，主动到目标对象中去拉，拉的内容是"+((ConcreteWeatherSubject)o).getContent());
    }
}
