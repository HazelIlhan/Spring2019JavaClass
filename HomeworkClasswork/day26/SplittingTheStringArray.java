package day26;

import java.util.Arrays;

public class SplittingTheStringArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//String str="Java is fun";

// splitting by ceratin delimeter yani by the space 
//str.split buna kullaniyruz 

	
String str="Java is fun,java is challenging";	
	
String[] words=str.split(" ");// nereden split ediceksin 
System.out.println(Arrays.toString(words));//[Java,is ,fun]


	
String[] parts=str.split("a");// a split ediceksin 
System.out.println(Arrays.toString(parts));//[[J, v,  is fun]
String[] parts2=str.split("is");// a split ediceksin 
System.out.println(Arrays.toString(parts2));//[[J, v,  is fun]


	}

}
