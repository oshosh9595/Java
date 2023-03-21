package edu.ex;

import java.util.Scanner;

public class Test06 {
	public static int GCD(int a, int b) {
		if(b == 0) {
			return a;
		}else {
			return GCD(b, a % b);
		}
	}
	
	
	/*Scanner sc = new Scanner(System.in);
	int A = sc.nextInt();
	int B = sc.nextInt();
	int rem = A%B;

	if(rem = 0) {
		
	}*/
	
	
	/*
	 * while(true) { int rem = max%min; if(rem = 0) {
	 * 
	 * } }else (rem != 0)
	 */
	
}
