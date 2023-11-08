import java.util.Scanner;

/**
    File name: CountdownUntilMatching.java
    Short description: This program will count down from a number until the tens and ones digits are the same.
    IST 140 Assignment: 5.33 M04-W08
    @author Pranav Ramesh
    @version 1.01 2023-10-20
    date of last revision: none
    details of the revision: none
*/


public class CountdownUntilMatching {
    public static void main(String[] args) {
        // Var declaration
        int inputNumber;

        // Initialize Scanner
        Scanner scanner = new Scanner(System.in);

        // Read the input
      //  System.out.println("Enter a number between 11 and 100:");
        inputNumber = scanner.nextInt();

        // Check if the input is within the specified range
        if (inputNumber < 11 || inputNumbeFr > 100) {
            System.out.println("Input must be 11-100");
            return;
        }

        // Countdown time 
        while (true) {
            int tensDigit = inputNumber / 10;
            int onesDigit = inputNumber % 10;

            System.out.print(inputNumber + " ");

            // Are the digits same? No, continue. Yes, break.
            if (tensDigit == onesDigit) {
                break;
            }

            // Decrease
            inputNumber--;
        }
        System.out.println();
    }
}
