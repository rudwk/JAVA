package ±è°æÅÂ;

public class MyRectangleTest {
	public static void main(String[] args) {
		
	}
}

class MyRectangle{
	private MyPoint corner = new MyPoint();
	private int width, height;
	
	public int getX() {return corner.x;}
	public void setX(int x) {corner.x = x;}
	public int getY() {return corner.y;}
	public void setY(int y) {corner.y = y;} 
	public int getWidth() {return width;}
	public void setWidth(int width) {this.width = width;}
	public int getHeight() {return height;}
	public void setHeight(int height) {this.height = height;}
	public void resize(int width, int height) {this.width = width; this.height = height;}
	public int getArea() {return width * height;}
	
	
	class MyPoint{
		private int x, y;

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
		
	}
}