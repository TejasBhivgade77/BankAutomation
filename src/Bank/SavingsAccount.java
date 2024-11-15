package Bank;

public class SavingsAccount extends Account{

    private final double minimumBalance = 10000;
    private final double savingsInterestPercent = 0.04;

    SavingsAccount(String accountHolderName, double accountBalance, int accountNumber){
        super(accountHolderName, accountBalance, accountNumber);
    }

    @Override
    public void CalculateInterest() {
        double totalInterest = accountBalance * savingsInterestPercent;
        accountBalance = accountBalance + totalInterest;
        System.out.println("Now total balance after interest is : " + accountBalance);
    }

    @Override
    public double withdraw(double amount) {
        if(accountBalance - amount >= minimumBalance){
            accountBalance = accountBalance - amount;
            System.out.println("Withdrawal successful. New balance: " + accountBalance);
            return accountBalance;
        } else {
            System.out.println("Withdrawal failed. Your account must maintain a minimum balance of " + minimumBalance);
            return accountBalance;
        }
    }

}
