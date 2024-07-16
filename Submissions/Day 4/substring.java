import java.util.Scanner;

public class substring {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        System.out.print("Enter the main string: ");
        String mainString = scn.nextLine();

        System.out.print("Enter the substring to find: ");
        String subString = scn.nextLine();

        int index=mainString.indexOf(subString); 

        if(index<0){
            System.out.println("Sub String not found");}
            else{
                System.out.println("Substring "+ subString + " found at index " + index);
            }
        
    }
}
