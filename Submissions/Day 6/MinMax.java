import java.util.Scanner;

public class MinMax {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = 10;
        System.out.print("Enter "+ n +" elements: ");
        
        int[] array = new int[n];

        //To scan 
        for(int i= 0;i<n;i++){
            array[i]= scan.nextInt();
           // System.out.print(array[i]+" ");
        }

        
    int max = array[0];
    int min = array[0];
    float sum =0;
    float avg = 0;

    //to find the min
    for ( int k = 0; k < n; k++) {
        if((k!=n-1)&&(array[k+1]<=array[k])){
            min=array[k+1];
            
        }
    }
    

//to find the max and sum
        for (int j = 0; j < n; j++) {
            if((j!=n-1)&&(array[j+1]>=array[j])){
                max=array[j+1];
                sum = sum + array[j];
            }
        }

        avg = sum/n;
    System.out.println("Minimun value = "+min);
    System.out.println("Maximum value = "+max);
    System.out.println("Sum = "+sum);
    System.out.println("Average = "+avg);
    
        
    }
}
