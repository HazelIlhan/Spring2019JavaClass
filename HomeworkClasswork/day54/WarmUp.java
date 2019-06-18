package day54;

public class WarmUp {
	
	//int num;// how can I change this value su an zero 
	
	int num=100;
	
	{
		//num=150;
		System.out.println("init block1");
	}
	{
		//num=150;
		System.out.println("init block2");
	}
	public WarmUp() {
		//num=150;  these 2 line shows us how compiler see init block inside constructor ondn once run ediyor cunku 
				//System.out.println("init block1");
		num=200;
	}
public WarmUp(int x) {
	//num=150;
		//	System.out.println("init block1");
		num=400;
	}
	
public static void main(String[] args) {
	
	WarmUp w=new WarmUp();
	
	System.out.println(w.num);
	
	
}
}
