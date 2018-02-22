package m19_Observer.demo1;


/**
 * Created by yuanjie.fang on 2018/2/13.
 * 具体的观察者对象，实现更新的方法，使自身的状态和目标的状态保持一致
 */
public class ConcreteObserver implements Observer {
    //观察者的名称，是谁收到了这个讯息
    private String observerName;

    //天气内容的情况,从目标出获取
    private String weatherContent;

    //提醒的内容：女朋友提醒约会，老妈提醒购物
    private String remindThing;


    //获取目标类的状态，同步到观察者的状态中
    public void update(WeatherSubject subject) {
        weatherContent = ((ConcreteWeatherSubject) subject).getweatherContent();
        System.out.println(observerName + "——收到了" + weatherContent + ",提醒" + remindThing);
    }


    public String getObserverName() {
        return observerName;
    }

    public void setObserverName(String observerName) {
        this.observerName = observerName;
    }

    public String getWeatherContent() {
        return weatherContent;
    }

    public void setWeatherContent(String weatherContent) {
        this.weatherContent = weatherContent;
    }

    public String getRemindThing() {
        return remindThing;
    }

    public void setRemindThing(String remindThing) {
        this.remindThing = remindThing;
    }
}
