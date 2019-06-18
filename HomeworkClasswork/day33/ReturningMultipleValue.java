package day33;

import java.util.Arrays;

public class ReturningMultipleValue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] myArray=giveMeAnArray();
		// calling it one shot
		//System.out.println(Arrays.toString(giveMeAnArray()));
		
		System.out.println(Arrays.toString(myArray));
	}
public static int [] giveMeAnArray() {
	System.out.println("Action");
	//return  10; //i WANNA RETURN MORE VALUE THAT IS WHY WE LEARN ARRAY 
	// How can I do  many value return?yukari int[] ekledik
	// int array retunr etmeni istiyor
	int[] arr=new int[] {1,2,3};

return arr;
}
}
