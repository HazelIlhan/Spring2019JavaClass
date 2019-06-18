package day34;

import java.util.Arrays;

public class MethosWith2DArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * create a method called twoDPrinter 
		 * accept one 2D int array object as parameter 
		 * and print them all out in excel like row and column 
		 
		   create a method called get2DArray
		   accept 2 int as parameters , row, col
		   return 2D array object in below logic : 
		     
		   get2DArray(2,3) --->> { {1,2,3},{1,2,3} }
		 
		 
		 * */

		
		int[][] twoDarrOjb= {{2,3,7},{4,8,9}};
		twoDPrinter(twoDarrOjb);
	int x,y;
	
	}

	
	public static void twoDPrinter(int [][]twoD) {
	//	System.out.println(Arrays.deepToString(twoD));
		
		
		
		for(int[]eachArr:twoD) {
			
			for(int eachnum:eachArr) {
				
				System.out.print(eachnum+" ");
			}
			System.out.println();
		}
	}
	
	
	
	
	
	
}
