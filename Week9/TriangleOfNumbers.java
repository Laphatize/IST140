import java.util.Scanner;

public class TriangleOfNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        final int ROW = 7;

        for (int i = 1; i <= ROW; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }

}
