package m18_Memento;

/**
 * Created by yuanjie.fang on 2018/2/13.
 * 　发起人角色类
 */
public class Originator {
    private String state;

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
        System.out.println("当前状态:" + this.state);
    }

    //工厂方法，返回一个新的备忘录对象
    public Memento createMemento() {
        return new Memento(state);
    }

    //将发起人恢复到备忘录对象所记载的状态
    public void restoreMemento(Memento memento) {
        this.state = memento.getState();
    }

}
