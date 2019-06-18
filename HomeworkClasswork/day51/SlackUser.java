package day51;

public class SlackUser {
String displayName;

int timezone;
String status;



public SlackUser() {
	

}
public SlackUser(String displayName,int timezone,String status) {
	
	
		super();
		this.displayName = displayName;
		this.status = status;
		this.timezone = timezone;	
	
	
}

public void sendMessage(String message) {
	System.out.println("<"+displayName+"> is sending <" + message+">" );
}

public void changeStatus(String status) {
	this.status = status;
}

}