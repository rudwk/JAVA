package day2;

public class p136_ArrayCopy {
	public static void main(String[] args) {
		int[] arr1 = new int[] {1, 2, 3};
		int[] arr2 = arr1;
		arr2[1] = 0;
		
		printArr(arr1);
		
		arr1 = new int[] {1, 2, 3};
		arr2 = arr1.clone();
		arr2[1] = 0;
		
		printArr(arr1);
	}

	private static void printArr(int[] arr) {
		// TODO Auto-generated method stub
		for(int i : arr) System.out.print(i + " ");
		System.out.println();
	}
}
