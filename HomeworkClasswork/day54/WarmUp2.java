package day54;

public class WarmUp2 {

	//int num=100; //instead off this there another way to assign value which is assigning method
	
	int num=getNumber();
	
public static void main(String[] args) {
	
	WarmUp w=new WarmUp();
	
	System.out.println(w.num);
	
	
}
public int getNumber() {
	return 200;
}

}

