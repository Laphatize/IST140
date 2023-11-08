import java.util.Scanner;

/**
    File name: Accounting.java
    Short description: A program that simulates a bank account.
    IST 140 Assignment: M03 - W05 
    @author Pranav Ramesh
    @version 1.01 2023-09-29
    date of last revision: none
    details of the revision: none
*/
public class Accounting {

    public static void main(String[] args) {

        // Import Scannery
        Scanner scanner = new Scanner(System.in);
        
        //  Balance set
        double balance = 25000.12;

        // Explain objective of program to the user.
        System.out.println("This program allows users to interact with a mock banking interface feature balance view, deposit, withdrawal, and exiting. A hard balance is predefined.");

        // Display menu
        System.out.println("Enter the number of your desired transaction type.");
        System.out.println("1. Balance");
        System.out.println("2. Deposit");
        System.out.println("3. Withdrawal");
        System.out.println("4. Quit");
        System.out.print("Enter choice: ");

        int choice = scanner.nextInt();

        switch (choice) {
            case 1:  // Balance
                System.out.printf("Your current balance is $%.2f\n", balance);
                break;
            case 2:  // Deposit
                System.out.print("Enter the amount of the deposit: ");
                double deposit = scanner.nextDouble();
                balance += deposit;
                System.out.printf("Your current balance is $%.2f\n", balance);
                break;
            case 3:  // Withdrawal
                System.out.print("Enter the amount of the withdrawal: ");
                double withdrawal = scanner.nextDouble();
                if (withdrawal <= balance) {
                    balance -= withdrawal;
                    System.out.printf("Your current balance is $%.2f\n", balance);
                } else {
                    System.out.printf("Insufficient funds. Your current balance is $%.2f\n", balance);
                }
                break;
            case 4: // Exit
                System.out.println("Good-bye.");
                break;
            default:  // Didn't choose any valid choices.
                System.out.println("Invalid menu choice.");
                break;
        }

        // Close scanner
       scanner.close();
    }
}


/*
 Outputs:
 This program allows users to interact with a mock banking interface feature balance view, deposit, withdrawal, and exiting. A hard balance is predefined.
Enter the number of your desired transaction type.
1. Balance
2. Deposit
3. Withdrawal
4. Quit
Enter choice: 1
Your current balance is $25000.12

This program allows users to interact with a mock banking interface feature balance view, deposit, withdrawal, and exiting. A hard balance is predefined.
Enter the number of your desired transaction type.
1. Balance
2. Deposit
3. Withdrawal
4. Quit
Enter choice: 2
Enter the amount of the deposit: 20 
Your current balance is $25020.12

This program allows users to interact with a mock banking interface feature balance view, deposit, withdrawal, and exiting. A hard balance is predefined.
Enter the number of your desired transaction type.
1. Balance
2. Deposit
3. Withdrawal
4. Quit
Enter choice: 3
Enter the amount of the withdrawal: 100
Your current balance is $24900.12
 
This program allows users to interact with a mock banking interface feature balance view, deposit, withdrawal, and exiting. A hard balance is predefined.
Enter the number of your desired transaction type.
1. Balance
2. Deposit
3. Withdrawal
4. Quit
Enter choice: 3
Enter the amount of the withdrawal: 100000
Insufficient funds. Your current balance is $25000.12


This program allows users to interact with a mock banking interface feature balance view, deposit, withdrawal, and exiting. A hard balance is predefined.
Enter the number of your desired transaction type.
1. Balance
2. Deposit
3. Withdrawal
4. Quit
Enter choice: 4
Good-bye.

 */