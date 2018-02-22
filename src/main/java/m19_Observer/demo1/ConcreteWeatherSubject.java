package m19_Observer.demo1;

/**
 * Created by yuanjie.fang on 2018/2/13.
 * 具体的目标对象，负责把有关状态存入到相应的观察者对象中
 */
public class ConcreteWeatherSubject extends WeatherSubject {
    //目标对象的状态
    private String weatherContent;

    public String getweatherContent() {
        return weatherContent;
    }

    public void setweatherContent(String weatherContent) {
        this.weatherContent = weatherContent;
        this.notifyObservers();
    }
}
