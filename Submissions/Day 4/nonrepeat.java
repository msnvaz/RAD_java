import java.util.Scanner;

public class nonrepeat {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        System.out.print("Enter the main string: ");
        String string = scn.nextLine();

        String regex = "[,\\.\\s]";
        String[] myArray = string.split(regex);
        for (int i = 0; i< myArray.length; i++) {
            for (int j = i; j< myArray.length; j++) {
                if(myArray[j].equals(myArray[j+1])){
                    System.out.println("first non-repeating character in "+ string + " is" + myArray[i]);
                    break;
                }   
            }
}
    }
}