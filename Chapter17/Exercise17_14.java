package exercise_17_14;

/* 
 * Author: Renee Linford
 * Date: 9-9-19
 * OOP Exercise 17-14: Encrypt files.
 */

import java.io.*;
import java.util.*;

public class Exercise17_14 {

	public static void main(String[] args) {
		// Encrypt file.

		// Prompt user to enter file name.
		System.out.print("Enter file name to encrypt: ");

		// Create scanner & read file name from user input.
		Scanner scanner = new Scanner(System.in);
		String sourceFile = scanner.nextLine();

		try {

			// Write encrypted file version and save under new file name.
			String encryptedFileName = ("encrypted.dat");
			//RandomAccessFile targetFile = new RandomAccessFile("exercise_17_14/" + encryptedFileName, "rw");

			// New InputStream/OutputStream.
			DataInputStream input = new DataInputStream(
					new FileInputStream("exercise_17_14/" + sourceFile));
			DataOutputStream output = new DataOutputStream(
					new FileOutputStream("exercise_17_14/" + encryptedFileName));

			// Copy data from original file with encryption ("5").
			int r;
			while ((r = input.read()) != -1) {
				output.write(r + 5);
				System.out.print(r + " ");
			}

			input.close();
			output.close();
		}

		catch (IOException ex) {
			ex.printStackTrace();
		}

	}

}
