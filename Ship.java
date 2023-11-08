

import java.util.Scanner;

public class Ship {
    public static void main(String[] args) {
        /*
 * Write a program which will ask teh user to input a code to determine a ship's class based on the following table:
 * 
 * Code B or b | Battleship
 * C or c |  Crusier
 * D or d | Destroyer
 * F or f | Frigate
 * Anyting else | Unknown Shio Class
 * 
 * Use an if-else chain to output the Ship's Class for code.
 * Use a switch statement to output the ships's class for code.
 * 
 */

        Scanner input = new Scanner(System.in);
        System.out.println("Enter a code to determine a ship's class: ");
        String code = input.nextLine();

        if (code.equals("B") || code.equals("b")) {
            System.out.println("Battleship");
        } else if (code.equals("C") || code.equals("c")) {
            System.out.println("Crusier");
        } else if (code.equals("D") || code.equals("d")) {
            System.out.println("Destroyer");
        } else if (code.equals("F") || code.equals("f")) {
            System.out.println("Frigate");
        } else {
            System.out.println("Unknown Ship Class");
        }

        switch (code) {
            case "B":
            case "b":
                System.out.println("Battleship");
                break;
            case "C":
            case "c":
                System.out.println("Crusier");
                break;
            case "D":
            case "d":
                System.out.println("Destroyer");
                break;
            case "F":
            case "f":
                System.out.println("Frigate");
                break;
            default:
                System.out.println("Unknown Ship Class");
                break;
        }
    }
}