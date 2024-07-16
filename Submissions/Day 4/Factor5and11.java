import java.util.Scanner;

public class Factor5and11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number : ");
        int num = scanner.nextInt();

        if (num % 5 == 0 && num % 11 == 0) {
            System.out.println("This Number is Divisible by 5 and 11");
        } else {
            System.out.println("This Number is NOT Divisible by 5 and 11");
        }

        scanner.close();
    }
}
