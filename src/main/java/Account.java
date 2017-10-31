import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Created by shazeda on 10/30/17.
 */
public class Account {

    public static void main (String[] args) {

        float bal = 0;
        float amount;
        Scanner scanner = new Scanner(System.in);

        while (true) {

            System.out.println("Please enter in a command (Deposit, Withdraw, Balance, Exit) :");
            String command = scanner.next();

            switch (command.toLowerCase()) {

                case "deposit":
                    System.out.println("Please enter an amount to deposit:");

                    try {
                        amount = scanner.nextFloat();
                    } catch (InputMismatchException ex) {
                        System.out.println("Amount is invalid. Please try again.");
                        break;
                    }

                    if (decimalDigits(amount) > 2) {
                        System.out.println("Amount is invalid. Please try again.");
                        break;
                    }

                    bal = bal + amount;
                    break;

                case "withdraw":
                    System.out.println("Please enter an amount to withdraw:");

                    try {
                        amount = scanner.nextFloat();
                    } catch (InputMismatchException ex) {
                        System.out.println("Amount is invalid. Please try again.");
                        break;
                    }

                    if (decimalDigits(amount) > 2) {
                        System.out.println("Amount is invalid. Please try again.");
                        break;
                    }

                    bal = bal - amount;
                    break;

                case "balance":
                    System.out.println("The current balance is: $" + bal);
                    break;

                case "exit":
                    System.out.println("Goodbye!");
                    return;

                default:
                    System.out.println("Invalid command. Please try again.");

            }
        }
    }

    public static int decimalDigits(float number) {
        String str = String.valueOf(number);
        String[] split = str.split("\\.");
        return split[1].length();
    }

}
