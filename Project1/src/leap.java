import java.io.*;
public class leap {
	public static void main(String args[]) throws IOException{
		BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
		
		System.out.print("Enter year No. : ");
		int year = Integer.parseInt(br.readLine());
		
		if(year % 100 == 0 && year % 400 == 0 ) {
			System.out.println("It is a Leap");
		} else if (year % 100 !=0 && year % 4 == 0){
			System.out.println("It is a Leap");
		}else
			System.out.println("It is not a Leap");
			
			
	}
}
