package com.ruby.java.ch09;

public class Test01 {
	public static void main(String[] args) {
		
		Object obj1 = new Object();
		Object obj2 = new Object();
		Object obj3 = new Object();
		
		Class c = obj1.getClass();
		//sysout(obj1.getClass().getName())
		
		
		
		//System.out.println(obj4);
		
		
		System.out.print(obj1.hashCode());
		System.out.println(obj2.hashCode());
		System.out.println(obj3.hashCode());

		System.out.println(obj1);
		System.out.println(obj2);
		System.out.println(obj3);
		
		System.out.print(c.getName());
		
		
		MyObject obj4 = new MyObject(123);
		MyObject obj5 = new MyObject(123);
		
		if(obj4.equals(obj5)) {
			System.out.println("동일객체이다"); 	
		} else {
			System.out.println("동일객체이다"); 
		}
		
		if(obj4 == obj5) {
			System.out.println("동일객체이다"); 
		} else {
			System.out.println("동일객체이다"); 
		}
		
		
	}
}
