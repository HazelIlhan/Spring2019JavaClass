package day9;

import java.util.Scanner;

public class march12 {

	public static void main(String[] args) {
		  Scanner scan=new Scanner(System.in);
		
		  
	    System.out.println("Welcome to math library!");
	    System.out.println("Enter two numbers:");
	   
	    int num1=scan.nextInt();
	    int num2=scan.nextInt();
	    int sum=num1+num2;
	if (sum>100) {
		System.out.println("You entered great numbers");
	}else {
		System.out.println("You failed");
	}
	}

}
