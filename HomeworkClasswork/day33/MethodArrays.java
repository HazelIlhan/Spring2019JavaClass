package day33;

import java.util.Arrays;

public class MethodArrays {
	public class ReturningMultipleValue {
		// Task 2 
		/*
		 * create a static method called combineArray
		 * it takes 2 double array as parameters 
		 * and return another double array with 2 array items combined
		 * */

	
	
	
	}
	
	
	public static double[] combineArray(double arr1[],double arr2[]){
		double[] arr=Arrays.copyOf(arr1, arr1.length+arr2.length);
	for(int	i=arr1.length;i<arr1.length+arr2.length;i++) {
		arr[i]=arr2[i-arr1.length];
	}
 		
		

	return arr;
	
	
}
}