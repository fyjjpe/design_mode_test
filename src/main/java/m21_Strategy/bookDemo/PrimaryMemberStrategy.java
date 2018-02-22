package m21_Strategy.bookDemo;

/**
 * Created by yuanjie.fang on 2018/2/22.
 */
public class PrimaryMemberStrategy implements MemberStrategy {
    public double calcPrice(double booksPrice) {
        System.out.println("普通会员没有优惠");
        return booksPrice;
    }
}
