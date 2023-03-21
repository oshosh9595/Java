package com.ruby.java.test1;

//class Armor2 {
//	private String name;
//	private int height;
//	public int takeOff(int value) {
//		System.out.println("엔진 시동 : value" + value);
//		return value - 50;
//	}

//}


public class TestArmor {
	static void test(int ... v) {
		System.out.println(v.length + " : ");
		for (int x : v) {
			System.out.print(x + " ");
		System.out.println();	
		}
	}
	
	public static void main(String[] args) {
		int n = 0;
		int [][]arr = new int[3][4];
		
		Armor a = new Armor();
		//a.Height = 10;
//		n = a.takeOff(100); // 함수 호출
//		a.speedup(12);
//		System.out.println("n = " + n); 스피드
		
//		test(1);
//		test(1, 2);
//		test(1, 2, 3, 4, 5, 6, 7);
		
		
		
	}
}
