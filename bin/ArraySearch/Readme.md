# Array Search Program

## Problem Statement

Create a simple Java program that searches for a specific item within an array of integers. The program prompts the user for input (the item to search for) and then performs a linear search through the array. If the item is found, the program returns the index of the item; if not, it displays a message indicating that the item is not present.

## Analysis

The problem is to search for a given element in an array. The simplest approach is to use a **linear search algorithm**, where each element in the array is checked one by one until the target element is found, or the end of the array is reached.

The key steps in the problem are:
1. Defining an array with a set of integers.
2. Taking input from the user, which represents the element to be searched.
3. Iterating through the array and comparing each element with the user input.
4. Returning the index of the element if found, or displaying an appropriate message if not.

## Input

The program expects the following input:
- **An integer value**: The user inputs a number that the program will search for within a predefined array.

## Expected Output

The program will provide one of the following outputs:
1. **Item found**: The index of the item in the array.
   - Example: `Item found at index 2` (if the user searches for `30` in the array `[10, 20, 30, 40, 50]`).
2. **Item not found**: A message indicating that the item is not present in the array.
   - Example: `Item not found in the array` (if the user searches for `60` in the same array).

   
## Algorithm: Search in an Array
	
	Start
	Define an array with a set of integers (e.g., [10, 20, 30, 40, 50]).
	Prompt the user to input the target element (the item to search for in the array).
	Initialize a loop that iterates over each element of the array.
		Start from the first element and continue until the last element.
	Check if the current element matches the target element.
		If the element matches, store the index of that element.
		If the element doesn't match, move to the next element.
	After the loop ends, check if the target element was found.
		If the element was found, print the index of the element.
		If the element wasn't found, print a message indicating that the item is not in the
		array.
	End