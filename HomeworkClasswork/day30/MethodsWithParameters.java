package day30;

public class MethodsWithParameters {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//	String s="abc";
//	System.out.println(s.substrng(1,3));
//	
	
	
//	kendime ustteki gibi sunstring yerine gecicek bir 
//	method yapmak istiyorum 
	printTheSum(10.5,20.9); //double yaratmak istiyorum 
	printTheSum(123.9,200.9);
	printTheSum(11.33,44.1);
	printTheSum(11,5); //bunu sonrdan ekledik int olursa ne olur diye 
	}
//no object no return value  juct print 
	// double icin parantez icine doube a,double b yaziyoruz
	public static void printTheSum(double a,double b) {
	// eger int eklersem 11 ve 5 gibi double a =11; olucan can you store int in doube but double has much bigger range 
		//
		
		double sum =a+b;
System.out.println("the sum of numbers"+sum);	
}
}

// can I make (int a ,double b) yaparsak.
// down cast yap nasil( (int)10.5 ,20.9)   