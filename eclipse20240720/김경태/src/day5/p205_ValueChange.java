package day5;

import java.util.Scanner;

public class p205_ValueChange {
	public static void main(String[] args) {
		int x, y;
		Scanner sc = new Scanner(System.in);
		
		x = sc.nextInt();
		y = sc.nextInt();
		
		swap(x, y);
		System.out.println();
	}
	
	public static void swap(int x, int y) {
		int temp;
		temp = x;
		x = y;
		y = temp;
	}
	
	public static void swapByMyIntager(MyIntager x, MyIntager y) {
		
	}
}

class MyIntager {
	private int x;

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}
}