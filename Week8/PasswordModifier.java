package Week8;

import java.util.Scanner;

public class PasswordModifier {
    public static void main(String[] args) {

        // var declaration
        String password;

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a password: ");
        password = sc.next();

        String modPassword = "";

        for (int i = 0; i < password.length(); i++) {
            char currentChar = password.charAt(i);
            if (currentChar == 'i') {
                modPassword += "1";
            } else if (currentChar == 'a') {
                modPassword += "@";
            } else if (currentChar == 'B') {
                modPassword += "8";
            } else if (currentChar == 's') {
                modPassword += "$";
            } else if (currentChar == 'm') {
                modPassword += "M";
            } else {
                modPassword += currentChar;
            }
        }

        modPassword += "!";
        System.out.println("The modified password is " + modPassword + ";");
    }
}
