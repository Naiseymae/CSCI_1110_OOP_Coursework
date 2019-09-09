package exercise_17_7;

/* 
 * Author: Renee Linford
 * Date: 9-9-19
 * OOP Exercise 17-7: Restore objects from a file.
 */

import java.io.*;
import java.util.*;

public class Exercise17_7 {
	public static void main(String[] args) throws ClassNotFoundException, IOException {
		
		// Create new loans.
		Loan loan1 = new Loan();
		Loan loan2 = new Loan(1.8, 10, 10000);
		
		try (	// Create new file.
				ObjectOutputStream output = new ObjectOutputStream(new 
						FileOutputStream("exercise_17_7/Exercise17_07.dat"));
				) {
			
			// Write loan objects to file.
			output.writeObject(loan1);
			output.writeObject(loan2);
		}
		catch (IOException ex) {
			System.out.println("File could not be opened");
		}
		
		// Call method to read loans from file & display amounts.
		outputData("exercise_17_7/Exercise17_07.dat");		
	}
	
	public static void outputData(String loanFile) throws FileNotFoundException, IOException, ClassNotFoundException {
		// Reads the loan objects from a file and displays total loan amount.
		
		try (	// Read from file.
				ObjectInputStream input = new ObjectInputStream(new FileInputStream(loanFile))
				) {
			int count = 0; // Loan number from file.
			while (true) {
				Loan loan = (Loan) input.readObject(); // Read object from file as Loan.
				count++;
				System.out.println("Loan " + count + " amount: $" + loan.getLoanAmount());
			}
		}
		
		catch (EOFException ex) {
			//Unknown loan objects in file; catch ends the loop.
			System.out.println("END OF FILE");
		}
		
		catch (IOException ex) {
			ex.printStackTrace();
		}
	}
}