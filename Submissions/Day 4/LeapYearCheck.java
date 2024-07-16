import java.util.Scanner;

public class LeapYearCheck {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int year = scanner.nextInt();

        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
            System.out.println("The year " + year + " is a Leap Year");
        } else {
            System.out.println("The year " + year + " is NOT a Leap Year");
        }

        scanner.close();
    }
}
