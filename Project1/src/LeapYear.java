import java.util.Scanner;

public class LeapYear {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter The Year: ");
		int year = sc.nextInt();
		
		if(year%100 == 0 && year%400 == 0) {
			System.out.println(year + " is a Leap Year");
		}
		else if (year%100 != 0 && year%4 ==0)
			System.out.println(year + " is a leap year.");
		else
			System.out.println(year + " is not a leap Year");

	}

}
