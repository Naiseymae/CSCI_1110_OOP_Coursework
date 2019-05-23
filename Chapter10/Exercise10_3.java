package exercise_10_3;

/* 
 * Author: Renee Linford
 * Date: 5-17-19
 * OOP Exercise 10-3: Testing MyInteger class
 */

public class Exercise10_3 {

	public static void main(String[] args) {
		// This program tests all method in the MyInteger class.


		// Create new MyInteger objects.
		MyInteger testInt = new MyInteger();
		MyInteger oddInt = new MyInteger(3);
		MyInteger evenInt = new MyInteger(6);
		char[] charArray = {'1', '2', '3', '4'};
		String charString = "4321";


		// Test isEven methods.
		System.out.println("Testing isEven methods:");
		System.out.println("\ttestInt(default constructor) is even: " + testInt.isEven());
		System.out.println("\toddInt(3) is even: " + oddInt.isEven());
		System.out.println("\tevenInt(6) is even: " + evenInt.isEven());
		System.out.println("\t9 is even: " + MyInteger.isEven(9));
		System.out.println("\tisEven(MyInteger(12)): " + MyInteger.isEven(new MyInteger(12)));
		System.out.println();
		

		// Test isOdd methods.
		System.out.println("Testing isOdd methods:");
		System.out.println("\ttestInt(default constructor) is odd: " + testInt.isOdd());
		System.out.println("\toddInt(3) is odd: " + oddInt.isOdd());
		System.out.println("\tevenInt(6) is odd: " + evenInt.isOdd());
		System.out.println("\t9 is odd: " + MyInteger.isOdd(9));
		System.out.println("\tisOdd(MyInteger(12)): " + MyInteger.isOdd(new MyInteger(12)));
		System.out.println();

		
		// Test isPrime methods.
		System.out.println("Testing isPrime methods:");
		System.out.println("\ttestInt(default constructor) is prime: " + testInt.isPrime());
		System.out.println("\toddInt(3) is prime: " + oddInt.isPrime());
		System.out.println("\tevenInt(6) is prime: " + evenInt.isPrime());
		System.out.println("\t9 is prime: " + MyInteger.isPrime(9));
		System.out.println("\tisPrime(MyInteger(12)): " + MyInteger.isPrime(new MyInteger(12)));
		System.out.println();
		

		// Test equals methods.
		System.out.println("Testing equals methods:");
		System.out.println("\toddInt(3) is equal to 3: " + oddInt.equals(3));
		System.out.println("\toddInt(3) is equal to 4: " + oddInt.equals(4));
		System.out.println("\tevenInt(6) is equal to 6: " + evenInt.equals(6));
		System.out.println("\tevenInt(7) is equal to 7: " + evenInt.equals(7));
		System.out.println("\tequals(MyInteger(0)): " + testInt.equals(new MyInteger(0)));
		System.out.println();


		// Test parseInt(char []) method.
		System.out.println("Testing parseInt(char[]) method:");
		System.out.println("\tparseInt(char [] charArray) with array numbers {1, 2, 3, 4} returns: " + testInt.parseInt(charArray));
		System.out.println();
		

		// Test parseInt(String) method.
		System.out.println("Testing parseInt(String) method:");
		System.out.println("\tparseInt(String charString) with string \"4321\" returns: " +  testInt.parseInt(charString));
		System.out.println();

	}

}
