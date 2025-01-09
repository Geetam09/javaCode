/*
Author:- Geetam Dupare 
Batch:- J-56
Title:- 1) make a user-defined class type array of student and print all information.

*/ 


class StudentArray{	
	public static void main(String args[]){
		Student s1 = new Student(101,"Ajay");
		Student s2 = new Student(102,"summit");
		Student s3 = new Student(103,"Raju");
		Student s4 = new Student(104,"Rohan");
		Student s5 = new Student(105,"soham");
		
		Student array[]={s1,s2,s3,s4,s5};
		
		for(int i=0;i<array.length;i++){
			System.out.print(array[i].getRoll()+" ");
			System.out.println(array[i].getName()); 
		}
		System.out.println("________________________");
		
		for(Student a1: array ){
			System.out.print(a1.getRoll()+" ");
			System.out.println(a1.getName());
			}
		
	}

}

class Student{
	private int roll;
	private String name;
	
	Student(int roll,String name){
		this.roll=roll;
		this.name=name;
	}
	public void setRoll(int roll){
		this.roll=roll;
	}
	public int getRoll(){
		return roll;
	}
	public void setName(String name){
		this.name=name;
	}
	public String getName(){
		return name;
	}
	
}

