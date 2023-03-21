package edu.ex;

import java.util.Scanner;

public class Test07 {
	public static void main(String[] args) {

		 
		  for(int i = 1; i < 10; i++) {
			  System.out.println( i + "단을 출력");
			  for(int j =1; j < 10; j++) {
				  int k = i * j;
				  System.out.println(i + "x" + j + " = " + k);
				  if(i < 0 || 9 < i) {
					  
				  	}else if(k < i-1) {
					  System.out.println("\t"); 
					}else {	
						
					} 
			  }
		  }
		 
		
		//교수님 코드
		
		/*
		 * int col;
		 * 
		 * //Scanner try (Scanner scanner = new Scanner(System.in)) {
		 * System.out.println("결과입력 : "); col = scanner.nextInt(); }catch (Exception e)
		 * { return; }
		 * 
		 * if (col < 1 || 9 <col) { System.out.println("col is not valid!"); return; }
		 * for (int i = 2; i < 9; i++) { for (int j = 1; j < 9; j++) for (int k = 0; k <
		 * col; k++) {
		 * 
		 * if (10 <= i+k) { System.out.println("\n"); break; }
		 * 
		 * System.out.printf("%d*%d=%d", (i+k), j, (i+k)*j);
		 * 
		 * 
		 * if(k < col -1) System.out.print("\t"); else System.out.print("\n"); } }
		 */
	}
}
