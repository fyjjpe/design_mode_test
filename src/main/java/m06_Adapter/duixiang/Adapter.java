package m06_Adapter.duixiang;

import m06_Adapter.nei.*;

/**
 * Created by yuanjie.fang on 2018/1/23.
 */
public class Adapter implements m06_Adapter.nei.Target {
    private Adaptee adaptee;

    public Adapter(Adaptee adaptee) {
        this.adaptee = adaptee;
    }

    public void sampleOperation1() {
        this.adaptee.sampleOperation1();
    }

    public void sampleOperation2() {

    }
}
