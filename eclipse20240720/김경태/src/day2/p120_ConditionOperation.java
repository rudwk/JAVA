package day2;

import java.util.Scanner;

public class p120_ConditionOperation {
	public static void main(String[] args) {
		int val, cnt = 0, sum = 0;
		int []array = new int[100];
		Scanner sc= new Scanner(System.in);
		
		System.out.print("0 ~ 100 >>");
		val = sc.nextInt();
		while(val >= 0 && val <= 100) {
			array[cnt] = val;
			cnt++;
			System.out.print("0 ~ 100 >>");
			val = sc.nextInt();
		}
		
		int min = array[0];
		int max = array[0];
		sum = array[0];
		for(int i = 1; i < cnt; i++) {
			sum += array[i];
			if(array[i] > max)max = array[i];
			if(array[i] < min)min = array[i];
		}
		
		
		
		if(cnt != 0)System.out.println("avg: " + (double)sum/cnt);
		System.out.println("max: " + max);
		System.out.println("min: " + min);
		
		sc.close();
	}
}
