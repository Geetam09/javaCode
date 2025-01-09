/*
Author:- Geetam Dupare 
Batch:- J-56
Title:- Write a program for Calculator.

*/

class Calculator{
	int div ,multi, sub, add;
	int a = 15 , b =0;
	
	public int cube(int d){
		return d*d*d;
	}
public static void main(String args[]){
Calculator c1 = new Calculator();
c1.add=c1.a+c1.b;
c1.multi=c1.a*c1.b;
c1.sub=c1.a-c1.b;


System.out.println("addition = "+c1.add);
System.out.println("multiple = "+c1.multi);
System.out.println("sub = "+c1.sub);

if(c1.b==0 || c1.a == 0){
	System.out.println("not divide by zero");
}else{
	c1.div=c1.a/c1.b;
	System.out.println("div = "+c1.div);
}
System.out.println(c1.cube(2));


}
}

