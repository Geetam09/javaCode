/*
Author:- Geetam Dupare 
Batch:- J-56
Title:-Q8. show example  of normal method ,private method ,static method , defult method in interface with example.


*/




*/
class MethodExInInterface{
public static void main(String args[]){

UseMethod u1 = new UseMethod();
u1.norMethod();
u1.priMethod();
Methods.satMethod();
u1.defMethod();


 
 }

}

interface Methods{
	  void norMethod();



private void priMethod(){
		System.out.println("this is Private method  ");	
	}



static  void satMethod(){
		System.out.println("this is static method  ");
	}


default void defMethod(){
		System.out.println("this is default method  ");
}

}

class parantClass{

}
class UseMethod extends parantClass implements Methods{
 	UseMethod(){
		System.out.println("Use method class:- ");

	}
	public void norMethod(){
		System.out.println("this is normal method  ");

	}

	public void priMethod(){
		System.out.println("this is Private method  ");	
	}

	
	


	
	}