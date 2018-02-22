package m14_Action;

/**
 * Created by yuanjie.fang on 2018/2/12.
 */
public class ConcreteCommand implements Command {
    private Receiver receiver = null;

    public ConcreteCommand(Receiver receiver) {
        this.receiver = receiver;
    }

    public void execute() {
        receiver.action();
    }
}
