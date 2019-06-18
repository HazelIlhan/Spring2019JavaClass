package day40;

public class BanActivityObject {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		BankAccount customer1=new BankAccount();
		customer1.accountHolder="Ashrfa";
	     customer1.balance=2935.6;
		
		
	 	customer1.showAccountHolder();
		customer1.showBalance();
		customer1.add100Dollar();
		customer1.showBalance();
		
		
		
		
		
	}

}
