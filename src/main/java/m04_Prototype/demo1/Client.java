package m04_Prototype.demo1;

/**
 * Created by yuanjie.fang on 2018/1/22.
 */
public class Client {
    private Prototype prototype;

    public Client(Prototype prototype) {
        this.prototype = prototype;
    }

    public void operation(Prototype example) {
        Prototype copy = prototype.clone();
    }
}
