package m17_Mediator;

/**
 * Created by yuanjie.fang on 2018/2/13.
 */
public class Mediator extends AbstractMediator {

    public Mediator(AbstractColleague a, AbstractColleague b) {
        super(a, b);
    }

    public void AaffectB() {
        int number = A.getNumber();
        B.setNumber(number * 100);
    }

    public void BaffectA() {
        A.setNumber(B.getNumber()/100);
    }
}
