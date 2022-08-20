package IndividualTrials;

import java.util.Scanner;

public class TrialFive {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter first number : ");
		double a = input.nextDouble();
		System.out.println("Enter second number : ");
		double b = input.nextDouble();
		double c = a / b;
		double d = a * b;
		double e = a % b;
		double f = Math.pow(a, b);
		System.out.println("Result of Division : " + c);
		System.out.println("Result of Multiplication : " + d);
		System.out.println("Result of Mod : " + e);
		System.out.println("Result of Pow : " + f);

	}

}
