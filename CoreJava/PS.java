package CoreJava;

public class PS extends PS3 {
int a;
	public PS(int a )
	{
	// TODO Auto-generated constructor stub
		//a=i;
		// or u can use
		super(a); //it means ps3 parent class constructor is invoked
		this.a=a;
		
}

	public int increment()
	{
		a=a+1;
		return a;
	}
	
	public int decrement()
	{
		a=a-1;
		return a;
	}
}
