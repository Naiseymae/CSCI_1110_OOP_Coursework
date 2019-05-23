package exercise_10_3;

/* 
 * Author: Renee Linford
 * Date: 5-17-19
 * OOP Exercise 10-3: MyInteger class
 * 
 * -----------------------
 * 		MyInteger
 * -----------------------
 * value: int
 * -----------------------
 * +MyInteger()
 * +MyInteger(int)
 * +isEven(): true
 * +isEven(int): true
 * +isEven(MyInteger): true
 * +isOdd(): true
 * +isOdd(int): true
 * +isOdd(MyInteger): true
 * +isPrime(): true
 * +isPrime(int): true
 * +isPrime(MyInteger): true
 * +equals(int): true
 * +equals(MyInteger): true
 * +parseInt(char[]): int
 * +parseInt(String): int
 * -----------------------
 * 
 */

public class MyInteger {

	// Define variables.
	int value = 0;


	// Set default constructor 
	public MyInteger() {
	}

	// Set constructor with specified value.
	public MyInteger(int newValue) {
		value = newValue;
	}


	// Non-static method getInt() returns object's int value.
	public int getInt() {
		return this.value;
	}


	// Non-static method isEven() returns true if value is even.
	public boolean isEven() {
		if (this.value % 2 == 0) {
			return true;
		}
		else 
			return false;
	}


	// Static method isEven(int) returns true if value is even.
	public static boolean isEven(int newValue) {
		if (newValue % 2 == 0) {
			return true;
		}
		else 
			return false;
	}


	// Static method isEven(MyInteger) returns true if MyInteger object is even. 
	public static boolean isEven(MyInteger newValue) {
		if (newValue.getInt() % 2 == 0) {
			return true;
		}
		return false;
	}


	// Non-static method isOdd() returns true if value is odd.
	public boolean isOdd() {
		if (this.value % 2 != 0) {
			return true;
		}
		return false;
	}


	// Static method isOdd(int) returns true if specified value is odd.
	public static boolean isOdd(int newValue) {
		if (newValue % 2 != 0) {
			return true;
		} 
		return false;
	}	


	// Static method isOdd(MyInteger) returns true if MyInteger object is odd.
	public static boolean isOdd(MyInteger newValue) {
		if (newValue.getInt() % 2 != 0) {
			return true;
		} 
		return false;
	}	


	// Non-static method isPrime() returns true if value is prime number.
	public boolean isPrime() {
		if (value == 0 || value == 1) { // Not prime if value is 0 or 1.
			return false;
		}
		// Loop checks if value is prime.
		for (int i = 1; i < value/2; i++) { // "i" is divisor.
			if (value % i == 0) { // If divisible value is not prime.
				return false;
			}
		}	
		return true;
	}


	// Static method isPrime(int) returns true if specified value is prime number.
	public static boolean isPrime(int newValue) {
		if (newValue == 0 || newValue == 1) { // Not prime if value is 0 or 1.
			return false;
		}
		// Loop checks if value is prime.
		for (int i = 1; i < newValue/2; i++) { // "i" is divisor.
			if (newValue % i == 0 || newValue == 0) { // If divisible value is not prime.
				return false;
			}
		}
		return true;
	}


	// Static method isPrime(MyInteger) returns true if MyInteger object is prime number.
	public static boolean isPrime(MyInteger newValue) {
		if (newValue.getInt() == 0 || newValue.getInt() == 1) { // Not prime if value is 0 or 1.
			return false;
		}
		// Loop checks if value is prime.
		for (int i = 1; i < (newValue.getInt() / 2); i++) { // "i" is divisor.
			if (newValue.getInt() % i == 0 || newValue.getInt() == 0) { // If divisible value is not prime.
				return false;
			}
		}
		return true;
	}	


	// Non-static method equals(int) returns true if value is equal to specified value.
	public boolean equals(int number) {
		if (this.value == number) {
			return true;
		}
		else
			return false;
	}


	// Non-static method equals(MyInteger) returns true if value is equal to MyInteger value.
	public boolean equals(MyInteger number) {
		if (number.getInt() == this.value) {
			return true;
		}
		else
			return false;
	}


	// Static method parseInt(char[]) converts array of numeric characters to int value.
	public int parseInt(char [] numericChar) {
		// Loop assigns numeric characters to array.
		for (int i = 0; i < numericChar.length; i++) {
			numericChar[i] = numericChar[i];
		}
		// Loop puts each value into units slot by x10, x100, x1000, etc.
		int numbers = 0;
		for (int j = 0; j < numericChar.length; j++) {
			numbers = numbers * 10 + (numericChar[j] - '0'); // array[j] - '0' converts char to int value.
		}
		return numbers;
	}


	// Static method parseInt(String) converts a string of numeric characters to int value.
	public int parseInt(String numericChar) {
		// Loop assigns numeric characters to new string.
		String numberString = "";
		for (int i = 0; i < numericChar.length(); i++) {
			numberString = numberString + numericChar.charAt(i);
		}
		// Convert string to integer.
		int numbers = 0;
		for (int j = 0; j < numericChar.length(); j++) {
			numbers = numbers * 10 + (numericChar.charAt(j) - '0'); // string.charAt - '0' converts char to int value.
		}
		return numbers;
	}


}
