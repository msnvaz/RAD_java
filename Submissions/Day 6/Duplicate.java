public class Duplicate {
    public static void main(String[] args) {
        int[] numbers = {4, 2, 7, 4, 8, 9, 2, 6, 8, 5};

        System.out.println("Duplicate values in the array:");
        for (int i = 0; i < numbers.length - 1; i++) {
            for (int j = i + 1; j < numbers.length; j++) {
                if (numbers[i] == numbers[j]) {
                    // Found a duplicate element
                    System.out.println(numbers[i]);
                }
            }
        }
    }
}
