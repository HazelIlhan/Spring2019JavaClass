package day47;

public class bike2 {
private String brand;
private int gear;
private double speed;
private  int id;
	private static int countOfBike;
	
public String getBrand() {
	return brand;
}
public void setBrand(String brand) {
	this.brand = brand;
}int getGear() {
	return gear;
}
public void setGear(int gear) {
	this.gear = gear;
}
public double getSpeed() {
	return speed;
}
public void setSpeed(double speed) {
	this.speed = speed;
}
public int getId() {
	return id;
}
private  bike2() {
	System.out.println("No arg is being called  ");
}
public bike2(String brand, int gear, double speed) {
	this();
	this.brand = brand;
	this.gear = gear;
	this.speed = speed;
	countOfBike++; //counting objects we have to put it inside the constructor there is no other option .
	              //just by looking a new keyword we need to find a block of code that run when object is being creted so we can increase the count here
	/// there is only one place understand new keywprd and count it is constructor.
	this.id=countOfBike;
	
}
public static void showCurrentCount() {
	System.out.println("current count of bikes"+countOfBike);
}

public void SpeedUp(int increaseBy ) {
	speed++;
	
}
public void Speed(int decreaseBy ) {
	speed=speed-decreaseBy;
	
	
	
}
@Override
public String toString() {
	return "Bike [brand=" + brand + ", gear=" + gear + ", speed=" + speed + ", id=" + id + "]";
}

	
	
	
	
}
 



