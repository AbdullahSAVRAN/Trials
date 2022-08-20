package IndividualTrials;

import java.util.Scanner;

public class TrialTwo {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter first number : ");
		double divided = input.nextDouble();
		System.out.println("Please enter second number : ");
		double dividing = input.nextDouble();
		double remaining = divided % dividing;
		double division = divided / dividing;
		System.out.println("The remaining is : " + remaining);
		System.out.println("The division is : " + division);

	}

}
