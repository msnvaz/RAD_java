import java.util.Scanner;

public class BubbleSort {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = 10;
        int[] array = new int[n];
        System.out.println("Please enter 10 integer values:");

        for (int i = 0; i < 10; i++) {
            System.out.print("Value " + (i + 1) + ": ");
            array[i] = scanner.nextInt();
        }

        
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = 0; j < array.length - i - 1; j++) {
                if (array[j] > array[j + 1]) {
                    
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }

        
        System.out.println("Sorted array in ascending order:");
        for (int value : array) {
            System.out.print(value + " ");
        }
    }
}
