package test;

import java.util.Scanner;

public class ȸ������_�α���_���α׷� {
	public static void main(String[] args) {
		String[] ids = new String[100];
		String[] pws = new String[100];
		int count = 0, chois;
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("welcom to service");
		while(true) {
			System.out.println("1. ȸ������, 2. �α���, 3. ����");
			System.out.print(">>");
			chois = sc.nextInt();
			
			switch(chois) {
			case 1 : SignUp(ids, pws, count); count++; break;
			case 2 : SignIn(ids, pws, count); break;
			case 3 : System.out.println("�����մϴ�."); return;
			}
		}
	}

	private static void SignUp(String[] ids, String[] pws, int count) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("���̵� �Է�");
		System.out.print(">>");
		ids[count] = sc.next();
		
		System.out.println("��й�ȣ �Է�");
		System.out.print(">>");
		pws[count] = sc.next();
		
		System.out.println("ȸ������ �Ϸ�!");
		
	}
	
	private static void SignIn(String[] ids, String[] pws, int count) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String id, password;
		
		System.out.println("���̵� �Է�");
		System.out.print(">>");
		id = sc.next();
		
		System.out.println("��й�ȣ �Է�");
		System.out.print(">>");
		password = sc.next();
		
		for(int i = 0; i <= count; i++) {
			if(ids[i].equals(id)) {
				if(pws[i].equals(password)) {
					System.out.println("�α��� ����!"); return;
				}
				else System.out.println("��й�ȣ Ʋ��"); return;
			}
			else System.out.println("���̵� Ʋ��"); return;
		}
	}
}
