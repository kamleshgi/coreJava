package com.duplicateUsinfStream;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

public class StreamEmployee {
public static void main(String[] args) throws ParseException {
	SimpleDateFormat dtaeFormat=new SimpleDateFormat("dd-MM-yyyy");
	Date joiningDateRam=dtaeFormat.parse("01-01-2000");
	Date joinigDateSita=dtaeFormat.parse("15-05-2000");
	Date joinDateVishnu=dtaeFormat.parse("10-12-1998");
	Date joinDateMahesh=dtaeFormat.parse("20-03-1990");
	
	List<Employee> empList=Arrays.asList(new Employee("Ram", 50000.0, joiningDateRam,"M"),
			new Employee("Sita", 40000.0, joiningDateRam,"F"),
			new Employee("Vishnu", 20000.0, joiningDateRam,"M"),
			new Employee("Mahesh", 70000.0, joiningDateRam,"M")
			);
	
	System.out.println("Find the Eployee Who has maximum salary");
	Employee maxSal = empList.stream().max((a,b)->Double.compare(a.getSalary(), b.getSalary())).get();
	System.out.println(maxSal);
	
	System.out.println("Find the Eployee Who has minimum salary");
	Employee minSal = empList.stream().min((a,b)->Double.compare(a.getSalary(), b.getSalary())).get();
	System.out.println(minSal);
	
	System.out.println("Find the Eployee Who has Second highest salary");
	
	Optional<Employee> SecondHigh = empList.stream()
			.sorted((a,b)->Double.compare(a.getSalary(), b.getSalary()))
	        .skip(1)
	        .findFirst();
	
	System.out.println(SecondHigh);
	
	System.out.println("Find the Eployee Who is most senior based on Joining Date ?");
	
	Employee seniorEmp = empList.stream()
	       .min((a,b)->a.getJoiningDate().compareTo(b.getJoiningDate()))
	       .get();
	
	System.out.println(seniorEmp);

	System.out.println("Find the Eployee Based on The gender");
	
	Map<String, Long> listEmpByGender = empList.stream()
			       .collect(Collectors.groupingBy(Employee::getGender,Collectors.counting()));
	
	System.out.println(listEmpByGender);
	
	
	
}
}
