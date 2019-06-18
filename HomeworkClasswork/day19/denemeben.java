package day19;

public class denemeben {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	
	String name="nurdan";
	
	int count=name.length();
	int i=count-1;
	int counter=0;
	while(i>=0){
		
		if(name.charAt(i)=='a') {
	counter++;
}
		System.out.print(name.charAt(i));	
		i--;
	}
	System.out.println(counter);
	
	}
}
