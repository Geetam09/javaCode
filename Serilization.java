/*
Author:- Geetam Dupare 
Batch:- J-56
Title:- explain Serilization.

*/


*/

/* 1)Serilization
> process of storing object into file
> we are storing a object from heap memory into another system memory
> taking object out from jvm convert into byteStrem
> 1) ObjectOutputStream class
> 2) writeObject 
> 3) transient (keyword ):- use to not send that data towords file cuz security porpose 



2)de-Serilization 
> process of getting  object back from the file
> ObjectInputStream class
> 2) object readObject(); its return object as a parant class not curret class than use casting

SerialVersionUID :- uniqe id for each classs , every modification and campile change the UID , we can give the UID in class  


achive: data/entry paramntly store (object/ data parsestanse)


 
 */
import java.io.*;
class Serilization{
	public static void main(String args[]){
		Student s1 = new Student(101,"Geetam",80.00f);
		
		//Object --> file 
		try{
		
		File f1 = new File("C:\\Users\\Geeta\\Desktop\\New folder\\core java\\sirilization\\abcd.txt");
		FileOutputStream fos = new FileOutputStream(f1);
		ObjectOutputStream oos =new ObjectOutputStream(fos);
			oos.writeObject(s1);
			oos.close();
			System.out.println("Object send to file ..");
		}
		catch(Exception e){
			System.out.println(e);
		}
		//Object --> file
		try{
			ObjectInputStream ois = new ObjectInputStream(new FileInputStream("C:\\Users\\Geeta\\Desktop\\New folder\\core java\\sirilization\\abcd.txt")); 
			Student student = (Student) ois.readObject();
			System.out.println(student);
			
			}
		catch(Exception e){
			System.out.println(e);
		}
		
		
		
	}
}

class Student implements Serializable{
	static final long SerialVersionUID = 15l;
	int id;
	String name;
	 transient float marks;
	 Student(int id ,String name,float marks){
		 this.id =id;
		 this.name=name;
		 this.marks=marks;
	 }
	public void setID(int id){
		this.id =id;
		
	}
	public void setName(String name){
		this.name = name;
		
	}
	public void setMarks(int marks){
		this.marks =marks;
		
	}
	public int getID(int id){
		return id;
		
	}
	public String getID(String name){
		return name;
		
	}
	public float getMarks(float marks){
		return marks;
		
	}
	
	public String toString(){
		return  "  ID :- "+ this.id +"\n"+ " Name :- "+this.name+"\n"+" Marks :- "+this.marks;  
	}
	
	
}