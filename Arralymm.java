import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Arralymm {

	public static void main(String[] args) {
		ArrayList<Integer> al1=new ArrayList<>();
		Scanner sc=new Scanner(System.in);
				System.out.println("Array elements");
		int a=sc.nextInt();
		System.out.println("arrays of integers");
		for(int i=0;i<a;i++)
		{
			al1.add(sc.nextInt());
			
		}
		System.out.println("med "+med(al1));
		System.out.println("sum "+sum(al1));
		System.out.println("mean is "+mean(al1));
	
	}
	private static float med(ArrayList<Integer> al1) {
		Collections.sort(al1);
		int s=al1.size();
		float med=0;
		if(s%2!=0)
		
			med=al1.get(s/2);
			else
				med=(float)(al1.get((s/2)-1)+al1.get(s/2))/2;
				return med;
	}
		private static float mean(ArrayList<Integer> al1) {
			int sum=sum(al1);
			float mean=(float)sum/al1.size();
			return mean;
			
		
				
		}
		private static int sum(ArrayList<Integer> al1) {
			int sum=0;
			for(int i=0;i<al1.size();i++) {
				sum=sum+al1.get(i);
			}
			return sum;
			}
		
		
	}


