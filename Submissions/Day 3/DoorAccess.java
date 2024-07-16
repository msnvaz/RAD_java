import java.util.Scanner;

public class DoorAccess {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int correctCode = 1337;

        System.out.print("Enter the code to open the door: ");
        int enteredCode = scn.nextInt();

        if (enteredCode == correctCode) {
            System.out.println("Correct code. The door is now open.");
        } else {
            System.out.println("Incorrect code. The door remains closed.");
        }

        scn.close();
    }
}
