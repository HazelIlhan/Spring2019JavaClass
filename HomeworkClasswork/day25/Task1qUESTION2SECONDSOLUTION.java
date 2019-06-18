package day25;
import java.util.Arrays;
public class Task1qUESTION2SECONDSOLUTION {

	

	

	  public static void main(String[] args) {
	    //array is a class specifically design
		  //for workng on array object with many pre defined methods
		  //array.toString(yourArrayobjectinhere)-----[item1,item2.item3]
	    // create an array of int with capacity of 50 
	    // store 1-50 inside 
	    // print them out 
	    int[] nums = new int [50];
	    // BEFORE 50 HERE I only have 0
	    
//	    nums[0] = 1; 
//	    nums[1] = 2; 
//	    nums[2] = 3; 
//	    nums[3] = 4; 
//	    nums[4] = 5;
	// .....
//	    nums[49] = 50;

	    for (int i = 0; i < 50; i++) {
	      nums[i] = i+1; 
	    }
	    System.out.println( Arrays.toString(nums)  ); 
// getting to content out of array object we need to ue arrays.tostring 
//	some methods requires to change it to another method array is one of them 
	    
	 //   nums[0] = 0;  
//	    nums[1] = 2; 
//	    nums[2] = 4; 
//	    nums[3] = 6; 
//	    nums[4] = 8;
	// .....
//	    nums[50] = 100;
	   
	    int[] evenNumbers = new int[51] ; 	 
	    for (int i = 0; i <=50 ; i++) {
	      evenNumbers[i] = i * 2 ; 
	    } 
	    System.out.println( Arrays.toString(evenNumbers))  ;
	    
	    
	    
	        
	    
	    
	    
	    // create another array of int with capacity of 50 
	    // store even numbers from 0-100 inside
	    // print them out 
	    
	    
	    
	    
	    
	    

	  }

	}
