import java.util.Scanner;

class Takeride{
	                      //adult
	public int adultRide(int adult,int ch,int hour)
	{
		int price;
	
		switch (ch) {

	      case 1:
	    	  price=adult*hour*50;
	    	  return price;
		case 2:
	    	  price=adult*hour*60;
	    	  return price;    	
	      case 3:
	    	  price=adult*hour*45;
	    	  return price;      
	      case 4:
	    	  price=adult*hour*70;
	    	  return price;  
	      default:
	    	  System.out.println("invalid");
	       return 0;
	}
	}
	//child
	public int childRide(int child,int ch, int hour)
	{
		int price;
	switch (ch) {
      case 1:
    	  price=child*hour*40;
    	  return price;
	case 2:
    	  price=child*hour*30;
    	  return price;
      case 3:
    	  price=child*hour*25;
    	  return price;        
      case 4:
    	  price=child*hour*60;
    	  return price;   
      default:
    	  System.out.println("invalid");
       return 0;
		
	}
	
	}		
}
public class EnjoyRide {

	public static void main(String[] args) {
		
		Takeride rd=new Takeride();
		Scanner sc = new Scanner(System.in);
		int adults;
        System.out.println("How many adults?");
        adults=sc.nextInt();
        int children;
        System.out.println("How many children?");
        children=sc.nextInt();
        System.out.println("Which ride");
		System.out.println("1  Alibaba");
		System.out.println("2  Alpine slide");
		System.out.println("3  Bumpper Cars");
		System.out.println("4  Baloon Race");
		System.out.println("Enter choice");
		int ch;
		ch=sc.nextInt();
		System.out.println("How many hours u want to take ride?");
		int hours;
		hours=sc.nextInt();
		int totalhrs;
		totalhrs=(adults+children)*hours;
		System.out.println("Total hours of Ride = "+totalhrs);
		int adride=rd.adultRide(adults, ch, hours);
		System.out.println("Adult ride fare = $ "+ adride);
		int childride=rd.childRide(children, ch, hours);
		System.out.println("fare of child ride = $ "+childride);
		int totamount=adride+childride;
		System.out.println("Total amount is = $ "+ totamount);		   
	}

}
