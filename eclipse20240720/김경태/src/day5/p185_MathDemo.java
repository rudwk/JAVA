package day5;

import java.util.Scanner;

public class p185_MathDemo {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("������ >>");
		double r = sc.nextDouble();
		System.out.println("�ѷ� >> " + p185_MyMath.getCirclePerimeter(r));
		System.out.println("���� >>" + p185_MyMath.getCircleArea(r));
		
		System.out.print("���� >>");
		double m = sc.nextDouble();
		System.out.println(p185_MyMath.mileToKilometer(m) + "km");
	}
}
