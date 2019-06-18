package day48;

public class StudentTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	
		Person p1 = new Person();
		p1.name="lili";
		p1.age=33;
		p1.height=5.5f;
		p1.gender='f';
		p1.eat();
		
		Student s1 = new Student ();
		s1.name="ali";
		s1.age=23;
		s1.height=4.5f;
		s1.gender='m';
		s1.studentId=123;
		s1.eat();// bu person icinde olmasina ragmen cagirabiliyorsun methodu inherant yapiyorsun 
		System.out.println(s1.studentId);
	
	
	// person and studetn has exactly same instance except studentId bunlari bir araya getirebilriiz 
		// repeat edilenleri 
	
		// simdi student e git ve ayni olanlaru comment yap complain edicek onun yerine 
		// public class Student extends Person yapiyoruz ve student persondan odunc aliyr bilgiyi 
		
	}

}
