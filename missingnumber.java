import java.util.Scanner;

public class missingnumber {

	public static void main(String[] args) 
		
		   {  
		      Scanner sc=new Scanner(System.in);

		      
		      System.out.println("Enter the total number of elements ");
		     int n=sc.nextInt(); 
		      System.out.println("Enter elements");
		      int arr[]=new int[n];
		      for(int i=0;i<n;i++)
		      {
		    	  arr[i]=sc.nextInt();
		      }
		    int sum=0;
		   
	         for(int i=0;i<arr.length;i++)
	         {
	        	 sum=sum+arr[i];
	         }
	         
		    
         
         int sum1=(n+1)*(n+2)/2;
	      
		System.out.println("missing number is " + (sum1-sum));
		   }
}

        /* int a[]= {1,2,4,5};
         int sum=0;
         for(int i=0;i<a.length;i++)
         {
        	 sum=sum+a[i];
         }
         System.out.println("sum is " + sum);
         int sum1=0;
         for (int j=1;j<=5;j++)
         {
        	 sum1=sum1+j;
         }
         System.out.println("Total sum should be " + sum1);
         System.out.println("Missing number is " +(sum1-sum)); */
	