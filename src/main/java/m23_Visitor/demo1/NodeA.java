package m23_Visitor.demo1;

/**
 * Created by yuanjie.fang on 2018/2/22.
 */
public class NodeA extends Node {
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    public String operationA(){
        return "NodeA";
    }
}
