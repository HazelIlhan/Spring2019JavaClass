package day33;

public class WarmUpMaxSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*Create a static method
getSum  
accept 1 paramter as int array 
and return the sum of the all the items in array

another method called 
addAll 
accept 1 paramter as String array 
and return the concatenation of all items 

another method called 
getMax 
accept 1 paramter as int array 
and return the max from the all the items in array
Collapse



*/
		int[] nums = {15, 16 ,9};
		int sum=getSum(nums);
		///System.out.println(getSum(nums));
	/// sout((getSum)new int[]{15,16,9});
	System.out.println("sum of all numbers:"+ sum);
	}

	public static int getSum(int[] arr)  
    { 
        // getting sum of array values 
        int sum = 0; 
          
        for (int i = 0; i < arr.length; i++) 
            sum+=arr[i]; 
          
        return sum;
    } 
} 
	
	
	

