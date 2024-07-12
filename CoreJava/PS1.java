package CoreJava;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class PS1 {

	@BeforeMethod
	public void beforerun()
	{
		System.out.println("I will run before");
	}
	@AfterMethod
	public void afterrun()
	{
		System.out.println("I will run after");
	}
	public void doThis()
	{
		System.out.println("I am here");
	}
	
}
