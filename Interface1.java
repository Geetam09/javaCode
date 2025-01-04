/*interface 
>>interface 100% hinding implementation//or abstractions//
>>(blueprints of class)
>>method are by default abstract AND public in interface without  declare abstracts keyword//ont having constractor 
>>tangible(object) and non-tangible(class,interface)
>>standard naming?(pascal case)
//access specifier:only public,defult,|private and default allow with body in interfaces java 9+ |protected not allowed| //java 8+
//method:-abstract keyword✅ | final(not allowed) | static (not allowed)(with body we can use but method converts into non-abstract //						allow from java 8+)
// multiple implementations ✅ 
//extended and implements both are work together ✅ 
//default keyboard method we use in interface when we extends a one interface and other one!
// static method in interface are call only by interface name....
//access interface method in class use public otherwise error (attempting to assign weaker access privileges; was public)
//variable:-are static and final(by default)| access by interface name | value needs to declare in interface
*/


class Interface1{
public static void main(String args[]){
Airoplan a1 = new Airoplan();
a1.partOff();
System.out.println(a1.isHePilot());

System.out.println("________________________");

Bike b1 = new Bike();
b1.partOff();
b1.onEarth();
System.out.println(b1.isLicenceRequired());

System.out.println("________________________");

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
		System.out.print("Is He Pilot : ");
		return true;
	}

}

class Bike extends Vehicles implements ByRoad{
	Bike(){
		System.out.println("i am Bike");
 	}
	
	public boolean isLicenceRequired(){
		System.out.print("is Licence Required : ");
		return true;
	}

}

class car extends Vehicles implements ByRoad {
	car(){
		System.out.println("i am car");
	}

	 public boolean isLicenceRequired(){
		System.out.print("is Licence Required : ");
		return true;
	}

}

interface ByRoad{
	static boolean isLicenceRequired(){return true;}

}

interface ByAir extends byEarth{
public boolean isHePilot();
}

interface byEarth{
	void onEarth();//{
		//System.out.print("on earth: ");
//	}
}


parant (static ) just a static mathod
child
child