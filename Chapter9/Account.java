package exercise_9_7;

import java.util.Date;

/* 
 * Author: Renee Linford
 * Date: 5-15-19
 * OOP Exercise 9-7: Account Class
 * 
 * -------------------------------
 * 			Account
 * -------------------------------
 * -id:int
 * -balance:double
 * -annualInterestRate:double
 * -dateCreated:Date
 * -monthlyInterestRate:double
 * -monthlyInterest:double
 * -------------------------------
 * +Account()
 * +getMonthlyInterestRate():double
 * +getMonthlyInterest():double
 * +withdraw():double
 * +deposit():double
 * +getID():double
 * +getBalance():double
 * +getAnnualInterestRate():double
 * +getDateCreated():Date
 * +setID():void
 * +setBalance():void
 * +setAnnualInterestRate():void
 * -------------------------------
 */


public class Account {
	// Account class creates object with new ID and new balance.

	// Define variables
	private int id = 0;
	private double balance = 0;
	private double annualInterestRate = 0;
	private Date dateCreated = new Date();
	private double monthlyInterestRate = 0;
	private double monthlyInterest = 0;


	// Default Account constructor
	public Account() {
	}

	// Create constructor with new account with given ID and balance.
	public Account(int newId, double newBalance) {
		this.id = newId;
		balance = newBalance;
	}



	// Methods for monthly interest rate, monthly  interest, withdraw, and deposit.
	public double getMonthlyInterestRate() { // Take annual rate, divide by 100, then divide by 12 months.
		return monthlyInterestRate;
	}

	public double getMonthlyInterest() { // Multiply balance by monthly interest rate.
		return monthlyInterest; 
	}

	public double withdraw(double withdrawalAmount) { // Subtract withdraw amount from balance.
		balance = (balance - withdrawalAmount);
		return balance;
	}

	public double deposit(double depositAmount) { // Add deposit amount to balance.
		balance = (balance + depositAmount);
		return balance;
	}



	// Accessor methods for getID, getBalance, and getAnnualInterestRate.
	public int getID() { // Get account ID.
		return this.id;
	}

	public double getBalance() { // Get account Balance.
		return this.balance;
	}

	public double getAnnualInterestRate() { // Get account annual interest rate.
		return this.annualInterestRate;
	}


	// Accessor method for date created.
	public Date getDateCreated(int accountID) {
		return this.dateCreated;
	}



	// Mutator methods for setID, setBalance, and setAnnualInterestRate.
	public void setID(int newID) {	// Set new account ID.
		this.id = newID;
	}

	public void setBalance(double newBalance) { // Set new account balance.
		this.balance = newBalance;
	}

	public void setAnnualInterestRate(double newAnnualInterestRate) { // Set new annual interest rate.
		this.annualInterestRate = newAnnualInterestRate;
		this.monthlyInterestRate = ((annualInterestRate / 100) / 12); 
		this.monthlyInterest = (balance * monthlyInterestRate);
	}



}
