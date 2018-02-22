package m17_Mediator;

/**
 * Created by yuanjie.fang on 2018/2/13.
 */
public abstract class AbstractColleague {
    protected int number;

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public abstract void setNumber(int number, AbstractMediator am);
}
