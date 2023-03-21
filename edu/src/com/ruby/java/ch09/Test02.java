package com.ruby.java.ch09;

public class Test02 {

	public static void main(String[] args) {
		
		String s1 = new String("Java");
		String s2 = "Java";
				
		String s3 = new String("Java");
		String s4 = "Java";
		
		if(s1 == s3) {
			System.out.println("동일객체");
		}else {
			System.out.println("다른객체");
		}
		
		if(s2 == s4) {
			System.out.println("동일객체");
		}else {
			System.out.println("다른객체");
		}
		
		if(s1.equals(s3)) {
			System.out.println("동일 문자열을 가집니다.");
		} else {
			System.out.println("다른 문자열을 가집니다.");
		}
		
		if(s2.equals(s4)) {
			System.out.println("동일 문자열을 가집니다.");
		} else {
			System.out.println("다른 문자열을 가집니다.");
		}
		
		String s5 ="JAVA";
		
		if(s1.equals(s5)) {
			System.out.println("동일 문자열을 가집니다.");
		} else {
			System.out.println("다른 문자열을 가집니다.");
		}
		
		if(s1.equalsIgnoreCase(s5)) {
			System.out.println("동일 문자열을 가집니다.");
		} else {
			System.out.println("다른 문자열을 가집니다.");
		}
	
	}
}
