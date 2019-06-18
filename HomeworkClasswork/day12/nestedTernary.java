package day12;

public class nestedTernary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int bill=1400;
int quantity=11;
int discount;
if (bill>1000) {
	if(quantity>11) {
		discount=10;
	}else {
		discount=9;
	}
}else {
	discount=5;
}

System.out.println(discount);
 discount=(bill>1000)?(quantity>11)? 10 : 9 : 5;
	
	
	}


	}


