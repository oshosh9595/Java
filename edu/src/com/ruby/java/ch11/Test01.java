package com.ruby.java.ch11;


public class Test01 {
	public static void main(String[] args) {
		test();
	}
	public static void test() {
		try {
			String s = new String("java");
			int len = s.length();
			s = null;
			s.length();
			int arr[] = new int[3];
			arr[3] = 30;
			System.out.println("OK");
		} catch (ArrayIndexOutOfBoundsException e) { 
		//catch (Exception e) 간편하게 부모클래스사용
			System.out.println("잘못된 배열의 인덱스 사용");
		} catch (NullPointerException e2) {
			e2.printStackTrace(); //예외가 발생하기전까지 호출된 순서를 거꾸로 출력
			System.out.println("잘못된 참조!" + e2.getMessage()); //get.Message() 발생한 예외 객체의메시지 추출
		}
		System.out.println("Good");
	}
}
