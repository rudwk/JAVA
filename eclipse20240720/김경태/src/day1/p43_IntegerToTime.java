package day1;

import java.util.Scanner;

public class p43_IntegerToTime {
	public static void main(String[] args) {
		System.out.print("숫자: ");
		Scanner sc = new Scanner (System.in);
		int i = sc.nextInt();
		sc.close();
		
		int hour = i / 3600;
		int remain = i % 3600;
		int minute = remain / 60;
		int second = remain % 60;
		
		System.out.println(hour + "시간 " + minute + "분 " + second + "초 ");
	}
}
