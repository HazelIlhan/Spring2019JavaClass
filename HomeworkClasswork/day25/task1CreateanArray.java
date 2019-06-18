package day25;

import java.util.Arrays;

public class task1CreateanArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//create an array of int with capacity of 50 
		//store 1-5- inside
		//print them out 
		int[]numbers=new int[50];
	String str="";	
		
	for(int i=0;i<50;i++) {
	numbers[i]=i+1;
		//System.out.print(numbers[i]+" ");
	str+=numbers[i]+", ";
	
	}
	System.out.println(str.indexOf("3"));
	System.out.println();
	
	System.out.println(Arrays.toString(numbers));		
}
}

