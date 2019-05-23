package exercise_10_7;

/* 
 * Author: Renee Linford
 * Date: 5-22-19
 * OOP Exercise 10-7: ATM machine
 */

import java.util.Scanner;

public class Exercise10_7 {

	public static void main(String[] args) {
		// Use the Account class to simulate an ATM machine.


		// Create 10 accounts in an array with initial balance of $100.
		Account[] account = new Account[10];
		for (int i = 0; i < 10; i++) {
			account[i] = new Account (i+1, 100);
		}


		// System prompts user to enter an ID. 
		System.out.println("Enter account ID: ");
		Scanner input = new Scanner(System.in);
		int userInput = input.nextInt();
		int userChoice = 0;
		boolean loopATM = true;

		// Re-prompt user if ID is incorrect.
		while (loopATM)	{
			while (userInput < 1 || userInput > 10) { // Loop to re-prompt user.
				if (userInput != -200 && userInput < 1 || userInput > 10) {
					System.out.println("Error: Account not valid.");
					System.out.println();
				}
				System.out.println("Enter account ID: ");
				userInput = input.nextInt(); // Assign new input to userInput.
			}
			
			// Main Menu Loop
			// Display Main Menu: userChoice is 1, 2, 3, or 4.
			while (userChoice < 1 || userChoice > 4) {
				System.out.println();
				System.out.println("Main Menu:"); // Main menu options.
				System.out.println("1: Check Balance");
				System.out.println("2: Withdraw");
				System.out.println("3: Deposit");
				System.out.println("4: Exit");
				
				// Prompt user to enter menu choice.
				System.out.println();
				System.out.println("Enter a choice: "); 
				userChoice = input.nextInt(); // Assign new input to userInput.
	
				// Execute user choice.
				if (userChoice == 1) {
					// Display Balance.
					System.out.println();
					System.out.printf("Account " + userInput + " balance: $%.2f", account[userInput - 1].getBalance());
					System.out.println();
					userChoice = -100; // Resets userChoice which resets main menu loop.
				}
				if (userChoice == 2) {
					// Withdraw amount specified by user.
					System.out.print("Enter withdrawal amount: $");
					double withdrawalAmount = input.nextDouble();
					account[userInput - 1].withdraw(withdrawalAmount);
					//System.out.printf("Account " + userInput + " balance: $%.2f", account[userInput - 1].getBalance());
					userChoice = -100; // Resets userChoice which resets main menu loop.
				}
				if (userChoice == 3) {
					// Deposit amount specified by user.
					System.out.print("Enter deposit amount: $");
					double depositAmount = input.nextDouble();
					account[userInput - 1].deposit(depositAmount);
					userChoice = -100; // Resets userChoice which resets main menu loop.
				}
				if (userChoice == 4) {
					// Exit to "Enter an ID".
					System.out.println();
					System.out.println("--------------------------");
					System.out.println();
					userChoice = -100; // Resets userChoice which resets main menu loop.
					userInput = -200; // Resets userInput which resets ATM loop.
					break;
				}
			}
		}
	}
}


