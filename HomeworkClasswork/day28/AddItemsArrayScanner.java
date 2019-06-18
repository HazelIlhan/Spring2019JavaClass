package day28;

import java.util.Arrays;
import java.util.Scanner;

public class AddItemsArrayScanner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String[]words= {"coding","start","to","Day","Perfect","Sunday"};
	
		// create a program to add items to an array by users input 
	    // {1,23,4,5,6}  , 17  ---> {1,23,4,5,6, 17}  
	    Scanner scan = new Scanner(System.in); 
	    System.out.println("Enter your word to be added ");
	    String usersWord = scan.next() ; 
	    
	    String[] newWords = Arrays.copyOf(words, words.length + 1) ; //AYNI STRING I copyalayiyoruz ve yeni bosluklu string yapiyoruz
	    System.out.println( Arrays.toString(newWords) ); // burada null goruyoruz bosluk ekleniyor
	    
	    int lastSpotIndex = newWords.length-1 ; 
	    newWords[lastSpotIndex] = usersWord ; 
	    System.out.println( Arrays.toString(newWords) );
	     String[] codingStart = Arrays.copyOfRange(words,3,4+1) ; 
	     System.out.println( Arrays.toString(codingStart) );
	
	}

}
