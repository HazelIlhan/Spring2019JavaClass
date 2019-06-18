package day12;

import java.util.Scanner;

public class tas1 {
	
	
	public static void main(String[] args) {
		String action;
	Scanner input=new Scanner(System.in);
	 String weather=input.next();
	// action=(weather).equals("sunny")?"go out":"stay home";
	 action=(weather).equalsIgnoreCase("sunny")?"go out":"stay home";
	
	System.out.println(action);
	
}
}
