package day28;

public class TwoDArray3rdWay {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int []nums= {1,23,4};// we cannot declare first and assign later with this shortcut 
int[][]data= {{2,14,3}, {4,5}, {9}};// each item is another array in here alway remember 

	for (int[]row:data) {
	
		for(int cell:row) {
			System.out.print(cell+" ");
			
			
		}
	System.out.println();
	}	
	
	for (int i = 0; i < data.length; i++) {
		System.out.println("row number"+(i+1)+":");
	
		// how do I get each item every row 
		for (int j = 0; j < data[i].length; j++) {
			System.out.print(data[i][j]+" ");
		}
		System.out.println();
	}
// data [0] [0] =2 | data [0] [1[ =14 how can see output like this 

	
	
	
	
	
	
	
	
	
	
	
	}
}