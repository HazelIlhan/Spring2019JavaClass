package day41;

public class Student {

	
	
	// access modifiers 
		/*
		 * public / protected / default / private 
		 * 
		 * we can use it for any methods 
		 * we can use it for fields 
		 * 
		 * */
		
		
//		public String name; public can be seen from everywhere 
//		public int age; 
//		public long ssn; 
		 String name; 
		 int age;     /// this is default as log as we are in same package dfault is ok 
		 
		 long ssn; 
		
		
		public void displayName() {
			System.out.println("name is : " + name);
		}
		
		// it is only accessible within same class
		// which means Student class only
		private void displayNameAndAge() {
			System.out.println("name is : " + name + "| age is " + age );
		}
		
		// it is only accessible within same class
		// which means Student class only
		private void showSSN() {
			System.out.println("SSN IS "+ ssn);
		}
		
	}
	
	
	
	

