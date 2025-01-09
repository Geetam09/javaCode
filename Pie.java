/*
Author:- Geetam Dupare 
Batch:- J-56
Title:- write a program for Polymorphism with diff aprroch.

*/



package test;


class Pie{
static private float pi;
static boolean flag=true;

public float getValue(){
	return this.pi;
	
	}

public void setValue(float pi){
	while(flag){
		this.pi=pi;
		flag=false;
		
	}
}


public static void main(String args[]){
Pie p1=new Pie();

p1.setValue(3.14f);
System.out.println(p1.getValue());
p1.setValue(5.04f);

System.out.println(p1.getValue());

}

}

/*

//approach 1
static boolean flag=true;
public void setValue(float pi){
	while(flag){
		this.pi=pi;
		flag=false;
		
	}
}

approach 2
static int count=0;

public void setValue(float pi){
	if(count>=1){
	System.out.println("invaild ");

}else{
	count++;
	 this.pi=pi;
	
}


