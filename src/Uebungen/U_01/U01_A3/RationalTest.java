package Uebungen.U_01.U01_A3;

import java.util.Scanner;
// Test the Rational number class

public class RationalTest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Rational original, right, result = null;
		int numerator, denumerator;
		char operation;

		// create the left operand
		System.out.println("Enter first Rational object");
		System.out.println("Enter the numerator: ");
		numerator = sc.nextInt();
		System.out.println("Enter the denumerator: ");
		denumerator = sc.nextInt();

		original = new Rational(numerator, denumerator);

		// choose the operation
		System.out.println("Enter the operation +, *, /, -");
		
		operation = sc.next().charAt(0);// next().charAt(0).next()
		// create the right operand
		System.out.println("Enter second Rational object");
		System.out.println("Enter the numerator: ");
		numerator = sc.nextInt();
		System.out.println("Enter the denumerator: ");
		denumerator = sc.nextInt();
		
		right = new Rational(numerator, denumerator);

		// execute the operation
		if (operation == '+')
			result = original.sum(right);
		if (operation == '-')
			result = original.subtract(right);
		if (operation == '/')
			result = original.divide(right);
		if (operation == '*')
			result = original.multiply(right);

		// print the result
		System.out.println(
				original.toString() + " " + operation + " " + right.toString() + " " + "=" + result.toString());
	} // end main
}
