package p35p61_doit;

public class p50_ShiftOperation {
	public static void main(String[] args) {
		int x = 128;
		int y = -128;
		
		System.out.println("x >> 2: " + Integer.toBinaryString(x) + " -> " + Integer.toBinaryString(x >> 2));
		System.out.println("y >> 2: " + Integer.toBinaryString(y) + " -> " + Integer.toBinaryString(y >> 2));
		
		System.out.println("x >>> 2: " + Integer.toBinaryString(x) + " -> " + Integer.toBinaryString(x >>> 2));
		System.out.println("y >>> 2: " + Integer.toBinaryString(y) + " -> " + Integer.toBinaryString(y >>> 2));
		
		System.out.println("x << 2: " + Integer.toBinaryString(x) + " -> " + Integer.toBinaryString(x << 2));
		System.out.println("y << 2: " + Integer.toBinaryString(y) + " -> " + Integer.toBinaryString(y << 2));
		
	}
}
