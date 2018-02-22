package m23_Visitor.demo1;

/**
 * Created by yuanjie.fang on 2018/2/22.
 */
public class VisitorA implements Visitor {
    public void visit(NodeA node) {
        System.out.println(node.operationA());
    }

    public void visit(NodeB node) {
        System.out.println(node.operationB());
    }
}
