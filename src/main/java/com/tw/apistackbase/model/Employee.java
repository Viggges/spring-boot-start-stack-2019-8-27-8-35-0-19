package com.tw.apistackbase.model;

public class Employee {
	private String name;
	private int age;
	private String gender;
	private String id;
	public Employee() {
		
	}
	public Employee(String name, String gender, int age, String id) {
		this.age = age;
		this.gender = gender;
		this.id = id;
		this.name = name;
	}

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

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}
}
