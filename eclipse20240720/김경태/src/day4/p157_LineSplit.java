package day4;

import java.util.Scanner;

public class p157_LineSplit {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("���� ���� �ӽñ� ����� >>");
		String statement = sc.nextLine();
		
		String []split = null;
		split = statement.split(" ");
		int sum = 0;
		for(String s : split) {
			sum += Integer.parseInt(s);
		}
		System.out.println(sum);
	}
}
