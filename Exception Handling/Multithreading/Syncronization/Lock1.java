import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

class BankAccount {
    private int balance = 1000;
    private final Lock lock = new ReentrantLock();

    public void withdraw(String threadName, int amount) {
        lock.lock();
        try {
            System.out.println(threadName + " is trying to withdraw " + amount);

            if (balance >= amount) {
                System.out.println(threadName + " is withdrawing.....");
                balance -= amount;

                System.out.println(threadName + " Completed withdrawl . Balance left : " + balance);
            } else {
                System.out.println("Not enough balance for " + threadName);
            }
        } finally {
            lock.unlock();
        }
    }

}

public class Lock1 {
    public static void main(String[] args) {
        BankAccount account = new BankAccount();
        Thread t1 = new Thread(() -> account.withdraw("Thread-1", 700));
        Thread t2 = new Thread(() -> account.withdraw("Thread-2", 500));

        t1.start();
        t2.start();
    }
}
