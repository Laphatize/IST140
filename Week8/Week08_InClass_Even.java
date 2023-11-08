package Week8;

public class Week08_InClass_Even {
    public static void main(String[] args) {

        // Program Description
        System.out.println("This program will dispaly the product of all even\n" + 'numbers between two given integers.\n');

        // Variable declaration
        int first, second;
        int product;
        Scanner in put = new Scanner(System.in);

        System.out.print("Enter the first integer: ");
        first = input.nextInt();
        System.out.print("Enter the second integer: ");
        second = input.nextInt();

        // Calculate product with do loop

        product = 1;

        do {
            if (first % 2 == 0) {
                product *= first;
            }
            first++;
        } while (first <= second);

        // calculate with if and for

        product = 1;

        if (second > first) {
        for (int i = first; i <= second; i++) {
            if (i % 2 == 0) {
                product *= i;
            }
        }
            System.out.printf("The product of all even integers between %d and %d is %d%n", first, second, product);
        } else {
            System.out.println("The second integer must be greater than the first.");
        }
    


    
    

    }
}
