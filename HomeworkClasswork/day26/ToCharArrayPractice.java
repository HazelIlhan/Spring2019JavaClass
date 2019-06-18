package day26;

import java.util.Arrays;
import java.util.Scanner;

public class ToCharArrayPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	// task 2
		// get user input usind scanner as string name
		// turn it int char Array and count 
		
		Scanner scan=new Scanner(System.in);
		String name=scan.next();
		// Ask user to enter the char to count
		//Since we can not store user input as a character 
		//we will just ask for String then turn it into character
		
		
		
		
		
		System.out.println("enter char to count");
		String userCharStr=scan.next();
		// diyelim a girdi 
		char charToLookFor=userCharStr.charAt(0); // I assume user only out one character 
		// i use char at 0 
		
		
		
		
		char[]nameChars=name.toCharArray();
		
		System.out.println(Arrays.toString(nameChars));
		int counter=0;//  
		
		for(int i=0;i<nameChars.length;i++) {
			if (nameChars[i]==charToLookFor){
					counter++;
					
			}
		}
		
		
	System.out.println("The count is"+charToLookFor+counter);
	
	
	


}
}



//there is no way to get scanner for char we have to use string with char at method 
