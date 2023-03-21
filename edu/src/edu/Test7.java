package edu;

public class Test7 {
	public static void main(String[] args) {
		
		int a =10;
		a++;
		System.out.println(a); // 11
		++a;
		System.out.println(a); // 12
		
		int b = 10;
		b--;
		System.out.println(b); // 9
		--b;
		System.out.println(b); // 8
		
		int c = 10;
		int d = 10;
		System.out.println(++c); // 11 ++가 앞이면 먼저 더해서 값이나와서 11
		System.out.println(d++); // 10 ++뒤면 앞에 값만 나오고 다음 프린트할떄 더한결과가 나온다 밑에 예시
		System.out.println(d);
	}
}
