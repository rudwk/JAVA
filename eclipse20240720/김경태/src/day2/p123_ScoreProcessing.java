package day2;

import java.util.Arrays;
import java.util.Scanner;

public class p123_ScoreProcessing {
	public static void main(String[] args) {
		int val, cnt = 0, sum = 0;
		int []array = new int[100];
		Scanner sc = new Scanner(System.in);
		
		System.out.print("0 ~ 100 >>");
		val = sc.nextInt();
		while(val >=0 && val <= 100) {
			array[cnt] = val;
			cnt++;
			System.out.print("0 ~ 100 >>");
			val = sc.nextInt();
		}
		
		for(int i = 0; i < cnt;i++) {
			System.out.print(array[i] + " ");
		}
		System.out.println("<<정렬 전");
		
		Arrays.sort(array, 0, cnt);
		
		
		for(int i = 0; i < cnt; i++) {
			System.out.print(array[i] + " ");
		}
		System.out.println("<<정렬 후");
	}
}
