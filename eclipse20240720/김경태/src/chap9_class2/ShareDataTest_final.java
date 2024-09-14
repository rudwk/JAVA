package 김경태;

import java.util.Random;

public class ShareDataTest_final {
	public static void main(String[] args) {
		Consumer c = new Consumer();
		Producer p = new Producer();
		
		for(int i = 0; i < 3; i++) {
			p.produce();
			c.consume();
		}
	}
}

class ShareData{
	private static int count = 0;
	public final static int MaxSize = 100;
	private static int[] buff = new int[MaxSize];
	
	public static int getVal() {
		if(count != 0) return buff[--count];
		else return -1;
	}
	public static int setVal(int s) {
		if(count != MaxSize) {
			buff[count++] = s;
			return count;
		}else return -1;
	}
}

class Producer{
	private Random random = new Random();
	public void produce() {
		int loop = random.nextInt(4) + 2;
		int res, val;
		for(int i = 0; i < loop; i++) {
			val = random.nextInt(101);
			res = ShareData.setVal(val);
			if(res < 0) System.out.println("full buffer");
			else System.out.println("write: " + val);
		}
	}
}

class Consumer{
	private Random rand = new Random();
	public void consume() {
		int loop = rand.nextInt(4) + 2;
		int res;
		for(int i = 0; i < loop; i++) {
			res = ShareData.getVal();
			if(res < 0) System.out.println("데이터 x");
			else System.out.println("read: " + res);
		}
	}
}