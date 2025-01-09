/*
Author:- Geetam Dupare 
Batch:- J-56
Title:- multi- level and method hiding


*/
class Hide{
	public static void main(String args[]){
		Bike b1 =new Bike();
		System.out.println(b1.info());
		
		Son s1 = new Son();
		
	}
}
class Vahical {
	Vahical(){
		System.out.println("vahical class constractor ");
	}
	public String info(){
		return "Vahical   class method ";
		
	}
}
class Bike extends Vahical{
	Bike(String name){
			System.out.println(name+" bike class method ");

		
	}
	
	Bike(){
		this("TVS");
		
		System.out.println("bike class method ");
	}
	
	
	public String info(){
		return "Bike  class method ";
		
	}
} 

//malti-lavel inharitance
class GrandFather{
		GrandFather(){
			System.out.println("GrandFather :- hiii");
		}
}

class Father extends GrandFather{
		Father(){
			
			System.out.println("Father :- hiii");
		}
}

class Son extends Father{
		Son(){
			System.out.println("Son:- hiii");
		}
}