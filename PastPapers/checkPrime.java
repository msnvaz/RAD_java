
import java.util.Scanner;

public class checkPrime {
    public static void main(String[] args) {
        int i,f=0;
        int n =Integer.parseInt("5");
        System.out.println("Enter the number to check prime or not");
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        for(i=2;i<=n/2;i++){
            if(n%i==0){
                System.out.println("Not Prime");
                f=1;
                break;
            }
        }
        if(f==0){
            System.out.println("Prime");
        }
    }
    
}
