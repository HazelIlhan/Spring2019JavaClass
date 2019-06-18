package day33;

public class hw175 {

	public static int findMax(int[]arr1) {
		int max = arr1[0];
		for (int i = 0; i < arr1.length; i++) 

			
			if ( arr1[i]>max) 
				max = arr1[i];
				return max;
			
			
		}
		
	public static double  findMax(double[]arr1) {
		double max = arr1[0];
		for (int i = 0; i < arr1.length; i++) 

			
			if ( arr1[i]>max) 
				max = arr1[i];
				return max;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	
		
		
		
	}
}
/*
 * In this task, you need to write 2 methods findMax() that will find a maximum
 * number in the array. First method should work with array of integers (int[])
 * and return int, and second method s hould work with an array of doubles
 * (double[]) and return double as a result.
 * 
 * Methods must have the same name and different parameters. Fo more
 * information: https://docs.oracle.com/javase/tutorial/java/javaOO/methods.html
 * 
 * Comment: Methods should be non static and with a return type.
 */