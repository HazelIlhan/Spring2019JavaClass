package day34;

public class BreakReturn {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//return kewword
		//Where can we use it ?
		/*it can be used to get out of any method 
		 * 
		 * it can be used to get out of method 
		 * including method with retun type or void method 
		 * 
		 * once return keyword is reached ,method stop executing 
		 * you cant have two return in same execution path 
		 * 
		 * break vs return 
		 * break--- loop+switch 
		 * return--- to return a value or terminate method execution 
		 * System.exit(0);  shut down the jvm  entire app stop execution 
		 * 
		 * 
		 */
		int x=20;
		
		System.out.println("abc");
		if (x>10)
		return;// return always comes at the end
		//return "abc";// not works
		//System.out.println("the end"); unreachable code 
		
		System.out.println("the end");
	}

}
