package day21;
import java.util.Scanner;
public class task1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	Scanner input=new Scanner(System.in);
	System.out.println("Enter ateo  number");
	
	
	// do while kullanmamak lazim cunku at least bir kere denemsini istiyoruz
	
		int number1=0;
		int number2=0;
		do {
				System.out.println("enter num1");
				 number1=input.nextInt();
				System.out.println("enter num2");
				 number2=input.nextInt();
				
			}while(number1+number2<=100);
	
		
		System.out.println("end");
	
	}
}