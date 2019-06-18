package day32;

public class task1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
// FIRST WAY 8-11
//		long firstYearSalary = giveMe6DigitSsalary();
	//	long secondYearSalary = giveMe6DigitSsalary();

		///System.out.println(firstYearSalary + secondYearSalary);
// SECOND WAY TO DO IT
//		long firstYearSalary = giveMe6DigitSsalary();
//		
//		System.out.println(firstYearSalary *2);
//System.out.println(giveMe6DigitSsalary()+giveMe6DigitSsalary());

	//%10 ZAM ILE NASIL YPARSIN
		
	// firstYerSalary ile1.1 carpinca cikicak sey double o zaman bizim downcasting yapip onu long a cevirces
		long firstYearSalary = giveMe6DigitSsalary();
		long secondYearZam=(long)(firstYearSalary*1.1);
		
	// sagdaki long downcasting icin 
		
	
	
	
	}

	public static long giveMe6DigitSsalary() {
		return 180000L;

	}

}