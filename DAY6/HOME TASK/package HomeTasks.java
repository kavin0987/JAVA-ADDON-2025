package HomeTasks;


public class BankAccount {
    private int balance;

    public BankAccount(int balance) {
        this.balance = balance;
    }

    public synchronized void withdraw(String user, int amount) {
        System.out.println(user + " is trying to withdraw ₹" + amount);
        if (balance >= amount) {
            try {
                Thread.sleep(1000); // simulate delay
            } catch (InterruptedException e) {
                System.out.println("Transaction interrupted.");
            }
            balance -= amount;
            System.out.println(user + " successfully withdrew ₹" + amount + ". Remaining balance: ₹" + balance);
        } else {
            System.out.println(user + " failed to withdraw ₹" + amount + ". Insufficient balance: ₹" + balance);
        }
    }

    public int getBalance() {
        return balance;
    }
}