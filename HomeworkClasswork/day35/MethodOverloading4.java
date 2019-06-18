package day35;

public class MethodOverloading4 {

	
	// is this correct overloading ?
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
add(10);  // ANY LITERAL(DIRECT NUMBER NOT STRING NUMBER )  NON FRACTIONAL  NUMBER WILL BE SEEN AS INT 
//add(10L);// ANY FRACTIONAL NUMBER IF YOU DONT SAVE IT IT  WILL BE SEEN AS DOUBLE
// BUNU DOWNASTING YAPIYOURZ 
add((int)10L);


//QUESTION?

// LET COMMENT 10 NE OLCAK 
	}// this method can take any argument type int or anything that can be stores inside int variable 
	// for example short and bytes are allowed 
	// but not long or double 
	public static void add(int x) {
		
		System.out.println("int x"+x);
	                                       // line 12-20  yazdik calisti  lets call this method go to 10 it will ick up most specific one
}
public static void add(long x) {
		
		System.out.println("long x"+x);
}
}

// AMA 11 ACIK BIRAK 16 ACIK BIRAK LONG INTTEN BUYUK BUYUK OLANI GIDIP INT E KOYAMAZSIN 
// HOW WE CAN FIX IT WITH CASTING 