package m23_Visitor;

/**
 * Created by yuanjie.fang on 2018/2/22.
 */
public class Mozi {
    public void ride(Horse h){
        System.out.println("骑马");
    }

    public void ride(BlackHorse bh){
        System.out.println("骑黑马");
    }

    public static void main(String[] args) {
        Horse bh = new BlackHorse();
        Mozi mozi = new Mozi();
        mozi.ride(bh);
        //重载方法的分派是根据静态类型进行的，这个分派过程在编译时期就完成了。
    }
}
