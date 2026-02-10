package bankaccount;

public interface AccountState {
    void deposit(double depositAmount);
    void withdraw(double withdrawAmount);
    void activate();
    void suspend();
    void close();
}