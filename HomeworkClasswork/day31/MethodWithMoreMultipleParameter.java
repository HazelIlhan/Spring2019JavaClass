package day31;

import java.util.Scanner;

public class MethodWithMoreMultipleParameter {

	// create a static method called login
	/*
	 * it return nothing It takes 3 parameters : user as String , password as
	 * String, rememberMe as boolean inside body You entered username : ---- You
	 * entered password : ---- print you checked remeberMe checkbox if it's true
	 * print you did not check remeberMe checkbox if it's false
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);
		System.out.println("Enter your name");

		String username = scan.next();
		System.out.println("Enter your password");
		String password = scan.next();

		System.out.println("Do your remember?");
		boolean rememberMe = scan.nextBoolean();
		login(username, password, rememberMe);

	}
	// eger scanner yapmak istemiyorsan
	// login("sartan","s300",true);
	//login("horse","h300",false;
// create a data for action 
	public static void login(String username, String password, Boolean rememberMe) {
		System.out.println("You entered username" + username);
		System.out.println("You entered password" + password);
		if (rememberMe) {
			System.out.println("you checked rememberMe checkbox");
		} else {
			System.out.println("you did not check remeberMe checkbox");

		}
	}
}
