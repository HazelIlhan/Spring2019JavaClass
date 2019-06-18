package day38;

public class WrapperClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//doSomething(new Integer(100)); // once do ihave axact match yes int we have .Integer icin de ayni sey exact match varsa inangidicek.
		
		doSomething(Integer.valueOf(100));
		//Integer x=100;
		//doSomething(x);
		doSomething(100);
		
		
		doSomething(Integer.parseInt("100")); // parse int her zaman primitive e ceviriyor print edince assgidan int x i print ediyor 
		
		//doSomething(null); // why we can assign a null-null a bisey assign edeceiz 
		// can we set a Integer variable value to null?
		//YES 
		//int x=null; bad idea
		//Integer b=null;
		//doSomething(b);
		//doSomething(null);


	}
		public static void doSomething(int x) {// simdi bunu koyduk 
			
			System.out.println("doSomething(Int x)");
		}
		
		
	

	
	public static void doSomething(Integer x) {
		
		System.out.println("doSomething(Integer x)");
	}
	
	
	
}
