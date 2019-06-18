package day30;

public class WarmUpMeThodCreate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

sayHello();
WarmUpMeThodCreate.sayGoodBye();
sayHelloTo("300 Spartans");
sayHelloTo("joN SNOW");

// calling sttatic methos
	// className.staticMethodnAME()	;
// if the method is in same class --static
	}
	public static void sayHello() {
	
// sttaic do i need a object or not need  demek 
	// I do not retunr a vlaue o  zaman void 
	System.out.println("Greeting spartans");
	}
	public static void sayGoodBye() {
		System.out.println("Bye spartans");
		
		
		
	}

	
	public static void sayHelloTo(String name) {
		System.out.println("Greeting"+name);
	
}
}