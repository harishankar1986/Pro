
public class MainClass {

	public static void main(String[] args) {
		
		Out obj1 = new Out();
		obj1.m1();
		
		//Outer.Inner obj2 = obj1.new Inner();
		
		Out.Inner obj2 = new Out().new Inner();
		obj2.m2();
	}
}


class Out {
	
	class Inner {
		void m2() {
			System.out.println("Inner class method");
		}
	}
	void m1() {
		System.out.println("Outer class method");
	}
}