/*
Author:- Geetam Dupare 
Batch:- J-56
Title:- write a program for print all Roman numbers with digit using for loop.

*/

class Test1{
public static void main(String args[]){

for(int i = 0;i<100;i++){
	System.out.print(i+" = ");
if(i>0 && i<100){
	int countX=i/10;
	int remainder=i%10;

while(countX>0){
	--countX;
	System.out.print("X");
}
if(remainder==4 || remainder==9){
	System.out.println((remainder==4)?"IV":"IX");
}else if(remainder>0){
	if(remainder>=5){
	System.out.print("V");
}else{
	remainder%=5;
	while(remainder>0){
	--remainder;
	System.out.print("I");

}//whie

}//else
	
}//if
 
}//for
System.out.println();
}//main
}//class

}