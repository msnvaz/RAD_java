import java.util.Scanner;
    public class AlphabetPyramid {
        public static void main(String[] args) {
            Scanner scn= new Scanner(System.in);

            System.out.print("Enter the Height : ");
            int h= scn.nextInt();

            char Letter=65;
            for(int i=0; i<h;i++){
                for(int j=0;j<i;j++){
                    System.out.print(Letter+" ");
                    Letter++;
                }
                System.out.println();
            }
        }
    
}
