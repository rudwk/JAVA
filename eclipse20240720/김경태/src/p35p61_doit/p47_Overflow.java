package p35p61_doit;

public class p47_Overflow {
	public static void main(String[] args) {
		int x= Integer.MAX_VALUE;
		int y = Integer.MIN_VALUE;
		
		System.out.println(x);
		System.out.println(y);
		
		int w = x + 1;
		int z = y - 1;
		
		System.out.println(w);
		System.out.println(z);
	}
}
