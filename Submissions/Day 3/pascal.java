import java.util.Scanner;

public class pascal {

    // Function to calculate and print Pascal's Triangle
    public static void printPascalTriangle(int numRows) {
        // Initialize a 2D array to store the triangle
        int[][] triangle = new int[numRows][numRows];

        // Iterate through each row
        for (int row = 0; row < numRows; row++) {
            // Each row has row+1 elements
            for (int col = 0; col <= row; col++) {
                // First and last values in every row are 1
                if (col == 0 || col == row)
                    triangle[row][col] = 1;
                else
                    // Other values are sum of values just above and to the left
                    triangle[row][col] = triangle[row - 1][col - 1] + triangle[row - 1][col];
                // Print the value
                System.out.print(triangle[row][col] + " ");
            }
            // Move to the next line
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt user to enter the number of rows
        System.out.print("Enter the number of rows for Pascal's Triangle: ");
        int numRows = scanner.nextInt();

        // Print Pascal's Triangle
        printPascalTriangle(numRows);

        scanner.close();
    }
}
