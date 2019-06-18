package day32;

public class AdultOrNot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean result=isAdultOrNot(15);
		
	System.out.println(result);
	
		
	}
	
	public static boolean isAdultOrNot(int age) {
		
		
//		if(age>18) {
//			
//	return true;
//		
//		
//	}else{
//		return false;
//	}
//ustteki 17-24 yerine 26 yazabilrisin  cunku whole thing is boolean result
return age>18;

	}
}
