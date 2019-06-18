package day26;

import java.util.Arrays;

public class SplitTask1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//Create a string called groceries
		// add item separated by comma
		// split and print them out
		
		// find out size of split
		//sind out length of each items
		
		
		String str="Chicken,lemon,mint,vinegar";
		System.out.println(str.substring(0, 1));
		String[] items =str.split(",");
		System.out.println(Arrays.toString(items));
		System.out.println(items.length);
		
// split method from String class is used to split up 
// string into multiple pieces accprding to the dilemeter that provided
// and return it as String array 
// if the given does not exist 
	
		
		for(int i=0; i<items.length;i++) {
			//System.out.println(items[i].length()+"cc");
			System.out.println(items[i].trim().length());
		}
		
		
		
	}	
		
	}


