/*
Author:- Geetam Dupare 
Batch:- J-56
Title:- Write a program for inharitance.


*/
class Main3{
Engine e1 = new Engine(true,250,800,5);
Bike b1 = new Bike("FZ",e1,"Yamaha");
b1.displayInfo();

}

class Bike extends Vehicle{
	String name;
	Engine engine;
	
	Bike(String name,Engine engine,String Company){
		this.name=name;
		this.engine=engine;
		this.Company=Company;
		
	}
	public void displayInfo(){
		System.out.println("Bike   name:-"+name);
		System.out.println("bike company name:-"+Company);
		System.out.println("Engin cc:-"+engine.cc+" "+"CC");
		System.out.println("bike Engin horse power:-"+engine.hp+" "+" HP");
		System.out.println("bike is gare:-"+engine.gare+" "+"Gare");
		System.out.println("bike is Petrol:-"+engine.isPetrol);
		
		}
}

class Vehicle{
	String Company;
	
}

class Engine{
	Boolean isPetrol;
	int cc;
	int hp;
	int gare; 
	Engine(Boolean isPetrol,int cc ,int hp ,int gare ){
		this.isPetrol=isPetrol;
		this.cc=cc;
		this.hp=hp;
		this.gare=gare;


	}

}

