package day51;

public class Dog  extends Animal {
	@Override	 // bunu yazmazsan dog class kendinin  methodu olarak goruyor 
	//annotation
	public void makeNoise() {
			
			System.out.println("dog----Woo Woof Woof");
		}
		
		
	}
// you dont override something that you dont see