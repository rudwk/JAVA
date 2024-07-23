package day2;

public class p139_MultiDimensionTest {
	public static void main(String[] args) {
		int[][] arr = {{62, 17, 42, 64}, {18, 96, 29, 5}, {6, 3, 6, 5}};
		
		for(int i = 0; i < arr.length;i++) {
			System.out.println();
			for(int j = 0; j < arr[i].length;j++) System.out.print(arr[i][j] + " ");
		}
		System.out.println();
	}
}
