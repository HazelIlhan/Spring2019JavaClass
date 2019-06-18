package day30;

import java.util.Scanner;

public class MethodUtilityScanner {
//1
	public static void main(String[] args) {
		// TODO Auto-generated method stub

// what if we do create a method print users input 	
	//I dont want to cretae scanner or no external data
		// simple scnerio would be use scanner to get user  inout
		// can we make a method 
		// printUsersName()	;
		// to type of calling method with class or without
		 printUsersName() ; //2
		 MethodUtilityScanner.printUsersName() ; //5 repeat againz
		  

		  }
		  
		  public static void printUsersName() {
		 //3  
		    Scanner scan = new Scanner(System.in) ; 
		    System.out.println("Enter your name please");
		   //4 
		    String name = scan.next(); 
		    System.out.println("You entered : " + name);    
		    
		  }
}