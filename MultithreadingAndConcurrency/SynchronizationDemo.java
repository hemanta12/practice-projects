/**
 * The BankAccount class simulates a simple bank account with a balance.
 * The `withdraw()` method is synchronized to ensure thread safety when
 * multiple threads attempt to withdraw money simultaneously.
 */
class BankAccount {
    private int balance;

    public BankAccount(int inititalBalance) {
        this.balance = inititalBalance;
    }

    /**
     * Withdraws an amount from the account.
     * This method is synchronized to prevent inconsistent states
     * when accessed by multiple threads.
     * 
     * @param amount The amount to withdraw.
     */
    public synchronized void withdraw(int amount) {
        System.out.println("******************************");
        System.out.println(Thread.currentThread().getName() + " attempting to withdraw: $" + amount);

        // Check if the balance is sufficient for the withdrawal
        if (balance >= amount) {
            System.out.println(Thread.currentThread().getName() + " successfully withdrew: $" + amount);
            System.out.println("******************************");

            balance -= amount;
        } else {
            System.out.println(Thread.currentThread().getName() + " failed to withdraw: Insufficient funds.");
        }
        System.out.println("Rremaining balance: $" + balance);
    }
}

/**
 * The BankAccountThread class represents a task that tries to withdraw money
 * from a shared BankAccount instance. This simulates multiple users accessing
 * the same account concurrently.
 */

class BankAccountThread extends Thread {
    private BankAccount account;
    private int amount;

    public BankAccountThread(BankAccount account, int amount) {
        this.account = account;
        this.amount = amount;
    }

    @Override
    public void run() {
        account.withdraw(amount);
    }
}

/**
 * SynchronizationDemo demonstrates the use of synchronization to prevent
 * inconsistent states when multiple threads access a shared resource
 * (BankAccount).
 * 
 * It creates multiple threads to simulate simultaneous withdrawals.
 */
public class SynchronizationDemo {
    public static void main(String[] args) {
        BankAccount account = new BankAccount(100);

        BankAccountThread thread1 = new BankAccountThread(account, 50);
        thread1.setName("User-1");

        BankAccountThread thread2 = new BankAccountThread(account, 50);
        thread2.setName("User-2");

        BankAccountThread thread3 = new BankAccountThread(account, 50);
        thread3.setName("User-3");

        thread1.start();
        thread2.start();
        thread3.start();

    }
}
