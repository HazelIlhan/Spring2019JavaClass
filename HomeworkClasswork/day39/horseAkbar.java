package day39;

public class horseAkbar {

	 // instance field/variable 
	  // to define properties/ attributes of objects 
	  // that being created out of this class
	  String breed;
	  int age;
	  String color;
	  double height;
	  
	  
	  
	  public static void main(String[] args) {
	    
	    // each objects attribues 
	    // are completely independent from
	    // any other objects that created 
	    // from same class 
	    
	    horseAkbar h1 = new  horseAkbar(); 
	    h1.age = 4;
	    h1.breed= "Mongolian horse";
	    h1.color ="black";
	    h1.height= 5.10;
	    
	    horseAkbar h2 = new  horseAkbar();
	        // Setting attributes of object
	    // are completely independent from 
	    // any other object that created
	    // from same class
	    
	        h2.breed = "Arabian" ;
	        h2.age = 5 ;
	        h2.color = "black";
	        h2.height = 5.5;
	        
	        System.out.println( h1.color );
	        System.out.println( h2.height);
	        // reassigned to new value 
	        h1.color = "brown"; 
	        
	        System.out.println(h1.color);
	        System.out.println(h2.color);
	        
	        
	        
	    System.out.println(h1);// bu sekilde hashcode veriyor .toString();
	    
	    System.out.println(  h1.breed+";"+h1.age+";"+h1.color+";"); // if you want con together to print 
	    
	    
	  }
	  
	  
	}
