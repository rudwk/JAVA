package day4;

import java.util.Scanner;

public class p161_SearchReplace_v2 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("문장 >>");
		StringBuilder statement = new StringBuilder(sc.nextLine());
		
		System.out.print("찾을 단어 >>");
		String sword = sc.next();
		System.out.print("바꿀 단어 >>");
		String rword = sc.next();
		
		int start = statement.indexOf(sword);
		int end = start + sword.length();
		statement.replace(start, end, rword);
		System.out.println(statement);
	}
}
