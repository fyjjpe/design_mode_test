package m10_Wrapper;

/**
 * Created by yuanjie.fang on 2018/1/23.
 */
public class Fish extends Change {
    public Fish(TheGreatestSage sage) {
        super(sage);
    }

    @Override
    public void move() {
        System.out.println("Fish Move");
    }
}
