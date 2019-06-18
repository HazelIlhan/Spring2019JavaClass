package day39;

public class horseobject {

	/// CREATE A CUSTOM CLASS CALLED 
		// Horse 
		// it should have 4 instance variables 
		// any object created out of this class 
		// should have 4 attribute as below 
		/*
		 * breed as String 
		 * age as int 
		 * color as String 
		 * height as double 
		 * */
		
	
	String breed; /// each every person will have a name// we call them instance variable/field 
	int age;
	double height;
	String color;



public static void main(String[] args) {
	// TODO Auto-generated method stub
	
	horseobject h1 = new horseobject();
	
	h1.breed = "morgan";
	h1.age = 1;
	h1.color = "brown";
	h1.height=5.6;
	
	System.out.println(h1.breed);
	System.out.println(h1.color);
	
	// how do I change the color 
	h1.color="black";// reassign updated last value always win 
	
	
	System.out.println(h1.color);
}

}

