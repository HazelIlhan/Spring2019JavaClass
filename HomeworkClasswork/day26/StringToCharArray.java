package day26;

import java.util.Arrays;

public class StringToCharArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	// turn the string into a char Array
		String str ="Spartan";
		int size=str.length();
		
		char[] myChars= new char[size];
		
		for (int i=0;i<size;i++) {
			myChars[i]=str.charAt(i);

			
		}
		
		// one length counts of array values
		//length()  count string length
	//------System.out.println(Arrays.toString(myChars));
	
		
		// bunlarin hepsinin yerine sadece CharArray kullanarak iki line de cozebiliriz
	//toCharArray method is a method form string clas
	//and it will take no external data when being called
	// and it will retun character array that have each char of  string object 
	char[]nmyChars=str.toCharArray();
	System.out.println(Arrays.toString(myChars));
	// myChars[0]=str.charAt(0)  bunun uzun hali 
	//myChars[1]=str.charAt(1)
	//
	}

}
