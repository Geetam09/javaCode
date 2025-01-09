/*
Author:- Geetam Dupare 
Batch:- J-56
Title:- write a program for inharitrance and interface. 


*/
class Main3{
public static void main(String args[]){
/*Child ch = new Child();
ch.staticMathod();
//ch.Mathod();
Person.Mathod();
*/

B b1 = new B();
b1.simpleMethod();
System.out.println(A.a);


 }

}

/*class Parent{
public static void staticMathod(){
	System.out.println("this is static method from parent class");
}

}

interface Person{
	static void Mathod(){
	System.out.println("this is static method from person");
}

} 

class Child extends Parent  implements Person {
	
}
*/

interface A{
	int a=10;
	void simpleMethod();
}

class B implements A{
 	
	public void simpleMethod(){
	System.out.println(" method"+a);
	
}
}
