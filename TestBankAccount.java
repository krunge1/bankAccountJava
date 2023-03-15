public class TestBankAccount {
    public static void main(String[] args){

        // Test class setups
        System.out.println("*****Test Bank Account Setups******");
        BankAccount kyle = new BankAccount(5, 10);
        BankAccount Jack = new BankAccount(55, 100);
        
        // Test account balance and info printing
        System.out.println("*****Test Account Printing******");
        kyle.printAccountBalances();
        Jack.printAccountBalances();
        kyle.printAccountNumber();
        Jack.printAccountNumber();

        //Test depsit functions
        System.out.println("*****Test Deposit******");
        kyle.depositInAccount("checking", 150);
        kyle.depositInAccount("savings", 110);
        kyle.depositInAccount("block", 10000);
        Jack.depositInAccount("checking", 1500);
        Jack.depositInAccount("savings", 200000);
        Jack.depositInAccount("block", 10000);

        //Test depsit functions
        System.out.println("*****Test Withdraw******");
        kyle.withdrawInAccount("checking", 50);
        kyle.withdrawInAccount("savings", 10);
        kyle.withdrawInAccount("block", 10000);
        Jack.withdrawInAccount("checking", 100);
        Jack.withdrawInAccount("savings", 200);
        Jack.withdrawInAccount("block", 10000);

        System.out.println("\n*****Test Bank Public Level Activity******");
        System.out.println(kyle.balanceDepositAccountsOnHand);
        System.out.println(kyle.depositAccountsOnHand);
    }
}
