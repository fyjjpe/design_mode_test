package m16_Iterator;

/**
 * Created by yuanjie.fang on 2018/2/12.
 */
public interface Iterator {
    public void first();

    public void next();

    public boolean isDone();

    public Object currentItem();
}
