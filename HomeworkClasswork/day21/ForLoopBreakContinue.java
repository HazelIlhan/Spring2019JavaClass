package day21;

public class ForLoopBreakContinue {
	//loop control statment2 akbar ismi bu 

		  public static void main(String[] args) {
		    
		    
//		    for (int i = 1; i <=10; i++) {
//		      
//		      if (i==5) {
//		        break; 
//		      }
//		      
//		      System.out.println("GOT SMART WATER? "+ i);
//		      
//		    }
		    
		    for (int i = 1; i <=10; i++) {
		      
		      if (i==5) {   /// Burada break yapmiyor continue diyerek sadeec 5 e kadar gelmesini sagliyor
		        continue; 
		      }
		      
		      System.out.println("GOT SMART WATER? "+ i);
		      //break ; bunu koydugumda i=1 kucuk mu evet 5 e esit mi hayir o zaman 1 i print edip cikiyor exit.
		      
		    }
		    

		  }

		}

