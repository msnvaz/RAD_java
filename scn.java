import java.util.Scanner;

public class scn {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number: ");
        int value = scanner.nextInt();
        
        // Consume the newline character
        scanner.nextLine();

        System.out.println("Number is " + value);

        System.out.println("Enter a string:");
        
        // Read the string input
        String inputString = scanner.nextLine();
        
        // Process the input string
        System.out.println("You entered: " + inputString);
        
        // Close the scanner
        scanner.close();
    }
}
