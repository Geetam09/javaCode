/*
Author:- Geetam Dupare 
Batch:- J-56
Title:- show how contructor chaining is works.


*/

*/
//main class
class ContChaining{
public static void main(String args[]){

	Child c1 = new Child(20);	

	} 
}




// parent class
class Parent{
	Parent(){
		System.out.println("parant class non-parameterize contructor");
	}

	Parent(String name){
		this();
		System.out.println("parant class parameterize contructor"+ name);
	}
}



// child class
class Child extends Parent{
	Child(){
		super("Geetam");
		System.out.println("Child class non-parameterize contructor");
	}
	

	Child(int num){
		this();
		System.out.println("parant class parameterize contructor"+ num);
	}
		

}


