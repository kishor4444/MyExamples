import java.util.*;

public class SwitchEx {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter choice");
		int ch=sc.nextInt();
		switch(ch)
		{
		case 1:System.out.println("Enter number 1");
		int n1=sc.nextInt();
		System.out.println("Enter number 2");
		int n2=sc.nextInt();
		System.out.println("Addition" +(n1+n2));
		break;
		case 2:System.out.println("Enter a number to check even or odd");
		int n=sc.nextInt();
		String res=n%2==0 ? "Even":"Odd";
		System.out.println(res);
		break;
		case 3:System.out.println("Enter number 1");
		int x=sc.nextInt();
		System.out.println("Enter number 2");
		int y=sc.nextInt();
		float avg=(x+y)/2;
		
		System.out.println(avg);
		break;
		case 4:System.out.println("Enter a number");
		int q=sc.nextInt();
		String re=q>0?"positive":"Negative";
		System.out.println(re);
		break;
		case 5:System.out.println("Enter a number");
		int z=sc.nextInt();
		boolean flag=false;
		for(int i=2;i<=z/2;i++)
		{
			if(z%i==0)
			{
				flag=true;
				break;
			}
		}
		if(!flag)
			System.out.println("Prime number");
		else
			System.out.println("Not a prime number");
		
	
	break;
		case 6:System.exit(0);
		
		}
	}
}
		
	
		