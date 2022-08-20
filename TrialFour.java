package IndividualTrials;

import java.util.Scanner;

public class TrialFour {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter first number");
		double a = input.nextDouble();
		System.out.println("Enter second number");
		double b = input.nextDouble();
		System.out.println("Enter third number");
		double x = input.nextDouble();
		System.out.println("Enter fourth number");
		double y = input.nextDouble();
		b++;
		++a;
		double c = a * b;
		System.out.println("Result of : " + c);
		x++;
		--y;
		double z = x * y;
		System.out.println("Second Result of : " + z);

	}

}
