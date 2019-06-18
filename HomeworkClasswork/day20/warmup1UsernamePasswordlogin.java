package day20;
import java.util.Scanner;
public class warmup1UsernamePasswordlogin {
	

	

	  public static void main(String[] args) {
	    
	    /*
	     * while( some condition is true){
	     *     action to be repeated
	     * }
	     * 
	     * do{
	     *     action to be repeated
	     * }while(some condition is true); 
	     * 
	     * */
//	    
//	    String name = ""; 
//	    String pass = "";
	   Scanner scan = new Scanner(System.in); 
	   System.out.println("Enter username : ");
	   String  name = scan.next(); 
	   System.out.println("Enter Password : ");
	   String   pass = scan.next(); 
	 
	    while(  !( name.equals("abc")&& pass.equals("123") ) ) {
	      
	      System.out.println("Enter username : ");
	      name = scan.next(); 
	      System.out.println("Enter Password : ");
	      pass = scan.next(); 
	      
	    }
	    
	    
//	    do {
//	      
//	      System.out.println("Enter username : ");
//	      name = scan.next(); 
//	      System.out.println("Enter Password : ");
//	      pass = scan.next(); 
	//
//	    }while(  !( name.equals("abc")&& pass.equals("123") ) ) ; 
	    
	    System.out.println("END");
	    
	  }

	}