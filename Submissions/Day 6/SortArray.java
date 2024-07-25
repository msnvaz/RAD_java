
import java.util.Arrays;

public class SortArray {
    public static void main(String[] args) {
        int[] array = {29,10,14,37,13,7,18,5,12,33};
        Arrays.sort(array); // Sorts the array in ascending order
        System.out.println("Elements of array sorted in ascending order:");
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }
}
