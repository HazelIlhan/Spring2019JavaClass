package day42;

public class CopyingA_VariableValue {
	public static void main(String[] args) {
		
		Dog d1=new Dog();
		d1.name="puppy";
		d1.breed="pitbull";
		
		
		Dog d2=d1;
		
		d2.name="yumak";
		System.out.println(d1.name);
		System.out.println(d2.name);
		
		
	}
}
