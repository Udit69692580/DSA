import java.util.*;

public class G {
    public static void main(String[] args) {
        // Define and initialize a 2D array
        int[][] arr = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        // Call the printArray method to print the 2D array
        printArray(arr);
    }

    // Method to print the 2D array in matrix form
    static void printArray(int[][] arr) {
        // Iterate over each row
        for(int i = 0; i < arr.length; i++) {
            // Iterate over each column in the current row
            for(int j = 0; j < arr[i].length; j++) {
                // Print the element followed by spaces to align with the columns
                System.out.print(arr[i][j] + " ");
            }
            // Move to the next line after printing all elements of the row
            System.out.println();
        }
    }
}

