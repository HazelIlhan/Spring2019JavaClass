package day12;

import java.util.Scanner;

public class task3 {

	public static void main(String[] args) {
		  Scanner scan = new Scanner(System.in); 
		    
		    
		  
		    System.out.println("Enter Day Numbers ");

		    int dayNum = scan.nextInt();
		    String dayWord="Unknown";
		  

		    switch(dayNum) {
		    	case 1:
		    	dayWord="Monday";
		    		System.out.println(dayWord );
		    		break;
		    	case 2:
		    		dayWord="Tuesday";
		    		System.out.println(dayWord);
		    		break;
		    	case 3:
		    		dayWord="Wednesday";
		    		System.out.println(dayWord );
		    		break;
		    	case 4:
		    	dayWord="Thursday";
		    		System.out.println(dayWord );
		    		break;
		    	case 5:
		    		dayWord="Friday";
		    		System.out.println(dayWord);
		    		break;
		    	case 6:
		    		dayWord="Saturday";
		    		System.out.println(dayWord );
		    		break;
		    	case 7:
		    		System.out.println(dayWord );
		    		break;
		    		
		    	default :
		    		dayWord="invalid day";
		    		System.out.println("dayWord is"+dayWord);
		    		break;
		    		
		    }
	}

}
