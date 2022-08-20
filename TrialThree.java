package IndividualTrials;

import java.util.Scanner;

public class TrialThree {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter first number : ");
		double a = input.nextDouble();
		System.out.println("Enter second number : ");
		double b = input.nextDouble();
		System.out.println("Before changing");
		System.out.println("First number : " + a);
		System.out.println("Second number : " + b);
		double c = a;
		a = b;
		b = c;
		System.out.println("After changing");
		System.out.println("First Number  : " + a);
		System.out.println("First number  : " + b);
	}

}
