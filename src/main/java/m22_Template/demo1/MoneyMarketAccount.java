package m22_Template.demo1;

/**
 * Created by yuanjie.fang on 2018/2/22.
 * 货币市场
 */
public class MoneyMarketAccount extends Account {
    protected String doCalculateAccountType() {
        return "Money Market";
    }

    protected double doCalculateInterestRate() {
        return 0.045;
    }
}
