package m10_Wrapper;

/**
 * Created by yuanjie.fang on 2018/1/23.
 */
public class Change implements TheGreatestSage {
    private TheGreatestSage sage;

    public Change(TheGreatestSage sage) {
        this.sage = sage;
    }

    public void move() {
        sage.move();
    }
}
