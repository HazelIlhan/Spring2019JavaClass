package day20;

public class FirstCharacterNumberOrLetter {
	public static void main(String[] args) {
		
	// java20awesome  al javaawesome 20 cikar 
		String mix="online132x" ;
		// how do i know first chacter is number or not
		char c=mix.charAt(0);
		// check whether c is between 0-9
		if (c>='0')
		// 0 burada character zero not number zero 
			if(c>='0'&& c<='9') {
				System.out.println("number");
			}else {
				System.out.println("not");
			}
		
				if(c>='A'&& c<='Z') {
					System.out.println("UPPERCASE");
				}else {
					System.out.println("not UPPERCASE");
				}
			}
		
		
		

}
