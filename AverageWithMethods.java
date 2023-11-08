
/**
    File name: AverageWithMethod.java
    Short description: 
    IST 140 Assignment: M05 - W10
    @author Pranav Ramesh
    @version 1.01 2023-11-05
    date of last revision: none
    details of the revision: none
*/


import java.util.Scanner;

public class AverageWithMethods {
    
    public static void printDescription() {
        System.out.println("This program calculates the average of the numbers you enter.");
    }
    
    public static String getNumbers() {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter 5 to 10 numbers separated by spaces:");
        return input.nextLine();
    }
    
    public static double calculateAverage(String inputString) {

        // var declaration
        Scanner strInput = new Scanner(inputString);
        double sum = 0;
        int count = 0;
        
        // loop through the input string and calculate the sum and count
        while (strInput.hasNextDouble()) {
            sum += strInput.nextDouble();
            count++;
        }
        
        // check if the count is less than 5 or greater than 10
        if (count < 5 || count > 10) {
            System.out.println("Error: You must enter at least 5 and at most 10 numbers.");
            System.exit(0);
        }
        
        // return the average
        return sum / count;
    }
    
    public static void printResults(String numbers, double average) {
        // print the results
        System.out.printf("The average of the numbers %s is %.2f.%n", numbers, average);
    }
    
    public static void main(String[] args) {
        printDescription();
        
        // get the numbers from the user
        String numbers = getNumbers();
        double average = calculateAverage(numbers);
        printResults(numbers, average);
    }
}

/*

Test Cases:
This program calculates the average of the numbers you enter.
Enter 5 to 10 numbers separated by spaces:
1 2 3 4 5 6
The average of the numbers 1 2 3 4 5 6 is 3.50.
pranav@Pranavs-MacBook-Pro IST 140 2023 %  /usr/bin/env /Library/Java/JavaVirtualMachines/jdk-18.0.2.jdk/Contents/Home/bin/java -XX:+ShowCodeDetailsInExceptionMessages -cp /Users/pranav/Library/Application\ Support/Code/User/workspaceStorage/121bea65cf893fc4e205fada4e1a45c7/redhat.java/jdt_ws/IST\ 140\ 2023_bf4723b4/bin AverageWithMethods
This program calculates the average of the numbers you enter.
Enter 5 to 10 numbers separated by spaces:
2 3 5 6 21 2
The average of the numbers 2 3 5 6 21 2 is 6.50.


 */
