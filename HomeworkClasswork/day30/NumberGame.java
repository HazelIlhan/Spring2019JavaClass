package day30;

public class NumberGame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Task 2 
	    /* 2.1
	     * create a static method with no return type
	     * called printTheDoubledNumber
	     * it takes 1 int as parameter
	     * and it will print out doubled number on the console
	     * 
	     * 2.2 
	     * create another static method with no return type
	     * called checkForAge 
	     * it takes 1 int age as parameter
	     * inside body , check whether the age is more than 18 
	     * if the age is more than 18 --> print adult 
	     * if not print not an adult  
	     * 
	     * */
		
	
	printTheDoubleNumber(10);// ---20
	int i=21; // this is passing data do variable 
	checkForAge(21);//adult
	checkForAge(i);
	
	}
     //                                       //PARAMETERS   
	public static void checkForAge(int age){
	// demek yerine icine int age yazdik
	if (age>18) {
	System.out.println("adult");
		
	}else {
		System.out.println("not");
	}
	}
	// int a is called method parameters
	public static void printTheDoubleNumber(int a){
		// BODY GOES HERER
			int doubleNum=a*2;
		System.out.println(doubleNum+"WAS DOUBLED");
			
		}
		
	
	
	
}
