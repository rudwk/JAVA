package day4;

import java.util.Scanner;

public class p155_SearchReplace {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("���� �Է� >>");
		String statement = sc.nextLine();
		System.out.print("ã�� �ܾ� >>");
		String sword = sc.nextLine();
		System.out.print("�ٲ� �ܾ� >>");
		String rword = sc.nextLine();
		
		statement = statement.replaceFirst(sword, rword);
		System.out.println(statement);
	}
}
