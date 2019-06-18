package day19;
import java.util.Scanner;

public class LoopingChars {


	  public static void main(String[] args) {

	    Scanner scan = new Scanner(System.in);

	    String str = scan.next();
	    // how to check whether string start with a-z
	    char firstChar = str.charAt(0); // if this ch between a to z or not 

	    //ABC System.out.println('a' > 'b'); what this is comparing? it is getting its ascii number and and give you boolean value 
// a comes before b so nunber is lower 
	    if (firstChar >= 'a' && firstChar <= 'z') {

	      System.out.println(" lower case letter");

	    } else {

	      System.out.println("NOT a-z");
	    }

	  }

	}


