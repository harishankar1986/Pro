import java.util.Scanner;
class MultiClasses {
	public static void main(String args[]) {
		
		Scanner input = new Scanner(System.in);
		
		MultiMeth workOut = new MultiMeth();
		
		System.out.print("Please Enter Your Favorite Movie Name : ");
		
		String xMovie = input.nextLine();
		
		workOut.setMovie(xMovie);
		
		workOut.fResult();
	}

	
}
