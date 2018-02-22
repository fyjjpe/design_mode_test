package m19_Observer;

/**
 * Created by yuanjie.fang on 2018/2/13.
 * 具体的观察者对象，实现更新的方法，使自身的状态和目标的状态保持一致
 */
public class ConcreteObserver implements Observer {
    //观察者的状态
    private String observerState;

    //获取目标类的状态，同步到观察者的状态中
    public void update(Subject subject) {
        observerState = ((ConcreteSubject)subject).getSubjectState();
    }
}
