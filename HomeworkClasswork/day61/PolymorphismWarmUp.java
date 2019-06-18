package day61;

import day58.Animal;
import day58.Dog;

public class PolymorphismWarmUp {
	
	 public static void main(String[] args) {
		    
		    int i = 10 ; 
		    
		    long l = i ; 
		    
		    
		    double d = 3.14 ; 
		    int a = (int) d ; 
		    
		    System.out.println(a);
		    Dog d1=new Dog();
		    
		    //upcasting 
		    Animal a1=d1;
		    Dog d2=(Dog) a1;
		    
		    
		  }
		  

}
