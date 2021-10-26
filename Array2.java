import java.util.*;
public class Array2 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		try {
			
			System.out.println("Enter array");
			
		
			int a[]=new int[5];
			System.out.println(a[8]);
			/*for(int i=0;i<5;i++) {
				
				a[i]=sc.nextInt();
			System.out.println(a[i]);
			
			
			
			}*/
			try
			{
				String s="abc";
				System.out.println(Integer.parseInt(s));
			}
			catch(Exception e) {
				System.out.println(e);
			}
		}
		catch(ArrayIndexOutOfBoundsException ex) {
			System.out.println("Exception"+ex);
			ex.getMessage();
			ex.printStackTrace();
			
		}
		finally {
			System.out.println("The end");
		}
	}
}
			
		

