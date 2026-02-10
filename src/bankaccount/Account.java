package bankaccount;

public class Account {
    private String accountNumber;
    private double balance;
    private AccountState accountState;

    public Account(String accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.accountState = new ActiveState(this); // starts as active
    }

    public void deposit(double depositAmount) {
        accountState.deposit(depositAmount);
    }

    public void withdraw(double withdrawAmount) {
        accountState.withdraw(withdrawAmount);
    }

    public void activate() {
        accountState.activate();
    }

    public void suspend() {
        accountState.suspend();
    }

    public void close() {
        accountState.close();
    }

    @Override
    public String toString() {
        return "Account Number: " + accountNumber + ", Balance: " + balance;
    }

    // Getters and setters needed by the states
    public AccountState getAccountState() {
        return accountState;
    }

    public void setAccountState(AccountState accountState) {
        this.accountState = accountState;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getAccountNumber() {
        return accountNumber;
    }
}