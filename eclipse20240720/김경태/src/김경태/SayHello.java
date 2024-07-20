package ±è°æÅÂ;

import java.util.Scanner;

public class SayHello {
	public static void main(String args[]) {
//		TODO Auto-generated method stub;
		System.out.println("ÀÌ¸§ÀÔ·Â");
		Scanner sc = new Scanner (System.in);
		String name = sc.next();
		sc.close();
		String helloMessage = "¾È³çÇÏ¼¼¿ä" + name + "´Ô";
		System.out.println(helloMessage);
	}
}
