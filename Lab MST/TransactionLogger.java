import java.io.FileWriter;
import java.io.IOException;
class TransactionLogger {
    void logTransaction(int accountNumber, String transactionType, double amount) {
        try {
            FileWriter writer = new FileWriter("transactions.txt", true);
            writer.write(accountNumber + " | " + transactionType + " | " + amount + "\n");
            writer.close();
        } catch (IOException e) {
            System.out.println("Error");
        }
    }
}
class InsufficientBalanceException extends Exception {
    InsufficientBalanceException(String message) {
        super(message);
    }
}