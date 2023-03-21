package com.ruby.java.ch07.inheritance;

public class Person {
	private final String ssd_ID = "!23"; //이게 최기화 final 변수 
	
//	public void setssd_ID() {
//		this.ssd_ID = ssd_ID;
//	}
	
	private String name;
	private int age;
	
//	public Person(String ssd_ID) {
//		this.ssd_ID = ssd_ID;
//	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
	// 출력하는 funsion
	public final String toString() {
		return name + ":" + age;
	}
	public Person() {
		System.out.println("Person 생선자 실핼!");
	}
	
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
		System.out.println("Person 생선자 실핼!");
	}
	
}