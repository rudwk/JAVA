package �����;

import java.util.Scanner;

public class �౸���ܰ������α׷� {
	public static void main(String[] args) {
		�౸���ܰ������α׷� coccer = new �౸���ܰ������α׷�();
		coccer.start();
	}
	
	void start()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("1: �����߰�");
		System.out.println("2: ��������");
		System.out.println("3: ���ܻ���");
		System.out.println("4: ���ܺ���");
		System.out.println("5: ����");
		���� club = new ����();
		
		int chois = sc.nextInt();
		switch(chois) {
		case 1:
			club.addClub(sc.next());
			System.out.println("������");
			
		case 2:
			club.showAllClubs();
			
		case 5:
			
		}
	}
}



class ����{
	private String clubs[];
	private int size = 0;
	
	public void addClub(String name) {
		clubs[size++] = name;
	}
	
	public void showAllClubs() {
		if(size == 0) {System.out.println("���� ����");}
		else for(String l : clubs) System.out.println(l);
	}
}

class ����{
	
}
