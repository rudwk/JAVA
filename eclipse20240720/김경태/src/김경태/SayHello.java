package �����;

import java.util.Scanner;

public class SayHello {
	public static void main(String args[]) {
//		TODO Auto-generated method stub;
		System.out.println("�̸��Է�");
		Scanner sc = new Scanner (System.in);
		String name = sc.next();
		sc.close();
		String helloMessage = "�ȳ��ϼ���" + name + "��";
		System.out.println(helloMessage);
	}
}
