package day41;

public class AirConditioner {

	String brand;
	float currentTemp;
	boolean isOn;

	public void displayBrand() {
		System.out.println("the brand is " + brand);
	}

	public void showCurrentTemp() {
		System.out.println("currentTemp :  " + currentTemp);
	}

	public void displayAllInfo() {
		System.out.println("Brand is " + brand + " | The current temp is " + currentTemp + " | Is AC on? " + isOn);
	}

	public void turnOn() {

		System.out.println("current AC is " + isOn);

		if (isOn == false) {
			isOn = true;
		} else {
			System.out.println("It is already on !!!");
		}

	}

	public void turnOff() {

		if (isOn) {
			isOn = false;
			System.out.println("It has been turned off");
		} else {
			System.out.println("IT IS ALREADY OFF!@");
		}

	}
// 
	
	// MODIFT BELOW CODE IF C IS OFF THERE SHOULD BE ANY ACTION CAN BE PERFORMED YANI METHODU METHODUN ICINE YAZ 
	
	
	public void increaseTemp(int increaseBy) {
		currentTemp += increaseBy;
		showCurrentTemp(); //ACTester icinde tek tek cagirmak yerine mthod icine method koyarak cozduk boylece her seferinde print ediyor 
		// incerase or decrease yapinca current tem p print ediyor yada sout(curruent temp after incrae+currentTemp) sekliyle de print edebilrisin 
		// methoda koyunca 

	}
	public void decreaseTemp(int decreaseBy) {
		currentTemp -= decreaseBy;
		showCurrentTemp();// an instance method can be called inside another intance method just like instance field
		//can be access diretlu inside any instance method 
	}

	// what if I WANT TO EXACT TEMPERATURE 
	public void setTemperature(float targetTemperature) {
		currentTemp=targetTemperature;
		showCurrentTemp();
		
	}
	
	
}
/*
 * WARM UP Create a class called AirContitioner Add instance fields brand as
 * String currentTemp as float isOn as boolean
 * 
 * Add below behaviors displayTheBrand() ; accept no paramter and print out the
 * brand showCurrentTemp accept no paramter and simply display current temp on
 * console
 * 
 * displayAllInfo accept no paramter and display all AC info
 * 
 * turnOn accept no parameter and set isOn value to true if it's not already
 * true
 * 
 * turnOff accept no parameter and set isOn value to false if it's not already
 * true
 * 
 * increaseTemp it accepts one parameter int and increase the value by the
 * amount passed
 * 
 * decreaseTemp it accepts one parameter int and increase the value by the
 * amount passed
 * 
 * setTemperature it acceps one paramter int and set the value to that paramter
 * passed
 * 
 * Create a class called ACTester Create 3 object set their field value then
 * call the methods
 * 
 * 
 */