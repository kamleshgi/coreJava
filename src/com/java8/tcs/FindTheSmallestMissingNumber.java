package com.java8.tcs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import com.jav8.Employee.Employee;

public class FindTheSmallestMissingNumber {
	
public static void main(String[] args) {
	//1. find the smallest missing number
	int arr[]= {2,4,6,1,3,5,8};
	Arrays.sort(arr);
	int res=1;
	for(int i=0;i<arr.length;i++) {
		if(arr[i]==res) {
			res++;
		}else {
			System.out.println(res);
			break;
		}
	}
	
	//2. Using Java 8 stream Find the Highest Salary Employee
	List<Employee> empList=new ArrayList<>();
	createEmployeeList(empList);
	Optional<Employee> highestsalary = empList.stream().collect(Collectors.maxBy(
			Comparator.comparingDouble(
					Employee::getSalary)));
	System.out.println(highestsalary.get().getName()+"-"+highestsalary.get().getSalary()+"-"+highestsalary.get().getDeoartment());
//3. Asked Implement a Rest API to Update a resource
	//PUT
}



private static void createEmployeeList(List<Employee> employeeList) {
	
	employeeList.add(new Employee(1, "Kamlesh",20,"Yes", "CSE",2023, 30000.00));
	employeeList.add(new Employee(2, "Karthik",18,"Yes", "IT",2024, 35000.00));
	employeeList.add(new Employee(4, "Ravi",18,"Yes", "IT",2024, 30000.00));
	employeeList.add(new Employee(3, "Aaryan",10,"No", "EE",2022, 25000.00));
	employeeList.add(new Employee(5, "Aman",10,"No", "EE",2022, 20000.00));
}

}
