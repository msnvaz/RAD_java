    import java.util.Scanner;

public class Star1 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        System.out.print("Enter the number of rows for the star triangle: ");
        int rows = scn.nextInt();

        for (int i = 1; i <= rows; i++) {
            System.out.print("**");
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        scn.close();
    }
}

    

