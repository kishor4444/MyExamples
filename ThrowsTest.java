
public class ThrowsTest {
	public void division(int a,int b) throws ArithmeticException{
		int divide=a/b;
		
		System.out.println("division "+divide);
		
	}


	public static void main(String[] args) {
		ThrowsTest ts=new ThrowsTest();
		try {
		ts.division(1,0);
		}
		catch(Exception ex) {
			System.out.println(ex);
			ex.getMessage();
			ex.printStackTrace();
		}
		

	}

}
