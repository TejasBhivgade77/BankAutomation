package Bank;

public class SalaryAccount extends Account {

    private int transactionCount;
    private boolean Frozen;
    private final double minimumBalance = 10000;
    private final double savingsInterestPercent = 0.04;

    SalaryAccount(String accountHolderName, double accountBalance, int accountNumber) {
        super(accountHolderName, accountBalance, accountNumber);
        this.transactionCount = 0;
        this.Frozen = false; // not frozen
    }

    public void updateTransactionCount(){
        this.transactionCount++;
    }


    public void checkforInactivity(){
        if(transactionCount == 0 ){
            Frozen = true;
            notifyAccountHolder();
        }
    }

    private void notifyAccountHolder(){
        System.out.println("Account is being frozen due to inactivity. Please visit bank for further action.");
    }


    @Override
    public void CalculateInterest() {
        double totalInterest = accountBalance * savingsInterestPercent;
        accountBalance = accountBalance + totalInterest;
        System.out.println("Now total balance after interest is : " + accountBalance);
    }

    public double deposite(double amount){
        if(!Frozen){ // opposite of Frozen
            super.deposite(amount);
            updateTransactionCount();
        }else{
            System.out.println("Your account is frozen due to no transaction activity");
        }
        return accountBalance;- 
    }


    @Override
    public double withdraw(double amount) {
        if(!Frozen){
            accountBalance = accountBalance-amount;
            updateTransactionCount();
            return  accountBalance;
        }else{
            System.out.println("Account is being frozen due to no transaction activity");
            return getAccountBalance();
        }
    }

}
