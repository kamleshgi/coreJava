package com.streamAPI;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Set;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamApi {
	
	static List<Employee> employees = new ArrayList<>();
	
   static {
	   employees.add(new Employee("Kamlesh","Kumar",5000.0,List.of("Project1","Project1")));// List.off introduced in java 9
	   employees.add(new Employee("Karthik","Kumar",4000.0,List.of("Project3","Project3")));// List.off introduced in java 9
	   employees.add(new Employee("Shruti","Kumari",3000.0,List.of("Project4","Project4")));//
	   employees.add(new Employee("AARyan","Kumar",2000.0,List.of("Project5","Project5")));//
   }
	public static void main(String[] args) {
	//foreach	
     employees.stream().forEach(employee-> System.out.println(employee));
     
     //map
     //set
     //Collect
     List<Employee> increasedSal= employees.stream()
       .map(employee->new Employee(
    		   employee.getFirstName(),
    		   employee.getLastName(),
    		   employee.getSalary() * 1.10,
    		   employee.getProject()
    		   ))
               .collect(Collectors.toList());
     
     System.out.println(increasedSal);
     
     //filter 
   List<Employee> filterEmployee=  employees.stream()
             .filter(employee->employee.getSalary()>3000.0)
             .map(employee->new Employee(
            		 employee.getFirstName(),
            		 employee.getFirstName(),
            		 employee.getSalary(),
            		 employee.getProject()))
             .collect(Collectors.toList());
     System.out.println("filterEmployee: "+filterEmployee);
     
     
   //findFirst
     
     Employee findFirstemployee=  employees.stream()
             .filter(employee->employee.getSalary()>3000.0)
             .map(employee->new Employee(
            		 employee.getFirstName(),
            		 employee.getLastName(),
            		 employee.getSalary(),
            		 employee.getProject()))
             .findFirst()
             .orElse(null);
     System.out.println("findFirstemployee "+findFirstemployee);
     
     //FlatMap
     
    String flatMapString= employees.stream()
              .map(employee->employee.getProject())
              .flatMap(strings->strings.stream())
              .collect(Collectors.joining(","));
    
    System.out.println("flatMapString: "+flatMapString);
    
  //Filter with FlatMap 
    
    String flatMapFilterString= employees.stream()
    		.filter(employee->employee.getSalary()>4000.0)
              .map(employee->employee.getProject())
              .flatMap(strings->strings.stream())
              .collect(Collectors.joining(","));
    
    System.out.println("flatMapFilterString: "+flatMapFilterString);
    
    //Short Circuit Operation
    
 List<Employee> shortCircitOperationemp=   employees.stream()
            .skip(1)//row Skip
            .limit(1)//row
            .collect(Collectors.toList());
 
 System.out.println("shortCircitOperationemp "+shortCircitOperationemp);
    
   //Finite Data
    Stream.generate(Math::random)
            .limit(5)
            .forEach(number->System.out.println(number));
    
    //sorting by name
    List<Employee> sortedEmployees= employees.stream()
              .sorted((o1, o2) ->o1.getFirstName().compareTo(o2.getFirstName()))
              .collect(Collectors.toList());
    System.out.println("sortedEmployees: "+sortedEmployees);
    
    //sorted by salary
    List<Employee> sortedBySalEmployees= employees.stream()
            .sorted((o1, o2) ->o1.getSalary().compareTo(o2.getSalary()))
            .collect(Collectors.toList());
    System.out.println("sortedBySalEmployees: "+sortedBySalEmployees);
    
    //Max and min
    
   Employee maxEmployeeSal= employees.stream()
             .max(Comparator.comparing(Employee::getSalary))
             .orElseThrow(NoSuchElementException::new);
   System.out.println("maxEmployeeSal: "+maxEmployeeSal);
   
   //reduce or acomulate
   
     Double sum= employees.stream()
                 .map(employee->employee.getSalary())
                 .reduce(0.0, Double::sum);
     
     System.out.println("Total Salary: "+sum);
    
	}	

}
