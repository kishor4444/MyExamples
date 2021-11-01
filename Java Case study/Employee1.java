import java.util.Scanner;
public class Employee1{
	static String name;
	static int id;
	static double basic_salary;
	static double SA;
	static double HRA;
	static final int tax = 2500;
	static double tallowance;
	public static void Netsal(double basic_salary,double SA,double HRA,double tallowance,int tax)
	{
		double net_salary = basic_salary+HRA+SA+tallowance-tax;
		System.out.println("Net salary " + net_salary);
	}

	public static void main(String[] args) {
		Employee1 e1 = new Employee1();
		Scanner sc = new Scanner(System.in);
		System.out.println("Employee name");
		name=sc.nextLine();	
		System.out.println("Employee id");
		id=sc.nextInt();
		e1.tallowance = 0.2*basic_salary;
		System.out.println("basic salary");
		e1.basic_salary= sc.nextInt();
		if(e1.basic_salary<=10000)
		{
			e1.HRA = 0.2*e1.basic_salary;
			e1.SA = 0.8*e1.basic_salary;
		}
		else if (e1.basic_salary>=10000 && e1.basic_salary<=20000)
		{
			e1.HRA = 0.25*e1.basic_salary;
			e1.SA = 0.9*e1.basic_salary;
		}
		else
		{
			e1.HRA = 0.3*basic_salary;
			e1.SA = 0.95*basic_salary;
		}
		Netsal(e1.basic_salary,e1.SA,e1.HRA,e1.tallowance,e1.tax);
		System.out.println("Name " + name  + "   Id " + id);	
	}

}
	
		
		
	
