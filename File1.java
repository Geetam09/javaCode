/*
Author:- Geetam Dupare 
Batch:- J-56
Title:- write a program for write and read a file.

*/


/* 
File handling:-(handaling a file in system)
File class
fileWriter class
from IO pakage java.io.fileWriter
extend by OutputStreamWriter class 
constractor:-1) FileWriter(File f1);

method:- 1)public void write(String str) throws IOException :-
				>its use to write inside file any 
				>need to close after use using close();



 */
import java.util.Scanner;
import java.io.File;
import java.io.*;

class File1{
	public static void main(String args[]){
	/*	System.out.println("");
		File file = new File(new Scanner(System.in).nextLine());
		System.out.println((file.exists())? "exists":"no exists");
		
	*/
	/*try{
		File f1 = new File("C:\\Users\\Geeta\\Desktop\\New folder\\FileNew.txt"); 
		f1.createNewFile();
		//FileWriter fw = new FileWriter(f1); using object of file 
		FileWriter fw = new FileWriter("C:\\Users\\Geeta\\Desktop\\New folder\\FileNew.txt");//using direct file name 

			fw.write("Geetam  ");
			fw.close();
			
	}
	catch(IOException e){
		System.out.println("IOException"+e);
	}
	*/
	try{
		File f1 = new File("C:\\Users\\Geeta\\Desktop\\New folder\\FileNew.txt"); 
		Scanner sc = new Scanner(f1);
		sc.nextLine();
		System.out.println(sc.hasNext());
		System.out.println(sc.hasNextLine());
		
		while(sc.hasNextLine()){
			String str = sc.nextLine();
			System.out.println(str);
		}
		sc.close();
		
		
		//file reader ?? use 
		
	
		
		
		
	}
	catch(IOException e){
		System.out.println("IOException"+e);
	}
	
	} 
	
	
	
	 
}