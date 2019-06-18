package day40;

public class Phone {

	String brand;
	String OS;
	int capacity;
	
	public void ring() {
		
		
		System.out.println("ringing");
	}
	public void dial(long number ) {
		System.out.println("dialing"+number);
		
		
		
	}
	
	// OPTIONAL PART 
//	OPTIONALLY 
//    *   add a behavior to Phone object  
//    *   displayPhoneInfo method accept no param return no value 
//    *   --> this should print all phone attributes 
	 
	  public void displayBrand() {
	    
	    System.out.println("brand: "+  brand );
	    
	  }
	
}
