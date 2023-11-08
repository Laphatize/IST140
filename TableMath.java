
/**
    File name: TableMath.java
    Short description: The application prompts the user for an integer 'stop' between 5 and 10, inclusive. It then uses nested for loops to print the multiplication table up to 'stop'.
    IST 140 Assignment: M04 - W09
    @author Pranav Ramesh
    @version 1.01 2023-10-27
    date of last revision: none
    details of the revision: none
*/


import java.util.Scanner;

public class TableMath {
    public static void main(String[] args) {

        // Import scanner
        Scanner scnr = new Scanner(System.in);
        int stop;
        
        // Input validation
        do {
            System.out.println("Enter an integer between 5 and 10 inclusive: ");
            stop = scnr.nextInt();
        } while (stop < 5 || stop > 10);
        
        // Table header
        System.out.print("*  |  ");
        for (int i = 1; i <= stop; ++i) {
            System.out.printf("%3d ", i);
        }
        System.out.println();
        
        // Seperator 
        for (int i = 0; i <= stop + 1; ++i) {
            System.out.print("----");
        }
        System.out.println();
        
        // Print multiplication table
        for (int row = 1; row <= stop; ++row) {
            System.out.printf("%2d |", row);
            for (int col = 1; col <= stop; ++col) {
                System.out.printf("%4d", row * col);
            }
            System.out.println();
        }
    }
}

/*

TEST CASES

Enter an integer between 5 and 10 inclusive: 
10
*  |    1   2   3   4   5   6   7   8   9  10 
------------------------------------------------
 1 |   1   2   3   4   5   6   7   8   9  10
 2 |   2   4   6   8  10  12  14  16  18  20
 3 |   3   6   9  12  15  18  21  24  27  30
 4 |   4   8  12  16  20  24  28  32  36  40
 5 |   5  10  15  20  25  30  35  40  45  50
 6 |   6  12  18  24  30  36  42  48  54  60
 7 |   7  14  21  28  35  42  49  56  63  70
 8 |   8  16  24  32  40  48  56  64  72  80
 9 |   9  18  27  36  45  54  63  72  81  90
10 |  10  20  30  40  50  60  70  80  90 100

Enter an integer between 5 and 10 inclusive: 
6
*  |    1   2   3   4   5   6 
--------------------------------
 1 |   1   2   3   4   5   6
 2 |   2   4   6   8  10  12
 3 |   3   6   9  12  15  18
 4 |   4   8  12  16  20  24
 5 |   5  10  15  20  25  30
 6 |   6  12  18  24  30  36

Enter an integer between 5 and 10 inclusive: 
5
*  |    1   2   3   4   5 
----------------------------
 1 |   1   2   3   4   5
 2 |   2   4   6   8  10
 3 |   3   6   9  12  15
 4 |   4   8  12  16  20
 5 |   5  10  15  20  25

Enter an integer between 5 and 10 inclusive: 
3
Enter an integer between 5 and 10 inclusive: 

 */