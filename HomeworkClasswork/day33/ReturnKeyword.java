package day33;

import java.util.Scanner;

public class ReturnKeyword {
	
	public static void main(String[] args) {
Scanner scan=new Scanner(System.in);
System.out.println("Enter number:");
int num=scan.nextInt();
if(num<0) {
	return ;/// once return keyword is reached ,method stop excuting
	
	
}
	
	
	System.out.println("complex statement");
	
	
	}
}