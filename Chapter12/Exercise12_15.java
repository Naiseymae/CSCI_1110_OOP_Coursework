package exercise_12_15;

/* 
 * Author: Renee Linford
 * Date: 6-10-19
 * OOP Exercise 12-15: Write/read data
 */

import java.io.*;
import java.util.*;

public class Exercise12_15 {

	public static void main(String[] args) throws Exception {
		// Create file named Exercise12_15.txt
		java.io.File myFile = new java.io.File("Exercise12_15.txt");
		//System.out.println("1 - Does file exist? " + myFile.exists());
		//System.out.println("1 - Can it be written? " + myFile.canWrite());


		// If file already exists, notify user.
		if (myFile.exists()) {
			System.out.println("File already exists");
		}

		// Try/catch blocks for exceptions.
		try {
			// If file doesn't exist, create file.
			java.io.PrintWriter output = new java.io.PrintWriter(myFile);
			//System.out.println("2 - Does file exist? " + myFile.exists());
			//System.out.println("2 - Can it be written? " + myFile.canWrite());


			// Write 100 random integers into file; separate by spaces.
			for (int i = 0; i < 100; i++) {
				//output.println(85);
				output.println((int)(Math.random() * 101) + " ");
				//System.out.println(((int)(Math.random() * 101) + " "));

			}

			// Close file.
			output.close();

			//System.out.println("Can it be read? " + myFile.canRead());
		}

		catch (Exception ex) {
			System.out.print(ex);
		}


		// Read data back from file & put into array.
		int [] intArray = new int [100];
		Scanner input = new Scanner(myFile); // Scanner input from myfile.
		while (input.hasNext()) {
			for (int j = 0; j < 100; j++) {
				intArray[j] = input.nextInt();
				//System.out.println("intArray[" + j + "] = " + intArray[j]);
			}
		}


		// Close file.
		input.close();


		// Display data in increasing order.
		java.util.Arrays.sort(intArray); // Sort array.
		System.out.println("Numbers in Exercise12_15.txt: ");
		for (int k = 0; k < 100; k++) { // Loop prints array.
			System.out.println(intArray[k] + " ");
		}
		

	}

}
