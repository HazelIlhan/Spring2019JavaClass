package day39;

public class ClassRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// local variable
		// string s="abc"
		
		String s = "abc";
		person p1 = new person();// what is p1 it is the address referece variable 
		// how can i assignn value to properties that person have
		p1.name = "Talmurat";
		p1.age = 1;
		p1.gender = 'M';

// as long as you have the cookie cutter you can do istedigin kadar cookie 
// we have 2.object
		// if I change the diana to nurdan nothing change 
		person p2 = new person();
		// setting attributes value of object 
		p2.name = "Diana";
		p2.age = 27;
		p2.gender = 'F';

		horseAkbar spartan=new horseAkbar(); // can I call create this object in people obkect yes because thy are in same package 
		spartan.breed="Mustang";
		spartan.age=10;
		spartan.color="black";
		spartan.height=10;
		
		System.out.println(spartan.breed);
		System.out.println(p1.name);
		System.out.println(p2.name);
		
		
		
		
		
//		String name="ayse";
//		int age=23;
//		char gender='f';
//		//when you have these top one  they have nothing to each other what if I have 100 of object 
//		//there is no direct link between these data .there is no link between them .
//		
//		// main 

	}

}
