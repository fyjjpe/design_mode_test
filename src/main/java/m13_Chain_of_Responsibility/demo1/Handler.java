package m13_Chain_of_Responsibility.demo1;

/**
 * Created by yuanjie.fang on 2018/1/24.
 */
public abstract class Handler {
    protected Handler successor = null;

    public Handler getSuccessor() {
        return successor;
    }

    public void setSuccessor(Handler successor) {
        this.successor = successor;
    }

    //处理聚餐费用的申请
    public abstract String handleFeeRequest(String user, double fee);
}
