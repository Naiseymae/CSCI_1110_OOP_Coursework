
/* 
 * Author: Renee Linford
 * Date: 6-3-19
 * OOP Exercise 11-3: Savings SubClass (extends Account Class)
 * 
 * -------------------------------
 * 		SavingsAccount
 * -------------------------------
 * -overdraft:double
 * -------------------------------
 * +SavingsAccount()
 * +withdraw():double
 * -------------------------------
 */

public class SavingsAccount extends Account {
	// Subclass of Account class. Does not allow overdraft.
	
	// Default constructor.
	public SavingsAccount() {
	}


	//Overdraft declared.
	double overdraft = 0;


	// Public Savings balance method.  No overdraft allowed.
	public double withdraw(double withdrawalAmount) {
		double savingsBalance = getBalance();
		if ((savingsBalance - withdrawalAmount) >= overdraft) { // Check if balance is less than overdraft limit.
			super.withdraw(withdrawalAmount);
		}
		if ((savingsBalance - withdrawalAmount) < overdraft) {
			System.out.print("Cannot execute withdraw action: greater than savings withdraw limit.\n");
		}
		return getBalance();
	}


	// Public method toString.
	public String toString() {
		return "Savings: $" + getBalance();


	}
}


