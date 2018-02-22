package m19_Observer;

/**
 * Created by yuanjie.fang on 2018/2/13.
 * 观察者接口，定义一个更新的接口给哪些目标发生改变的时候被通知的对象
 */
public interface Observer {

    //观察者更新的方法
    void update(Subject subject);
}
