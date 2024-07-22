package day1;

import java.util.Scanner;

public class p45_SumNAvg {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("첫번째:");
		int s1 = sc.nextInt();
		System.out.print("두번째:");
		int s2 = sc.nextInt();
		System.out.print("세번째:");
		int s3 = sc.nextInt();
		
		int sum = s1 + s2 + s3;
		double avg = sum / 3.0;
		
		System.out.println("합: " + sum);
		System.out.println("평균: " + avg);
	}
}
