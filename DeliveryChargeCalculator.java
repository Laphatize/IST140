import java.util.Scanner;

public class DeliveryChargeCalculator {

    public static void main(String[] args) {

        // Scanner
        Scanner scanner = new Scanner(System.in);


        double weightLbs = scanner.nextDouble(); // test input

        double totalShippingCharges = 0.0;

        if (weightLbs < 0) {
            System.out.println("Invalid input. Weight must be a positive number.");
        } else if (weightLbs < 2.5) {
            totalShippingCharges = 2.50;
        } else if (weightLbs >= 2.5 && weightLbs <= 4.99) {
            totalShippingCharges = 3.50;
        } else if (weightLbs >= 5.0 && weightLbs <= 14.99) {
            totalShippingCharges = 10.75;
        } else if (weightLbs >= 15.0 && weightLbs <= 20.0) {
            totalShippingCharges = 15.75;
        } else {
            System.out.println("Not able to ship.");
            return;
        }

        System.out.println("Total Shipping Charges: $" + totalShippingCharges);
    }
}
