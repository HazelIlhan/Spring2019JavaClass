package day21;

public class chardeneme {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "AAccBBBdEEEf" ; 
        String newStr = "" ; 
        
    for( int i=0; i<str.length(); i++) {
     
      if(! newStr.contains( str.charAt(i)+""  )) {
          newStr = newStr + str.charAt(i); 
      }
        }
        
        System.out.println(newStr);

}
}
