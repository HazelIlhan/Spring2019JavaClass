package day19;

public class appReverse {

	public static void main(String[] args) {

		String app = "app";
		String reversedApp = "";

//		    reversedApp = reversedApp + app.charAt(2) ; 
//		    System.out.println(reversedApp);
		//
//		    reversedApp = reversedApp + app.charAt(1) ; 
//		    System.out.println(reversedApp);
		//
//		    reversedApp += app.charAt(0) ; 
//		    System.out.println(reversedApp);

		//int x = 2;
		int a=app.length()-1;

		//while (x >= 0) {
		while (a >= 0) {
			reversedApp = reversedApp + app.charAt(a);

			System.out.println(reversedApp);

			a--;

		}
		System.out.println("final value of reversed word is " + reversedApp);

	}

}