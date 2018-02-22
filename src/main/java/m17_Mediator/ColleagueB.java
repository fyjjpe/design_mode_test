package m17_Mediator;

/**
 * Created by yuanjie.fang on 2018/2/13.
 */
public class ColleagueB extends AbstractColleague {
    public void setNumber(int number, AbstractMediator am) {
        this.number = number;
        am.BaffectA();
    }
}
