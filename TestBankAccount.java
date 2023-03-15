public class TestBankAccount {
    public static void main(String[] args){
        BankAccount kyle = new BankAccount(5, 10);
        kyle.printCheckingBalance();
        kyle.printSavingsBalance();
        System.out.println(kyle.balanceDepositAccountsOnHand);
        System.out.println(kyle.depositAccountsOnHand);
    }
}
