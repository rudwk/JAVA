package day1;

import java.util.Scanner;

public class SayHello {
	public static void main(String args[]) {
//		TODO Auto-generated method stub;
		System.out.println("이름입력");
		Scanner sc = new Scanner (System.in);
		String name = sc.next();
		sc.close();
		String helloMessage = "안녕하세요" + name + "님";
		System.out.println(helloMessage);
	}
}
