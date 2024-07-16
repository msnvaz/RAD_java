import java.util.Scanner;

public class ReverseWords {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a sentence: ");
        String sentence = scanner.nextLine();

        String reversedSentence = reverseWordOrder(sentence);

        System.out.println("Reversed sentence:");
        System.out.println(reversedSentence);

        scanner.close();
    }

    public static String reverseWordOrder(String sentence) {
        
        String[] words = sentence.split("\\s+");

        StringBuilder reversed = new StringBuilder();

        for (int i = words.length - 1; i >= 0; i--) {
            reversed.append(words[i]).append(" ");
        }

        return reversed.toString().trim();
    }
}
