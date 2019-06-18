package day26;

import java.util.Arrays;

public class ReverseanArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

// reverse this array so the value of numbers array 
		// will be in reverse order
		// do not create a new object 
		
		int[]numbers= {11,2,39,7,4,15};
		             //0  1  2 3 4 5
	
	     int count=numbers.length;           // 5 sifirin yerine gecicek 4 1 in yerine gecicek 
		          // swap yapmmaiz lazim o yuzden temp lazim 
		System.out.println(Arrays.toString(numbers));
	
	int temp=numbers[0];
	numbers[0]=numbers[5];
	numbers[5]=temp;
	

	 temp=numbers[1];
	numbers[1]=numbers[5-1];   //second iteration 
	numbers[5-1]=temp;
	
	 temp=numbers[2];
		numbers[2]=numbers[5-2];   //third iteration 
		numbers[5-2]=temp;
	
	System.out.println(Arrays.toString(numbers));
	}

}
