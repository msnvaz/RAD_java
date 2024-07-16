import java.util.Scanner;

public class maxNum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter number 1 : ");
        double num1 = scanner.nextDouble();

        System.out.print("Enter number 2 : ");
        double num2 = scanner.nextDouble();

        System.out.print("Enter number 3 : ");
        double num3 = scanner.nextDouble();

        double maxNum = num1;

        if (num2 > maxNum) {
            maxNum = num2;
        }

        if (num3 > maxNum) {
            maxNum = num3;
        }

        System.out.println(maxNum);

        scanner.close();
    }
}
