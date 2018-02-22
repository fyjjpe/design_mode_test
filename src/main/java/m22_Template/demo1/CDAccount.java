package m22_Template.demo1;

/**
 * Created by yuanjie.fang on 2018/2/22.
 * 定期存款
 */
public class CDAccount extends Account {
    protected String doCalculateAccountType() {
        return "Certificate of Deposite";
    }

    protected double doCalculateInterestRate() {
        return 0.06;
    }
}
