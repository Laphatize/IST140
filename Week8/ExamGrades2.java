/**
 * File name: ExamGrades1.java
 * Short description: Class to work with multiple exam grades and calculate various values.
 * IST 140 Assignment:  Week 07 In Class
 *
 * @author Prof. D'Imperio
 * @version 1.01 10/5/2023
 */

import java.util.Scanner;

public class ExamGrades2 {
    public static void main(String[] args) {
        // Program description
        System.out.println("This program will process exam grades entered by the user.\n");

        // Declaring the variables: types and names
		int numExams;  // user input - loop control variable
		int count;
        double exam;   // user input - for each exam grade (inside the loop)
        double average, sum;
		String grade;  // output
        Scanner input = new Scanner(System.in);

        // Variable initialization: getting the input from the user
        System.out.print("Enter the number of exams to be processed: ");
        numExams = input.nextInt();   // stop indicator for the loop
		sum = 0;
		count = 0;
        // Calculations --- loop
    
        for (count = 0; count < numExams; count++) {
            System.out.println("Enter exam #" + (count + 1) + ": ");
            exam = input.nextDouble();

            sum = sum + exam;
        }
        // Calculate the average
		average = sum / numExams;
		// Calculate the letter grade -- if-else chain
		if (average >= 90) {
			grade = "A";
		} else if (average >= 80) {
			grade = "B";
		} else if (average >= 70) {
			grade = "C";
		} else if (average >= 60) {
			grade = "D";
		} else {
			grade = "F";
		}
		// Display the results
        System.out.printf("The average of the exams is %.2f\n", average);
		System.out.println("The grade earned is " + grade);
    }
}
/*
This program will process exam grades entered by the user.

Enter the number of exams to be processed: 4
Enter exam #1: 98
98.0
Enter exam #2: 98
196.0
Enter exam #3: 98
294.0
Enter exam #4: 98
392.0
The average of the exams is 98.00
The grade earned is A

Process finished with exit code 0

 */