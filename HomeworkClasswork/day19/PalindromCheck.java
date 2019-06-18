package day19;

import java.util.Scanner;

public class PalindromCheck {
	 public static void main(String[] args) {
		    
		    Scanner scan = new Scanner(System.in);
		    System.out.println("ENTER A name");
		   
		    String name = scan.nextLine() ;
		  		   
		        int count = name.length();
		        int vStart=0, vEnd=count-1;
		        int isPalindrom=0;
		        int sameCount=0;
				 System.out.println(count);
				 System.out.println(sameCount);

		        while(vStart<count) {
		            if(name.charAt(vEnd--) == name.charAt(vStart++)) {
		                sameCount++;
		            }
		            
		        }
		        if(sameCount == count) {
		            System.out.println("palindrom");
		        } 
		        else {
		        	System.out.println("not palindrom");
		        }
		  
		 System.out.println(count);
		 System.out.println(sameCount);
	 
	 }
	 
	 }
