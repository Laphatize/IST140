/*
 * Filename: NestedDemo.java
 * Short description: Class to ???
 * @author  Nannette D'Imperio
 * @version Mar 9, 2021
 */

import java.util.Scanner;

/**
 * @author Nannette
 * @version 1.0 Mar 9, 2021
 */
public class NestedGradesDemo {

    public static void main(String[] args) {
        int i, j;
        Scanner in = new Scanner(System.in);
        double grade, total, average;
        for (i = 1; i <= 3; i++) // start of outer loop
        {
            total = 0;               // clear the total for this student
            for (j = 1; j <= 4; j++) // start of inner loop
            {
                System.out.print("Enter an exam grade for this student: ");
                grade = in.nextDouble();
                total = total + grade;     // add the grade into the total
            }                        // end of the inner for loop
            average = total / 4;     // calculate the average
            System.out.printf("\nThe average for student %d is %.2f\n\n",
                    i, average);
        }                           // end of the outer for loop

}
}
