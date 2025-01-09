/*
Author:- Geetam Dupare 
Batch:- J-56
Title:- show how Switch case use for normal functions and static functions.


*/


class demo{

public void sum(){
	System.out.println("normal ");
}
static void staticSum(){
	System.out.println("static");
}  
public static void main(String args[]){

demo d1 = new demo();
d1.sum();
d1.staticSum();

demo.staticSum();
staticSum();


}
}
/*int num=33;
for(int i=num/10; i>0; i--){
	System.out.print("X");
} 
int n=num%10;
	switch(n){
		case 1:
			System.out.println("I");
		break;
		case 2:
			System.out.println("II");
		break;
		case 3:
			System.out.println("III");
		break;
		case 4:
			System.out.println("IV");
		break;
		case 5:
			System.out.println("V");
		break;
		case 6:
			System.out.println("VI");
		break;
		case 7:
			System.out.println("VII");
		break;
		case 8:
			System.out.println("VIII");
		break;
		case 9:
			System.out.println("IX");
		break;
		case 10:
			System.out.println("X");
		break;
} */