package day28;

import java.util.Arrays;

public class BinarySearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		
		
		//int[] nums= {11,20,4,6,54,19,5};//1
		// ustekini sort ettik simdi onu yazip devam ediyoruz ona comment yaptim 
		int[] nums= {4, 5, 6, 11, 19, 20, 54};//8
	// ARRAY OBJECT MMUST BE SORTED BEFORE USING THIS METHOD 
		Arrays.sort(nums);// once siiraya soktuk2
		
		System.out.println(Arrays.toString(nums));//3
		int index=Arrays.binarySearch(nums,5); // sana index nosunu veriyor //4
		System.out.println(index);//5
		int index20=Arrays.binarySearch(nums,20); // sana index nosunu veriyor //6
		System.out.println(index20);//7
	//if we dnt have the item in array we will get minus number to point the insertion point of the array 
		//to keep array sorted
		int idx10=Arrays.binarySearch(nums,10);// if you have 10 nereye insert ederdin -4
		System.out.println(idx10);
	
	
		int idx100=Arrays.binarySearch(nums,100);// if you have 100 nereye -8
		System.out.println(idx100);
		int idx3=Arrays.binarySearch(nums,3);// if you have 100 nereye -8
		System.out.println(idx3); // first item olacagini gosteriyor -1  lets give me the sirasini minus dahi olsa 
	// always interview arrays alwasy have to be sorted 
	int[]nums100=new int[100];
	Arrays.fill(nums100, 5);
	System.out.println(Arrays.toString(nums100));  // icini doldumak icin kullaniyor store etmez sort gibi 
	
	
	}
	
	

}
