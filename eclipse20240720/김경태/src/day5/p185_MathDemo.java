package day5;

import java.util.Scanner;

public class p185_MathDemo {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("반지름 >>");
		double r = sc.nextDouble();
		System.out.println("둘레 >> " + p185_MyMath.getCirclePerimeter(r));
		System.out.println("넓이 >>" + p185_MyMath.getCircleArea(r));
		
		System.out.print("마일 >>");
		double m = sc.nextDouble();
		System.out.println(p185_MyMath.mileToKilometer(m) + "km");
	}
}
