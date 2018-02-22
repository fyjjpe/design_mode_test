package m23_Visitor.demo1;

/**
 * Created by yuanjie.fang on 2018/2/22.
 */
public class Client {
    public static void main(String[] args) {
        ObjectStructure os = new ObjectStructure();
        os.add(new NodeA());
        os.add(new NodeB());
        Visitor visitor = new VisitorA();
        os.action(visitor);
    }
}
