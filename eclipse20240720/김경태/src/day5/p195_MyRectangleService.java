package day5;

public class p195_MyRectangleService {
	private int x, y;
	private int width, height;
	
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
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
	
	public int getArea() {return width * height;}
}
