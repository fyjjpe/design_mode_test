package m23_Visitor.demo1;

/**
 * Created by yuanjie.fang on 2018/2/22.
 */
public interface Visitor {
    void visit(NodeA node);
    void visit(NodeB node);
}
