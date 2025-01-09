/*
Author:- Geetam Dupare 
Batch:- J-56
Title:- 1) Explain How abstractions Work.


*/ 



//abstract class 
//use abstract keyword //it may have variable,method,static,final method,instance method ,constructor (optional all) //class dont have abstract method it //well abstracts
//abstarct class method 
//abstract method need only abstract classs otherwise we not use...
//Hiding a complex implementation from end user to provides simplicity nad functionality 
//100 % abstarction achive using  interface

//example= bank transactions. we use either abstract class or interfaces to achieve abstraction
//instances mathod - require object for normal mathod
//1.abstrsct class-(0% to 100%)range for hiding implementation. vs interface 100% hinding implementation,we use interface..
//2.can't create the object/instantiate
//3.child class must implement abstract mathod/declere child class as abstract class.

/*

//

class Abstract{
public static void main(String args[]){
 B obj = new B();
obj.a1();

}
}

abstract class A{
	public void a1(); 

}
class B extends A{
	public void a1(){
		System.out.println("method a1 from class bw");
	}		

}
//error
 //A is not abstract and does not override abstract method a1() in A
//class A{
*/


//interface 
//blueprints of class
//method are by default abstract AND public in interface without  declare abstracts keyword
//

class Abstract{
public static void main(String args[]){
 bike obj = new bike();
obj.info();


	}
}

interface vehicle{
	public void info();//final // error: modifier final not allowed here
} 

class bike implements vehicle{
	public void info(){
		System.out.println("hihi");
	}
}




//class- vehicle,airplane,bike,car
//interfaces-  byroad(lisence required) ,byair(ishepiot)






