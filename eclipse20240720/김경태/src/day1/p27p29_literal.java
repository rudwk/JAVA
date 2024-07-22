package day1;

public class p27p29_literal {
	public static void main(String args[]) {
		int m = 15;
		System.out.println(m);
		m = 015;
		System.out.println(m);
		m = 0x15;
		System.out.println(m);
		
		System.out.println("----");
		
//		float f = 12.3;
		float f = 12.3f;
		System.out.println(f);
		double d = 12.3;
		System.out.println(d);
		
		System.out.println("-------");
		
		char c = '\u0042';
		System.out.println(c);
		c = '\uae00';
		System.out.println(c);
		
		System.out.println("-----");
		
		boolean b = true;
		System.out.println(b);
		
		System.out.println("-----");
		
		String str = null;
		System.out.println(str);
		str = "i asdfasdf";
		System.out.println(str);
		
		System.out.println("-----");
		
		final double pi = 3.141592;
		System.out.println(pi);
//		pi = 3.14;
	}
}
