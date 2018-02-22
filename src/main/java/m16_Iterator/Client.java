package m16_Iterator;

/**
 * Created by yuanjie.fang on 2018/2/12.
 */
public class Client {
    public static void main(String[] args) {
        Client client = new Client();
        client.operation();
    }

    public void operation(){
        Object[] objArray = {"one","Two","Three","Four","Five","Six"};
        Aggregate agg = new ConcreteAggregate(objArray);

        Iterator it = agg.createIterator();
        while (it.isDone()){
            System.out.println(it.currentItem());
            it.next();
        }
    }
}
