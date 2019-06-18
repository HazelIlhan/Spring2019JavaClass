package day13;

import java.util.Scanner;

public class task1 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		 String word1 = s.next();
		 String word2 = s.next();
	   
	    boolean b = word1.equalsIgnoreCase(word2); 
	    System.out.println(  b     );
	 
	    if (word1.length()>=word2.length()) {
		  System.out.println(word2);
	  System.out.println(word1.charAt(1));
	    }
	    else {
	    	 System.out.println(word1.charAt(2));	
	    }
	    
	    char k=word1.charAt(word1.length()-1);
	  
	    switch (k){
		  case 'a':
		    System.out.println("name ende with a");
		    break;
		    case 'b':
		    System.out.println("b ended with b");
		    break;
		    case 'c':
		    System.out.println("c ended with c");
		    break;
		    default:
		    System.out.println("did not get abc");
		    break;
		    
		    
	    
	    
	    }
	  

	}

}
