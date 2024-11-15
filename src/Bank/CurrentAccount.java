package Bank;

public class CurrentAccount extends Account{

    private double overDraftLimit;
    CurrentAccount(String accountHolderName, double accountBalance, int accountNumber, double overDraftLimit){
        super(accountHolderName, accountBalance, accountNumber);
        this.overDraftLimit=overDraftLimit;
    }

    public void CalculateInterest() {
        System.out.println("current account does not give the facility of interest");
    }

    public double withdraw(double amount) {
        if(accountBalance + overDraftLimit >= amount){
            accountBalance = accountBalance - amount;
            System.out.println("Withdrawl successfull");
            return accountBalance;
        }
        else{
            System.out.println("Withdrawl failed");
            return accountBalance;
        }
    }
}
