import java.util.Scanner;

/**
    File name: RooterDown.java
    Short description: This program will print the square root of a number from 1 to the number you enter
    IST 140 Assignment: M04 - W07
    @author Pranav Ramesh
    @version 1.01 2023-10-15
    date of last revision: none
    details of the revision: none
*/

public class RooterDown {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // var declaration
        int start = -1;

        // Program Description:
        System.out.println("This program will print the square root of a number from 1 to the number you enter.");

        // Validate user input
        while (start <= 0) {        
            System.out.print("Please enter a positive integer: ");
            
            if (scanner.hasNextInt()) {
                start = scanner.nextInt();

                if (start <= 0) {
                    System.out.println("The number must be a positive integer. Please try again.");
                }
            } else {
                System.out.println("Invalid input. Please enter a positive integer.");
                scanner.next(); // Clear the invalid input from the scanner
            }
        }

        // Calculate and print square roots
        while (start >= 0) {
            double sqrtValue = Math.sqrt(start);
            System.out.printf("%d: %.4f\n", start, sqrtValue);
            start--;
        }

    }
}

/*

This program will print the square root of a number from 1 to the number you enter.
Please enter a positive integer: 8
8: 2.8284
7: 2.6458
6: 2.4495
5: 2.2361
4: 2.0000
3: 1.7321
2: 1.4142
1: 1.0000
0: 0.0000

---------
This program will print the square root of a number from 1 to the number you enter.
Please enter a positive integer: 12
12: 3.4641
11: 3.3166
10: 3.1623
9: 3.0000
8: 2.8284
7: 2.6458
6: 2.4495
5: 2.2361
4: 2.0000
3: 1.7321
2: 1.4142
1: 1.0000
0: 0.0000


---------
This program will print the square root of a number from 1 to the number you enter.
Please enter a positive integer: 13
13: 3.6056
12: 3.4641
11: 3.3166
10: 3.1623
9: 3.0000
8: 2.8284
7: 2.6458
6: 2.4495
5: 2.2361
4: 2.0000
3: 1.7321
2: 1.4142
1: 1.0000
0: 0.0000

---------
This program will print the square root of a number from 1 to the number you enter.
Please enter a positive integer: -24
The number must be a positive integer. Please try again.
Please enter a positive integer:   


 */