package day24;

public class ArrayFindEvenNumberPrintSthgFromString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	
	
	
//	int[]intArray= {1,2,4,5,7};
//	for (int item: intArray){
//		System.out.println(item);
		
		
//		String[]strArray= {"dave","eva","mouse"};
//		for(String item:strArray) {  //  Array is collection -- you write first data type then collection
//			System.out.println("items "+item);
//		
		
		
		//FINDING EVEN NUMBER
		
				int[]intArray= {1,2,4,5,11,6,123};		
		for(int item:intArray) {
			if (item%2==0)
				
			System.out.println(item);
		}	
			
			// PRINTING FROM STRING 
	String[]strArray= {"aaa","bb","cafd"};
			for(String letters:strArray) {
				if(letters.contains("b")) 
//					System.out.println("found b");
//					break;
			
				System.out.println(letters+" ");
			}
		// for  loop ile yap 
		for (int i = 0; i < strArray.length; i++) {
			System.out.println(strArray[i]);
			
		}
			
		
	}
	
	
	
	
	
	

}
