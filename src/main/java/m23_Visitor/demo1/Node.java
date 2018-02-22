package m23_Visitor.demo1;

/**
 * Created by yuanjie.fang on 2018/2/22.
 */
public abstract class Node {
    public abstract void accept(Visitor visitor);
}
