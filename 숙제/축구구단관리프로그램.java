package 김경태;

import java.util.Scanner;

public class 축구구단관리프로그램 {
	public static void main(String[] args) {
		축구구단관리프로그램 coccer = new 축구구단관리프로그램();
		coccer.start();
	}
	
	void start()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("1: 구단추가");
		System.out.println("2: 구단편집");
		System.out.println("3: 구단삭제");
		System.out.println("4: 구단보기");
		System.out.println("5: 종료");
		구단 club = new 구단();
		
		int chois = sc.nextInt();
		switch(chois) {
		case 1:
			club.addClub(sc.next());
			System.out.println("생성됨");
			
		case 2:
			club.showAllClubs();
			
		case 5:
			
		}
	}
}



class 구단{
	private String clubs[];
	private int size = 0;
	
	public void addClub(String name) {
		clubs[size++] = name;
	}
	
	public void showAllClubs() {
		if(size == 0) {System.out.println("구단 없음");}
		else for(String l : clubs) System.out.println(l);
	}
}

class 선수{
	
}
