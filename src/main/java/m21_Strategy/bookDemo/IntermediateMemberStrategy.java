package m21_Strategy.bookDemo;

/**
 * Created by yuanjie.fang on 2018/2/22.
 */
public class IntermediateMemberStrategy implements MemberStrategy {
    public double calcPrice(double booksPrice) {
        System.out.println("中级会员折扣为10%");
        return booksPrice * 0.9;
    }
}
