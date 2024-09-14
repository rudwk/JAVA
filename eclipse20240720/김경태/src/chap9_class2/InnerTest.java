package ±è°æÅÂ;

class Outer{
	int num = 10;

	void display_Inner() {
		class Inner{
			private int x = 5;
			public void print() {
				System.out.println("an inner class: " + num);
			}
		}
		
		Inner inner = new Inner();
		System.out.println(inner.x);
		inner.print();
	}
}

public class InnerTest {
	public static void main(String[] args) {
		Outer outer = new Outer();
		outer.display_Inner();
	}
}