package edu.ex;

import java.util.Arrays;

public class Test05 {
	
	private void printArray(int arr[]) {
		for(int i = 0; i < arr.length; i++) {
			{
				System.out.println(arr[i] + "");
			}
		}
	}
	
	public static void main(String[] args) {
		int[] A = {1, 2, 3, 4};
		int[] B = {5, 6, 7, 8};
		int[] C = new int[4];
		
		for(int i = 0; i < A.length; i++) {
			
			System.out.print(Arrays.toString(A));
			System.out.print("\n");
		}	
		for(int i = 0; i < B.length; i++) {
			System.out.print(Arrays.toString(B));
		}
		
		int sum = 0;
		int i = 0;
		sum = A[i] + B[i];
		System.out.print(" 합 : " + sum);
		

		
		//merge()
		
	}
}
