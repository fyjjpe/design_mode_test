package m16_Iterator;

/**
 * Created by yuanjie.fang on 2018/2/12.
 */
public class ConcreteIterator implements Iterator {
    private ConcreteAggregate agg;
    private int index = 0;
    private int size = 0;

    public ConcreteIterator(ConcreteAggregate agg) {
        this.agg = agg;
        this.size = agg.size();
        index = 0;
    }

    public void first() {
        index = 0;
    }

    public void next() {
        if (index < size) {
            index++;
        }
    }

    public boolean isDone() {
        return (index >= size);
    }

    public Object currentItem() {
        return agg.getElement(index);
    }
}
