package day1;

import java.util.Scanner;

public class p60_ConditionOperation {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.print("첫 숫자: ");
		int s1 = sc.nextInt();
		System.out.print("다음숫자: ");
		int s2 = sc.nextInt();
		sc.close();
		
		s1 = s1 > 0 ? s1 : -s1;
		s2 = s2 > 0 ? s2 : -s2;
		
		//암튼 절대값 나옴
	}
}
