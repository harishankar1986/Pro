import java.util.Scanner;
public class SAvg {
	public static void main(String args[]) {
		int income, avgIncome, total = 0, x = 0;
		
		
		
		Scanner input = new Scanner(System.in);
		
		while (x < 10) {
			x++;
			System.out.print("Enter your Income of Day " + x + " : ");
			income = input.nextInt();
			total = total + income;
		}
		avgIncome = total / 10;
		
		System.out.println("Your total Income is : " + total);
		
		System.out.print("Your Average Income per Day is : " + avgIncome);
	}
}
