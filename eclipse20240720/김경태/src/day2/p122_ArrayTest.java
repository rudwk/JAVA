package day2;

import java.util.Arrays;
import java.util.Collections;

public class p122_ArrayTest {
	public static void main(String[] args) {
		int[] array = {1, 5, 3, 2, 4};
		
		for(int e : array) {
			System.out.print(e);
		}
		System.out.println("<<정렬 전");
		
		Arrays.sort(array);
		
		for(int e : array) {
			System.out.print(e);
		}
		System.out.println("<<정렬 후");
		
		
		int[] a = new int[] {4,2,3,1,5};
		
		Arrays.sort(a);
		for(int i = 0; i < a.length/2; i++) {
			int temp = a[i];
			a[i] = a[a.length - (i+1)];
			a[a.length - (i+1)] = temp;
		}
		for(int e : a) {
			System.out.print(e);
		}
		System.out.println("<<역 정렬");
		
		
		String[] b = {"aa", "ff", "dd", "bb"};
		Arrays.sort(b, Collections.reverseOrder());
		for(String e : b) {
			System.out.print(e);
		}
		System.out.println("<<문자열 역정렬");
	}
}
