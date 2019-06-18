package day28;

import java.util.Arrays;
import java.util.Scanner;

public class ArraysClassMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*Arrays Class methods to work with array object
 * 
*toString (arrObject); 		  return string rep of array items 
*sort(arrObject); sort the array it is not gonna create a new string jusy play with insid e
*copyOf(arrObject.lengthOfNewArr)  new array withlength defined an everthing copied from original 
**copyOfRange (arrObject,from,to) works like substring 
**equals(arr1,arr2)  true false if all eements are the same and 

binary search 

	some actions give back to value some not sort is  not 	
		*/
	
	String[]words= {"coding","start","to","Day","Perfect","Sunday"};
	
	//I wanna get first two  tword I used copy of method
	
	Arrays.sort(words);
    System.out.println( Arrays.toString(words) );

	
	String[]first2words=Arrays.copyOf(words,2);
	System.out.println(Arrays.toString(first2words));
	
	String[]tenItem=Arrays.copyOf(words,10);
	System.out.println(Arrays.toString(tenItem));
	
	
	
    
    
    
    
   
   
   

 }

}
