package bankaccount;

public class AccountTest {
    public static void main(String[] args) {
        Account myAccount = new Account("1234", 10000.0);

        myAccount.activate();           // Account is already activated!

        myAccount.suspend();            // Account is suspended!

        myAccount.activate();           // Account is activated!

        myAccount.deposit(1000.0);      // updates balance → Account Number: 1234, Balance: 11000.0

        myAccount.withdraw(100.0);      // updates balance → Account Number: 1234, Balance: 10900.0

        myAccount.close();              // Account is closed!

        myAccount.activate();           // You cannot activate a closed account!

        myAccount.suspend();            // You cannot suspend a closed account!

        myAccount.withdraw(500.0);      // You cannot withdraw on a closed account!
                                        // Account Number: 1234, Balance: 10900.0

        myAccount.deposit(1000.0);      // You cannot deposit on a closed account!
                                        // Account Number: 1234, Balance: 10900.0
    }
}