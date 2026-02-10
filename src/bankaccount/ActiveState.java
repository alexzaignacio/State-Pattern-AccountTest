package bankaccount;

public class ActiveState implements AccountState {
    private Account account;

    public ActiveState(Account account) {
        this.account = account;
    }

    @Override
    public void deposit(double depositAmount) {
        account.setBalance(account.getBalance() + depositAmount);
        System.out.println(account.toString());
    }

    @Override
    public void withdraw(double withdrawAmount) {
        account.setBalance(account.getBalance() - withdrawAmount);
        System.out.println(account.toString());
    }

    @Override
    public void activate() {
        System.out.println("Account is already activated!");
    }

    @Override
    public void suspend() {
        account.setAccountState(new SuspendedState(account));
        System.out.println("Account is suspended!");
    }

    @Override
    public void close() {
        account.setAccountState(new ClosedState(account));
        System.out.println("Account is closed!");
    }
}