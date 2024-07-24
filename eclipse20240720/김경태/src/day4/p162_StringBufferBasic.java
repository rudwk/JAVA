package day4;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class p162_StringBufferBasic {
	public static void main(String[] args) {
		
		StringBuffer sBuffer = new StringBuffer(" test");
		sBuffer.append(" StringBuffer");
		System.out.println(sBuffer);
		
		System.out.println();
		
		String input = "나보기가 역겨워 가실때에는 말없이 고이 보내드리오리다";
		Pattern p = Pattern.compile("(역겨워|말없이|보내드리오리다)");
		Matcher m = p.matcher(input);
		while(m.find()) {
			System.out.println(m.start() + "에서부터" + (m.end() - 1) + "까지" + m.group() + "발견");
		}
	}
}
