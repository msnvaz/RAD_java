import java.util.Scanner;
    public class square {
        public static void main(String[] args) {
            Scanner scn= new Scanner(System.in);

            System.out.print("Enter the Height : ");
            int h= scn.nextInt();

            for(int i=0; i<h;i++){
                if(i==0||i==h-1){
                    for(int k=0; k<h;k++){
                         System.out.print("* ");
                    }
                }else{
                    System.out.print("* ");
                    for(int j=0;j<h-2;j++){
                        System.out.print("  ");
                }
                System.out.print("* ");
                    
                }
                System.out.println();
            }
        }
    
}
