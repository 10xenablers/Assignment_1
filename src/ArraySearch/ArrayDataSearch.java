package ArraySearch;

import java.util.Scanner;

public class ArrayDataSearch 
{
	public static void main(String[] args) {
        // Define an array of items (integers in this case)
        int[] arr = {10, 20, 30, 40, 50};

        // Prompt the user to enter an item to search for
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an item to search for: ");
        int target = scanner.nextInt();

        // Search for the item in the array
        int index = searchArray(arr, target);

        // Output the result
        if (index != -1) {
            System.out.println("Item found at index " + index);
        } else {
            System.out.println("Item not found in the array.");
        }

        // Close the scanner
        scanner.close();
    }

    // Function to perform linear search
    public static int searchArray(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                return i;  // Return the index if the item is found
            }
        }
        return -1;  // Return -1 if the item is not found
    }
}
