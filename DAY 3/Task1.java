
package Day3;
public class Bankaccount {
 double balance;
 void deposit(double amount) {
 balance = balance + amount;
 System.out.println("Deposited: $" + amount);
    }
void withdraw(double amount) {
   if (amount <= balance) {
    balance = balance - amount;
    System.out.println("Withdrew: $" + amount);
    } 
   else {
    System.out.println("Not enough money!");
     }
    }
    void showBalance() {
    System.out.println("Balance: $" + balance);
    }
    public static void main(String[] args) {
    Bankaccount myAccount = new Bankaccount();
    myAccount.deposit(100);
    myAccount.withdraw(40);
    myAccount.showBalance();
    }
}
