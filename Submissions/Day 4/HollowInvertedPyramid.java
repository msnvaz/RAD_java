import java.util.Scanner;

public class HollowInvertedPyramid {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the height of the inverted pyramid: ");
        int height = scanner.nextInt();

        for (int i = height; i >= 1; i--) {
            // Print spaces before each row
            for (int j = 1; j <= height - i; j++) {
                System.out.print(" ");
            }

            // Print stars for the first and last columns
            for (int j = 1; j <= 2 * i - 1; j++) {
                if (j == 1 || j == 2 * i - 1 || i == height) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }

            System.out.println(); // Move to the next row
        }

        scanner.close();
    }
}
