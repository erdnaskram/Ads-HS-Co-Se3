package Uebungen.U_01.U01_A3;
// Definition of class Rational

public class Rational {
	private int numerator; // Zaehler
	private int denominator; // Nenner

	// Initialize numerator to 0 and denominator to 1
	public Rational() {
		numerator = 0;
		denominator = 1;
	}

	// Initialize numerator part to n and denominator part to 1
	public Rational(int n) {
		numerator = n;
		denominator = 1;
	}

	// Initialize numerator part to n and denominator part to d
	public Rational(int n, int d) {
		assert (d != 0);

		numerator = n;
		denominator = d;
		reduce();
	}

	// Add two Rational numbers
	public Rational sum(Rational right) {
		if (this.denominator != right.denominator){
			return new Rational(this.numerator * right.denominator + right.numerator * this.denominator, this.denominator * right.denominator);
		} else
			return new Rational(this.numerator + right.numerator, this.denominator);
	}

	// Subtract two Rational numbers
	// return a Rational result object
	public Rational subtract(Rational right) {
		if (this.denominator != right.denominator){
			return new Rational(this.numerator * right.denominator - right.numerator * this.denominator, this.denominator * right.denominator);
		} else
			return new Rational(this.numerator - right.numerator, this.denominator);
	}

	// Multiply two Rational numbers
	// return a Rational result object
	public Rational multiply(Rational right) {
		return new Rational(this.numerator * right.numerator, this.denominator * right.denominator);
	}

	// Divide two Rational numbers
	// return a Rational result object
	public Rational divide(Rational right) {
		return new Rational(this.numerator * right.denominator, this.denominator * right.numerator);

	}

	// Reduce the fraction
	private void reduce() {
		assert (denominator != 0);
		int number1 = numerator;
		int number2 = denominator;
		do{
			if (number1 > number2){
				number1 = number1 - number2;
			} else {
				number2 = number2 - number1;
			}

		} while (number2 != 0);
		this.numerator = this.numerator/number1;
		this.denominator = this.denominator/number1;
	}

	public void toScreen() {
		System.out.println("Wert " + this.toString());
	}

	// Return String representation of a Rational number
	public String toString() {
		return numerator + "/" + denominator;
	}

}