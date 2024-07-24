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
				System.out.println("Çü½Ä Æ²¸²");
				continue;
			}
		}while(true);
	}
	
	public static void main(String[] args) {
		String name = getString("vvÀÌ¸§vv", "^[°¡-ÆR]{2,4}$");
		String addres = getString("vvÁÖ¼Ò vv", "^[°¡-ÆR]{2,4}µµ\\s+[°¡-ÆR]{2,4}½Ã\\s+[°¡-ÆR]{2,6}±æ\\s+\\d{2,4}$");
		String postadd = getString("v¿ìÆí¹øÈ£v", "^\\d{2,5}$");
		String phone = getString("vÀüÈ­¹øÈ£v", "^01[10]-\\d{4}-\\d{4}$");
		
		/*
		Scanner sc = new Scanner(System.in);
		String input;
		Pattern p;
		Matcher m;
		
		System.out.print("ÀÌ¸§ >> ");
		input = sc.nextLine();
		p = Pattern.compile("^[°¡-ÆR]{2,4}$");
		m = p.matcher(input);
		if(!m.matches()) {
			System.out.println("Çü½Ä Æ²¸²");
			return;
		}
		
		System.out.print("ÁÖ¼Ò >> ");
		input = sc.nextLine();
		p = Pattern.compile("^[°¡-ÆR]{2,4}µµ\\s+[°¡-ÆR]{2,4}½Ã\\s+[°¡-ÆR]{2,6}·Î\\s+\\d{2,4}$");
		m = p.matcher(input);
		if(!m.matches()) {
			System.out.println("ÁÖ¼Ò Çü½Ä ¾È¸ÂÀ½¾ÏÆ°±×·³");
			return;
		}
		
		System.out.print("¿ìÆí¹øÈ£ >> ");
		input = sc.next();
		p = Pattern.compile("^\\d{5}$"); 
		m = p.matcher(input);
		if(!m.matches()) {
			System.out.println("Çü½Ä x");
			return;
		}
		
		System.out.print("ÀüÈ­¹øÈ£ >>");
		input = sc.next();
		p = Pattern.compile("^01[01]-\\d{4}-\\d{4}$");
		m = p.matcher(input);
		if(!m.matches()) {
			System.out.println("¹øÈ£°¡ Çü½Ä¿¡ ¸ÂÁö ¾Ê½À´Ï´Ù.");
			return;
		}
		*/
		
		System.out.println();
		System.out.println("ÀÌ¸§>>" + name);
		System.out.println("ÁÖ¼Ò>>" + addres);
		System.out.println("¿ìÆí¹øÈ£>>" + postadd);
		System.out.println("ÀüÈ­¹øÈ£>>" + phone);
	}

}
