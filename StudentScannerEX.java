/*
Author:- Geetam Dupare 
Batch:- J-56
Title:- 1) get user input for class student object get 5 Students store into array of type student
		display using tht for loop with toString override


*/ 

/*  
		get user input for class student object
		get 5 Students store into array of type student
		display using tht for loop with toString override
		
		
*/


import java.util.Scanner;
class StudentScannerEX{
	public static void main(String args[]){
		Student student[] = new Student[5];
		
		
		for(int i = 0; i< student.length; i++){
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter a name and thair age : ");
			student[i] = new Student(sc.next(),sc.nextInt());
			
			}
			for(Student i : student){
				System.out.print(" "+i);
			}
		
		}
		
		
	}


class Student{
	String name;
	int age;
	Student(String name,int age){
		this.name=name;
		this.age=age;
		
	}
		public String toString(){
			return this.name +" "+ this.age ;
			
		}

}
