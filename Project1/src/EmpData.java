import java.io.*;
public class EmpData {
	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
		
		System.out.print("Enter ID : ");
		int id = Integer.parseInt(br.readLine());
		
		System.out.print("Enter Sex (M/F): ");
		char sex = br.readLine().charAt(0);
		//char sex = (char)br.read();
	
		
		System.out.print("Enter Name : ");
		String name = br.readLine();
		
		br.skip(1);
		
		System.out.println("ID = " + id);
		System.out.println("Sex = " + sex);
		System.out.println("Name = " + name);
	}
}
