package day28;

import java.util.Arrays;

public class task1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	String str="Sunday Perfect Day to Start coding"	;
	// reverse coding start to Day Perect Sunday
	String[] sentence=str.split(" ");
	

	
	for (int  i = sentence.length-1;  i >=0 ;  i--) {
		System.out.print(sentence[i]+"- ");
	}
		
	// how do you remove dash at last when you come to last iterations skip dash 
	//when i== 0  you dont put dash 
	
	// now store it 
	System.out.println();
	String reversed="";   // loop thriguh to half a git 
		int lastIndex=sentence.length-1;
	for(int i=0; i<sentence.length/2;i++) {
		//System.out.println(sentence[i]); yariya boldu gorduk 
			
			String temp=sentence[i];
			sentence[i]=sentence[lastIndex-i];
			
			sentence[lastIndex-i]=temp;
			System.out.println(Arrays.deepToString(sentence));
			
		}
		
		
		
	}

}
