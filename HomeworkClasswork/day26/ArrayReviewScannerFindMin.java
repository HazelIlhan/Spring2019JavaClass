package day26;

import java.util.Arrays;

public class ArrayReviewScannerFindMin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/* 3 ways to create anArray
 * 1-----
 */
  String names []=new String [5]; 
  
  // defult value is null
  names[0]="abc";
  names[1]="ef";
  names[2]="gh";
  System.out.print(Arrays.toString(names)); // print edince [abc,ef,gh,nul,null]
                                    //null
  ///---------2
  System.out.println();
  String[] names2 = new String[] {"aaa","bbb", "" , "ccc"} ; 
  
  int x = 0 ; 
  while(x< names2.length) {
    
    System.out.println(  names2[x] );
    x++ ; 
  }
  
  // This must happen in one statenment 
  String[] names3  =  {"asdads","ssss0"} ; 
  
  

}

		
		
		
		
	}


