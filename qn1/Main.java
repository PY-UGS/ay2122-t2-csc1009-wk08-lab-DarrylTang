import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // takes inputs from user, and throws an exception if input is
        // wrong. Try Catch

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter circle radius: ");

        try {
            float userRadius = sc.nextFloat();

            CircleWithException circle = new CircleWithException(userRadius);
            System.out.println("The circle's area is: " + circle.getArea());
        } catch (IllegalArgumentException e) {
            System.out.println("Exception caught, " + e);
        } catch (Exception e) {
            System.out.println("Exception caught, " + e);
        }

    }
}
