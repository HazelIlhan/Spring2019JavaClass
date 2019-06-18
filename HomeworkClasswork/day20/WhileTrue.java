package day20;

public class WhileTrue {
	public static void main(String[] args) {
	int x=0;
	while(true){
		x++;
		System.out.println(x);
		
	// bu skeilde surekli run ediyor araya break koymamiz lazim 
	if(x==10) {
		break;
	}
}
}
}