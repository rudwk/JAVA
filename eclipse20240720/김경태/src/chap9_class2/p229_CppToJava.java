package chap9_class2;

public class p229_CppToJava {
	public static void main(String[] args) {
		Car car = new Car();
		
		car.setSpeed(80);
		car.honk();
		System.out.println("현재 속도는 " + car.getSpeed());
	}
}

class Car{
	private int speed;
	public int getSpeed() {return speed;}
	public void setSpeed(int speed) {this.speed = speed;}
	public void honk() {System.out.println("breadbread");}
}