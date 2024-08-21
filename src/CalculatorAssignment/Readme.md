# Problem Analysis

## Problem Statement: 

Design and create a basic calculator that can perform simple arithmetic operations like addition, subtraction, multiplication, and division. The user will input two numbers and choose an operation, and the calculator will display the result.

### Problem Breakdown:

	Operations: The calculator should be able to perform:
		1. Addition
		2. Subtraction
		3. Multiplication
		4. Division

### User Input:

	The program should accept:
		
		1. The user will input two numbers.
			- Two numbers: These can be integers or floating-point numbers.
		2. The user will select an operation to perform on these numbers.
			- Operator: A symbol representing the desired operation (+, -, *, /).
	

### Expected Output:

	The program should output:
	
		1. The result of the arithmetic operation will be displayed, The result of the 		arithmetic operation based on the user's input.
	
		For example:

			If the user inputs 4 and 5 with the operator +, the output should be 9.
			If the user inputs 10 and 2 with the operator /, the output should be 5.
	
## Algorithm 
	Here's a simple algorithm representing the logic of the calculator program:

		Start
		Prompt the user to enter the first number.
		Prompt the user to enter the second number.
		Prompt the user to enter the operator (+, -, *, /).
		Check the operator:
			If the operator is +, perform addition.
			If the operator is -, perform subtraction.
			If the operator is *, perform multiplication.
			If the operator is /, perform division (check if the divisor is not zero).
		Display the result.
		End
		