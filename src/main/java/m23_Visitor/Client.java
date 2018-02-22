package m23_Visitor;

/**
 * Created by yuanjie.fang on 2018/2/22.
 */
public class Client {
    public static void main(String[] args) {
        Horse h = new BlackHorse();
        h.eat();
        //重写方法时，方法的调用则是根据对象的真实类型，而不是静态类型
    }
}
