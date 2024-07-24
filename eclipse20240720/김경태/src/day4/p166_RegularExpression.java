package day4;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class p166_RegularExpression {
	
	private static String getString(String s1, String s2) {
		// TODO Auto-generated method stub
		String input;
		Scanner sc = new Scanner(System.in);
		
		do{
			System.out.println(s1);
			input = sc.nextLine();
			Pattern p = Pattern.compile(s2);
			Matcher m = p.matcher(input);
			
			if(m.matches()) {
				return input;
			}else {
				System.out.println("���� Ʋ��");
				continue;
			}
		}while(true);
	}
	
	public static void main(String[] args) {
		String name = getString("vv�̸�vv", "^[��-�R]{2,4}$");
		String addres = getString("vv�ּ� vv", "^[��-�R]{2,4}��\\s+[��-�R]{2,4}��\\s+[��-�R]{2,6}��\\s+\\d{2,4}$");
		String postadd = getString("v�����ȣv", "^\\d{2,5}$");
		String phone = getString("v��ȭ��ȣv", "^01[10]-\\d{4}-\\d{4}$");
		
		/*
		Scanner sc = new Scanner(System.in);
		String input;
		Pattern p;
		Matcher m;
		
		System.out.print("�̸� >> ");
		input = sc.nextLine();
		p = Pattern.compile("^[��-�R]{2,4}$");
		m = p.matcher(input);
		if(!m.matches()) {
			System.out.println("���� Ʋ��");
			return;
		}
		
		System.out.print("�ּ� >> ");
		input = sc.nextLine();
		p = Pattern.compile("^[��-�R]{2,4}��\\s+[��-�R]{2,4}��\\s+[��-�R]{2,6}��\\s+\\d{2,4}$");
		m = p.matcher(input);
		if(!m.matches()) {
			System.out.println("�ּ� ���� �ȸ�����ư�׷�");
			return;
		}
		
		System.out.print("�����ȣ >> ");
		input = sc.next();
		p = Pattern.compile("^\\d{5}$"); 
		m = p.matcher(input);
		if(!m.matches()) {
			System.out.println("���� x");
			return;
		}
		
		System.out.print("��ȭ��ȣ >>");
		input = sc.next();
		p = Pattern.compile("^01[01]-\\d{4}-\\d{4}$");
		m = p.matcher(input);
		if(!m.matches()) {
			System.out.println("��ȣ�� ���Ŀ� ���� �ʽ��ϴ�.");
			return;
		}
		*/
		
		System.out.println();
		System.out.println("�̸�>>" + name);
		System.out.println("�ּ�>>" + addres);
		System.out.println("�����ȣ>>" + postadd);
		System.out.println("��ȭ��ȣ>>" + phone);
	}

}
