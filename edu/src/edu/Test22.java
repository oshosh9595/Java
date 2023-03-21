package edu;

public class Test22 {
	public static void main(String[] args) {
		// switch ~ break 문
		int a = 12;
		int b = 2;
		char op = '+';
		
		switch(op) {
			case '+':
				System.out.println(a + b);
			case '-':
				System.out.println(a - b);
			case '*':
				System.out.println(a * b);
			case '/':
				System.out.println(a / b);
		}
//		int a = 12;
//		int b = 2;
//		char op = '+';
		
		switch(op) {
			case '+':
				System.out.println(a + b); break;
			case '-':
				System.out.println(a - b); break;
			case '*':
				System.out.println(a * b); break;
			case '/':
				System.out.println(a / b); break;
		}
	}
}
