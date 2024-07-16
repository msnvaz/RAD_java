import java.util.Scanner;

public class LargerNumber {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        int num1 = scn.nextInt();

        System.out.print("Enter the second number: ");
        int num2 = scn.nextInt();

        if (num1 > num2) {
            System.out.println("The larger number is " + num1);
        } else if (num2 > num1) {
            System.out.println("The larger number is " + num2);
        } else {
            System.out.println("Both numbers are equal.");
        }

        scn.close();
    }
}
