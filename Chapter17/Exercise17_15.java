
/* 
 * Author: Renee Linford
 * Date: 9-9-19
 * OOP Exercise 17-15: Decrypt files.
 */

import java.io.*;
import java.util.*;

public class Exercise17_15 {

	public static void main(String[] args) {
		// Decrypt file.

		// Prompt user to enter file name.
		System.out.print("Enter file name to decrypt: ");

		// Create scanner & read file name from user input.
		Scanner scanner = new Scanner(System.in);
		String sourceFile = scanner.nextLine();


		try {

			// Write encrypted file version and save under new file name.
			String decryptedFileName = ("decrypted.dat");

			// New InputStream/OutputStream.
			DataInputStream input = new DataInputStream( new FileInputStream("exercise_17_14/" + sourceFile));
			//FileOutputStream output = new FileOutputStream("exercise_17_14/" + encryptedFileName);
			FileOutputStream output = new FileOutputStream("exercise_17_14/" + decryptedFileName);


			// Copy data from source file and delete encryption bytes ("5").
			int r;
			while((r = input.read()) != -1) {
				output.write(r - 5);
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
