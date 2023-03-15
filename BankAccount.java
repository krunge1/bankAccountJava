public class BankAccount{
    // overall class tracked items
    public static int depositAccountsOnHand = 0;
    public static double balanceDepositAccountsOnHand = 0;

    // individual object attributes
    private double checkingBalance;
    private double savingsBalance;
    
    //Constructer User bank accounts and initial balances
    public BankAccount (double checkingBalance, double savingsBalance){
        this.checkingBalance = checkingBalance;
        this.savingsBalance = savingsBalance;
        depositAccountsOnHand += 2;
        balanceDepositAccountsOnHand += (checkingBalance + savingsBalance);
    }

//Getters//
    //Get Checking balance and print sentence
    public void printCheckingBalance (){
        System.out.printf("\nYour balance in Checking $%.2f\n", checkingBalance);
    }
    
    //Get Savings balance and print sentence
    public void printSavingsBalance() {
        System.out.printf("\nYour balance in Savings $%.2f\n", savingsBalance);
    }


//Setters//
    //Deposit based upon account
    // public depositInAccount(String account, double amount) {

    // }
}