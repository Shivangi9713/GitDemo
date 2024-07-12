package javastreams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.testng.Assert;
import org.testng.annotations.Test;

@Test
public class streamMaps {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//print names which have last letter as "a" with uppercase
	/*	Stream.of("Aman", "Priya", "Akash", "Arpit", "Pooja").filter(s->s.endsWith("a")).map(s->s.toUpperCase())
		.forEach(s->System.out.println(s));
		
		//print names which have first letter as "a" with sorted list
	List<String> names1=	Arrays.asList("Aman", "Priya", "Akash", "Arpit", "Pooja");
	names1.stream().filter(s->s.startsWith("A")).sorted().map(s->s.toUpperCase()).forEach(s->System.out.println(s)); 
	
	//merge 2 lists
	ArrayList <String> names=new ArrayList <String>() ;
	names.add("Aman");
	names.add("Preeti");
	names.add("Samar");
	names.add("Yash");
	names.add("Pooja");
	
	List<String> names1=	Arrays.asList("Aman", "Priya", "Akash", "Arpit", "Pooja");
	
	Stream <String> newStream= Stream.concat(names.stream(), names1.stream());
	//newStream.sorted().forEach(s->System.out.println(s));
	boolean flag=  newStream.anyMatch(s->s.equalsIgnoreCase("aman"));
	System.out.println(flag);
	Assert.assertTrue(flag);
	
	//convert into list 
	 List <String> ls=Stream.of( "Pratibha", "Neha", "Preete", "Meete").filter(s->s.endsWith("e")).map(s->s.toUpperCase())
	.collect(Collectors.toList());
	 System.out.println(ls.get(0)); */
	 
	 //assignment 
	 List <Integer> values= Arrays.asList(3,3,3,7,5,1,9,7);
	 //print unique values
	 //sort this array
	//values.stream().distinct().forEach(s->System.out.println(s));
	// values.stream().distinct().sorted().forEach(s->System.out.println(s));
	List<Integer> ls= values.stream().distinct().collect(Collectors.toList());
	System.out.println(ls.get(2));
	
	}

}
