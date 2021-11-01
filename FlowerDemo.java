
import java.util.Scanner;

public class FlowerDemo {
	static void displayFlowers(int ch) 
    { 
      switch (ch) {
      case '1':
      	 System.out.println("Continent: Asia");
   		 System.out.println("Country name: India.  " + "National flower: Lotus");
   		System.out.println("Country name: Pakistan.  " + "National flower: Jasmine");
   		System.out.println("Country name: Nepal.  " + "National flower: Lali guras");
          break;
      case '2':
      	System.out.println("Continent: Europe");
  		 System.out.println("   Country Name and National Flower");
  		 System.out.println("Country name: Germany.  " + "National flower: CORN FLOWER");
  		System.out.println("Country name: France.  " + "Natioanl flower: LILY");
  		System.out.println("Country name: Greece.  " + "National Flower: ACANTHUS MOLLIS");
         break;
      case '3':     
    	  System.out.println("Continent: Africa");
    		 System.out.println("   Country Name and National Flower");
    		 System.out.println("Country name: Egypt.  " + "National flower: Blue Lotus");
    		System.out.println("Country name: Nigeria.  " + "National flower: Yellow Trumpet");
    		System.out.println("Country name: Kenya.  " + "National flower: Orchid");
           break;
      case '4':
          System.out.println("Exit\n");
          System.exit(0);
          break;

      default:
          System.out.println("Choose continent name");
          break;
  }
  } 
public static void main(String[] args) 
{ 
	char ab;
	Scanner sc = new Scanner(System.in);
	boolean la = true;
	do {
   System.out.println("continent name \n 1 Asia \n 2 Europe \n 3 Africa \n 4 Exit\n");
    ab = sc.next().charAt(0);
	 FlowerDemo fd = new FlowerDemo(); 
    FlowerDemo.displayFlowers(ab); 
	} while (la);
	
	
  } 
}

	
		
		
				
		
		