package day2;

import java.util.Scanner;

public class p126_StringSort {
	public static void main(String[] args) {
		final int cnt = 5;
		String []arr = new String[cnt];
		
		Scanner sc = new Scanner(System.in);
		for(int i = 0; i < cnt; i++) {
			System.out.print("이름 >>");
			arr[i] = sc.next();
		}
		
		for(String s : arr) {
			System.out.print(s + " ");
		}
		System.out.println("<< 정렬 전");
		
		String temp;
		int leastIndex;
		for(int i = 0; i < cnt-1;i++) {
			leastIndex = i;
			
			for(int j = i+1;j < cnt; j++) {
				if(arr[j].compareTo(arr[leastIndex]) < 0) leastIndex = j;
			}
			temp = arr[i];
			arr[i] = arr[leastIndex];
			arr[leastIndex] = temp;
		}
		
		for(String s : arr) {
			System.out.print(s + " ");
		}
		System.out.println("<< 정렬 후");
		
		sc.close();
	}
}
