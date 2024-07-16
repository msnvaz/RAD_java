import java.util.Scanner;

public class Star2 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        System.out.print("Enter the number of rows for the star triangle: ");
        int rows = scn.nextInt();
        int i;
        for ( i = 1; i <= rows; i++) {
            
            for (int j = rows; j > i; j--) {
                System.out.print(" ");
            }
            
            for (int k = 1; k <= (2 * i - 1); k++) {
                System.out.print("*");
            }
            
            System.out.println();
        }
        

        scn.close();
    }
}

    

