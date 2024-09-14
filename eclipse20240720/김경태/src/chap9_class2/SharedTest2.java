package 김경태;

public class SharedTest2 {
	private int sharedVariable;
	public final int sharedConstant = 100;
	
	public static void main(String[] args) {
		SharedTest2 app = new SharedTest2();
		SharedTest2.A a = app.new A();
		a.updateData();
		SharedTest2.B b = app.new B();
		b.readData();
	}
	
	class A{
		public void updateData() {
			System.out.println("상수: " + sharedConstant);
			sharedVariable = 5;
		}
	}
	
	class B{
		public void readData() {
			System.out.println("상수:" + sharedConstant);
			System.out.println(sharedVariable);
		}
	}
}
