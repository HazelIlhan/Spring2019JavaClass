package dy36;

public class WrapperClasses {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	Booelan b=new Boolean(true);
	Booelan b1=new Boolean(true);         // two different way to create an obect valueOf yerine new de yazabilriisn 
	Booelan b2= Boolean.valueOf(true);
	Booelan b3= Boolean.valueOf("true");
	
	
	
	System.out.println(b);
	System.out.println(b1);
	System.out.println(b2);
	System.out.println(b3);
	
	
	Integer i1=new Integer(123);
	Integer i2=new Integer("123");
	Integer i3=new Integer.valueOf(123);
	Integer i4=new Integer.valueOf("123");
	
	
	System.out.println(i1);
	System.out.println(i2);
	System.out.println(i3);
	System.out.println(i4);
	
	
	Character c1=new Character('c');
	Character c1=new Character.valueOf('c');
	System.out.println(c1);
	System.out.println(c2);
	
	
	
	
	
	
	
	
}
