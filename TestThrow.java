
public class TestThrow {
	public void checkNo(int no) throws Exception {
		if(no>1) {
			System.out.println(no);
		}
		else {
			throw new ArithmeticException("cant calculate");
		}
	}

	public static void main(String[] args) {
		TestThrow tt=new TestThrow();
		try {
			tt.checkNo(1);
		}
		catch(Exception e) {
			
			System.out.println("Exception"+e);
			
		}
		
		
	

	}

}
