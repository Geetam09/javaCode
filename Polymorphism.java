
/*
Author:- Geetam Dupare 
Batch:- J-56
Title:- write a program for Polymorphism mathod overloding , mathod overriding.

*/
/*class Polymorphism{
public static void main(String args[]){
Mobile m1 = new Mobile();
m1.turnOn();
m1.turnOn("Iphone");

}

}

class Device{
	
  	
}
class Mobile extends Device{
	public void turnOn(){
		System.out.println("Device ON");

	}
	public void turnOn(String name){
		System.out.println(name+" Device ON");

	}


}
*/
/*
//Polymorphism mathod overriding

class Polymorphism{
public static void main(String args[]){
Mobile m1 = new Mobile();
m1.turnOn();

//4. we can use parant class reference to store child class obj..

Device m2= new Mobile();
m2.turnOn();

//---
Device m3= new Device();
m3.turnOn();


}

}

class Device{
	
	public void turnOn(){
		System.out.println(" Device ON from Device  class");

	}

  	
}
class Mobile extends Device{
	
	public void turnOn(){
		
		System.out.println("Device ON from mobile class");

	}
	


}
*/
/*
//constructor in Inheritance
//01.implicit super() constructor calling
//03.this()constructor calling

class Polymorphism{
public static void main(String args[]){
Mobile m1 = new Mobile();

}

}

class Device{
	
	Device(String name){
		System.out.println(name +" Device parameter constructor call");
	}
	Device(){
		//for call internal class constructor

		this("Iphone");
		System.out.println(" Device non-parameter constructor call");
	}
	
	

  	
}
class Mobile extends Device{
	
	Mobile(){
		//default super() call the parant class constructor
		System.out.println(" mobile constructor call ");

	}
	
}
*/
/*
//02.explicit super() constructor calling
class Polymorphism{
public static void main(String args[]){
Mobile m1 = new Mobile();

}

}

class Device{
	
	
	Device(String name){
		
		
		System.out.println(name+" Device constructor call");
	}
	
	

  	
}
class Mobile extends Device{
	
	Mobile(){
		//super() call the parant class constructor
		
		super("MI");
		System.out.println(" mobile constructor call ");

	}
	
}
*/
/*
//diff position of super 

class Polymorphism{
public static void main(String args[]){
Mobile m1 = new Mobile();

}

}

class Device{
	
	
	Device(String name){
		
		
		System.out.println(name+" Device constructor call");
	}
	
	

  	
}
class Mobile extends Device{
	
	Mobile(){
		
		System.out.println(" mobile constructor call ");
		super("MI");
		// error: call to super must be first statement in constructor
		//always wirte 


	}
	
}
*/

//diff access specifier with methods in inheritance
class Polymorphism{

public static void main(String args[]){
Mobile m1 = new Mobile();
m1.turnOn();
//m1.turnOff();
m1.restart();

}

}

class Device{
	public void turnOn(){
		System.out.println("Device ON");

	}
	private void turnOff(){
		System.out.println("Device turnOff");
		// error: cannot find symbol

	}
	protected void restart (){
		System.out.println("Device restart ");

	}
	
  	
}
class Mobile extends Device{
	Mobile(){
		System.out.println("mobile  ON");

	
	}
	

	}













