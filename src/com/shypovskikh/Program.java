package com.shypovskikh;

import java.util.ArrayList;

import java.util.List;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    
		 List<Person> persons = new ArrayList<>();
		 persons.add(new Person("Serg", 28));
		 persons.add(new Person("Alex", 12));
		 persons.add(new Person("Vlad", 33));
		 persons.add(new Person("Viktor", 11));
		 
		// for(Person e : persons) {
		//	 System.out.println(e.toString());
		// }
		 
		// persons.stream().forEach((Person p) ->{
		//	 System.out.println(p);
		// });
		 persons.stream().forEach(System.out :: println);
		 
	//	 persons.stream().filter(p ->{
		//	return p.getAge() >= 18; 
		 //}).forEach(System.out::println);;
		 
		 System.out.println("***************");
		 persons.stream().filter(p ->
				p.getAge() >= 18)
		         .forEach(System.out::println);
	
		 System.out.println("***************");
		 persons.stream().filter(p ->
			p.getAge() >= 18)
		     .sorted((p1,p2) -> p1.getName().compareTo(p2.getName()) )
		     .map(p ->p.getName())
		     .forEach(System.out::println);
	  
		 double average = persons.stream().filter(p ->
		 p.getAge() >= 18)
		  .mapToInt(p -> p.getAge())
		  .average().getAsDouble();
		 
		 System.out.println(average);
	  
	}

}
