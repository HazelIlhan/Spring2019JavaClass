package day34;



public class PalendromeMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
	palindrome("ana");
	
	System.out.println(palindrome("ana"));
	}
	
	
	public static boolean palindrome(String target) {
	        String reversed="";
	        
	        target=target.replaceAll(" ","");
	        for(int i=target.length()-1;i>=0;i--) {
	        //	System.out.println(target.charAt(i));
	        	reversed+=target.charAt(i)+"";
//	        	
//	        	if(reversed.equals(target)) {
//	        		return true;
	        		
	        	}
	        			
	        		return reversed.equals(target)	;
	        	
	        }
	        
	
 
 }
 
 
	


