/*
Author:- Geetam Dupare 
Batch:- J-56
Title:- Explain scanner.


*/

/* scanner (class use for input scan) 
	1) create a object 
	2) System.in :- to take a input from console or terminal 
	3) method :-
		nextLine() :- for text or string
		nextInt() :- for int value 
		next():- for only one word 
		
	3)close():- close the scanner 
	4)reset():- 




 */

import java.util.Scanner;
class main5{
public static void main(String args[]){
 Scanner sc = new Scanner(System.in/);
 
 System.out.println("Enter name : ");
 String name = sc.nextLine();
 
 System.out.println("Enter age : ");
 int num = sc.nextInt();
 
 System.out.println("details :- name: "+ name+" Age "+num);
 
 

}

}

