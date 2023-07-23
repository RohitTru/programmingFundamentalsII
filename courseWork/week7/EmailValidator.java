package courseWork.week7;

import java.util.Scanner;

public class EmailValidator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String email;

        // Ask the user to enter their email address
        System.out.print("Enter your email address: ");
        email = scanner.nextLine();

        // Validate the length of the email address
        if (email.length() < 15 || email.length() > 25) {
            System.out.println("Email address must be between 15-25 characters long.");
        } else {
            // Validate the presence of '@' symbol and a number in the email address
            boolean hasAtSymbol = false;
            boolean hasNumber = false;

            for (int i = 0; i < email.length(); i++) {
                char character = email.charAt(i);

                if (character == '@') {
                    hasAtSymbol = true;
                } else if (Character.isDigit(character)) {
                    hasNumber = true;
                }
            }

            if (!hasAtSymbol) {
                System.out.println("Email address must contain '@' symbol.");
            } else if (!hasNumber) {
                System.out.println("Email address must contain a number.");
            } else {
                System.out.println("Email address is valid.");
            }
        }

        scanner.close();
    }
}
