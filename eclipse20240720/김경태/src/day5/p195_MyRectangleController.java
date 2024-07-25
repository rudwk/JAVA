package day5;

import java.util.Scanner;

public class p195_MyRectangleController {
	public static void main(String[] args) {
		p195_MyRectangleService r1 = new p195_MyRectangleService();
		int width, height;
		Scanner sc = new Scanner(System.in);
		
		width = sc.nextInt();
		r1.setWidth(width);
		height = sc.nextInt();
		r1.setHeight(height);
		System.out.println("¸éÀû>>" + r1.getArea());
	}
}
