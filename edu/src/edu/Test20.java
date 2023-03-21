package edu;

public class Test20 {
	public static void main(String[] args) {
		// if ~ else if 문
		int score = 90;
		char grade;
		
		if(score >= 90) {
			grade = 'A';
		}else if(score >= 80) {
			grade = 'B';
		}else if(score >= 70) {
			grade = 'C';
		}else if(score >= 60) {
			grade = 'D';
		}else {
			grade = 'F';
		}
		System.out.println(grade);
		
//		if(score >= 90)		 grade = 'A';
//		else if(score >= 80) grade = 'B';
//		else if(score >= 70) grade = 'C';
//		else if(score >= 60) grade = 'D';
//		else 		  		 grade = 'F';
//		
//		System.out.println(grade); 한줄일떄는 이것도 가능
	}
}
