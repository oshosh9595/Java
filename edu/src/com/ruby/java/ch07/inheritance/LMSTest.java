package com.ruby.java.ch07.inheritance;

public class LMSTest {
	public static void main(String[] args) {
		Employee e = new Employee("홍길동", 33, "입문처");
		Professor p = new Professor("아라라", 22, "반범");
		Student s = new Student("김재화", 23, "방화범");

//		e.setName("오정임");
//		e.setAge(47);
//		e.setDept("입학처");
//
//		p.setName("김푸름");
//		p.setAge(52);
//		p.setSubject("빅데이터");
//
//		s.setName("김유빈");
//		s.setAge(20);
//		s.setMajor("컴퓨터과학");

		System.out.println(e.toString());
		System.out.println(p.toString());
		System.out.println(s.toString());
	}
}