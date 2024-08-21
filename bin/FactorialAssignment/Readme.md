# Factorial Calculator Utility

## Problem Analysis

The task is to create a command-line utility that calculates the factorial of a non-negative integer. The factorial of a number `n` is defined as the product of all positive integers less than or equal to `n`. The program should validate the input and compute the factorial.

## Inputs

1. **Non-negative Integer**: The program should accept a valid non-negative integer as input. The input should be validated to ensure it is a non-negative integer.
	
	- The program should accept non-negative input given from command line argument.
	- Validation: It checks if the input is non-negative. If the user enters a negative 		number, it displays an error message.
	- Factorial Calculation: If the input is valid, the program calculates the factorial 		using a for loop.

## Expected Output

	The output will be the factorial of the input number. For example:
		- Input: `5` → Output: `120`
		- Input: `0` → Output: `1`

	If the input is invalid (e.g., a negative number), the program should display an
	appropriate error message.

## Algorithm: Factorial Calculation

	Start
	Input: User to enter a non-negative integer from command line argument.
	Validate Input: If the input is less than 0, display an error message ("Factorial is 	not defined for negative numbers.") and terminate the program.
	Initialize: Set a variable factorial to 1.
	Loop:
	For each integer i from 1 to the input number (inclusive), multiply factorial by i.
	Output: Display the value of factorial (the result of the multiplication).
	End
