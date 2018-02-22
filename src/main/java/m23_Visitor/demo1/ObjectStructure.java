package m23_Visitor.demo1;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by yuanjie.fang on 2018/2/22.
 */
public class ObjectStructure {
    private List<Node> nodes = new ArrayList<Node>();

    public void action(Visitor visitor) {
        for (Node node : nodes) {
            node.accept(visitor);
        }
    }

    public void add(Node node) {
        nodes.add(node);
    }
}
