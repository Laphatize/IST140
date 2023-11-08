import java.util.Scanner;

/**
    File name: GradeCalculator.java
    Short description: This program calculates a student's grade based on their scores.
    IST 140 Assignment: M03 - W06
    @author Pranav Ramesh
    @version 1.01 2023-10-08
    date of last revision: none
    details of the revision: none
*/


public class GradeCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // variable declarations 
        String studentStatus = scanner.next();
        double homeworkPoints = scanner.nextDouble();
        double quizPoints = scanner.nextDouble();
        double midtermExamScore = scanner.nextDouble();
        double finalExamScore = scanner.nextDouble();

        // Constants for max scores
        final double HOMEWORK_MAX = 800.0;
        final double QUIZZES_MAX = 400.0;
        final double MIDTERM_MAX = 150.0;
        final double FINAL_MAX = 200.0;

        // Calculate percentages
        double homeworkPercent = (homeworkPoints / HOMEWORK_MAX) * 100;
        double quizzesPercent = (quizPoints / QUIZZES_MAX) * 100;
        double midtermPercent = (midtermExamScore / MIDTERM_MAX) * 100;
        double finalPercent = (finalExamScore / FINAL_MAX) * 100;

        // Set any average to 100 if average is above 100
        homeworkPercent = Math.min(homeworkPercent, 100);
        quizzesPercent = Math.min(quizzesPercent, 100);
        midtermPercent = Math.min(midtermPercent, 100);
        finalPercent = Math.min(finalPercent, 100);

        // Check student status and proceed or print error
        if (studentStatus.equals("UG") || studentStatus.equals("G") || studentStatus.equals("DL")) {
            System.out.printf("Homework: %.1f%%%n", homeworkPercent);
            System.out.printf("Quizzes: %.1f%%%n", quizzesPercent);
            System.out.printf("Midterm: %.1f%%%n", midtermPercent);
            System.out.printf("Final Exam: %.1f%%%n", finalPercent);

            // Calculate course avg
            double courseAverage = 0.0;
            switch (studentStatus) {
                case "UG":
                    courseAverage = 0.2 * homeworkPercent + 0.2 * quizzesPercent + 0.3 * midtermPercent + 0.3 * finalPercent;
                    break;
                case "G":
                    courseAverage = 0.15 * homeworkPercent + 0.05 * quizzesPercent + 0.35 * midtermPercent + 0.45 * finalPercent;
                    break;
                case "DL":
                    courseAverage = 0.05 * homeworkPercent + 0.05 * quizzesPercent + 0.4 * midtermPercent + 0.5 * finalPercent;
                    break;
            }
            System.out.printf("%s average: %.1f%%%n", studentStatus, courseAverage);

            //  Identify the grade
            char grade;
            if (courseAverage >= 90.0) {
                grade = 'A';
            } else if (courseAverage >= 80.0) {
                grade = 'B';
            } else if (courseAverage >= 70.0) {
                grade = 'C';
            } else if (courseAverage >= 60.0) {
                grade = 'D';
            } else {
                grade = 'F';
            }
            System.out.println("Course grade: " + grade);

        } else {
            System.out.println("Error: student status must be UG, G or DL");
        }

    }

}


/*
 
UG  600.0  300.0  120.0  185.0
Homework: 75.0%
Quizzes: 75.0%
Midterm: 80.0%
Final Exam: 92.5%
UG average: 81.8%
Course grade: B


UG 700 100 10 100
Homework: 87.5%
Quizzes: 25.0%
Midterm: 6.7%
Final Exam: 50.0%
UG average: 39.5%
Course grade: F

DL 100 100 20
2
Homework: 12.5%
Quizzes: 25.0%
Midterm: 13.3%
Final Exam: 1.0%
DL average: 7.7%
Course grade: F
 */