package courseWork.week7;

import java.util.Scanner;

public class EmailValidator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String email;

        // Ask user to enter email address
        System.out.print("Enter your email address: ");
        email = input.nextLine();

        // Validate length of email address
        if (email.length() < 15 || email.length() > 25) {
            System.out.println("Email address must be between 15-25 characters long.");
        }
        else {
            // Validate @ symbol and number in email address
            boolean hasAtSymbol = false;
            boolean hasNumber = false;

            for (int i = 0; i < email.length(); i++) {
                char c = email.charAt(i);

                if (c == '@') {
                    hasAtSymbol = true;
                }
                else if (Character.isDigit(c)) {
                    hasNumber = true;
                }
            }

            if (!hasAtSymbol) {
                System.out.println("Email address must contain @ symbol.");
            }
            else if (!hasNumber) {
                System.out.println("Email address must contain a number.");
            }
            else {
                System.out.println("Email address is valid.");
            }
        }

        input.close();
    }
}