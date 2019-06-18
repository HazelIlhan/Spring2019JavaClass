package day48;

public class Horse extends Animal{

	int shoesCount;
	int horsePower;
	public static void main(String[] args) { // normalde main methodu burda yaomak digru degil olur ama not preferred
//		Animal a1=new Animal();// extend ettik bunun yerine 8-15 line lar yerine 
//		
//		a1.wild=false;
//		System.out.println(a1.breed);
//		System.out.println(a1.legCount);
//		System.out.println(a1.color);
//		System.out.println(a1.wild);
//		//System.out.println(a1.horsePower); horse is a animal but animal is bigger 
//		
		
		Horse h1=new Horse();
		h1.breed="spartan";
		h1.wild=false;
		h1.horsePower=600;
		System.out.println(h1.breed);
		System.out.println(h1.horsePower);
	}
	
	
	
	
	
}
