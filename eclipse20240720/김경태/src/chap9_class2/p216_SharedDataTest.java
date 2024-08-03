package chap9_class2;

import java.util.Random;

public class p216_SharedDataTest {
	public static void main(String[] args) {
		Consumer c = new Consumer();  //1
		Producer p = new Producer();  //2
		for(int i = 0; i < 3; i++) {  //3 25
			p.produce();  //4
			c.consume(); //15
		}
	}
}

class p216_SharedData {
	private static int count = 0; 
	public final static int maxSize = 100;
	private static int[] buffer = new int[maxSize];
	
	public static int getVal() {
		if(count != 0)   //19
			return buffer[--count];  //20
		else //20
			return -1;  //21
	}
	
	public static int setVal(int s) {
		if(count != maxSize) { //8
			buffer[count++] = s;  //9
			return count;  //10
		}
		else { //9
			return -1; //10
		}
	}
}

class Producer{
	private Random generator = new Random();
	public void produce() {
		int loop = generator.nextInt(4) + 2;  //4
		int res, val; //5
		for(int i = 0; i < loop;i++) {  //6 14
			val = generator.nextInt(101);  //6
			res = p216_SharedData.setVal(val);  //7
			if(res < 0)  //11
				System.out.println("꽉참 ㅅㄱ"); //12 
			else   //12
				System.out.println("write: " + val); //13 
		}
	}
}

class Consumer {
	private Random generator = new Random();
	public void consume() {
		int loop = generator.nextInt(4) + 2; //16
		int res; //17
		for(int i = 0; i < loop; i++) { //24
			res = p216_SharedData.getVal(); //18
			if(res < 0) //21
				System.out.println("데이터 없음 ㅅㄱ"); //22
			else  //22
				System.out.println("read: " + res); //23
		}
	}
}