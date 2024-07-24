package day4;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class p162_StringBufferBasic {
	public static void main(String[] args) {
		
		StringBuffer sBuffer = new StringBuffer(" test");
		sBuffer.append(" StringBuffer");
		System.out.println(sBuffer);
		
		System.out.println();
		
		String input = "�����Ⱑ ���ܿ� ���Ƕ����� ������ ���� �����帮������";
		Pattern p = Pattern.compile("(���ܿ�|������|�����帮������)");
		Matcher m = p.matcher(input);
		while(m.find()) {
			System.out.println(m.start() + "��������" + (m.end() - 1) + "����" + m.group() + "�߰�");
		}
	}
}
