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
				System.out.println("형식 틀림");
				continue;
			}
		}while(true);
	}
	
	public static void main(String[] args) {
		String name = getString("vv이름vv", "^[가-힣]{2,4}$");
		String addres = getString("vv주소 vv", "^[가-힣]{2,4}도\\s+[가-힣]{2,4}시\\s+[가-힣]{2,6}길\\s+\\d{2,4}$");
		String postadd = getString("v우편번호v", "^\\d{2,5}$");
		String phone = getString("v전화번호v", "^01[10]-\\d{4}-\\d{4}$");
		
		/*
		Scanner sc = new Scanner(System.in);
		String input;
		Pattern p;
		Matcher m;
		
		System.out.print("이름 >> ");
		input = sc.nextLine();
		p = Pattern.compile("^[가-힣]{2,4}$");
		m = p.matcher(input);
		if(!m.matches()) {
			System.out.println("형식 틀림");
			return;
		}
		
		System.out.print("주소 >> ");
		input = sc.nextLine();
		p = Pattern.compile("^[가-힣]{2,4}도\\s+[가-힣]{2,4}시\\s+[가-힣]{2,6}로\\s+\\d{2,4}$");
		m = p.matcher(input);
		if(!m.matches()) {
			System.out.println("주소 형식 안맞음암튼그럼");
			return;
		}
		
		System.out.print("우편번호 >> ");
		input = sc.next();
		p = Pattern.compile("^\\d{5}$"); 
		m = p.matcher(input);
		if(!m.matches()) {
			System.out.println("형식 x");
			return;
		}
		
		System.out.print("전화번호 >>");
		input = sc.next();
		p = Pattern.compile("^01[01]-\\d{4}-\\d{4}$");
		m = p.matcher(input);
		if(!m.matches()) {
			System.out.println("번호가 형식에 맞지 않습니다.");
			return;
		}
		*/
		
		System.out.println();
		System.out.println("이름>>" + name);
		System.out.println("주소>>" + addres);
		System.out.println("우편번호>>" + postadd);
		System.out.println("전화번호>>" + phone);
	}

}
