package m10_Wrapper;

/**
 * Created by yuanjie.fang on 2018/1/23.
 */
public class Bird extends Change {
    public Bird(TheGreatestSage sage) {
        super(sage);
    }

    @Override
    public void move() {
        System.out.println("Bird Move");
    }
}
