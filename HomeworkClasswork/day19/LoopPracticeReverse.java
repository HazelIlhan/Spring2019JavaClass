package day19;

import java.util.Scanner;

public class LoopPracticeReverse {
public static void main(String[] args) {
	    
	    Scanner scan = new Scanner(System.in);
	    System.out.println("ENTER A name");
	    
	    String name = scan.nextLine() ;
	    int count=name.length();
	    while(count>0) {
	    	System.out.print(name.charAt(count-1)+"-");
	    count--;
	    
	    
	    }
}
}
