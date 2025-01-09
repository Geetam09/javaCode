/*
Author:- Geetam Dupare 
Batch:- J-56
Title:- explain Final.

*/

class Area{
final float PI=3.14f;// constant value not change //PI capital letter for naming final variable
int radius;

public static float calArea(int radius,float pi){
	float result = pi*radius*radius;
	return result;
  }

public static void main(String args[]){
Area c = new  Area();

c.radius=5;

System.out.println(calArea(c.radius,c.PI);

 }
}

// final keywords 
//use ----> variable(not be change/constant ) , method(not be override) , class(not be inharite) , parameter list(not be //change in a local scope )
//does not modify



