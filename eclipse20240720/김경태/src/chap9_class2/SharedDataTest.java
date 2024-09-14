package 김경태;

public class SharedDataTest {
	public static void main(String[] args) {
		A a = new A();
		a.updateData();
		B b = new B();
		b.readData();
	}
}

class SharedData{
	private static int sharedVariable;
	public final static int sharedConstant = 100;
	public static int getSharedVarible() {return sharedVariable;}
	public static void setSharedVariable(int s) {sharedVariable = s;}
}

class A{
	public void updateData() {
		System.out.println("상수: " + SharedData.sharedConstant);
		SharedData.setSharedVariable(5);
	}
}

class B{
	public void readData() {
		System.out.println("상수: " + SharedData.sharedConstant);
		System.out.println(SharedData.getSharedVarible());
	}
}
