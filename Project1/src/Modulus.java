import java.util.Scanner;

public class Modulus {

	public static void main(String[] args) {
		
		
		int num=0;
		int reversenum = 0;
		
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter The Number: ");
		num = sc.nextInt();
		
		while(num != 0)
		{
			reversenum = reversenum * 10;
			reversenum = reversenum + num%10;
			num = num/10;
			
		}
		
		System.out.println("Reverse number of" + sc + " is :" +reversenum);
		

	}

}
