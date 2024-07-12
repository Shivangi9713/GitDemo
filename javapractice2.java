
public class javapractice2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stu
		String s= new String("Shivangi Gaurav Saini");
		String[] my=s.split("Gaurav");
		System.out.println(my[0]);
		
		System.out.println(my[1].trim());
		for(int i=s.length()-1;i>=0;i--)
		
		{
			System.out.println(s.charAt(i));
		}

		

	}

}
