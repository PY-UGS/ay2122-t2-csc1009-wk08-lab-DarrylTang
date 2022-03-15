import java.util.*;
import java.text.DecimalFormat;

public class CheckingAccount {
    Scanner sc = new Scanner(System.in);
    DecimalFormat df = new DecimalFormat("0.00");
    float balance, accountNum;

    public void deposit() {
        System.out.print("Enter amount to deposit: ");
        float num = sc.nextFloat();
        this.balance += num;
    }

    public void withdraw() throws InsufficientFundsException{
        System.out.print("Enter amount to withdraw: ");
        float num = sc.nextFloat();
        if (num > this.balance) {
            throw new InsufficientFundsException("Sorry, but your account is short by: $", num - balance);
        } else {
            this.balance -= num;
            System.out.println("The balance after withdraw is $" + df.format(balance));
        }
    }

    public float getBalance() {
        return balance;
    }

    public float getNumber() {
        return accountNum;
    }
}
