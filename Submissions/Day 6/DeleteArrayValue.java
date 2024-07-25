import java.util.Scanner;

public class DeleteArrayValue {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int[] arr = new int[10];

    // Prompt user to enter 10 integer values
    System.out.println("Enter 10 integer values:");
    for (int i = 0; i < 10; i++) {
      arr[i] = scanner.nextInt();
    }

    // Display the original array
    System.out.println("Original array:");
    for (int i : arr) {
      System.out.print(i + " ");
    }
    System.out.println();

    // Get the value to delete from the user
    System.out.println("Enter the value to delete:");
    int valueToDelete = scanner.nextInt();

    // Delete the value from the array (handling case where value is not found)
    int deleted = deleteValue(arr, valueToDelete);

    if (deleted != -1) {
      // Display the modified array (if deletion was successful)
      System.out.println("Modified array after deletion:");
      for (int i : arr) {
        System.out.print(i + " ");
      }
    } else {
      System.out.println("Value not found in the array.");
    }
  }

  public static int deleteValue(int[] arr, int value) {
    boolean found = false;
    for (int i = 0; i < arr.length; i++) {
      if (arr[i] == value) {
        found = true;
        // Shift elements to the left to overwrite the deleted value
        for (int j = i; j < arr.length - 1; j++) {
          arr[j] = arr[j + 1];
        }
        // Decrement the last element (since the array size effectively reduces)
        arr[arr.length - 1] = 0;
        break;
      }
    }
    return found ? value : -1; // Return the deleted value if found, -1 otherwise
  }
}
