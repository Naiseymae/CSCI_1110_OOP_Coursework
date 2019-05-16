
/* 
 * Author: Renee Linford
 * Date: 5-15-19
 * OOP Exercise 9-7: Implement Account Class
 * 
 */

public class Exercise9_7 {

	public static void main(String[] args) {
	
		
		// Create new Account object with ID of 1122 and balance of $20,000.
		int accountID = 1122;
		double accountBalance = 20000;
		Account myAccount = new Account(accountID, accountBalance);


		// Set annual interest rate at 4.5%.
		double newAnnualInterestRate = 4.5;
		myAccount.setAnnualInterestRate(newAnnualInterestRate);


		// Use withdraw method.
		double withdrawlAmount = 2500;
		accountBalance = myAccount.withdraw(withdrawlAmount);


		// Use deposit method.
		double depositAmount = 3000;
		accountBalance = myAccount.deposit(depositAmount);


		// Print the balance.
		System.out.printf("Balance is $%.2f\n", accountBalance);


		// Calculate monthly interest.
		double monthlyInterest = myAccount.getMonthlyInterest();


		// Print monthly interest.
		System.out.printf("Monthly interest is $%.2f\n", monthlyInterest);


		// Print date created.
		System.out.print("Date account created: " + myAccount.getDateCreated(1122));


	}

}
