package day22;

public class LookingForWordInSentence {

public static void main(String[] args) {
		
		String str = "java kava ava " ;
		
		String target = "ava" ; 
		

			//	for (int i = 0; i < =str.lastIndexOf(target); i+=target.length()) {System.out.println(str.indexOf(target,i));		}
		
		
		
			
		
		int firstIndex = str.indexOf( target ); 
		int laststIndex = str.lastIndexOf( target );
		System.out.println(firstIndex);		System.out.println(laststIndex);
		
		int index = 0 ; 
		
		while( index<= laststIndex   ) {
			
			index = str.indexOf(target, index); 
			System.out.println("Found at index : "+ index);
			//index = index + 1 ; 
			index = index + target.length() ; 
		
		}


}
		
}
		
		
		

	

