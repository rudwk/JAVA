package day3;

public class p150_String_ProgramBasic {
	public static void main(String[] args) {
		String regExp = " |,|:|\\.";
		String words = "one two,three:four.five";
		String newWord = words.replaceAll(regExp, "-");
		System.out.println(newWord);
		
		String delimStr = " ";
		words = "minus one   tow,three:four.five";
		
		String[] split = null;
		split = words.split(delimStr);
		for(String s : split)System.out.print(s + " / ");
	}
}
