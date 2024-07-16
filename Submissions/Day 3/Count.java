import java.util.Scanner;

public class Count{

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = scn.nextLine();

        int[] counts = countVowelsAndConsonants(input);

        System.out.println("Number of vowels: " + counts[0]);
        System.out.println("Number of consonants: " + counts[1]);

        scn.close();
    }

    public static int[] countVowelsAndConsonants(String input) {
        int vowelsCount = 0;
        int consonantsCount = 0;

                String lowercaseInput = input.toLowerCase();

         for (int i = 0; i < lowercaseInput.length(); i++) {
            char ch = lowercaseInput.charAt(i);

        if (Character.isLetter(ch)) {
                if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                    vowelsCount++;
                } else {
                    consonantsCount++;
                }
            }
        }

        return new int[]{vowelsCount, consonantsCount};
    }
}
