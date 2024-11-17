package com.SortEmployeeUsingComparator;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class SortEmployeeUsingComparator {

	public static void main(String[] args) {
		List<Employee> empList=new ArrayList<>();
		createEmployeeList(empList);
		System.out.println("EMPLOYEE LIST BEFORE SORTING");
		empList.forEach(emp->System.out.println(emp.getName() +" "+emp.getCity()+" "+emp.getId()));
        empList.sort(Comparator.comparing(Employee::getName));
        System.out.println("After Sort ");
        empList.forEach(emp->System.out.println(emp.getName() +" "+emp.getCity()+" "+emp.getId()));
        System.out.println("After Reverse Order ");
        empList.sort(Comparator.comparing(Employee::getName).reversed());
        empList.forEach(emp->System.out.println(emp.getName() +" "+emp.getCity()+" "+emp.getId()));
	
	   Comparator<Employee> groupByComparaTor=Comparator.comparing(Employee::getCity).thenComparing(Employee::getName);
	   System.out.println(" ");
	   empList.sort(groupByComparaTor);
	   System.out.println("Employee List After group by sorting ");
	   empList.forEach(emp->System.out.println(emp.getName() +" "+emp.getCity()+" "+emp.getId()));
	
//	   
//	  empList.stream.Collect(Collectors.maxBy(Comparator.CumpaireDouble(Employe::getSalary));
	   
//	   
//	   
//	   
//	   
	}
	
	private static void createEmployeeList(List<Employee> empList) {
		Employee emp=new Employee();
		emp.setCity("Delhi");
		emp.setName("Kamlesh");
		emp.setId("1");
		
		Employee emp2=new Employee();
		emp2.setCity("Delhi");
		emp2.setName("Karthik");
		emp2.setId("2");
		
		Employee emp3=new Employee();
		emp3.setCity("Delhi");
		emp3.setName("khruthi");
		emp3.setId("3");
		
		Employee emp4=new Employee();
		emp4.setCity("Mumbai");
		emp4.setName("Aaryan");
		emp4.setId("4");
		
		Employee emp5=new Employee();
		emp5.setCity("Kolkata");
		emp5.setName("Kumar");
		emp5.setId("5");
		
		Employee emp6=new Employee();
		emp6.setCity("Kolkata");
		emp6.setName("BIlala");
		emp6.setId("5");
		
		empList.add(emp);
		empList.add(emp2);
		empList.add(emp3);
		empList.add(emp4);
		empList.add(emp5);
		empList.add(emp6);
	}

}
