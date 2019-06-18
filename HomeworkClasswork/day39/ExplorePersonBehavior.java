package day39;

public class ExplorePersonBehavior {

	public static void main(String[] args) {
	    
	    
	    person p = new person(); 
	    p.age = 19; 
	    p.gender = 'M'; 
	    p.name = "Abdul Khan"; 
	    
	    person g = new person(); 
	    g.age = 19; 
	    g.gender = 'F'; 
	    g.name = "Alina"; 
	    
	    p.eat();
	    p.tellMeYourName();
	    
	    g.eat();
	    g.tellMeYourName();
	    
	    

	  }

	}

