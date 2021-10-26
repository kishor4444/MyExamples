import java.util.*;

public class Exception1 {


	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		
		try{
			
			System.out.println("Enter input");
			String s=sc.nextLine();
			int a=Integer.parseInt(s);
			System.out.println(a);
			
			
			
		}
		catch(Exception e)
		{
			
			System.out.println("exception"+e);
			System.out.println(e.getMessage());
	
		}
		finally {
			System.out.println("finally");
		}



}

}
