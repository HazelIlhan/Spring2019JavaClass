package day31;

public class WarmUpCountMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	/*WARM UP TASK 

Create few static methods with no return type with below name and logic

1, create a method called countFrom1To10
take no parameters 
print 1-10 in one line with space

2, create a method called countFrom1ToN
take 1 int as parameter  
print 1-N(number user passed) in one line with space

3, create a method called CountDown
take 1 int as parameter 
and count down till 1 in method body*/
		countFrom1to10();
		System.out.println();
		countFrom1toN(7);
		System.out.println();
		CountDown(20);
	}

	public static void countFrom1to10() {// bu uc linei biz countFrom1to10 methodu olrak cagiriyoruz
		for (int i = 1; i < 11; i++) {//
			System.out.print(i + " ");//
		}
	}

	public static void countFrom1toN(int n) {
		for (int i = 1; i <= n; i++) {
			System.out.print(i + " ");// some methods gets external daata 
		}

	}

	public static void CountDown(int n) {
		for (int i = n; i > 0; i--) {
			System.out.print(i + " ");
		}
	}
	
	
	
	
	
	
	
	
	
	
	
	
	}


