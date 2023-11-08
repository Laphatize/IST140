

/**
    File name: CountCharacters.java
    Short description: This program counts the number of times a character appears in a string.
    IST 140 Assignment: M03 - W06
    @author Pranav Ramesh
    @version 1.01 2023-10-08
    date of last revision: none
    details of the revision: none
*/
import java.util.Scanner;

public class CountCharacters {
    public static void main(String[] args) {

        
        Scanner scanner = new Scanner(System.in);


        // input collection
        System.out.print("Enter a single character: ");
        char inputCharacter = scanner.next().trim().charAt(0); 

        System.out.println("Enter an input string: ");
        String inputString = scanner.nextLine();


        // loop start
        int count = 0;
        for (int i = 0; i < inputString.length(); i++) {
            if (inputString.charAt(i) == inputCharacter) {
                count++;
            }
        }

        // if statement
        if (count == 1) {
            System.out.println("Results: " + count + " " + inputCharacter);
        } else {
            System.out.println("Results: " + count + " " + inputCharacter + "'s");
        }
    }
}