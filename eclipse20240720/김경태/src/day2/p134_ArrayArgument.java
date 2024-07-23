package day2;

import java.util.Random;

public class p134_ArrayArgument {
	public static void main(String[] args) {
		int[] array = new int[10];
		Random ran = new Random();
		
		for(int i = 0; i < 10; i++) array[i] = (ran.nextInt()) % 10;
		
		//for(int i = 0; i < 10; i++) System.out.print(array[i] + " ");
		printArray(array);
		System.out.println("<<변경 전");
		
		increaseArray(array);
		
		//for(int i = 0; i < 10; i++) System.out.print(array[i] + " ");
		printArray(array);
		System.out.println("<<변경 후");
	}

	private static void printArray(int[] arr) {
		// TODO Auto-generated method stub
		for(int i = 0; i < 10; i++) System.out.print(arr[i] + " ");
	}
	
	private static void increaseArray(int[] arr) {
		for(int i=0;i<10;i++)arr[i]++;
	}
}
