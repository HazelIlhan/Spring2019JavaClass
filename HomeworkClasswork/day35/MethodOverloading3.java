package day35;

import java.util.Arrays;

public class MethodOverloading3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
            /* passing 123 as argument for the method 
             * that have one int parameter     
             * 
             *  method signature----method name+parameter list
             *  
             */
		
		
		//123 is argument
		doSomething(123);
		doSomething();
		
		
		String name="Baryy";
		
		char[] nameChars=name.toCharArray(); // how to turn it char Array
		// getting each char as string Array 
		System.out.println(Arrays.toString(nameChars));
		String[] nameCharsStr=name.split("");
		System.out.println(Arrays.toString(nameCharsStr));
				Arrays.sort(nameCharsStr);
				System.out.println((Arrays.toString(nameCharsStr))); // sort etti aslinda B daha buyuk 
		
		
		                      //method parameter
	}
public static int doSomething(int y) {    //how do we know which one is called //what you are passing to the methodla 
	System.out.println("do something 2");
	return 0;
}
public static void doSomething() {
	System.out.println("do something 22432423");
	
	
	
}
}