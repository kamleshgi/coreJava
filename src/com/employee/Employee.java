package com.employee;

public class Employee {
	
	private String name;
	private String id;
	private String city;
	private Integer age;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	public Employee(String name, String id, String city, Integer age) {
		super();
		this.name = name;
		this.id = id;
		this.city = city;
		this.age = age;
	}
	@Override
	public String toString() {
		return "Employee [name=" + name + ", id=" + id + ", city=" + city + ", age=" + age + "]";
	}
	
	
	
	
	

}
