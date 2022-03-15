import java.io.*;

public class InsufficientFundsException extends Exception{
    private double amount;

    public InsufficientFundsException(String message, double amount) {
        super(message + amount);
        this.amount = amount;
    }

    public double getAmount() {
        return amount;
    }
}
