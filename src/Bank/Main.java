package Bank;

public class Main {
    public static void main(String[] args) {
//        CurrentAccount currentAccountDetails = new CurrentAccount("Tejash Bhivgade", 154522, 10001, 500);
//        currentAccountDetails.CalculateInterest();
//
//        System.out.println("Account balance is : "+currentAccountDetails.getAccountBalance());
//        System.out.println("amount deposited: "+currentAccountDetails.deposite(2000));
//        System.out.println("Amount withdrawed : "+currentAccountDetails.withdraw(2000));
//        System.out.println("Account balance is : "+currentAccountDetails.getAccountHolderName());
//
//        SavingsAccount savingsAccountDetails = new SavingsAccount("Harsh Bhivgade", 20000, 10002);
//        System.out.println("Your savings accoutn balance is: " + savingsAccountDetails.getAccountBalance());
//        savingsAccountDetails.CalculateInterest();
//        savingsAccountDetails.withdraw(15000);

        SalaryAccount salaryAccountDetails = new SalaryAccount("Sharma ji", 51000, 10003);
        salaryAccountDetails.deposite(4000);
        System.out.println("account balance after deposite: " + salaryAccountDetails.accountBalance);
        salaryAccountDetails.CalculateInterest();
        salaryAccountDetails.withdraw(26000);
        System.out.println("account balance after deposite: " + salaryAccountDetails.accountBalance);
    }

}
