package edu.ex;

public class Test04 {

	public static void main(String[] args) {
		int[][] A =  {{1, 2, 3},
				  {4, 5, 6},
				  {7, 8 ,9},
				  {10, 11, 12}};
	
		int[][] B =  {{2, 3, 4},
					  {5, 6, 7},
					  {8, 9, 10},
					  {11, 12, 13}};
	
		int[][] C = new int[3][3];
		
		System.out.print("A행 :" + A);
		System.out.println();
		System.out.print("B행 :" + B);
		System.out.println();
		
		for(int i = 0; i < A.length; i++) {
			for(int j = 0; j < B[0].length; j++) {
				for(int k = 0; k < B.length; k++) {
					C[i][j] += A[i][k] * B[k][j];
				}
			}
		}
		System.out.println("C : " + C);
	}
}
