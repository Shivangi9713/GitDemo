import java.util.Scanner;
public class practice {
	public static void main(String[] args)
	{
		Scanner Scanner= new Scanner(System.in);
		 System.out.println("Enter the num");
		
	int	num= Scanner.nextInt();
	       int rev=0;

	         while(num!=0)
	         {
	        	 rev= rev*10+num%10;
	        	 num= num/10;
	         }
	         System.out.println("Reverse is " + rev);

	}

}



