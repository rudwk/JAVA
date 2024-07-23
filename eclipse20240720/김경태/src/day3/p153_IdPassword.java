package day3;

import java.util.Scanner;

public class p153_IdPassword {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("id >>");
		String id = sc.next();
		System.out.println("password >>");
		String password = sc.next();
		
		id = id.trim();
		password = password.toLowerCase();
		
		if(id.equals("bmkim")) {
			if(password.equals("koala")) {
				System.out.println("welcom");
			}else System.out.println("password is worng");
		}else System.out.println("id is worng");
	}
}
