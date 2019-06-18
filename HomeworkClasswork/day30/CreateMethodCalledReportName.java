package day30;

public class CreateMethodCalledReportName {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//create a method called reportName
// this method take 2 string parameters as firstName,lastName
//return nothing 
// in the body 
// print the length of first and lastName with nice  message
// print the first initial of first and lastName together		
	
	//reportName();
	
	//String [] reportName= {firstName, lastName};
		reportName("aliia","nurdan");
		
		reportName("jon","snow");
		
		
		public static void reportName(String firstName,String lastName) {
			System.out.println("firstName"+firstName+"llength is"+firstName.length());
			
		}

		public static void reportName(String lastName,String lastName) {
			System.out.println("lastName"+lastName+"llength is"+lastName.length());
			
		}
		

		public static void reportName(String firstName,String lastName) {
			System.out.println("Your initial is"+firstName.charAt(0)+""+lastNameName.charAt(0));
			
		}
		
	}

}
