package day3;

import java.util.Scanner;


public class p142_SeatReservation {
	public static void main(String[] args) {
		boolean[][] seats = new boolean[10][5];
		char menuChar;
		
		for(int r = 0; r < seats.length;r++) {
			for(int c = 0; c < seats[r].length;c++) {
				seats[r][c] = false;
			}
		}
		
		do {
			System.out.println("s : ���� ��Ȳ");
			System.out.println("r : ����");
			System.out.println("c : ���� ���");
			System.out.println("e : ����");
			
			System.out.print(">>");
			Scanner sc = new Scanner(System.in);
			
			menuChar = sc.next().charAt(0);
			
			switch(menuChar) {
			case 's' : showReservationStatus(seats); break;
			case 'r' : reserveSeat(seats); break;
			case 'c' : cancelReservation(seats); break;
			case 'e' : System.out.println("��"); return;
			}
		}while(true);
	}
	
	private static void cancelReservation(boolean[][] seats) {
		// TODO Auto-generated method stub
		System.out.println("����� �¼�");
		System.out.print(">>");
		
		Scanner sc = new Scanner(System.in);
		int row = sc.nextInt();
		int col = sc.nextInt();
		
		
		
		if(row >= 1 && row <= 10 && col >= 1 && col <= 5) {
			row--;
			col--;
			if(seats[row][col] == true) seats[row][col] = false;
			else System.out.println("���� ����");
		}
		else System.out.println("�Է� �߸���");
	}
	
	private static void reserveSeat(boolean[][] seats) {
		// TODO Auto-generated method stub
		System.out.println("���ϴ� �¼�");
		System.out.print(">>");
		
		Scanner sc = new Scanner(System.in);
		int row = sc.nextInt();
		int col = sc.nextInt();
		
		
		if(row >= 1 && row <= 10 && col >= 1 && col <= 5) {
			row--;
			col--;
			if(seats[row][col] != true) seats[row][col] = true;
			else System.out.println("����� �ڸ�");
		}
		else System.out.println("�Է� �߸���");
	}
	
	private static void showReservationStatus(boolean[][] seats) {
		// TODO Auto-generated method stub
		System.out.println("--���� ������ �ڸ�--");
		for(boolean[] r : seats) {
			for(boolean c : r) {
				if(c == true) System.out.print("x ");
				else System.out.print("o ");
			}
			System.out.println();
		}
	}
}
