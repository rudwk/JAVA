package chap9_class2;

import java.util.Random;
import java.util.Scanner;


public class p231_CppToJava {
	public static void main(String[] args) {
		DiceGame game = new DiceGame();
		User user;
		Scanner sc = new Scanner(System.in);
		System.out.print("기본 자금 >>");
		game.setMony(sc.nextInt());
		
		for(int i = 0; i < 5; i++) {
			game.StartPlaying();
		}
		System.out.println("현재 자금 >>");
	}
}

class DiceGame{
	//private int diceFace, userGuess;
	Random rand = new Random();
	Scanner sc = new Scanner(System.in);
	private int mony, chip;
	
	public int getMony() {return mony;}

	public void setMony(int mony) {
		this.mony = mony;
	}

	public int getChip() {
		return chip;
	}

	public void setChip(int chip) {
		this.chip = chip;
	}

	private int RollDice() {
		int dice = rand.nextInt(6) + 1;
		return dice;
	}
	
	private int getUserInput(String pp) {
		System.out.print(pp);
		int user = sc.nextInt();
		return user;
	}
	private boolean checkUserGuess(int dice, int user) {
		
		if(dice == user) {
			System.out.println("맞");
			return true;
		}else {
			System.out.println("틀");
			return false;
		}
	}
	public void StartPlaying() {
		
		
		int dice = RollDice();
		int user = getUserInput("예상값>>");
		checkUserGuess(dice, user);
		System.out.println("남은돈: ");
	}
}

class User{
	private int mony;

	public int getMony() {
		return mony;
	}

	public void setMony(int mony) {
		this.mony = mony;
	}
	
}