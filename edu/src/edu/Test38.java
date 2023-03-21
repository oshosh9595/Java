package edu;

import java.util.Iterator;

public class Test38 {
	public static void main(String[] args) {
		
//		int arr[][] = new int[5][5];
//		int num = 1;
		int a[][] = new int[3][3];
		int b[][] = new int[3][3];
		int c[][] = new int[3][3];
		int d[][] = new int[3][3];
		
		for(int i = 0; i < a.length; i++) {
			for(int j = 0; j < a[0].length; j++) {
				double rnum = Math.random(); //난수 생성
				int num = (int) (rnum * 5); //난수 생성
				a[i][j] = num;
				System.out.print("\t");
			}
			System.out.println("\n");
		}
		
		//System.out.println("행렬");
		for(int i = 0; i < b.length; i++) {
			for(int j = 0; j < b[0].length; j++) {
				double rnum = Math.random(); //난수 생성
				int num = (int) (rnum * 5); //난수 생성
				b[i][j] = num;
			}
		}
		
		System.out.println();
		System.out.println("행렬 : a =");
		for(int i = 0; i < a.length; i++) {
			for(int j = 0; j < a[i].length; j++) {
				System.out.println(" "+ a[i][j]);
				System.out.print("\t");
			}
			System.out.println("\n");
		}
		
		System.out.println();
		System.out.println("행렬 : b =");
		for(int i = 0; i < b.length; i++) {
			for(int j = 0; j < b[i].length; j++) {
				System.out.println(" "+ b[i][j]);
				System.out.print("\t");
			}
			System.out.println("\n");
		}
		
		// c = a + b 행렬 더하기 밑에는 문제풀이
		/*
		 * for(int i = 0; i < a.length; i++) for(int j = 0; j < a[i].length; j++)
		 * c[i][j] = a[i][j] + b[i][j];
		 * 
		 * System.out.println("행렬"); for(int i = 0; i < c.length; i++) { for(int j = 0;
		 * j < c[i].length; j++) { System.out.println(" "+ c[i][j]);
		 * System.out.print("\t"); } System.out.println("\n"); }
		 */
		
		// d = a * b 행렬 곱한 결과 d 에저장
		for(int i = 0; i < a.length; i++) {
			for(int j = 0; j < a[i].length; j++) {
				int sum = 0;
				for (int k = 0; k < a[i].length; k++) {
					sum = sum + a[i][k] * b[k][j];
					}
					d[i][j] = sum;
				}
			}
			System.out.println();
			System.out.println("행렬 : d =");
			for(int i = 0; i < d.length; i++) {
				for(int j = 0; j < d[i].length; j++) {
					System.out.println(" "+ d[i][j]);
					System.out.print("\t");
				}
				System.out.println("\n");
			}
		
		
		
//		//내가 한거
//		for(int i = 0; i < a.length; i++) {
//			for(int j = 0; j < a[i].length; j++) {
//				int sum = 0;
//				sum = a[i][j] + b[i][j];
//				System.out.print("c : "+ sum);
//				System.out.print("\t");
//				}
//			System.out.println("\n");
//			}
//		
//		for(int i = 0; i < b.length; i++) {
//			for(int j = 0; j < b[i].length; j++) {
//				int sum = 0;
//				sum = a[i][j] + b[i][j];
//				System.out.print("c : "+ sum);
//				System.out.print("\t");
//				}
//			System.out.println("\n");
//			}

		
		// d = a * b
//		for(int i = 0; i < d.length; i++) {
//			for(int j = 0; j < d[0].length; j++) {
//				int sum = 0;
//				sum = a[i][j] * b[i][j] + a[i][j] * b[i][j];
//				System.out.print("d : "+ sum);
//				System.out.print("\t");
//				}
//			System.out.println("\n");
//			}
//}
		
		for(int i = 0; i < a.length; i++) {
			for(int j = 0; j < b[0].length; j++) {
				int sum = 0;
				sum = a[i][j] + b[i][j];
				System.out.print("c : "+ sum);
				System.out.print("\t");
				}
			System.out.println("\n");
			}

		
	
		
		
//		for(int i = 0; i < arr.length; i++) {
//			for(int j = 0; j < arr[i].length; j++) {
//				System.out.print(arr[i][j]);
//				System.out.print("\t");
//			}
//			System.out.println("\n");
//		}
//		for(int i = 0; i < arr.length; i++) {
//			for(int j = 0; j < arr[i].length; j++) {
//				if(i == j) {
//					System.out.print(" " + arr[i][j]);
//					System.out.print("\t");
//				}
//			}
//		}
//		for(int i = 0; i < arr.length; i++) {
//			for(int j = 0; j < arr[i].length; j++) {
//				if(i > j) {
//					System.out.print(" " + arr[i][j]);
//				}
//			}
//		}
		
	}
}
