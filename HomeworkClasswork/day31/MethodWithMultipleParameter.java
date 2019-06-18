package day31;

import java.util.Scanner;

public class MethodWithMultipleParameter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	// repeat method yaz 
		repeat("java",5);
		// any other combination will not work 
		repeat("spartan",300);//lets say you get this info from user
		Scanner scan=new Scanner (System.in);
		System.out.println("Giveme word to repeat");
	
		String str=scan.next();
		System.out.println("Giveme number of time to repeat");
       int i=scan.nextInt();
	repeat(str,i);
	}

	
	public static void repeat(String word,int num) {
	for (int i = 1; i <= num; i++) { // whoever call this method writes num
	 System.out.print(word + " "   );
    }
    System.out.println();
    
  }
  
	
	
}
//defining
