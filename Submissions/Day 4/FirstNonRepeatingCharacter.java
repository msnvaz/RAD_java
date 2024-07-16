import java.util.Scanner;

public class FirstNonRepeatingCharacter {
    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);

        System.out.print("Enter a string : ");
        String input= scn.nextLine();
        
        char[] charArray = input.toCharArray();

        int[] frequency = new int[256]; 

        for (char ch : charArray) {
            frequency[ch]++;
        }

        for (char ch : charArray) {
            if (frequency[ch] == 1) {
                System.out.println("First non-repeating character: " + ch);
                break;
            }
        }
    }
}
