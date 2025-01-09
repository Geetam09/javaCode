/*
Author:- Geetam Dupare 
Batch:- J-56
Title:- 1) Write a program to perform the opration on array for insert,search,print, is Empty.


*/ 


class ArrayEX1{
	public static void main(String args[]){
	
	
		Student s1 = new Student();
		Techer t1 = new Techer ();
		// two differnt object in single array
		Object[] student = {s1,t1};
		
		for(Object i:student) {
			System.out.println(i);
		}
		
		
		
		ArrayEX1 h1 = new ArrayEX1();
		System.out.println(h1.isEmptyArray());
		h1.insertEle(1);
		h1.insertEle(22);
		h1.insertEle(45);
		h1.insertEle(23);
		h1.insertEle(43);
		h1.insertEle(56);
		h1.insertEle(33);
		h1.insertEle(44);
		h1.insertEle(55);
		h1.insertEle(21);
		
		System.out.println(h1.isEmptyArray());
		h1.SearchEle(1);
		
		h1.printArray();
		
		 
	}
	
	int ele[] = new int[10];
	int size = 0;
	
	public void printArray(){
		for(int i:ele) {
			System.out.println(i);
		} 
	}
	
	public void SearchEle(int element ) {
		for(int i =0; i<ele.length;i++) {
			if(ele[i] == element) {
				System.out.println("element found ! position is  : = "+i);
			}
			
		}
		
	}
	
	public void insertEle(int element){
		ele[size]= element;
		size++;
		System.out.println("element inserted ..");
	}
	
	public boolean isEmptyArray() {
		for(int i =0; i<ele.length;i++) {
			if (ele[i]==0) {
				return false;
			}
		}
		return true;
		
	}
	
	
	
	
	
	

}
class Student{}
class Techer{}

