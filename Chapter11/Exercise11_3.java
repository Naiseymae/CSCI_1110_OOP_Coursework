
/* 
 * Author: Renee Linford
 * Date: 6-3-19
 * OOP Exercise 11-3: Subclasses of Account class
 */

public class Exercise11_3 {
	// Program creates and tests objects of Account, Savings, and Checking.
	
	public static void main(String[] args) {
	
	// Create new account objects.
	Account account1 = new Account();
	SavingsAccount savings = new SavingsAccount();
	CheckingAccount checking = new CheckingAccount();
	
	// Print toString methods for all accounts.
	System.out.print("account1: " + account1.getID() + ", " + account1.getBalance() + ", " + account1.getDateCreated(account1.getID()) + ".\n");
	System.out.println("savings ID: " + savings.getID());
	System.out.println(savings.toString());
	System.out.println("checking ID: " + checking.getID());
	System.out.println(checking.toString());	
	
	
	// Set ID & balance for savings and checking.
	int accountID = 3;
	
	savings.setID(accountID);
	checking.setID(accountID);
	
	savings.setBalance(500);
	checking.setBalance(1000);
	
	
	// Print toString methods for all accounts.
	System.out.println("\nSet ID & balance.");
	//System.out.print("account1: " + account1.getID() + ", " + account1.getBalance() + ", " + account1.getDateCreated(account1.getID()) + ".\n");
	System.out.println("savings ID: " + savings.getID());
	System.out.println(savings.toString());
	System.out.println("checking ID: " + checking.getID());
	System.out.println(checking.toString());	
	
	
	// First withdrawal: $500 from savings and from checking.
	System.out.print("\nWithdrawal of $500 from savings and from checking.\n");
	savings.withdraw(500);
	checking.withdraw(500);
	
	
	// Print balances of accounts.
	System.out.println(savings.toString());
	System.out.println(checking.toString());	
	

	// Second withdrawal: $500 from savings and from checking.
	System.out.print("\nWithdrawal of $500 from savings and from checking.\n");
	savings.withdraw(500);
	checking.withdraw(500);


	// Print balances of accounts.
	System.out.println(savings.toString());
	System.out.println(checking.toString());	


	// Third withdrawal: $500 from savings and from checking.
	System.out.print("\nWithdrawal of $500 from savings and from checking.\n");
	savings.withdraw(500);
	checking.withdraw(500);


	// Print balances of accounts.
	System.out.println(savings.toString());
	System.out.println(checking.toString());	
	
	
	// Fourth withdrawal: $500 from savings and from checking.
	System.out.print("\nWithdrawal of $500 from savings and from checking.\n");
	savings.withdraw(500);
	checking.withdraw(500);


	// Print balances of accounts.
	System.out.println(savings.toString());
	System.out.println(checking.toString());	



	}
}
