package day41;

import day40.BankAccount;//  we are trying to access bankAccount class
//import day40.*; bu butun classlari import ediyor 


public class StudentTester {
public static void main(String[] args) {
		
		
		Student muammar = new Student(); 
		muammar.name = "muammar" ; 
		muammar.age = 27 ; 
		muammar.ssn = 1234567 ; 
		
		muammar.displayName();
		
		
		// it is complaning BankAccount is in different package it ask 
		// me to import day 40package and I did
		BankAccount acc1 = new BankAccount(); // 
	System.out.println(acc1.balance);// BankAccount taki balance a ulasamayi cunku default only in sama package 
	                                     // if i DO IT public double balance; inday 40 BankAccount it will be ok 
		
		//System.out.println(acc1.balance);
		//System.out.println(acc1.accountHolder);
		//acc1.add100Dollar();//methodlarda public oldugu icin cagirabiliyorsun ama public kaldirirsan defalut olcak and complain
		
		
		
		
//		muammar.displayNameAndAge(); 
//		muammar.displayshowSSN(); 
		
		
		
		
		
	}

}
