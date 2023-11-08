import java.util.Scanner;

/**
    File name: PasswordChecker.java
    Short description: This program verifies if a given password conforms to rules.
    IST 140 Assignment: M03 - W06
    @author Pranav Ramesh
    @version 1.01 2023-10-08
    date of last revision: none
    details of the revision: none
*/
public class PasswordChecker {
    public static void main(String[] args) {
        // Import Scanner
        Scanner scanner = new Scanner(System.in);

        // Prorgam description
        System.out.println("This program verifies if a given password conforms to proper rules.");

        // Prompt password user wants to verify
        System.out.println("Please enter a password:");
        String inputPassword = scanner.nextLine();

        // Verify password length
        if (inputPassword.length() != 5) {
            System.out.println("The provided password is invalid because it must be five characters in length, include at least one digit, include at least one uppercase, and at least one lowercase character. Please try again.");
            return;
        }


        // Verify password contains at least one digit, one uppercase, and one lowercase character

        boolean hasUppercase = Character.isUpperCase(inputPassword.charAt(0)) ||
                               Character.isUpperCase(inputPassword.charAt(1)) ||
                               Character.isUpperCase(inputPassword.charAt(2)) ||
                               Character.isUpperCase(inputPassword.charAt(3)) ||
                               Character.isUpperCase(inputPassword.charAt(4));

        boolean hasLowercase = Character.isLowerCase(inputPassword.charAt(0)) ||
                               Character.isLowerCase(inputPassword.charAt(1)) ||
                               Character.isLowerCase(inputPassword.charAt(2)) ||
                               Character.isLowerCase(inputPassword.charAt(3)) ||
                               Character.isLowerCase(inputPassword.charAt(4));

        boolean hasDigit = Character.isDigit(inputPassword.charAt(0)) ||
                           Character.isDigit(inputPassword.charAt(1)) ||
                           Character.isDigit(inputPassword.charAt(2)) ||
                           Character.isDigit(inputPassword.charAt(3)) ||
                           Character.isDigit(inputPassword.charAt(4));

        // Notify user accordingly
        if (hasUppercase && hasLowercase && hasDigit) {
            System.out.println("The provided password is valid.");
        } else {
            System.out.println("The provided password is invalid because it must be five characters in length, include at least one digit, include at least one uppercase, and at least one lowercase character. Please try again.");
        }
    }
}

/*

This program verifies if a given password conforms to proper rules.
Please enter a password:
Ab12@
The provided password is valid.

This program verifies if a given password conforms to proper rules.
Please enter a password:
dT#14
The provided password is valid.

This program verifies if a given password conforms to proper rules.
Please enter a password:
test
The provided password is invalid because it must be five characters in length, include at least one digit, include at least one uppercase, and at least one lowercase character. Please try again.


This program verifies if a given password conforms to proper rules.
Please enter a password:
tes@!
The provided password is invalid because it must be five characters in length, include at least one digit, include at least one uppercase, and at least one lowercase character. Please try again.

This program verifies if a given password conforms to proper rules.
Please enter a password:
12as#
The provided password is invalid because it must be five characters in length, include at least one digit, include at least one uppercase, and at least one lowercase character. Please try again.

*/