package Bank;

public abstract class Account {
    protected String accountHolderName;
    protected double accountBalance;
    protected int accountNumber;

    Account(String accountHolderName, double accountBalance, int accountNumber){
        this.accountHolderName=accountHolderName;
        this.accountBalance=accountBalance;
        this.accountNumber=accountNumber;
    }

    public abstract void CalculateInterest();
    public abstract double withdraw(double amount);

    public double  deposite(double amount){
        accountBalance=accountBalance+amount;
        System.out.println("Amount Deposited: "+ amount);
        return amount;
    }

    public double getAccountBalance() {
        return accountBalance;
    }

    public int getAccountNumber(){
        return accountNumber;
    }

    public String getAccountHolderName(){
        return accountHolderName;
    }
}
