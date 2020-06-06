
public class MainClass1 {

	public static void main(String[] args) {
		Outer obj = new Outer();
		obj.m1();
	}
}

class Outer {
	void m1() {
		class Inner {
			void m2(){
				System.out.println("inner class method");
			}
		}
		
		Inner obj1 = new Inner();
		obj1.m2();		
	}
}			