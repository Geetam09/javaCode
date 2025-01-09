/*
Author:- Geetam Dupare 
Batch:- J-56
Title:-write a program for MultiThreading in student class with implements Runnable interface .

*/
class Student extends collage implements Runnable{
	int mark;
	String name;
	Student(String name,int mark){
			this.name = name;
			this.mark = mark;
	}
	
	public void setInfo(String name,int mark){
			this.name = name;
			this.mark = mark;
		}
	
	
	public void run(){
		
		this.setInfo(this.name,this.mark);
		this.getInfo();
	}
	
	public void getInfo(){
		System.out.println("name :- "+ this.name + " marks :- "+ this.mark);
	 }
	
	
	public static void main(String[] args){
		Student s1 = new Student("Geetam",80);
		Student s2 = new Student("jack " , 90);
		
		
		
		s1.run();
		
		/* try{
		s1.sleep(1000);
		}
		catch(Exception e){
			System.out.println(e);
		} */
		
		s2.run();
		
		}

}
class collage{
	
}
