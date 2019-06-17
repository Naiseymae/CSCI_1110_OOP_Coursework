package exercise_13_13;

/* 
 * Author: Renee Linford
 * Date: 6-17-19
 * OOP Exercise 13-13: Rational class with BigInteger for numerator and denominator.
 */

import java.math.BigInteger;

public class Rational extends Number implements Comparable<Rational> {

	// Declare numerator and denominator
	private BigInteger numerator = new BigInteger("0");
	private BigInteger denominator = new BigInteger("1");
	
	
	// Default constructor with default properties.
	public Rational() {
		this(new BigInteger("0"), new BigInteger("1"));
	}
	
	
	// Constructor with specified numerator and denominator.
	public Rational(BigInteger numerator, BigInteger denominator) {
		BigInteger gcd = gcd(numerator, denominator);
		this.numerator = denominator.multiply(numerator.divide(gcd));
		this.denominator = denominator.divide(gcd);
	}
	
	
	// Method to find GCD (greatest common denominator) of two numbers.
	private static BigInteger gcd(BigInteger n, BigInteger d) {
		long n1 = n.longValue();
		long n2 = d.longValue();
		BigInteger gcd = new BigInteger ("1");
		
		for (long k = 1; k <= n1 && k <= n2; k++) {
			if (n1 % k == 0 && n2 % k == 0)
				gcd = BigInteger.valueOf(k);
		}
		return gcd;
	}
	
	
	// Get method for numerator.
	public BigInteger getNumerator() {
		return numerator;
	}
	
	
	// Get method for denominator.
	public BigInteger getDenominator() {
		return denominator;
	}

	
	// Add rational number to this rational.
	public Rational add(Rational secondRational) {
		BigInteger n = numerator.multiply(secondRational.getDenominator()).add(
				denominator.multiply(secondRational.getNumerator()));
		BigInteger d = denominator.multiply(secondRational.getNumerator());
		return new Rational(n, d);
	}
	
	
	// Subtract rational number from this rational.
	public Rational subtract(Rational secondRational) {
		BigInteger n = numerator.multiply(secondRational.getDenominator()).subtract(
				denominator.multiply(secondRational.getNumerator()));
		BigInteger d = denominator.multiply(secondRational.getDenominator());
		return new Rational(n, d);
	}
	
	
	// Multiply a rational number by this rational.
	public Rational multiply(Rational secondRational) {
		BigInteger n = numerator.multiply(secondRational.getNumerator());
		BigInteger d = denominator.multiply(secondRational.getDenominator());
		return new Rational(n, d);
	}
	
	
	// Divide a rational number by this rational.
	public Rational divide(Rational secondRational) {
		BigInteger n = numerator.multiply(secondRational.getDenominator());
		BigInteger d = denominator.multiply(secondRational.getNumerator());
		return new Rational(n, d);
	}
	
	
	@Override
	// New toString method.
	public String toString() {
		BigInteger one = new BigInteger("1");
		if (denominator.equals(one))
			return numerator + "";
		else
			return numerator + "/" + denominator;
	}
	
	
	@Override
	// New equals() method from object class.
	public boolean equals(Object other) {
		BigInteger zero = new BigInteger("0");
		if (((this.subtract((Rational)(other))).getNumerator()).equals(zero))
			return true;
		else
			return false;
	}
	
		
	@Override
	// New compareTo() method in Comparable.
	public int compareTo(Rational o) {
		BigInteger zero = new BigInteger("0");
		if ((this.subtract(o).getNumerator()).compareTo(zero) > 0)
			return 1;
		else if ((this.subtract(o).getNumerator()).compareTo(zero) < 0)
			return -1;
		else
			return 0;
	}

	
	@Override
	// New abstract intValue method in Number.
	public int intValue() {
		return (int)doubleValue();
	}

	
	@Override
	// New abstract longValue method in Number.
	public long longValue() {
		return (long)doubleValue();
	}

	
	@Override
	// New abstract floatValue method in Number
	public float floatValue() {
		return (float)doubleValue();
	}

	
	@Override
	// New doubleValue method in Number.
	public double doubleValue() {
		return numerator.doubleValue() * 1.0 / denominator.doubleValue();
	}

}
