package com.employee;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class JavaEightStreamExample {

	public static void main(String[] args) {
		List<Employee> empList = createEmployeList();
		empList.stream().filter(emp->emp.getAge()>30)
            .collect(Collectors.toList());
		empList.forEach(emp->System.out.println(emp.getName()+" "+emp.getCity()+" "+emp.getId()+" "+emp.getAge()));
	
		System.out.println("Use Map");
		List<String> outPutList = empList.stream().map(Employee:: getName).collect(Collectors.toList());
	
		outPutList.forEach(emp->System.out.println(emp));
	}

	private static List<Employee> createEmployeList() {
		List<Employee> emplList=new ArrayList<>();
		Employee e1=new Employee("Amit", "1", "ajmer", 21);
		Employee e2=new Employee("Raj", "2", "pune", 23);
		Employee e3=new Employee("Dev", "3", "noida", 25);
		Employee e4=new Employee("Rishab", "4", "jaipur", 2);
		Employee e5=new Employee("Anvesh", "5", "vanarsi", 21);
		emplList.add(e1);
		emplList.add(e2);
		emplList.add(e3);
		emplList.add(e4);
		emplList.add(e5);
		
		
		return emplList;
	}

}
