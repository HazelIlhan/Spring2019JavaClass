package day20;

import java.util.Scanner;

public class MakeFirstLetterUpperCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	
	Scanner scan=new Scanner(System.in);
//FIRST WAY TO DO IT 	
String name=scan.next();
String firstUp=name.substring(0,1).toUpperCase();

String expected=firstUp+name.substring(1);

System.out.println(expected);
	/// SECOND WAY TO DO IT 
// Charla yapmak kolay ama char integer onu string 
//yapabiliriz .Nasil?
String upc=(name.charAt(0)+"");// 
	System.out.println(upc.toUpperCase()+""+name.substring(1));


	}

}
