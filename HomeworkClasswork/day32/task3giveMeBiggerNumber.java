package day32;

public class task3giveMeBiggerNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int biggerNum=giveMeBiggerNumber(10,12);
		System.out.println(giveMeBiggerNumber(10,12));
		System.out.println(giveMeBiggerNumber(100,120));
	}
public static int giveMeBiggerNumber( int a, int b) {
	
	int max=(a>b)?a:b;
	return max;
	// diger yol yazmak icin store etmeden direct 
	// return  a>b)?a:b;
}
	
	
	
	
	
	
	
}
