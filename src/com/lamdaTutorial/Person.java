package com.lamdaTutorial;

import java.util.ArrayList;
import java.util.List;

public class Person {
	public enum Sex {
			MALE,FEMALE
	};
	
	private String Name;
	private int age;
	private String address;
	private String mobileNumber;
	private String emailAddress;
	private Sex gender;
	
	
	@Override
	public String toString() {
		return "Person [Name=" + Name + ", age=" + age + ", address=" + address + ", mobileNumber=" + mobileNumber
				+ ", emailAddress=" + emailAddress + ", gender=" + gender + "]";
	}
	
	
	public Person() {
		super();
	}
	
	public Person(String name, int age, String address, String mobileNumber, String emailAddress, Sex gender) {
		super();
		Name = name;
		this.age = age;
		this.address = address;
		this.mobileNumber = mobileNumber;
		this.emailAddress = emailAddress;
		this.gender = gender;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getMobileNumber() {
		return mobileNumber;
	}
	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}
	public String getEmailAddress() {
		return emailAddress;
	}
	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}
	public Sex getGender() {
		return gender;
	}
	public void setGender(Sex gender) {
		this.gender = gender;
	}
	
	public void printPerson() {
		System.out.println(this.toString());
	}
	
	
	public static List<Person> generateDefaultList(){
		List<Person> pepoleList = new ArrayList<>();
		pepoleList.add(new Person("Kamlesh",40,"Panchsheel","7838366970","kamlesh.kr84@gmail.com",Sex.MALE));
		pepoleList.add(new Person("Karthik",10,"Panchsheel Green 2","1234567899","karthik@gmail.com",Sex.MALE));
		pepoleList.add(new Person("Shruti",5,"Panchsheel Green 2 A6","1234567899","karthik@gmail.com",Sex.FEMALE));
		
		return pepoleList;
	}

}
