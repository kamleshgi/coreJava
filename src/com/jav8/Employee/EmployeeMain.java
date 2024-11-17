package com.jav8.Employee;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.function.BinaryOperator;
import java.util.stream.Collectors;

public class EmployeeMain {

	public static void main(String[] args) {
		List<Employee> employeeList=new ArrayList<>();
		createEmployeeList(employeeList);
		
//1. Program to Print Max/min employee Salary from the given Collection
		Optional<Employee> maxSal = employeeList.stream()
		.collect(Collectors.maxBy(Comparator.comparingDouble(Employee::getSalary)));
		System.out.println(maxSal.get().getName());

Optional<Employee> minSalary = employeeList.stream()
.collect(Collectors.minBy(Comparator.comparingDouble(Employee::getSalary)));
System.out.println(minSalary.get().getName());

//2. Program to Print the max salary of an employee from each department
      Map<String, Optional<Employee>> maxSalbydep = employeeList.stream()
        .collect(Collectors.groupingBy(Employee::getDeoartment,
    		  Collectors.reducing(
    			BinaryOperator.maxBy(Comparator.comparing(Employee::getSalary)))));
      maxSalbydep.forEach((Key,value)->System.out.println(Key+"--"+value.get().getName()));


   // 3. Program to print active and inactive employee in the given Collection
Map<String, Long> activeContEmp = employeeList.stream().collect(Collectors.groupingBy(Employee::getActive,
		Collectors.counting()));

activeContEmp.forEach((key,value)->System.out.println(key+"-"+value));

System.out.println("========================");
//4. program to print emplyees count working in each department 
Map<String, Long> empCountByDepartment = employeeList.stream()
                         .collect(Collectors.groupingBy(Employee::getDeoartment,
		                       Collectors.counting()));

empCountByDepartment.forEach((key,value)->System.out.println(key+"- "+value));
System.out.println("========================");
//5 program to print employee details working in each department
Map<String, List<Employee>> empDetailsByDepartment = employeeList.stream()
                   .collect(Collectors.groupingBy(Employee::getDeoartment));
empDetailsByDepartment.forEach((key,value)->System.out.println(key+"-"+value));

System.out.println("=====================");
Map<Integer, Long> groupByYearofJoing = 
                           employeeList.stream()
                          .collect(Collectors.groupingBy(
                        		  Employee::getYearOfJoing,Collectors.counting()));
groupByYearofJoing.forEach((key,value)->System.out.println(key+"="+value));
	}

	
	private static void createEmployeeList(List<Employee> employeeList) {
		
		employeeList.add(new Employee(1, "Kamlesh",20,"Yes", "CSE",2023, 30000.00));
		employeeList.add(new Employee(2, "Karthik",18,"Yes", "IT",2024, 35000.00));
		employeeList.add(new Employee(4, "Ravi",18,"Yes", "IT",2024, 30000.00));
		employeeList.add(new Employee(3, "Aaryan",10,"No", "EE",2022, 25000.00));
		employeeList.add(new Employee(5, "Aman",10,"No", "EE",2022, 20000.00));
	}

}
