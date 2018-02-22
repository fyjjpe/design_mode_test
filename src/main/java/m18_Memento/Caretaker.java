package m18_Memento;

/**
 * Created by yuanjie.fang on 2018/2/13.
 * 负责人角色类
 */
public class Caretaker {
    private Memento memento;

    public Memento retrieveMemento() {
        return this.memento;
    }

    public void saveMemento(Memento memento) {
        this.memento = memento;
    }
}
