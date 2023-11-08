import java.util.Scanner;

public class InClass1_Grading {
    public static double validateExam(Scanner input, double low, double high) {
        double exam;
        do {
            System.out.print("Enter exam: ");
            exam = input.nextDouble();
            if (exam < low || exam > high) {
                System.out.println("Invalid exam. Try again.");
            }
        } while (exam < low || exam > high);
        return exam;

        // calculate average
        //int average = calcAverage(exam, 0);

    }


    public static String reverseNonLetters(String input) {
        String reversed = "";
        String lettersOnly = "";
        
        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            if (Character.isLetter(ch)) {
                lettersOnly += ch;
            }
        }

        String reversedLettersOnly = "";
        for (int i = lettersOnly.length() - 1; i >= 0; i--) {
            reversedLettersOnly += lettersOnly.charAt(i);
        }

        int j = 0;
        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            if (Character.isLetter(ch)) {
                reversed += reversedLettersOnly.charAt(j);
                j++;
            } else {
                reversed += ch;
            }
        }
        
        return reversed;
    }
    
    public static String reverseString(String input) {
        String reversed = "";
        for (int i = input.length() - 1; i >= 0; i--) {
            reversed += input.charAt(i);
        }
        
        return reversed;
    }


    public static void main(String[] args) {
        programDescription();
        // declare variables
        Scanner input = new Scanner(System.in);
        double exam;  // input variable - used in a loop
        int numExams;
        double sum, average;   // used in calculations
        String grade;  // actual letter grade earned
        // get input from user
        numExams = 3;
        sum = 0;
        for (int i = 0; i < numExams; i++) {
            System.out.print("Enter exam #" + (i + 1) + ": ");
            exam = input.nextDouble();
            // accumulate the sum
            sum = sum + exam;
        }
        // calculate
        average = calcAverage(sum, numExams);
        grade = getLetterGrade(average);
        // display results
        System.out.printf("The average of the exams is %.2f\n", average);
        System.out.println("The grade earned is " + grade);
    }

    /**
     * Computes the average grade.
     * @param total total of all exam grades
     * @param n the number of exam grades
     * @return avg the calculated average
     */
    public static double calcAverage(double total, int n) {
        double avg = total / n;
        return avg;
    }

    /**
     * Determines the letter grade based on avg
     * @param avg the average of the exams.
     * @return grade the actual letter grade earned.
     */
    public static String getLetterGrade(double avg) {
        // declare variables
        String grade;
        // determine the grade using if-else if chain
        if (avg >= 90) {
            grade = "A";
        } else if (avg >= 80) {
            grade = "B";
        } else if (avg >= 70) {
            grade = "C";
        } else if (avg >= 60) {
            grade = "D";
        } else {
            grade = "F";
        }
        // return the result
        return grade;
    }

    public static void programDescription() {
        System.out.println("This program will work with student grades.\n");
    }
}
/*
This program will work with student grades.

Enter exam #1: 80
Enter exam #2: 85
Enter exam #3: 90
The average of the exams is 85.00
The grade earned is B

 */
