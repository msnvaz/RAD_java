import java.util.Scanner;

public class Lowercase {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        System.out.print("Enter a sentence: ");
        String sentence = scn.nextLine();

        System.out.print("Lowercase sentence: " + sentence.toLowerCase());

        scn.close();
    }
}
