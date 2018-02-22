package m21_Strategy.bookDemo;

/**
 * Created by yuanjie.fang on 2018/2/22.
 */
public class AdvanceMemberStrategy implements MemberStrategy {
    public double calcPrice(double booksPrice) {
        System.out.println("高级会员折扣为20%");
        return booksPrice * 0.8;
    }
}
