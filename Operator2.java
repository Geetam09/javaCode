/*
Author:- Geetam Dupare 
Batch:- J-56
Title:- explain Operator.

*/

class Operator2{
int a,b;
boolean flag;

public static void main(String args[]){
/* using normal way
	int a = 10;
	int b = 20;
	boolean flag = true;
//unary
 System.out.println("!flag ="+ (!flag));
 System.out.println("~a ="+( ~a));

//relational 
System.out.println("a < b ="+(a<b));
System.out.println("a > b ="+(a>b));
System.out.println("a <= b ="+(a<=b));
System.out.println("a >= b ="+(a>=b));
System.out.println("a == b ="+(a==b));

//bitwise 
System.out.println("a & b ="+(a&b));
System.out.println("a | b ="+(a|b));
System.out.println("a ^ b ="+(a^b));



//Assignment
System.out.println("a = 30 ="+(a=30));
System.out.println("a += 2 ="+(a+=2));
System.out.println("a -= 2 ="+(a-=2));
System.out.println("a *= 2 ="+(a*=2));
System.out.println("a /= 2 ="+(a/=2));
System.out.println("a %= 2 ="+(a%=2));

//ternary
//?:
System.out.println((a<b)?"a is small":"a is not small");

*/



//object approach 
Operator2 o = new Operator2();
o.a=10;
o.b=20;

//ternary
//condition ? true : false;


System.out.println((o.a<o.b)?"a is small":"a is not small");

//Assignment
System.out.println("a = 30 ="+(o.a=30));
System.out.println("a += 2 ="+(o.a+=2));
System.out.println("a -= 2 ="+(o.a-=2));
System.out.println("a *= 2 ="+(o.a*=2));
System.out.println("a /= 2 ="+(o.a/=2));
System.out.println("a %= 2 ="+(o.a%=2));

//bitwise 
o.a=-10;
System.out.println("a & b ="+(o.a&o.b));
System.out.println("a | b ="+(o.a|o.b));
System.out.println("a ^ b ="+(o.a^o.b));

//relational 
System.out.println("a < b ="+(o.a<o.b));
System.out.println("a > b ="+(o.a>o.b));
System.out.println("a <= b ="+(o.a<=o.b));
System.out.println("a >= b ="+(o.a>=o.b));
System.out.println("a == b ="+(o.a==o.b));

o.flag=true;

//unary
 System.out.println("!flag ="+ (!o.flag));
 System.out.println("~a ="+( ~o.a));



}
}