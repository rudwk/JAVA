package day2;

public class p137_ManyArr {
	public static void main(String[] args) {
		int[][] arr2d;
		arr2d = new int[][] {{1, 0, 3}, {6, 9, 12}};
		
		int[][][] arr3d = new int[2][3][2];
		
		int x = arr3d[1][2][0] + arr2d[0][1];
		System.out.println(x);
		
		//µéÂß³¯Âß ¹è?¿­(jagged)
		int[][] jagged = {new int[] {1, 0, 3}, new int[] {6, 9}};
		
		jagged = new int[2][];
		jagged[0] = new int[] {1, 0, 3};
		jagged[1] = new int[] {6, 9};
	}
}
