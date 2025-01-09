/*
Author:- Geetam Dupare 
Batch:- J-56
Title:- write a program for interface.

*/


class Interface1{
public static void main(String args[]){
Airoplan a1 = new Airoplan();
a1.partOff();
System.out.println(a1.isHePilot());

Bike b1 = new Bike();
b1.partOff();
System.out.println(b1.isLicenceRequired());

car c1 =new car();
c1.partOff();
System.out.println(c1.isLicenceRequired());


 }
}

class Vehicles {

public void partOff(){
	System.out.println("i am include in Vehicles ");

}

}

class Airoplan extends Vehicles implements ByAir{
	Airoplan(){
		System.out.println("i am Aeroplane");
	}
	
	public boolean isHePilot(){
		return true;
	}

}

class Bike extends Vehicles implements ByRoad{
	Bike(){
		System.out.println("i am Bike");
 	}
	
	public boolean isLicenceRequired(){
		return true;
	}

}

class car extends Vehicles implements ByRoad {
	car(){
		System.out.println("i am car");
	}

	public boolean isLicenceRequired(){
		return true;
	}

}

interface ByRoad{
public boolean isLicenceRequired(); 
}

interface ByAir{
public boolean isHePilot();
}