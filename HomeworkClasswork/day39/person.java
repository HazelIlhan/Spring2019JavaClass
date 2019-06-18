package day39;

import java.util.Random;
import java.util.Scanner;

public class person {
	// main method is just a place to run your code 
// properties of the object are define by instance variable
	String name; /// each every person will have a name// we call them instance variable/field 
	int age;
	char gender;
	 // bradan asgisini  explorepersonbehaviour class icin create ettik 
	
	//public static void eat() {
	  // any non-static method is called instance method 
	  public void eat() {
	    
	    System.out.println(" eating "); 
	    
	  }
	  
	  public void tellMeYourName() {
	    System.out.println("My Name is " + name);
	  }
	
	
	//public static void main(String[] args) {       /// ClassRunner a yeni bir person actik ve object oldu burdki name age okudu 
		// main method nothing to do with blue print so he moved it 

		// how we are creating an object 
		/*Horse:
		 * 
		 * every horse these properties:color,age,breed  
		 * 
		
		 * behaviors
		 * :jump,eat,run,kick
		 * 
		 * person:
		 * properties:name,age,gender
		 * behaviors :eat,study,laugh,sleep
		 */
		
		
		String str=new String("abc");
		Scanner scan=new Scanner(System.in);
		
		Random ran=new Random();
		
		
	}


