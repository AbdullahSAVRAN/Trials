package IndividualTrials;

import java.util.Scanner;
public class TrialOne {
  public static void main(String[]args) {
	  Scanner input = new Scanner(System.in);
	  
	  System.out.println("Enter first number : ");
	  double a = input.nextDouble();
	  System.out.println("Enter second number : ");
	  double b = input.nextDouble();
	  System.out.println("Enter third number : ");
	  double c = input.nextDouble();
	  double result = a * b / c;
	  System.out.println("The result of : " + result );
	  
	  
  }
	
	
}
