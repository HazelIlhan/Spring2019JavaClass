package day50;

public class MethodChaining {
	public static void main(String[] args) {
		//step1
		methodA();
        //step7
	}
	public static void methodA() {
		//step2
		methodB();
		//step6
		System.out.println("A Called");
	}
	public static void methodB() {
		//step3
		System.out.println("B Called");
		//step4
		methodC();
		
	}
	public static void methodC() {
		//step5
		System.out.println("C Called");
	}
//Collapse


}
