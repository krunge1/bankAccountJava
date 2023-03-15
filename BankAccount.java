import java.util.Random;

public class BankAccount{
    // overall class tracked items
    public static int depositAccountsOnHand = 0;
    public static double balanceDepositAccountsOnHand = 0;

    // individual object attributes
    private int accountNumber;
    private double checkingBalance;
    private double savingsBalance;
    
    //Constructer User bank accounts and initial balances
    public BankAccount (double checkingBalance, double savingsBalance){
        this.accountNumber = randomAccountNumber();
        this.checkingBalance = checkingBalance;
        this.savingsBalance = savingsBalance;
        depositAccountsOnHand += 2;
        balanceDepositAccountsOnHand += (checkingBalance + savingsBalance);
    }

    //Random Generator for Account
    private int randomAccountNumber(){
        Random rand = new Random();
        accountNumber = rand.nextInt(1000000000) + 99999999;
        return accountNumber;
    }

//Getters//
    //Get account balances and print sentence
    public void printAccountBalances (){
        System.out.printf("\nYour balance in Checking $%.2f\n", checkingBalance);
        System.out.printf("\nYour balance in Savings $%.2f\n", savingsBalance);
    }

    //Get account number and print sentence
    public void printAccountNumber (){
        System.out.printf("\nYour account number is %s\n", accountNumber);
    }

// Setters//
    // Deposit based upon account
    public void depositInAccount(String account, double amount) {
        if (account == "checking") {
            checkingBalance += amount;
            balanceDepositAccountsOnHand += amount;
            System.out.printf("\nYour balance in Checking $%.2f\n", checkingBalance);
        }
        else if(account == "savings"){
            savingsBalance += amount;
            balanceDepositAccountsOnHand += amount;
            System.out.printf("\nYour balance in Savings $%.2f\n", savingsBalance);
        }
        else{
            System.out.println("You must enter savings or checking to make a deposit");
        }
    }

    // Withdraw based upon account and balance
    public void withdrawInAccount(String account, double amount) {
        if (account == "checking") {
            if (this.checkingBalance - amount > 0) {
                checkingBalance -= amount;
                balanceDepositAccountsOnHand -= amount;
                System.out.printf("\nYour balance in Checking $%.2f\n", checkingBalance);
            }
            else{
                System.out.println("Insufficient funds in account");
            }
        }
        else if(account == "savings"){
            if (this.savingsBalance - amount > 0) {
                savingsBalance -= amount;
                balanceDepositAccountsOnHand -= amount;
                System.out.printf("\nYour balance in Savings $%.2f\n", savingsBalance);
            }
            else{
                System.out.println("Insufficient funds in account");
            }
        }
        else{
            System.out.println("You must enter savings or checking to make a deposit");
        }
    }
}