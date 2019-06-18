package day32;

public class conversationOfUnit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 meterToCM(2);
		 System.out.println( meterToCM(2));
		 FeetToInch(3);
		 System.out.println(  FeetToInch(3));
		 FeetToCelcius(81);
		 System.out.println(  FeetToCelcius(81));
		  
		    // the method return double -- double can not be saved in int variable
		    //int cel = fahrToCel(81) ; 
		    // this is what we would do if we want to store the result in a variable
		 double cell= FeetToCelcius(81);
		 System.out.println(cell);
		 
		 
		 
		 // eger store ediceksemm  sagdaki double olmuyor we need to downcasting int 
		 // new requirement  what if i want to get the result as int 
		 // without changing the method return type to int
		 // but store the generated result as int 
		int cel= (int)FeetToCelcius(81);// downcasting ettim(int) ile
	
	}

	//create a method called meterToCM
	//it takes one int as a parameter and return cm 
	
	
	//create a method called FeetToInch
		//it takes one int as a parameter and return Inch 
		
	//create a method called FaToCelcius
		//it takes one double as a parameter and return celcius 
		
	public static int meterToCM(int a) {
		int cmvalue=a*100;
		
		return  cmvalue;
		// return meter*100;
	}
	
	public static int FeetToInch(int a) {
		int  inchvalue=a*12;
		
		return inchvalue;
		//return a*12;
		
	}
	public static double FeetToCelcius(double fahr) {
		double  celciusvalue=fahr-32*5/9;
		
		return  celciusvalue;
		//return a*12;
	
	
		
	}
	
	

