package com.lamdaTutorial;

import java.util.List;
import java.util.function.Predicate;

public class PersonMain {
	
	public interface CheckPerson{
		public boolean test(Person person);
	}
	
	public static class CheckPersonEligibleForSelectiveSearch implements CheckPerson{

		@Override
		public boolean test(Person person) {
			
			return person.getAge()>4 
				  && person.getGender()==Person.Sex.FEMALE;
		}
		
	}
	
	public static void printPersonOlderThan(List<Person> personList,int age) {
		for (Person person : personList) {
			if(person.getAge()>=age) {
				person.printPerson();
			}
		}
		
	}
	
	
	public static void printPersonWithinAgeRange(List<Person> personList,int age1,int age2) {
		for (Person person : personList) {
			if(person.getAge()<=age2 && person.getAge()>age1) {
				person.printPerson();
			}
		}
		
	}
	
	public static void printPublic(List<Person> personList,CheckPerson checkPerson) {
		for (Person person : personList) {
			if (checkPerson.test(person)) {
				person.printPerson();
			}
		}
	}
	
	public static void printPublicwithPredicate(List<Person> personList,Predicate<Person> checkPerson) {
		for (Person person : personList) {
			if (checkPerson.test(person)) {
				person.printPerson();
			}
		}
	}
	
	public static void main( String args[]) {
		List<Person> personList= Person.generateDefaultList();
		//printPersonOlderThan(personList, 30);
		//printPersonWithinAgeRange(personList, 4, 10);
	//	 printPublic(personList,new  CheckPersonEligibleForSelectiveSearch());
		
		printPublic(personList, new CheckPerson() {// use Anynimous Classs which class  		
			@Override
			public boolean test(Person person) {
				return person.getAge()>4 
						  && person.getGender()==Person.Sex.FEMALE;
			}
		});
		
        // above code to Change  Lamda Expression
		// use Anynimous Classs which class  
		printPublic(personList, person -> person.getAge()>4  && person.getGender()==Person.Sex.FEMALE);
		
		printPublicwithPredicate(personList, person -> person.getAge()>4  && person.getGender()==Person.Sex.FEMALE);
	}

}
