package m21_Strategy.bookDemo;

/**
 * Created by yuanjie.fang on 2018/2/22.
 */
public class Client {
    public static void main(String[] args) {
//        MemberStrategy strategy = new AdvanceMemberStrategy();
        MemberStrategy strategy = new IntermediateMemberStrategy();
        Price price = new Price(strategy);
        double quote = price.quote(300);
        System.out.println("图书价格为：" + quote);
    }
}
