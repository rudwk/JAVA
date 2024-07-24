package day4;

public class p158_StringBuilderBasic {
	public static void main(String[] args) {
		
		StringBuilder str1 = new StringBuilder("hellowold");
		System.out.println("old : " + str1.capacity());
		str1.ensureCapacity(28);
		System.out.println("new : " + str1.capacity());
		str1.ensureCapacity(33);
		System.out.println("new : " + str1.capacity());
		
		StringBuilder str2 = new StringBuilder();
		System.out.println("old : " + str2.capacity());
		str2.ensureCapacity(40);
		System.out.println("new : " + str2.capacity());
		
		System.out.println();
		
		StringBuilder sb = new StringBuilder();
		sb.append("hello");
		sb.append(123);
		sb.append(33.333);
		System.out.println(sb);
		sb.delete(4, 7);
		sb.replace(2, 7, "love");
		System.out.println(sb);
	}
}
