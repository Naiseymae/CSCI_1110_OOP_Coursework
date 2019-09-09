
/* 
 * Author: Renee Linford
 * Date: 9-9-19
 * OOP Exercise 17-3: Sum all the integers in a binary data file.
 */

import java.io.*;
import java.util.*;

public class Exercise17_3 {

	public static void main(String[] args) throws IOException  {
		// Call methods to create new file, add integers to it, and print sum of integers.

		// Create new file.
		createAndAddFile("exercise_17_3/Exercise_17_03.dat");

		// Read file and sum integers.
		int sum = readAndSum("exercise_17_3/Exercise_17_03.dat");
		System.out.println();
		System.out.println("SUM = " + sum);
	}

	private static void createAndAddFile(String fileName) throws FileNotFoundException {
		// Method to create a file. If file does not exist, create 100 new integers. 

		try {
			// New OutputStream & new file if it does not exist. 
			//Append new integers to file if it exists.
			FileOutputStream file = new FileOutputStream(fileName, true);
			DataOutputStream output = new DataOutputStream(file);

			// Write random 100 integers.
			for (int i = 0; i < 100; i++) {
				output.writeInt((int)(Math.random() * 100)); // Write into file.
			}
			output.close(); // Close write output.
		} 

		catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}


	public static int readAndSum(String fileName) throws IOException {
		// Method to read integers from file and find their sum.

		int sum = 0;

		// Try/Catch for file that contains an unspecified number of integers.
		try 
		(DataInputStream input = new DataInputStream(new FileInputStream(fileName));)
		{
			// Display integers from file.
			while (true) {
				int value = input.readInt();
				System.out.print(value + " "); // Print with spaces.
				sum += value; // Add readInt to sum.

			}
		}

		catch (EOFException ex)  { // Read end of file.
			return sum; // Return statement.
		}

	}


}
