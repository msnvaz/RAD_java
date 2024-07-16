import java.util.Scanner;

public class wordSearch {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        System.out.print("Enter a word to search : ");
        String input= scn.nextLine();

        System.out.print("Enter a string : ");
        String wordToSearch = scn.nextLine();

         if (input.toLowerCase().contains(wordToSearch.toLowerCase())) {
            System.out.println("The word '" + wordToSearch + "' is found in the string.");
        } else {
            System.out.println("The word '" + wordToSearch + "' is not found in the string.");
        }
    }
}
