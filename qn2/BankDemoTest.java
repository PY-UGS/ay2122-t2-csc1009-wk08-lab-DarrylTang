import java.io.InputStream;
import java.util.*;

public class BankDemoTest{
    public static void main(String[] args) {
        CheckingAccount account = new CheckingAccount();

        account.deposit();
        try {
            account.withdraw();
        } catch (InsufficientFundsException e) {
            System.out.println(e);
        }
    }
}
