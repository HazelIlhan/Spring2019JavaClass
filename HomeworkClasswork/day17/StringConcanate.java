package day17;

public class StringConcanate {

public static void main(String[] args) {
		
		String a = "abc";  //+ "efg"; 
		
		String b = a.concat("efg"); 
		
		String c = "abcefg" ; 
		
		System.out.println(  b == c  );
		

	}

}