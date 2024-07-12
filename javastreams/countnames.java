package javastreams;

import java.util.ArrayList;
import java.util.stream.Stream;

import org.testng.annotations.Test;

public class countnames {
@Test
	public  static void main(String[] args) {
	
		//in this we will use java streams with lambda operator
		ArrayList <String> names=new ArrayList <String>() ;
		names.add("Aman");
		names.add("Priya");
		names.add("Akash");
		names.add("Arpit");
		names.add("Pooja");
	//	now we can use above list also but we can use stream for creating list also 
	
		
	/*	int count=0;
		
		for(int i=0;i<names.size();i++)
		{
			String actual=names.get(i);
			if(actual.startsWith("A"))
			{
				count++;
			}
		}
		
		System.out.println(count);
 */
		//using streams
		
	  // Long	c= names.stream().filter(s->s.startsWith("A")).count();
	Long d= Stream.of("Aman", "Priya", "Akash", "Arpit", "Pooja").filter(s->s.startsWith("A")).count();
	   System.out.println(d);
		//print all names of length greater than 4
		names.stream().filter(s->s.length()>4).forEach(s->System.out.println(s));
		//print only first name with length greater than 4
		names.stream().filter(s->s.length()>4).limit(1).forEach(s->System.out.println(s));
		
	}

}
