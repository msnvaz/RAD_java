import java.util.Scanner;

public class HollowDiamondPattern {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        System.out.print("Enter the width of the diamond at its widest point (odd number): ");
        int width = scn.nextInt();

        if (width % 2 == 0) {
            System.out.println("Please enter an odd number.");
            return;
        }

        int n = width / 2;

        // Upper part of the diamond
        for (int i = 0; i <= n; i++) {
            for (int j = n; j > i; j--) {
                System.out.print(" ");
            }
            System.out.print("*");
            if (i > 0) {
                for (int k = 1; k < (2 * i); k++) {
                    System.out.print(" ");
                }
                System.out.print("*");
            }
            System.out.println();
        }

        // Lower part of the diamond
        for (int i = n - 1; i >= 0; i--) {
            for (int j = n; j > i; j--) {
                System.out.print(" ");
            }
            System.out.print("*");
            if (i > 0) {
                for (int k = 1; k < (2 * i); k++) {
                    System.out.print(" ");
                }
                System.out.print("*");
            }
            System.out.println();
        }

        scn.close();
    }
}
