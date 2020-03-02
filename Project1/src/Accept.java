import java.io.*;
public class Accept {
	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print("Enter an Int value : ");
		double d = Double.parseDouble(br.readLine());
		
	//float n = Float.parseFloat(br.readLine());
	//int num = Integer.parseInt(br.readLine());
	//String name = br.readLine();
	//char ch = (char)br.read();
		
		System.out.print("You Entered : " + d);
	}
}
