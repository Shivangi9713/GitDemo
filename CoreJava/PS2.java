package CoreJava;

import org.testng.annotations.Test;

public class PS2 extends PS1{

	@Test
	public void testRun()
	{
		doThis();
		int a=3;
		PS ps=new PS(3); //this is parameterized constructor
		System.out.println(ps.increment());
		System.out.println(ps.decrement());
		//PS3 ps3=new PS3(a);
		//System.out.println(ps3.multiplytwo());
		//now u have inherited ps3 to ps so u can use it also
		System.out.println(ps.multiplytwo());
		
	}
}
