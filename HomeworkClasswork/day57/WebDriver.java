package day57;

import java.util.ArrayList;

public interface WebDriver {

	public static final String Purpose="Automated Browser";// if we don't put public static final exclusive to interface 
	
	public abstract void openBrowser();//even I dont say abstarct it will nmake itpublic  abstract exclusive to interface 
	public abstract void navigateTo(String url);
	public  abstract void quit();
	public  abstract String findElementByID(int id);

	
	public  abstract ArrayList<String>findElementsByTagName(String tagName);
}
/*Create an interface called WebDriver 

add a constant called PURPOSE and assign "Automating Browser"

add few abstract methods : 

	openBrowser accept no param and return nothing
	navigateTo accept a String as Url and return nothing 
	quit accept no param and return nothing

	findElementByID accept one int as id 
		and return String 
	findElementsByTagName accept one String as tagName 
		and return List of Strings 
Collapse




*/