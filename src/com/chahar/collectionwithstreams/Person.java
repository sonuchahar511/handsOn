package com.chahar.collectionwithstreams;

public class Person {
	private Integer age;
	private String name;
	public Person(String name,Integer age) {
		super();
		this.age = age;
		this.name = name;
	}
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getInfo() {
	    return name + " (" + age + ")";
	}
}
