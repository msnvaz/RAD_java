package MockAssignment;

import java.util.Scanner;

public class FabEvenSum {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int T = scan.nextInt(); //number of test cases
        int N=0;
        
        for(int i=0;i<T;i++){
            int num1=1;
            int num2=2;
            int fib=0;
            int sum=2;
            N= scan.nextInt();//max number
            System.out.print(num1+ " "+num2);

            while(true){
                fib=num1+num2;
                
                
                if(fib>N){
                    break;
                }

                if(fib%2==0){
                    sum=sum+fib;
                }
                
                System.out.print(" "+fib);
                num1=num2;
                num2=fib;
                
            }
            System.out.println();
            System.out.println(sum);
            //System.out.println();
            
        }
        
    }
}
