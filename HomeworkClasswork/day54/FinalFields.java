package day54;

public class FinalFields {
	//FINALFIELDS MUST BE INITIALIZED BEFORE OBJECT CREATION COMPLETED
final int NUM=100;
final int NUM2;
final int NUM3;
{
	NUM2=200;


}
public FinalFields() {
	NUM3=300;
	
	
}
public static void main(String[] args) {
	final int x;
	x=20;
	x=30;// local final variable does not have to get inital value IF NOT USED
	// local final variable can not be reassigned once it get initial value 
System.out.println(x);
	FinalFields f1=new FinalFields();
	System.out.println(f1.NUM);
	System.out.println(f1.NUM2);
	System.out.println(f1.NUM3);
	
	//f1.NUM=200; can not reassign value for 
	System.out.println("THE END");
	
}


}
