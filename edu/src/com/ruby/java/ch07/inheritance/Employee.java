package com.ruby.java.ch07.inheritance;

public class Employee extends Person {
	
//	private String name;
//	private int age;
	private String dept;

//	public String getName() {
//		return name;
//	}
//	
//	public void setName(String name) {
//		this.name = name;
//	}
//	
//	public int getAge() {
//		return age;
//	}
//	
//	public void setAge(int age) {
//		this.age = age;
//	}
	
	public String getDept() {
		return dept;
	}

	public void setDept(String dept) {
		this.dept = dept;
	}
	
	public String toString() {
		//return name + " : " + age + " : " + dept; //오류
		return super.toString()+this.dept; 
	}
	public Employee() {
		super();
		System.out.println("Employee 생선자 실핼!");
	}
	
	public Employee(String name, int age, String dept) {
//		super.setName(name);
//		super.setAge(age);
		super(name, age); // 상위 클래스의 생성자를 가져 오는거
		this.dept = dept;
		System.out.println("Employee(name, age, dept) 생성자 실행!");
	}
	
}