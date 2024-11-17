package com.jav8.Employee;

public class Employee {
private int id;
private String name;
private int age;
private String active;
private String deoartment;
private int yearOfJoing;
private double salary;

public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public int getAge() {
	return age;
}
public void setAge(int age) {
	this.age = age;
}
public String getActive() {
	return active;
}
public void setActive(String active) {
	this.active = active;
}
public String getDeoartment() {
	return deoartment;
}
public void setDeoartment(String deoartment) {
	this.deoartment = deoartment;
}
public int getYearOfJoing() {
	return yearOfJoing;
}
public void setYearOfJoing(int yearOfJoing) {
	this.yearOfJoing = yearOfJoing;
}
public double getSalary() {
	return salary;
}
public void setSalary(double salary) {
	this.salary = salary;
}

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public Employee(int id, String name, int age, String active, String deoartment, int yearOfJoing, double salary) {
	super();
	this.id = id;
	this.name = name;
	this.age = age;
	this.active = active;
	this.deoartment = deoartment;
	this.yearOfJoing = yearOfJoing;
	this.salary = salary;
}


}
