package day5;

public class p184_StaticMethod {
	public static void main(String[] args) {
		StaticTest.setValue(3);
		System.out.println(StaticTest.getValue());
		
		StaticTest ob1 = new StaticTest();
		StaticTest ob2 = new StaticTest();
		
		ob1.setInstVal(5);
		System.out.println("ob1 >>" + ob1.getInstVal());
		ob2.setInstVal(10);
		System.out.println("ob2 >>" + ob2.getInstVal());
		System.out.println();
		System.out.println("ob1 >>" + ob1.getValue());
		System.out.println("ob2 >>" + ob2.getValue());
	}
}

class StaticTest{
	static int value;
	int instVal;
	static void setValue(int n) {value = n;}
	static int getValue() {return value;}
	void setInstVal(int n) {instVal = n;}
	int getInstVal() {return instVal;}
}