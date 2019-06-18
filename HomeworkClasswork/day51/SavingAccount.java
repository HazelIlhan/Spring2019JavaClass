package day51;

public class SavingAccount extends BankAccount {
	double returnRate;

	public SavingAccount(String accountName, long accountNumber, double balance,double returnRate) {
		super(accountName, accountNumber, balance);
// alttakilerin yerine usttekini yaziyoruz 
//		this.accountName = accountName;
//		this.accountNumber = accountNumber;
//		this.balance = balance;
	}
		
		@Override
public void  deposit(int dep) {
	balance+=dep*100;
}
		@Override
public void  withdraw(int with) {
	balance-=10*with;

	
	
	
}
}
/*Task 2 
Create a BankAccount class 
fields : 
	accountName as String
	accountNumber as long 
	balance as double 

Constructor 
	3 args constructor to set all above value 

methods : 
	toString method
	deposit accept one int as parameter 
		and it changes the balance accordingly
	withdraw accept one int as parameter
		and it changes the balance accordingly

Create a sub class called SavingAccount 
field : 
	double returnRate
Constructor 
	4 args constructor to set all above value 

overriden methods : 
	toString method
	deposit accept one int as parameter 
		and it changes the balance accordingly
		but you get 100$ for each deposit 
	withdraw accept one int as parameter
		and it changes the balance accordingly
		but you get 10$ penalty for each withdraw */