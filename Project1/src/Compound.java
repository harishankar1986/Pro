import java.util.Scanner;
public class Compound {
	public static void main(String args[]) {
		
		// A = P(1+R)^n
		
		double amount, principal = 50000, rate = 0.015,termInterest = principal * rate;
		int totalTerms = 12;
		
		double totalInterest = termInterest * totalTerms;
		
		amount = principal + totalInterest;
		
		System.out.println("Your Total amount with Interest is : " + amount);
		
	for (int month = 1; month <= totalTerms; month++) {
			amount =principal*Math.pow(1+rate, month);
			
			System.out.println(month + " " + amount);
			
			if (month == 12)
				System.out.println("Your Total amount with Interest is : " + amount);
		}
		
	}
}
