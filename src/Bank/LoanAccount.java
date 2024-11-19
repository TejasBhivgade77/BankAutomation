package Bank;

public class LoanAccount extends Account{
    private static final double loan_interest_rate = 0.05;

    LoanAccount((String accountHolderName, double accountBalance, int accountNumber)

    @Override
    public void CalculateInterest() {
        accountBalance = accountBalance *  loan_interest_rate;
        System.out.println("Balance after interest rate: "+accountBalance );
    }

    @Override
    public double withdraw(double amount) {
        return 0;
    }
}
