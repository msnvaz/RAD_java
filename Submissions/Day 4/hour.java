import java.util.Scanner;

public class hour {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        System.out.print("Enter hour (1-12) : ");
        int input = scn.nextInt();

        System.out.print("Enter the period  AM or PM : ");
        String ampm = scn.next();

        if(ampm.equals("PM")){
            input=input+12;
            }
            
          System.out.println(input+" : 00");
    }
    
}
