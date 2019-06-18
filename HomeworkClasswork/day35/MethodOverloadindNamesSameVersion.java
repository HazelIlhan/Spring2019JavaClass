package day35;

public class MethodOverloadindNamesSameVersion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	
	 
		    /*
		     * can i use same method name for different methods ? 
		     * YES !!!!!! 
		     * That's called method overloading 
		     * 
		     * Definition : 
		     *    reusing the name of the method with different method parameters
		     * you can have method with difefrent parameter count 
		     * you can have method with difefrent parameter type
		     * or both 
		     * */ 
		    printName(); 
		    printName("JAVA ");
		    printName("JAVA ", "Spartan");
		    System.out.println();
		    
		  //System.out.println( printName("JAVA "));// problem veriyor cunku vid no return valu bunu print edemezsin 
}
		  public static void printName() {
		    System.out.println(" Method overloading ");
		  }
		  
		  public static void printName(String name) {
		    System.out.println(" Method overloading " + name);
		  }
		  
		  public static void printName(String firstName, String lastName) {
		    System.out.println(" Method overloading " + firstName+lastName);
		  }
		  
		  

		


}