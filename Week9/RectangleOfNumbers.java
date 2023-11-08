import java.util.Scanner;

public class RectangleOfNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        final int ROW = 7;
        final int COL = 7;

        for (int i = 0; i <= ROW; i++) {
            for (int j = 1; j <= COL; j++) {
                System.out.print(j);
            }
            System.out.println();
        }

    }

}
