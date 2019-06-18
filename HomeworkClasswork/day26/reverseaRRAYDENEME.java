package day26;

public class reverseaRRAYDENEME {
	public static void main(String[] args) {

		int[]numbers= {11,2,39,7,4,15};
		String reversed="";
	int count=numbers.length;
	
		for(int i=count-1;i>=0;i--) {
			reversed+=numbers[i];
		}
	
	System.out.println(reversed);
	
	}
	}
