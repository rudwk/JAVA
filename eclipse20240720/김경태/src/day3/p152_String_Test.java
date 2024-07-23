package day3;

public class p152_String_Test {
	public static void main(String[] args) {
		String regExp = "01[078]-\\d{4}-\\d{4}";
		
		String str = new String("010-5182-0173");
		System.out.println(str.matches(regExp));
		
		str = new String("013-3300-2938");
		System.out.println(str.matches(regExp));
		
		str = new String("011-4685-2133");
		System.out.println(str.matches(regExp));
	}
}
