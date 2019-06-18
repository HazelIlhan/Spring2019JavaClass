package day28;

import java.util.Arrays;

public class MultiDArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// print each every value
		int[][] table = new int[4][2];
		table[0][0] = 12;
		table[0][1] = 17;
		table[1][0] = 3;
		table[1][1] = 40;
		table[2][0] = 44;
		table[2][1] = 27;
		table[3][0] = 23;
		table[3][1] = 12;

		for (int[] eachRow : table) { // sagdki array object
			for (int eachCell : eachRow) {
				System.out.print(eachCell + " ");

			}
System.out.println();// hepsii ayri  ayri print ett row un 

		}

	for (int i = 0; i < table.length; i++) {
		int[] eachRow=table[i];// each item i gormek icin bunu yaziyorz
		
		System.out.println(Arrays.toString(eachRow));
		
		for (int j = 0; j < eachRow.length; j++) { // burda eachrwo yerine table[i] yaziyoruz 
			//System.out.println(eachRow[j]+" ");// burda eachrwo yerine table[i] yaziyoruz 
			System.out.println(table[i][j]+" ");
		}
	System.out.println();
	}
	
	
	}
}