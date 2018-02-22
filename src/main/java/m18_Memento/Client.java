package m18_Memento;

/**
 * Created by yuanjie.fang on 2018/2/13.
 */
public class Client {
    public static void main(String[] args) {
        Originator o = new Originator();
        Caretaker c = new Caretaker();
        //改变发起人对象的状态
        o.setState("On");
        //创建备忘录对象,并将发起人的状态存储起来
        c.saveMemento(o.createMemento());
        //修改发起人对象的状态
        o.setState("Off");
        //恢复发起人的状态
        o.restoreMemento(c.retrieveMemento());

        System.out.println(o.getState());
    }
}
