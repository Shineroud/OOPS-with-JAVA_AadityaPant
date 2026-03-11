class BankAccount {

    int accountNumber;
    String holderName;
    double balance;
    BankAccount(int accountNumber, String holderName, double balance) {
        this.accountNumber = accountNumber;
        this.holderName = holderName;
        this.balance = balance;
    }
    void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: " + amount);
            System.out.println("New Balance: " + balance);
        } else {
            System.out.println("Invalid");
        }
    }
    void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn: " + amount);
            System.out.println("Remaining: " + balance);
        } else {
            System.out.println("Insufficient balance or invalid amount");
        }
    }
}
public class Main {
    public static void main(String[] args) {
        BankAccount acc = new BankAccount(101, "Rahul", 5000);
        acc.deposit(2000);
        acc.withdraw(1500);
        acc.withdraw(7000);

    }
}