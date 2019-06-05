package exercise_11_3;

/* 
 * Author: Renee Linford
 * Date: 6-3-19
 * OOP Exercise 11-3: Checking SubClass (extends Account Class)
 * 
 * -------------------------------
 * 		CheckingAccount
 * -------------------------------
 * -overdraft:double
 * -------------------------------
 * +CheckingAccount()
 * +withdraw():double
 * -------------------------------
 */

public class CheckingAccount extends Account {
	// Subclass of Account class. Allows overdraft limit.

	// Default constructor.
	public CheckingAccount() {
	}


	//Overdraft declared.
	double overdraft = -500;
	

	// Public Checking balance method.  Allows overdraft of $500.
	public double withdraw(double withdrawalAmount) {
		double checkingBalance = getBalance();
		if ((checkingBalance - withdrawalAmount) >= overdraft) { // Check if balance is more than overdraft limit.
			super.withdraw(withdrawalAmount);
		}
		if ((checkingBalance - withdrawalAmount) < overdraft) { // Check if balance is less than overdraft limit.
			System.out.print("Cannot execute withdraw action: greater than overdraft limit.\n");
		}
		return getBalance();
	}
	
	
	// Public method toString.
	public String toString() {
		return "Checking: $" + getBalance();


	}

}
