package edu;

public class Test32 {
	public static void main(String[] args) {
		
		int score[];
		score = new int[] {1, 2, 3, 4, 5};
		
		int arr[] = new int[20];
		System.out.println(arr.length);
//		int arr[] = {1, 2, 3, 4, 5};
//		int a[] = {1, 2, 3, 4, 5};
		for(int i = 0; i<arr.length; i++)
		arr[i] = i * 10;
		
//		arr[1] = 20;
//		arr[2] = 30;
//		arr[3] = 40;
//		arr[4] = 50;
		
//		for(int i = 0; i < arr.length; i++)
//		System.out.print(" " + arr[i]);
		for (int num: arr) {
			System.out.print(" " + num);
		} // 있는갯수 다돌리는거
			
		System.out.println();
		System.out.println("재화");
	}
}	
