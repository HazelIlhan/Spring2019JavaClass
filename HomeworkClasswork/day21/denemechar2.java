package day21;

public class denemechar2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 String name = "Dilnur";
		String newStr = "" ; 
		    for (int d = name.length() - 1; d >=0 ; d-- ) {
		      //System.out.print(name.charAt(d) + " ");
		      char eachChar = name.charAt(d); 
		      newStr = newStr + eachChar ;
		    }
		    System.out.println( newStr);
		
		
		
		  
		
		
	}

}
