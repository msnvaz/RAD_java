import java.util.*;

class JavaLoops2
{
    public static void main(String []argh){
        Scanner in = new Scanner(System.in);
        int t=in.nextInt();
        for(int i=0;i<t;i++){
            double a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();
            
            //printing 
            for(int j=0;j<n;j++){
                
                a=a+((Math.pow(2, j))*b);
                int A= (int)a;
                System.out.print(A+" ");
            }
            System.out.println();
        }
        in.close();
    }
}
//(1<<j)