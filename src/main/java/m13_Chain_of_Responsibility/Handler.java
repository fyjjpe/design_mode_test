package m13_Chain_of_Responsibility;

/**
 * Created by yuanjie.fang on 2018/1/24.
 */
public abstract class Handler {

    protected Handler successor;

    public abstract void handleRequest();

    public Handler getSuccessor() {
        return successor;
    }

    public void setSuccessor(Handler successor) {
        this.successor = successor;
    }
}
