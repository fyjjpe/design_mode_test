package m21_Strategy.bookDemo;

/**
 * Created by yuanjie.fang on 2018/2/22.
 */
public class Price {
    private MemberStrategy strategy;

    public Price(MemberStrategy strategy) {
        this.strategy = strategy;
    }

    //计算图书价格
    public double quote(double booksPrice){
        return this.strategy.calcPrice(booksPrice);
    }
}
