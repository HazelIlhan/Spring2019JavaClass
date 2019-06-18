package day34;

import java.util.Arrays;

public class VarArgs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Var arg ---- variable number of arguments 
		// we are passing 2 external data to a method that have 2 parameters
			// we can say also 
			// we are passing 2 arguments to a method that have 2 parameters 
		addNumbers(10,12);//FIRST 
		addNumbers2(10,12,13); //SECOND
	//	int [] newarr={1,4,66,33}; 
		
		addManyNumbers(new int[]{1,4,66,33});//THEN TRIED ARRAY 
		System.out.println("-----VARARGS--------C C");
		addManyNumbers2(1,4);
		addManyNumbers2(1,2,3,4);
		addManyNumbers2(1,4,6,7,8);
		
		//addManyNumbers2(new [] INT{1.2.3.}); icine array koyabilirisin ama  yapmaya gerek yok 
//	System.out.println(Arrays.toString(newarr));
	}
	public static void addManyNumbers2(int...manyNums) {  // varArgs is used to creta a method
		// that can take variable numbers of argument of same time type 
		// when being called 
		//vARaRG parameter is represented by using 
		//after methid parameter data type
		// and it can only be used here.
		
		int sum=0;
		for(int eachNum:manyNums) {
			
			
			sum+=eachNum;
		}
		System.out.println(sum);
		
	}
	public static void addManyNumbers(int[] manyNums) {
		
		int sum=0;
		for(int eachNum:manyNums) {
			
			
			sum+=eachNum;
		}
		System.out.println(sum);
	}
	
	
	public static void addNumbers(int num1,int num2) {
		
		System.out.println(num1+num2);
	}
      public static void addNumbers2(int num1,int num2,int num3) {
		
		System.out.println(num1+num2+num3);
}
}
