/*
Author:- Geetam Dupare 
Batch:- J-56
Title:- write a program for inharitrance and interface. 


*/

class MainMethodChaing{
public static void main(){
	System.out.println("hello world");
	int a[]={1,2,3,4};
	main(a);
}

public static void main(int a[]){
	System.out.println("hello int");

}


public static void main(String args[]){
	System.out.println("hello world");
	main();
}

}