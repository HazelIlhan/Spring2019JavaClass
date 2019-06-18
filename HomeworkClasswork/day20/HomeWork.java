package day20;

public class HomeWork {
	public static void main(String[] args) {
	//3 wrong attempt oldugunda nasil couunt edecegiz.
	//how many a showed up in this string	
	
		String str="jaaaava";
		//is it a no go look other then a ise dur 
		// go through each every character 
		// if I see a i will increent my counter by one
		int count=0;// we did not count yet it wil be zero 
		int x=0;
		do {
			
			//System.out.println(str.charAt(x)+" ");
			//x++;
			// simdi diyorum ki ilk character a mi vak 
			char c=str.charAt(x);
			if (c=='a') {
			System.out.println("BINGO");
			++count;}
			x++;
			
		}while(x<str.length());
		
		System.out.println(count);
				
			
}
		
	
}
