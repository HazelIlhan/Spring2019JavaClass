package day21;
import java.util.Scanner;
public class WarmUpDoWhileKeepAskMoreThan100Akbar {
	

	
	  public static void main(String[] args) {
	    
	    // WARM UP -- USE DO WHILE LOOP
	    /*
	    ASK USER TWO NUMBER

	    KEEP ASKING UNTIL THE SUM OF
	    TWO NUMBERS ARE MORE THAN 100

	    PTINT THE END AFTER THE LOOP

	    OPTIONAL : 3 ATTEMPS ONLY
	    */
	    Scanner scan=new Scanner(System.in);
	    System.out.println("Enter two numbers: ");
	    
	    int x=0 , y = 0 ; // do while kullandik cunku ilk once mutlaka degeri print etmesini istedi 
	    int tryCount = 0 ; // condition ne olursa olsun ilk degeri ver bana 
	    do {
	      
	      System.out.println("Enter num1");
	      x = scan.nextInt();
	      System.out.println("Enter num2");
	      y = scan.nextInt();
	      
	      ++tryCount ;  /// sadece 3 kez denemeni istiyirum uc ten sonra exit yap 
	      if(tryCount==3) {
	        //System.out.println("YOU LOST!");
	        break; 
	      }
	      
	    }while( x+y <= 100 ) ; 
	    
	    System.out.println("THE END");
	    
//	    int num1 = scan.nextInt();
//	    int num2 = scan.nextInt(); 

	  }

	}


