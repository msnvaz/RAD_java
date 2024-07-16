import java.util.Scanner;

public class CapitalizeWords {

    public static void main(String[] args) {
        try (Scanner scan = new Scanner(System.in)) {
            System.out.print("Enter a sentence: ");
            String sentence = scan.nextLine();
            
            String capitalizedSentence = capitalizeWords(sentence);
            
            System.out.println("Capitalized sentence:");
            System.out.println(capitalizedSentence);
        }
    }

    public static String capitalizeWords(String sentence) {
        String[] words = sentence.split("\\s+");
        StringBuilder sb = new StringBuilder();

        for (String word : words) {
            if (word.length() > 0) {
                char firstLetter = Character.toUpperCase(word.charAt(0));
                sb.append(firstLetter).append(word.substring(1)).append(" ");
            }
        }

                return sb.toString();
    }
}
