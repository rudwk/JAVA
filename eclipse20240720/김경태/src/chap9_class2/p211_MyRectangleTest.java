package chap9_class2;

public class p211_MyRectangleTest {
	public static void main(String[] args) {
		MyRectangle r = new MyRectangle();
		r.setX(10);
		r.setY(10);
		r.setWidth(5);
		r.setHeight(4);
		
		System.out.println("¸éÀû >>" + r.getArea());
		
		MyPoint p = new MyPoint();
		p.setX(3);
		p.setY(5);
		System.out.println(p.getX() + " " + p.getY());
	}
}

class MyRectangle {
	private MyPoint corner = new MyPoint();
	private int width, height;
	
	public int getX() {
		return corner.getX();
	}
	public void setX(int x) {
		corner.setX(x);
	}
	public int getY() {
		return corner.getY();
	}
	public void setY(int y) {
		corner.setY(y);
	}
	public int getWidth() {
		return width;
	}
	public void setWidth(int width) {
		this.width = width;
	}
	public int getHeight() {
		return height;
	}
	public void setHeight(int height) {
		this.height = height;
	}
	
	public void resize(int width, int height) {
		this.width = width;
		this.height = height;
	}
	public int getArea() {
		return width * height;
	}
}

class MyPoint{
	private int x, y;
	public int getX() {return x;}
	public int getY() {return y;}
	public void setX(int x) {this.x = x;}
	public void setY(int y) {this.y = y;}
}