package day3;

public class p145_String_ProgramBasic {
	public static void main(String[] args) {
		String str1, str2, str3, str4, str5;
		char[] charArr = {'i',' ','l','o','v','e',' ','y','o','u'};
		str1 = "Hi ByeongMan";
		str2 = new String(str1);
		str3 = new String(charArr);
		str4 = new String(charArr, 2, 4);
		System.out.println(str1 + '/' + str2 + '/' + str3 + '/' + str4);
		
		char[] t = str1.toCharArray();
		for(char c : t) System.out.print(c);
		System.out.println();
		
		String str = "i lobe you";
		t = str.toCharArray();
		t[4] = 'v';
		str = new String(t);
		System.out.println(str);
		
		str1 = new String("i love you");
		str2 = str1;
		str3 = new String("i love you");
		boolean retVal;
		
		retVal = str1.equals(str2);
		System.out.print(retVal + " ");
		retVal = str1.equals(str3);
		System.out.print(retVal + " ");
		if(str1 == str2)System.out.println("true1");
		if(str1 == str3)System.out.println("true2");
		
		//str1 = new String("i love you");
		//str2 = str1;
		str3 = new String("i hate you!!");
		
		if(str1.compareTo(str2) == 0)System.out.print("Eual ");
		else System.out.print("not Eual ");
		
		if(str1.compareTo(str3) > 3)System.out.println("Greater ");
		else if(str1.compareTo(str3) < 0)System.out.println("less ");
		else System.out.println("Equal ");
	}
}
