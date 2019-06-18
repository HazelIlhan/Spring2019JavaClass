package day41;

public class ACTester {


		 public static void main(String[] args) {
			    
			    
			    AirConditioner ac = new AirConditioner(); 
			    ac.brand= "Samsung" ; 
			        ac.currentTemp=79.7f;
			        ac.isOn=true;
			        
			        ac.displayBrand();;
			        ac.displayAllInfo();
			        
			        ac.turnOff();
			        ac.turnOn();
			        ac.showCurrentTemp();
			        
			        ac.increaseTemp(10);
			      //  ac.showCurrentTemp();// we call current temp to print or we can sout 
			        //System.out.println(ac.currentTemp);
			 
			        ac.decreaseTemp(20);
			     //   ac.showCurrentTemp();
			        
			        ac.setTemperature(80f);
			      //  ac.showCurrentTemp();  bunlara omment yaptik cunku bunlar uerinde methodlarinin icin showcurremTemp methoduu koyduk 
			        //boylece deceaseTemp already bunu include etmis oldu 
			        
			        
			      // burada her seferinde tek tek cagirmak yerine currentTemp classin icndeki increase ve decrase methodunun icinde 
			        // showCurremtTemp i eklersek bir kerede cozmus olacagiz 
			    

			  }

			}