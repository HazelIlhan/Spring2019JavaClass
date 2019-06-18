package day28;
import java.util.Arrays;
import java.util.Scanner;
public class hw149 {

	
		  public static void main(String[] args) {
		    Scanner scan = new Scanner(System.in);
		    timeConversion(scan.nextLine());
		  }
		  
		  public static void timeConversion(String s) {
			  String[] Arrayofstr=s.split(":");
			  
			  int hour=Integer.parseInt(Arrayofstr[0]);// string hour integer oldu 
			  int min=Integer.parseInt(Arrayofstr[1]);
				int sec=Integer.parseInt(Arrayofstr[2].substring(0, 2));
				
				 
				if (s.contains("PM")) {
					
					
					if (hour<12)
						hour+=12;
				}else if (s.contains("AM")&& hour==12) {
				hour=0;
				
				}
					
					
			
					
					
					
					Arrayofstr[0]=String.format( "%02d", hour);//  hour u al 2 digite cevir ve string olarak array geri aktar 
					Arrayofstr[1]=String.format( "%02d", min);
					Arrayofstr[2]=String.format( "%02d", sec);
					
					
					
					System.out.println(Arrayofstr[0]+":"+Arrayofstr[1]+":"+Arrayofstr[2]);
					
					
				}
				
		  }
		
	
	
	
	
	
	
	
/*Given a time in 12-hour AM/PM format, convert it to military (24-hour) time.

Note: Midnight is 12:00:00AM on a 12-hour clock, and 00:00:00 on a 24-hour clock. Noon is 12:00:00PM on a 12-hour clock, and 12:00:00 on a 24-hour clock.

Function Description
It should print a new string representing the input time in 24 hour format.

timeConversion has the following parameter(s):

s: a string representing time in  12 hour format


Input: 07:05:45PM
Output: 19:05:45*/
