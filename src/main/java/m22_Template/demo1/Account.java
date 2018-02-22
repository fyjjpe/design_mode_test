package m22_Template.demo1;

/**
 * Created by yuanjie.fang on 2018/2/22.
 */
public abstract class Account {
    public final double calculateInterest() {
        double interestRate = doCalculateInterestRate();
        String accountType = doCalculateAccountType();
        double amount = calculateAccount(accountType);
        return interestRate * amount;
    }

    protected abstract String doCalculateAccountType();

    protected abstract double doCalculateInterestRate();

    private double calculateAccount(String accountType) {
        return 1000.00;
    }
}
