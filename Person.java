/*
Author:- Geetam Dupare 
Batch:- J-56
Title:- make a class person is eligible for voting or not.
*/ 


//condition statement
//decision making statements 
//if 
//if and else
//if and else if(if else ladders)
//nasted if(if if else else)
//switch case : int char string

//looping statement
//

class Person{
String name;
int age;
String country;
public static void main(String args[]){

Person p1 = new Person();

p1.name="jack";
p1.age=17;
p1.country="USA";

Person p2 = new Person();
p2.name="geetam";
p2.age=18;
p2.country="Indian";

Person p3 = new Person();
p3.name="amit";
p3.age=20;
p3.country="Indian";

if(p1.age>=18){
		System.out.println(p1.name +" you are eligible for voting");
	}
	else{
		System.out.println(p1.name +" you are not eligible for voting");
	}

if(p2.country=="Indian"){
	if(p2.age>=18){
		System.out.println(p2.name +" you are eligible for voting");
	}
	else{
		System.out.println(p2.name +" you are not eligible for voting");
	}
}else{
	System.out.println(p2.name+"Not indian,hence can't vote ");

}
System.out.println("Thanks for visit");


//ternary 

System.out.println((p3.country=="Indian")?(p3.age>=18)?" you are eligible for voting":"you are not eligible for voting":"Not indian,hence can't vote ");


 

} 
}
