package day1;

import java.util.Scanner;

public class p45_SumNAvg {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("ù��°:");
		int s1 = sc.nextInt();
		System.out.print("�ι�°:");
		int s2 = sc.nextInt();
		System.out.print("����°:");
		int s3 = sc.nextInt();
		
		int sum = s1 + s2 + s3;
		double avg = sum / 3.0;
		
		System.out.println("��: " + sum);
		System.out.println("���: " + avg);
	}
}
