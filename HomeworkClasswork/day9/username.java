package day9;

import java.util.Scanner;

public class username {
	public static void main(String[] args) {
	
		 
		String username="Nurdan";
		String password="abcd12";
		Scanner scan=new Scanner(System.in);
		
	System.out.println("Enter your username");
	username=scan.next();
	System.out.println("Enter your password");
	password=scan.next();
	
	
 boolean usernameEqualToExpected=username.equals("Nurdan");
	boolean passwordEqualToExpected=username.equals("abcd12");
	
	if (username.equals("Nurdan")) {
		System.out.println("login succesful");
	}else {
		System.out.println("login failed");
	}
	
	}
}
