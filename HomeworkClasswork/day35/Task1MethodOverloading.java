package day35;

public class Task1MethodOverloading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
// create a fe static method called addNums
		//first one takes 2 numbers and add them 
	// return the result as int 
		//first one takes 3 numbers and add them 
		// return the result as int 
		//first one takes 4 numbers and add them 
				// does not return a value  just print out 
	
	addNums(1,2);
	System.out.println(addNums(1,2)); // return oldugu icin burda print edebiliyorun 
	System.out.println(addNums(1,2,3));
	addNums(1,2,3);
	addNums(2,4,5,6);  // printedemezsin cunku void 
	
	
	}

	
	
	public static int addNums(int num1,int num2) {
		
	return num1+num2;
		
	}
	
	public static int addNums(int num1,int num2,int num3) {
		
		return num1+num2+num3;
	
}
	public static void addNums(int num1,int num2,int num3,int num4) {
		
		System.out.println(num1+num2+num3+num4);
	
	}


}