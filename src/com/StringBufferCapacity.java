package com;

import java.util.Scanner;

//	Main Class
public class StringBufferCapacity {

	StringBuffer sb = new StringBuffer();									//	Class Variable of String Buffer to check its capacity changes
	
	public void showCapacity(String input) {								//	Method to display append string to stringBuffer and its capacity
		int capacity = sb.capacity();										//	Assigning the buffer capacity to a variable

		System.out.println("-------------------------------------------");
		System.out.println("Capacity Before appending : " + capacity);		//	Displaying capacity before appending string

		sb.append(input);													//	Appending the string

		capacity = sb.capacity();											//	Getting the capacity of buffer after append

		System.out.println("Capacity After appending : " + capacity);
		System.out.println("-------------------------------------------");	//	Displaying capacity after appending string
	}

	//	Main method
	public static void main(String[] args) {
		StringBufferCapacity bufferCapacity = new StringBufferCapacity();	//	Class Object
		String input = "";
		int choice = 0;
		Scanner userInput = new Scanner(System.in);							//	Scanner to get the user input

		System.out.println("Enter String to check the Capacity of the String Buffer........");
		while (true) {														//	Infinite Loop to get the user input continuously
			System.out.print("1. Enter 2. Exit - ");
			choice = userInput.nextInt();									//	Getting the choice from the user

			if (choice == 1) {												//	If 1 user can enter the string for capacity calculation process
				System.out.print("Enter String : ");
				userInput.nextLine();
				input = userInput.nextLine();
				bufferCapacity.showCapacity(input);
			} else if (choice == 2) {										//	If 2 Exit
				System.out.println("Exited.........");
				break;
			} else {
				System.out.println("Enter correct choice..");
			}

		}

		userInput.close();													//	Closing Scanner
	}
}
