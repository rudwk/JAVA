package test;

import java.util.Scanner;

public class 회원가입_로그인_프로그램 {
	public static void main(String[] args) {
		String[] ids = new String[100];
		String[] pws = new String[100];
		int count = 0, chois;
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("welcom to service");
		while(true) {
			System.out.println("1. 회원가입, 2. 로그인, 3. 종료");
			System.out.print(">>");
			chois = sc.nextInt();
			
			switch(chois) {
			case 1 : SignUp(ids, pws, count); count++; break;
			case 2 : SignIn(ids, pws, count); break;
			case 3 : System.out.println("종료합니다."); return;
			}
		}
	}

	private static void SignUp(String[] ids, String[] pws, int count) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("아이디 입력");
		System.out.print(">>");
		ids[count] = sc.next();
		
		System.out.println("비밀번호 입력");
		System.out.print(">>");
		pws[count] = sc.next();
		
		System.out.println("회원가입 완료!");
		
	}
	
	private static void SignIn(String[] ids, String[] pws, int count) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String id, password;
		
		System.out.println("아이디 입력");
		System.out.print(">>");
		id = sc.next();
		
		System.out.println("비밀번호 입력");
		System.out.print(">>");
		password = sc.next();
		
		for(int i = 0; i <= count; i++) {
			if(ids[i].equals(id)) {
				if(pws[i].equals(password)) {
					System.out.println("로그인 성공!"); return;
				}
				else System.out.println("비밀번호 틀림"); return;
			}
			else System.out.println("아이디 틀림"); return;
		}
	}
}
