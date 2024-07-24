package day4;

import java.util.Scanner;

public class p155_SearchReplace {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("문장 입력 >>");
		String statement = sc.nextLine();
		System.out.print("찾을 단어 >>");
		String sword = sc.nextLine();
		System.out.print("바꿀 단어 >>");
		String rword = sc.nextLine();
		
		statement = statement.replaceFirst(sword, rword);
		System.out.println(statement);
	}
}
