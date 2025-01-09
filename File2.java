/*
Author:- Geetam Dupare 
Batch:- J-56
Title:- write a program for File create and delete 

*/

import java.util.Scanner;
import java.io.File;

class File2{
	public static void main(String args[]){
		
		System.out.println("Enter a path :");
		File f1 = File(new Scanner(System.in).nextLine());
		
		System.out.println((f1.exists())? deleteFile(f1):createFile(f1));
		
		public static String deleteFile(File f1){
			try{
				
				f1.delete();
			}
			catch(Exception e){
				System.out.println(e);
				
			}
			return "File deleted";
		}
		
		public static String createFile(File f1){
			try{
				f1.createNewFile();
			}
			catch(Exception e){
				System.out.println(e);
				
			}
			return "File created";
		}
		
	}
