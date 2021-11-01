import java.util.Scanner;

public class Employee2 {
	private int employeeid;
	private String employeename;
	private float basicsalary,netsalary;
	private float SA;
	private float HRA;
	private int TA;
	private int tax=2500;
	public void display() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter employee name");
		employeename=sc.nextLine();
		System.out.println("Enter employee id");
		employeeid=sc.nextInt();
		System.out.println("Enter employee salary");
		basicsalary=sc.nextInt();
		calculateNetSalary();
			
		}
		public void calculateNetSalary() {
			if(basicsalary<=10000)
			{
				HRA=0.2f;
			    SA=0.8f;
			    
	}
			else if(basicsalary>=10001 && basicsalary<=20000) {
				HRA=0.25f;;
				SA=0.90f;
				
			}
			else {
				HRA=0.3f;
				SA=0.95f;
				
			}
			netsalary=basicsalary+HRA*basicsalary+SA*basicsalary+((20/100)*basicsalary)-tax;
			System.out.println(employeename+" "+employeeid+" "+netsalary);
		}
	public static void main(String[] args) {
		Employee2 e=new Employee2();
		e.display();
	}

}