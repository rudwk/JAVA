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
			System.out.println("s : 예약 현황");
			System.out.println("r : 예약");
			System.out.println("c : 예약 취소");
			System.out.println("e : 종료");
			
			System.out.print(">>");
			Scanner sc = new Scanner(System.in);
			
			menuChar = sc.next().charAt(0);
			
			switch(menuChar) {
			case 's' : showReservationStatus(seats); break;
			case 'r' : reserveSeat(seats); break;
			case 'c' : cancelReservation(seats); break;
			case 'e' : System.out.println("끝"); return;
			}
		}while(true);
	}
	
	private static void cancelReservation(boolean[][] seats) {
		// TODO Auto-generated method stub
		System.out.println("취소할 좌석");
		System.out.print(">>");
		
		Scanner sc = new Scanner(System.in);
		int row = sc.nextInt();
		int col = sc.nextInt();
		
		
		
		if(row >= 1 && row <= 10 && col >= 1 && col <= 5) {
			row--;
			col--;
			if(seats[row][col] == true) seats[row][col] = false;
			else System.out.println("예약 없음");
		}
		else System.out.println("입력 잘못됨");
	}
	
	private static void reserveSeat(boolean[][] seats) {
		// TODO Auto-generated method stub
		System.out.println("원하는 좌석");
		System.out.print(">>");
		
		Scanner sc = new Scanner(System.in);
		int row = sc.nextInt();
		int col = sc.nextInt();
		
		
		if(row >= 1 && row <= 10 && col >= 1 && col <= 5) {
			row--;
			col--;
			if(seats[row][col] != true) seats[row][col] = true;
			else System.out.println("예약된 자리");
		}
		else System.out.println("입력 잘못됨");
	}
	
	private static void showReservationStatus(boolean[][] seats) {
		// TODO Auto-generated method stub
		System.out.println("--예약 가능한 자리--");
		for(boolean[] r : seats) {
			for(boolean c : r) {
				if(c == true) System.out.print("x ");
				else System.out.print("o ");
			}
			System.out.println();
		}
	}
}
