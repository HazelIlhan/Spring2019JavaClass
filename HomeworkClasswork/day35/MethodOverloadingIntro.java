package day35;

public class MethodOverloadingIntro {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/* Can I use same method name for different methods?
 * Yes that is called method overloading 
 * definition :Reusing the name if the method with different method parameters
 * 
 * 
 */
		
	printName();	
	printName2("JAVA");	
	printName3("JAVA","Spartan");	
	
		
	}
	
	
	public static void printName() {
		System.out.println("method overloading");
	}
	public static void printName2(String name) {
		System.out.println("method overloading "+name);
}
	
	
	public static void printName3(String firstName,String lastName) {
		System.out.println("method overloading "+firstName+lastName);
	}
	
	
}



